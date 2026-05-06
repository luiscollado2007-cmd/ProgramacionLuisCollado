package repasoarraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame el primer nombre:");
        String nombre1 = teclado.nextLine();

        System.out.println("Dame el segundo nombre:");
        String nombre2 = teclado.nextLine();

        System.out.println("Dame el tercer nombre:");
        String nombre3 = teclado.nextLine();

        System.out.println("Dame el cuarto nombre:");
        String nombre4 = teclado.nextLine();

        System.out.println("Dame el quinto nombre:");
        String nombre5 = teclado.nextLine();

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add(nombre1);
        nombres.add(nombre2);
        nombres.add(nombre3);
        nombres.add(nombre4);
        nombres.add(nombre5);

        System.out.println("Recorremos el Array List");

        for (String nombre : nombres){
            System.out.println(nombre);
        }
    }
}
