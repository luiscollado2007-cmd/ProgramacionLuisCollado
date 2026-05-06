package repasoarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejercicio4 {

    public static void main(String[] args) {
        ArrayList<Integer> numeroAleatorio = new ArrayList<>();
        Random r = new Random();

        for (int cont = 0; cont < 10; cont++) {
            int num = r.nextInt(100) + 1;
            numeroAleatorio.add(num);
        }

        System.out.println("Lista de los 10 números aleatorios: " + numeroAleatorio);

        Collections.sort(numeroAleatorio);

        System.out.println("Lista ordenada de los 10 números aleatorios: " + numeroAleatorio);
    }
}
