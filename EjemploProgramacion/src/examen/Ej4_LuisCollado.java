package examen;

import java.util.Scanner;

public class Ej4_LuisCollado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime la cantidad de videojuegos que deseas registrar, por favor");
        int cantidadVideojuegos = teclado.nextInt();


        for (int contVideojuegos = 0; contVideojuegos < cantidadVideojuegos; contVideojuegos++) {
            System.out.println("Introduce el videojuego" + (contVideojuegos+1) + " , por favor");
            String nombreVideojuego = teclado.next();
        }
        System.out.println("Dime que es lo que desea saber a continuación:");
        System.out.println("Pulse 1 para TÍTULO MÁS LARGO");
        System.out.println("Pulse 2 para MOSTRAR INICIALES");
        System.out.println("Pulse 3 para COMPARAR TITULOS");
        System.out.println("Pulse 4 para SALIR");
        String eleccionUsuario = teclado.next();

        switch (eleccionUsuario){
            case "1":
                System.out.println("A continuación buscaré el videojuego más largo que has introducido");
                break;
            case "2":
                System.out.println("Dime el número de videojuego que has asignado y te muestro las iniciales");
                int numVideojuego = teclado.nextInt();
                break;
            case "3":
                System.out.println("A continuación, te voy a pedir dos números enteros del 1 a la cantidad de " +
                        "videojuegos que has deseado registrar");
                System.out.println("DIGA PRIMER NÚMERO");
                int primerNumero = teclado.nextInt();
                System.out.println("DIGA SEGUNDO NÚMERO");
                int segundoNumero = teclado.nextInt();
                break;
            case "4":
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
}
