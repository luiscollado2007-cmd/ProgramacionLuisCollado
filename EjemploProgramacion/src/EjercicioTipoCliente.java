import java.util.Scanner;

public class EjercicioTipoCliente {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el nombre del usuario, cantidad de compras y el precio del producto que desea comprar, por favor");
        String nombreUsuario = teclado.nextLine();
        int cantidadCompras = teclado.nextInt();
        teclado.nextLine();
        float precioProducto = teclado.nextFloat();
        String tipoCliente = "";
        float precioFinal;

        if (cantidadCompras >= 5 && cantidadCompras < 10){
            System.out.println("Eres un cliente BRONCE");
            tipoCliente = "BRONCE";
        } else if (cantidadCompras >= 10 && cantidadCompras < 20) {
            System.out.println("Eres un cliente ORO");
            tipoCliente = "ORO";
        } else if (cantidadCompras >= 20) {
            System.out.println("Eres un cliente PLATINO");
            tipoCliente = "PLATINO";
        } else if (cantidadCompras < 0) {
            System.out.println("Esta cantidad no es válida");
        } else if (cantidadCompras < 5) {
            System.out.println("Eres un cliente NORMAL");
            tipoCliente = "NORMAL";
        }

        System.out.println("Ahora te diré tu porcentaje de descuento, según el cliente que seas");
        float descuento = 0;

        switch (tipoCliente){
            case "BRONCE" :
               descuento = 5;
                System.out.println(" Al ser un cliente BRONCE, se te aplicará un 5% de descuento");
                break;
            case "ORO" :
                descuento = 8;
                System.out.println("Al ser un cliente ORO, se te aplicará un 8% de descuento");
                break;
            case "PLATINO" :
                descuento = 15;
                System.out.println("Al ser un cliente PLATINO, se te aplicará un 15% de descuento");
                break;
            case "NORMAL" :
                descuento = 0;
                System.out.println("HAZ MÁS COMPRAS, RATA!");
                break;
            default:
                System.out.println("No puedo hacer un descuento a ese tipo de clientes");
        }
        if (descuento > 0){
            precioFinal = precioProducto - (precioProducto * descuento / 100);
        }else {
            precioFinal = precioProducto;
        }

        System.out.println(nombreUsuario + " eres un cliente " + tipoCliente + " y tu precio final es: " + precioFinal + " €");
    }
}
