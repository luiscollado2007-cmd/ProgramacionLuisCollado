package Strings;

import java.util.Scanner;

public class EjercicioArraysMezclaConStrings {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una frase y te separo cada palabra del texto que hayas introducido");
        String textoUsuario = teclado.nextLine();

        int capacidad = textoUsuario.length();
        System.out.println("capacidad = " + capacidad);

        String texto1 = textoUsuario;
        String palabra = texto1.substring(0,textoUsuario.length());
        System.out.println("palabra = " + palabra);

        int posicionPrimerEspacio = texto1.indexOf(" ");
        System.out.println("posicionPrimerEspacio = " + posicionPrimerEspacio);


        int indiceEspacio = -1;
        int contPalabras = 0;
        do {
            indiceEspacio = texto1.indexOf(" ");
            palabra = null;
            if (indiceEspacio != -1) {
                palabra = palabra.substring(0, indiceEspacio);
                String restoFrase = palabra.substring(indiceEspacio + 1);
            } else {
                palabra = palabra;
            }


        } while (indiceEspacio != -1);



        int posicionSegundoEspacio = texto1.indexOf(" ",posicionPrimerEspacio + 1);
        System.out.println("posicionSegundoEspacio = " + posicionSegundoEspacio);

        int primeraPalabra = textoUsuario.indexOf(textoUsuario);
        System.out.println("primeraPalabra = " + primeraPalabra);

    }
}
