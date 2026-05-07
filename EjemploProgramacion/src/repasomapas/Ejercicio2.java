package repasomapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Map<String, String> agendaTelefonica = new HashMap<>();

        agendaTelefonica.put("Luis","678443178");
        agendaTelefonica.put("Victor","676343178");
        agendaTelefonica.put("Izan","697443178");

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el nombre que quieras buscar en la mapa: ");
        String nomUsuario = teclado.nextLine();

        if (agendaTelefonica.containsKey(nomUsuario)){
            System.out.println("El número de teléfono del nombre que has puesto es: " + agendaTelefonica.get(nomUsuario));
        }

        System.out.println("Dime el nombre que quieres eliminar de la agenda: ");
        String nomUsuario2 = teclado.nextLine();

        if (agendaTelefonica.remove(nomUsuario2) != null){
            System.out.println("Contacto de la agenda eliminado");
        }else{
            System.out.println("Ese contacto no existe");
        }


        System.out.println("Contenido del mapa");

        for (String p : agendaTelefonica.keySet()){
            System.out.println(p + " ---> " + agendaTelefonica.get(p));
        }
    }
}
