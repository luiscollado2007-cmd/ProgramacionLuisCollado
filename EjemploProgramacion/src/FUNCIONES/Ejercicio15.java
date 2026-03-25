package FUNCIONES;

public class Ejercicio15 {
    public static void main(String[] args) {

        int [] numeros = crearArrayConNumeros(8);
        mostrarValoresArray(numeros);


        System.out.println();
        int suma = sumarElementos(numeros);
        System.out.println("La suma es: " + suma);

        System.out.println("La media de los números es: " + mediaDeNumeros(numeros));

    }

    private static int sumarElementos(int[] numeros) {
        int sumaTotal = 0;
        for (int cont = 0; cont < numeros.length; cont++) {
            sumaTotal += numeros[cont];
        }
        return sumaTotal;
    }

    /**
     * Crear array con una longitud. Rellenará valores desde el 1 hasta el valor de longitud
     * @param longitud La longitud del array a crear
     * @return
     */

    public static int[] crearArrayConNumeros(int longitud){
        if (longitud <= 0){
            System.out.println("No es posible crear arrays con longitud 0 o negativa");
            return null;
        }
        int[] arrayNumeros = new int[longitud];
        for (int num = 0; num < longitud ; num++) {
            arrayNumeros[num] = (num + 1);
        }

        return arrayNumeros;
    }

    public static void mostrarValoresArray(int[] array){
        if (array != null){
            System.out.println("Contenido del array");
            for (int cont = 0; cont < array.length; cont++) {
                System.out.print(array[cont] + " ");
            }
        }
    }

    public static float mediaDeNumeros(int [] numeros){
        float media = 0;
        if (numeros != null){
            int suma = sumarElementos(numeros);
            media = (float) suma / numeros.length;
        }
        return media;
    }
}
