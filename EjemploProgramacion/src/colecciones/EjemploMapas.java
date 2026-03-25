package colecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EjemploMapas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Map<String, Integer> mapaNotasPorAlumno;
        mapaNotasPorAlumno = new HashMap<>(3);

        mapaNotasPorAlumno.put("Diego",4);
        mapaNotasPorAlumno.put("Paco",2);
        mapaNotasPorAlumno.put("Fer",8);

        System.out.println(mapaNotasPorAlumno.size());
        System.out.println("Dime el nombre del alumno y te digo su nota: ");

        String nombreAlumno = teclado.nextLine();

        if (mapaNotasPorAlumno.containsKey(nombreAlumno)){
            System.out.println("La nota es: " + mapaNotasPorAlumno.get(nombreAlumno));
        }else{
            System.out.println("No encuentro a ese alumno en las ");
        }
        System.out.println("Notas de los alumnos:");
        for (Integer valor : mapaNotasPorAlumno.values()){
            System.out.println(valor);
        }
        System.out.println();
        System.out.println("Nombre de los alumnos");
        for (String clave : mapaNotasPorAlumno.keySet()){
            System.out.println(clave);
        }

        System.out.println("Tablita de notas por alumno:");
        for (String clave : mapaNotasPorAlumno.keySet()){
            Integer nota = mapaNotasPorAlumno.get(clave);

            System.out.println(clave + ": " + nota);

        }
    }
}
