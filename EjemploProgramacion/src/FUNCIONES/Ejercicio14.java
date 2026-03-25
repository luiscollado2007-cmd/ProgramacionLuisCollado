package FUNCIONES;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un carácter para el triángulo");
        String caracterTriangulo = teclado.nextLine();

        //TODO: incluir una validación en la que, si el usuario no nos dice sólo una letra, no le dejemos seguir hasta que ponga sólo una letra.

        System.out.println("Dime número de líneas del triángulo");
        int numLineas = teclado.nextInt();

        char letra = caracterTriangulo.charAt(0);
        imprimirTriangulo(letra, numLineas);

    }

    public static void imprimirTriangulo(char caracter, int numLineas){

        if (numLineas >=1){
            int numCaracteresMaximo = 1;
            int numEspaciosMax = numLineas - 1;
            for (int contFila = 0; contFila < numLineas; contFila++) {
                //1er for: pone espacios
                for (int contEspacios = 0; contEspacios < numEspaciosMax; contEspacios++) {
                    System.out.print(" ");
                }
                for (int contColumna = 1; contColumna <= numCaracteresMaximo ; contColumna++) {
                    System.out.print(caracter);
                }
                System.out.println();
                numEspaciosMax--;
                numCaracteresMaximo+=2;
            }


        }else{
            System.out.println("El mínimo de líneas debe de ser 1.Se ha introducido un valor no válido");
        }


    }
}
