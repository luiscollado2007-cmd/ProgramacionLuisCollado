package accesobd;

import com.sun.jdi.request.ClassPrepareRequest;

import java.sql.*;

public class PruebaConsultas {

    public static void main(String[] args) {

        /*
        1. Consultar el resto de campos de la tabla para que se muestre toda la info
        2. Que la consulta sólo muestre los productos mayores a 100€ (es decir, pasar el parámetro, no que esté a pelo).
        Usar las propiedades del prepareStatement
        3. Crear clase Producto, con los mismos cargos que tiene la tabla
        4. Con cada fila recuperada, crear un objeto de Producto y meter en un ArrayList
         */


        try(Connection connection = DriverManager.getConnection(ConstantesBD.URL,ConstantesBD.USER,ConstantesBD.PASS)){

            PreparedStatement sentenciaConsulta = connection.prepareStatement("Select * from productos");
            PreparedStatement sentenciaDos = connection.prepareStatement("select * from productos where precio > 100");

            ResultSet conjuntoResultado = sentenciaConsulta.executeQuery();

            ResultSet conjuntoDos = sentenciaDos.executeQuery();

            while (conjuntoResultado.next()){
                String nombreProducto = conjuntoResultado.getString("nombre");
                double precioProducto = conjuntoResultado.getDouble("precio");
                int stock = conjuntoResultado.getInt("stock");
                int activo = conjuntoResultado.getInt("activo");
                int id_categoria = conjuntoResultado.getInt("id_categoria");

                System.out.println("El producto es: " + nombreProducto + " , cuyo precio es: " + precioProducto
                + " donde su stock es: " + stock + " , su estado es: " + activo + " y su categoría es: " + id_categoria);
            }
            while (conjuntoDos.next()){
                String nombreProducto = conjuntoDos.getString("nombre");
                double precioProducto = conjuntoDos.getDouble("precio");
                int stock = conjuntoDos.getInt("stock");
                int activo = conjuntoDos.getInt("activo");
                int id_categoria = conjuntoDos.getInt("id_categoria");

                System.out.println("El producto es: " + nombreProducto + " , cuyo precio es: " + precioProducto
                + " donde su stock es: " + stock + " , su estado es: " + activo + " y su categoría es: " + id_categoria);
            }


        }catch (SQLException e){
            System.err.println("Error general con la BD: " + e);
        }
    }
}
