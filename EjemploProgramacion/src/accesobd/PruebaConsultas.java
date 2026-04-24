package accesobd;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PruebaConsultas {

    public static void main(String[] args) {

        /*
        1. Consultar resto de campos de la tabla para que se muestre toda la info
        2. Que la consulta sólo muestre los productos mayores a 100€ (es decir, pasar el parámetro, no que esté a pelo). Usar las propiedades del prepareStatement
        3. Crear clase Producto, con los mismos campos que tiene la tabla
        4. Con cada fila recuperada, crear un objeto de Producto y meter en un ArrayList
        5. Que la consulta me devuelva tambien el id y el nombre de la categoria del producto
        6. Crear una clase Categoria (campos id, nombre)
        7. Que el producto tenga un objeto de la clase Categoria
        8. Asignar la categoria y mostrarla cuand se muestre el producto
         */

        try(Connection conexion = DriverManager.getConnection(ConstantesBD.URL, ConstantesBD.USER, ConstantesBD.PASS);
            PreparedStatement sentenciaConsulta = conexion.prepareStatement("SELECT * FROM productos where precio > ?");
        ){

            double precioFiltro = 100;

            sentenciaConsulta.setDouble(1, precioFiltro);
            ResultSet conjuntoResultado = sentenciaConsulta.executeQuery();

            List<Producto> productosBd = new ArrayList<>();

            while(conjuntoResultado.next()){
                //Aqui estamos en la siguiente fila
                int idProducto = conjuntoResultado.getInt("id_producto");
                String nombreProducto = conjuntoResultado.getString("nombre");
                double precioProducto = conjuntoResultado.getDouble("precio");
                int stock = conjuntoResultado.getInt("stock");
                boolean activo = conjuntoResultado.getBoolean("activo");
                int idCategoria = conjuntoResultado.getInt("id_categoria");

                Producto nuevo = new Producto(idProducto, nombreProducto, precioProducto,stock, activo);
                productosBd.add(nuevo);
//
            }

            mostrarListaProductos(productosBd);


            conjuntoResultado.close();

        }catch (SQLException e){
            System.err.println("Error general con la BD: " + e);
        }
    }

    private static void mostrarListaProductos(List<Producto> productosBd) {

        if(productosBd.isEmpty()){
            System.out.println("...No hay productos...");
        }else{
            System.out.println("Coindencias: " + productosBd.size() + " productos");

            //Linea para recorrer todos los productos e invocar a su metodo mostrarProducto
            productosBd.forEach(Producto::mostrarProducto);

        }
    }


}