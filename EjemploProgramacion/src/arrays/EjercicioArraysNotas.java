package arrays;

import java.util.Random;
import java.util.Scanner;

public class EjercicioArraysNotas {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime cuántas notas vas a poner y te hago la media de ellas");
        int numNotas = teclado.nextInt();
        int[] notaAlumno = new int[numNotas];



        int capacidad = notaAlumno.length;
        System.out.println("Puedes poner: " + capacidad + " notas.");
        Random generadorAleatorios = new Random();

        for (int cont = 0; cont < notaAlumno.length; cont++){
            int numAleatorio = generadorAleatorios.nextInt(0,11);
            notaAlumno[cont] = numAleatorio;
            System.out.println("La nota " + (cont+1) + " es: " + numAleatorio);
        }
        int suma = 0;
        for (int cont = 0; cont < notaAlumno.length; cont++){
            int notaDelAlumno = notaAlumno[cont];
            suma = suma + notaDelAlumno;
        }
        System.out.println("suma de las notas = " + suma);
        //Casting de tipos: forzamos a la variable a que se convierta a otro tipo
        double media = (double) suma / notaAlumno.length;
        System.out.println("La media de las notas es: " + media);

        System.out.println("Ahora te voy a buscar una nota igual a 10");
        int contador = 0;
        boolean hayNota10 = false;
        while (contador < notaAlumno.length && !hayNota10){
            int notAlumno = notaAlumno[contador];
            if (notAlumno == 10){
                hayNota10 = true;
            }else{
                contador++;
            }

        }

        if (hayNota10){
            System.out.println("He encontrado alguna nota igual a 10. La tiene el alumno número: " + (contador+1));
        }else {
            System.out.println("No he encontrado alguna nota igual a 10");
        }



    }
}
