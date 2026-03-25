package examen;

import java.util.Scanner;

public class Ej2_LuisCollado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("*** BIENVENIDO AL SISTEMA DE CONVERSIÓN DE ALMACENAMIENTO***");
        System.out.println("Introduzca un tamaño en GB:");
        double numUsuario = teclado.nextDouble();

        System.out.println("Introduzca la unidad final (KB / MB / TB)");
        String unidadUsuario = teclado.next();
        double unidadFinalUsuario = 0;
        switch (unidadUsuario){
            case "KB":
                unidadFinalUsuario = (1024 * 1024 * numUsuario);
                break;
            case "MB":
                unidadFinalUsuario= (1024 * numUsuario);
                break;
            case "TB":
                unidadFinalUsuario = numUsuario / 1024;
                break;
            default:
                System.out.println("Unidad no válida");
        }

        System.out.println("**** RESULTADO ****");
        System.out.println("EL TAMAÑO DE " + numUsuario + " GB" + " EN " + unidadUsuario + " ES " + unidadFinalUsuario );


    }
}
