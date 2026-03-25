package Matrices;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int alumnos = 4;
        final int asignatura = 5;
        double[][] notas = new double[alumnos][asignatura];
        double nota;
        for (int cont = 0; cont < alumnos; cont++) {
            System.out.println("Hola,introduce las 5 notas del alumno" + (cont+1));
            for (int cont1 = 0; cont1 < asignatura; cont1++) {
                System.out.println("Asignatura" + (cont1+1) + ":");
                nota = teclado.nextDouble();

            }

        }

        System.out.println("Resultados");
        for (int cont = 0; cont < alumnos; cont++) {
            double min = notas[cont][0];
            double max = notas[cont][0];
            double suma = 0;
            for (int cont1 = 0; cont1 < asignatura; cont1++) {
                nota = notas[cont][cont1];
                if(nota < min){
                    min = nota;
                }else{
                    max = nota;
                }
                suma+=nota;
            }
            double media = suma / asignatura;

            System.out.println("Alumno" + (cont+1) + " = " + media);
            System.out.println("Nota máxima = " + media);
            System.out.println("Nota mínima = " + media);
            System.out.println("Nota media = " + media);
        }



    }
}
