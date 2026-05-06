package repasoarraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Izan");
        nombres.add("Luis");
        nombres.add("Victoria");
        nombres.add("Carolina");
        nombres.add("Marta");

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime que nombre quieres buscar");
        String nombreUsuario = teclado.next();

        if (nombres.contains(nombreUsuario)){
            System.out.println("Encontrado");
        }else{
            System.out.println("No encontrado");
        }

    }
}
