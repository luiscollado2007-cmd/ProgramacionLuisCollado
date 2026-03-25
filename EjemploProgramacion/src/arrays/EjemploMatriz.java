package arrays;

public class EjemploMatriz {
    public static void main(String[] args) {

        int numFilas = 2;
        int numColumnas = 3;
        int[][] matrizNotas = new int[numFilas][numColumnas];
        matrizNotas[0][0] = 8;
        matrizNotas[0][1] = 9;
        matrizNotas[0][2] = 15;
        matrizNotas[1][2] = 4;

        System.out.println("Longitud? : " + matrizNotas.length);

        for (int fila = 0; fila < numFilas; fila++){
            for (int columna = 0; columna < numColumnas ; columna++) {
                System.out.print(fila + "," + columna + " :");
                int nota = matrizNotas[fila][columna];
                System.out.print(nota);
                System.out.println();
            }
        }

        //1º En otro fichero nuevo:
        //Pedir al usuario num filas, num columnas
        //Crear una matriz con ese tamaño

        //2º Rellenarlo de valores aleatorios DECIMALES

        //3º Recorrer la matriz mostrando todos sus valores

        //4º BONUS: que el 3º lo muestre de esta manera(ej para 3x3):
        // 4.2  2.5 4.5
        // 1.2  9.0 4.1
        // 5.3  2.1 1.2

    }
}
