package repasomapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Map<String,String> idiomas = new HashMap<>();

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce palabra en español");
        String esp = teclado.nextLine();

        System.out.println("Introduce palabra en inglés");
        String ing = teclado.nextLine();

        idiomas.put(esp,ing);

        System.out.println("Introduce la palabra a buscar: ");
        String palabraUsuario = teclado.nextLine();

        if (idiomas.containsKey(palabraUsuario)) {
            System.out.println("Traducción: " + idiomas.get(palabraUsuario));
        }else{
            System.out.println("La palabra no está en la mapa");
        }

        System.out.println("Contenido del mapa:");
        for (String e: idiomas.keySet()){
            System.out.println(e + "--> " + idiomas.get(e));
        }


    }
}
