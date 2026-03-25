package repasoArrays;

import java.util.Random;

public class RepasoMatrices {
    public static void main(String[] args) {

        double[][] temperaturasPorCiudad = new double[4][3];

        mostrarTemperaturas(temperaturasPorCiudad);

        for (int contFila = 0; contFila < temperaturasPorCiudad.length; contFila++) {
            System.out.println("Temperaturas de la ciudad " + (contFila + 1));
            for (int contColumna = 0; contColumna < temperaturasPorCiudad[0].length; contColumna++) {
                System.out.print(redondear2Decimales(temperaturasPorCiudad[contFila][contColumna]) + "º ");
            }
            System.out.println();
        }
    }

    public static float redondear2Decimales(double valor){
        valor = valor * 100;
        long numeroRedondeado = Math.round(valor);
        return numeroRedondeado / (float) 100;
    }

    public static void mostrarTemperaturas(double[][]valor){
        Random aleatorios = new Random();
        for (int contFilas = 0; contFilas < valor.length; contFilas++) {
            for (int contColumnas = 0; contColumnas < valor[0].length; contColumnas++) {
                //generar num aleatorio
                //meter num aleatorio en la CELDA
                double numAleatorio = aleatorios.nextDouble(1,31);

                valor[contFilas][contColumnas] = numAleatorio;
            }
        }
    }
}
