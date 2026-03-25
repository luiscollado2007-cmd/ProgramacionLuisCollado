package arrays.MATRICES;

import java.util.Random;

public class Ejercicio4 {
    public static void main(String[] args) {

        double[][] notasAlumnos = new double[4][5];
        Random aleatorio = new Random();
        for (int contFila = 0; contFila < notasAlumnos.length; contFila++) {
            for (int contColumna = 0; contColumna < notasAlumnos.length; contColumna++) {
                //Donde tengo que generar la nota aleatoria y meterla en la celda
                notasAlumnos[contFila][contColumna] = aleatorio.nextDouble(0,10);
            }
        }

        for (int contFila = 0; contFila < notasAlumnos.length; contFila++) {
            System.out.println();
            System.out.println("-----------------------");
            System.out.println(String.format("Alumno núm %d:", (contFila+1)));
            double notaMax = 0;
            double notaMin = Double.MAX_VALUE;
            double mediaNotas = 0;
            double sumaNotas = 0;
            for (int contColumna = 0; contColumna < notasAlumnos.length; contColumna++) {
                double notaAlumno = notasAlumnos[contFila][contColumna];
                notaMax = Math.max(notaMax, notaAlumno);
                notaMin = Math.min(notaMin,notaAlumno);
                sumaNotas += notaAlumno;
            }
            mediaNotas = sumaNotas / notasAlumnos[0].length;

            System.out.println("Máxima nota: " + notaMax);
            System.out.println("Mínima nota: " + notaMin);
            System.out.println("Media de la nota: " + mediaNotas);
        }


    }
}
