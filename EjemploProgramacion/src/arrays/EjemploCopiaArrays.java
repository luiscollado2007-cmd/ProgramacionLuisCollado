package arrays;

import java.util.Arrays;

public class EjemploCopiaArrays {
    public static void main(String[] args) {

        String[] diasSemana = new String[]{"LUNES", "MARTES", "MIÉRCOLES", "JUEVES", "VIERNES"};
        int [] array1 = new int[]{1,2,3,4,5};

        int[] array2 = new int[10];

        //Forma manual
//        for (int cont = 0; cont < array1.length; cont++) {
//            array2[cont] = array1[cont];
//        }

        //Forma automática
        System.arraycopy(array1, 0, array2, 0,3);

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}
