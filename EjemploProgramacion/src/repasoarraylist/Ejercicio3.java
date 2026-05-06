package repasoarraylist;

import java.util.ArrayList;

public class Ejercicio3 {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(2);
        numeros.add(2);
        numeros.add(7);
        numeros.add(3);
        numeros.add(6);
        numeros.add(5);
        numeros.add(7);

        System.out.println("Lista de números: " + numeros);

        ArrayList<Integer> numeroNoRepetidos = new ArrayList<>();

        for (Integer numero : numeros){
            if (!numeroNoRepetidos.contains(numero)){
                numeroNoRepetidos.add(numero);
            }
        }

        System.out.println("Lista de números sin repetir: " + numeroNoRepetidos);
    }
}
