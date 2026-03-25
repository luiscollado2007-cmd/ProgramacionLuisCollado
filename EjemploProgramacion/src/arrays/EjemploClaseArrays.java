package arrays;

import java.util.Arrays;

public class EjemploClaseArrays {
    public static void main(String[] args) {

        int valores[] = new int[23];
        Arrays.fill(valores,-1); //Almacena -1 en todo el array 'valores

        String arrayEnString = Arrays.toString(valores);
        System.out.println(arrayEnString);
        //TODO: ¿cómo rellenar a -1 una matriz de 3x2?? --> Mirarlo

        //Prueba Arrays.equals
        int[] array1 = new int[]{2,3,5,6};
        int[] array2 = new int[]{8,191,4242,6,3,44,2,-54};
        System.out.println("¿Son iguales?: " + Arrays.equals(array1,array2));
        //Otra forma es:
        //System.out.println("¿Son iguales?: "  + Arrays.equals(array1,array2));
        //Y no tendrías que poner un boolean, porque ya lo estás haciendo con el Arrays.equals.

        //Sirve para ordenar de menor a mayor
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));

        //Este arrays sirve para buscar en que posición se encuentra el número que buscas
        int indiceBuscado = Arrays.binarySearch(array2,9);
        if (indiceBuscado >= 0){
            System.out.println("El número 191 está en la posición: " + indiceBuscado);
        }else{
            System.out.println("No existe el num 191 en el array");
        }
    }
}
