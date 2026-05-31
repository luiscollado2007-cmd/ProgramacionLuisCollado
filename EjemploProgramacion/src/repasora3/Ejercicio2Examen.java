package repasora3;

import java.util.Scanner;

public class Ejercicio2Examen {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("*** BIENVENIDO AL SISTEMA DE CONVERSIÓN DE ALMACENAMIENTO ***");
        System.out.println("Introduzca tamaño en GB");
        int tamanyoUsuario = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Introduzca unidad final (KB /MB /TB)");
        String unidadUsuario = teclado.nextLine();
        switch (unidadUsuario.toUpperCase()){
            case "KB":
                double resultado = tamanyoUsuario * 1024 * 1024;
                System.out.println("*** RESULTADO ***");
                System.out.println("EL TAMAÑO DE " + tamanyoUsuario + " GB EN KB ES " + resultado);
                break;
            case "MB":
                double resultadoMegas = tamanyoUsuario * 1024;
                System.out.println("*** RESULTADO ***");
                System.out.println("EL TAMAÑO DE " + tamanyoUsuario + " GB EN MB ES " + resultadoMegas);
                break;
            case "TB":
                double resultadoTeras = (double) tamanyoUsuario / 1024;
                System.out.println("*** RESULTADO ***");
                System.out.println("EL TAMAÑO DE " + tamanyoUsuario + " GB EN TB ES " + resultadoTeras);
        }

        teclado.close();
    }
}
