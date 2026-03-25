package arrays;

import java.util.Arrays;

public class EjercicioArrays11Vectores {
    public static void main(String[] args) {

        int[] array1 = new int[100];
        int[] array2 = new int[100];
        for (int cont = 0; cont < array1.length ; cont++) {
            array1[cont] = (cont+1);
        }
        System.out.println(Arrays.toString(array1));

        int contadorArray1 = array1.length - 1;
        for (int contArray2 = 0; contArray2 < array2.length ; contArray2++) {

            int numeroArray1 = array1[contadorArray1];
            array2[contArray2] = numeroArray1;
            contadorArray1--;
        }
        System.out.println(Arrays.toString(array2));

        //Si te pide separarlo de otra manera es:
//        for (int cont = 0; cont < array2.length ; cont++) {
//            System.out.print(array2[cont] + "|");
//        }
    }
}
