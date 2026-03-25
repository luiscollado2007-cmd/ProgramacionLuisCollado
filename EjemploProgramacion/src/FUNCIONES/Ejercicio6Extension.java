package FUNCIONES;

import java.util.Scanner;

public class Ejercicio6Extension {

    //Declaración de una constante del fichero/clase
    public static final double IVA = 21;

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime cuántos productos hacemos. Le aplicaré el IVA del " + IVA);
        int numProductos = teclado.nextInt();
        teclado.nextLine();
        String[] nombresProducto = new String[numProductos];
        double[] preciosProducto = new double[numProductos];
        double[] preciosConIva = new double[numProductos];
        for (int cont = 0; cont < numProductos; cont++) {
            System.out.println("Ok, el producto num " + (cont+1) + ". Dime el nombre y el precio");
            String nombreProducto = teclado.nextLine();
            double precioProducto = teclado.nextDouble();
            teclado.nextLine();
            nombresProducto[cont] = nombreProducto.trim();
            preciosProducto[cont] = precioProducto;
        }


        //VIENE EL DESCUENTASO!
        descontarPrecios(nombresProducto,preciosProducto);
        /*
        2 funciones separadas:
        TODO: hacemos una funcion que reciba el array de precios,
        y a cada precio le aplica un descuento del 5%

        TODO2: lo de antes PERO en vez de 5%, que el descuento sea igual a la longitud
        del nombre de cada producto. Por ejemplo: iPhone tiene un 6% de descuento. Colonia tiene un 7% de descuento....
        */

        mostrarValores(nombresProducto);

        double sumaTotalPreciosIva = 0;
        //Recorro los productos para calcular el precio con IVA de cada uno
        for (int cont = 0; cont < preciosProducto.length; cont++) {
            //Invoco la función de "precioConIVA" y le paso por param el precio extraído del array
            preciosConIva[cont] = precioConIVA(preciosProducto[cont]);
            sumaTotalPreciosIva += preciosConIva[cont];
        }

        System.out.println("******INFORMACIÓN COMPLETA DE PRODUCTOS********");
        //Mostrar la información completa de los productos
        for (int cont = 0; cont < nombresProducto.length; cont++) {
            String nombre = nombresProducto[cont];
            double precioNormal = preciosProducto[cont];
            double precioIva = preciosConIva[cont];
            //TODO: que los precios estén redondeados a 2 decimales
            //HACERLO CON UNA FUNCIÓN QUE LE PASE UN PRECIO Y ME DEVUELVA ESE PRECIO REDONDEADO A 2 DECIMALES
            precioNormal = redondearDosDecimales(precioNormal);
            precioIva = redondearDosDecimales(precioIva);
            mostrarInfoProducto(nombre, precioNormal, precioIva);
        }


    }

    private static void modificarPrecioBase(double precioBase) {

        precioBase *= 500;
    }

    public static double precioConIVA(double precio){
        final double IVA = 21;
        return precio * (IVA/100) + precio;
    }

    public static void mostrarValores(String[] array){

        for (int cont = 0; cont < array.length; cont++) {
            System.out.println("Valor: " + array[cont]);
        }
    }

    public static double redondearDosDecimales(double precio) {
        //52,37000 --> 52,37
        //1ºmuevo la coma 2 posiciones a la derecha (*100)
        precio = precio * 100;
        //2ºredondeo /trunco
        precio = Math.round(precio);
        //3ºvolver la coma hacia atrás 2 posiciones (/100)
        precio = precio / 100;

        return precio;
    }

    public static void mostrarInfoProducto(String nombreProducto, double precioNormal, double precioImpuesto){
        System.out.printf("Producto: %s | Precio: %f € | PrecioIVA: %f € \n" , nombreProducto, precioNormal, precioImpuesto);


    }
    /*
    Recibe una colección de precios y los altera aplicándoles un descuento del 5%
     */

    public static void descontarPrecios(double[] precio){
        final double descuento = 5;
        for (int cont = 0; cont < precio.length; cont++) {
            double precioProducto = precio[cont];
            precio[cont] = aplicarDescuento(precioProducto, descuento);
        }
    }

    public static double aplicarDescuento(double precio, double descuento){
        return precio - (precio * descuento /100);
    }

    public static void descontarPrecios( String[] nombres, double[] precio){
        double descuento = 0;
        for (int cont = 0; cont < precio.length; cont++) {
            double precioProducto = precio[cont];
            String nombreProducto = nombres[cont];
            descuento = nombreProducto.length();
            precio[cont] = aplicarDescuento(precioProducto, descuento);
        }
    }
}
