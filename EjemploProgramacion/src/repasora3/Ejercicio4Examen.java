package repasora3;

import java.util.Scanner;

public class Ejercicio4Examen {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cuántos videojuegos quieres registrar?");
        int numVideojuegos = teclado.nextInt();
        teclado.nextLine(); // limpiar salto

        String[] juegos = new String[numVideojuegos];

        // 1. Registrar títulos
        for (int cont = 0; cont < juegos.length; cont++) {
            System.out.println("Introduce el título " + (cont + 1) + ":");
            juegos[cont] = teclado.nextLine();
        }

        int opcion = 0;

        // 2. Menú
        while (opcion != 4) {

            System.out.println("\nMENÚ DE OPCIONES");
            System.out.println("1. TÍTULO MÁS LARGO");
            System.out.println("2. MOSTRAR INICIALES");
            System.out.println("3. COMPARAR TÍTULOS");
            System.out.println("4. SALIR");

            opcion = teclado.nextInt();
            teclado.nextLine(); // limpiar salto

            // OPCIÓN 1: TÍTULO MÁS LARGO
            if (opcion == 1) {

                int maxLongitud = juegos[0].length();
                int posMax = 0;

                for (int contador = 1; contador < juegos.length; contador++) {
                    if (juegos[contador].length() > maxLongitud) {
                        maxLongitud = juegos[contador].length();
                        posMax = contador;
                    }
                }

                System.out.println("El título más largo es: " + juegos[posMax]);
            }

            // OPCIÓN 2: MOSTRAR INICIALES
            if (opcion == 2) {

                System.out.println("Diga número de videojuego (1 a " + numVideojuegos + "):");
                int num = teclado.nextInt();
                teclado.nextLine();

                String titulo = juegos[num - 1];
                String[] palabras = titulo.split(" ");

                String siglas = "";

                for (int cont = 0; cont < palabras.length; cont++) {
                    siglas += palabras[cont].toUpperCase().charAt(0);
                }

                System.out.println(titulo + " -> " + siglas);
            }

            // OPCIÓN 3: COMPARAR TÍTULOS
            if (opcion == 3) {

                System.out.println("DIGA PRIMER NÚMERO");
                int n1 = teclado.nextInt();
                System.out.println("DIGA SEGUNDO NÚMERO");
                int n2 = teclado.nextInt();
                teclado.nextLine();

                String t1 = juegos[n1 - 1];
                String t2 = juegos[n2 - 1];

                if (t1.equalsIgnoreCase(t2)) {
                    System.out.println("SON IGUALES");
                } else {
                    System.out.println("SON DISTINTOS");
                }
            }

            // OPCIÓN 4: SALIR
            if (opcion == 4) {
                System.out.println("Saliendo del programa...");
            }
        }

        teclado.close();
    }
}
