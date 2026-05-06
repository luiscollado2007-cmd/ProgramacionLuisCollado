package repasoset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio2 {
    public static void main(String[] args) {
        Set<String> colores = new HashSet<>();

        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Amarillo");
        colores.add("Blanco");
        colores.add("Negro");

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un color y te digo si está en la lista");
        String colorUsuario = teclado.next();

        if (colores.contains(colorUsuario)) {
            System.out.println("Está el color que has escrito");
        }else{
            System.out.println("NO está el color que has escrito");
        }
    }
}
