package arrays.MATRICES;

public class Ejercicio2 {
    public static void main(String[] args) {

        int[][] tablaMultiplicar = new int[10][10];

        for (int fila = 0; fila < tablaMultiplicar.length; fila++) {
            int numero = fila+1;
            for (int columna = 0; columna < tablaMultiplicar[0].length; columna++) {
                int numero2 = columna+1;
                int producto = numero * numero2;
                tablaMultiplicar[fila][columna] = producto;
            }

        }

        for (int conFila = 0; conFila< tablaMultiplicar.length; conFila++) {
            for (int contColumna = 0; contColumna < tablaMultiplicar[0].length; contColumna++) {
                System.out.print(tablaMultiplicar[conFila][contColumna]+ " ");
            }
            System.out.println();
        }
    }
}
