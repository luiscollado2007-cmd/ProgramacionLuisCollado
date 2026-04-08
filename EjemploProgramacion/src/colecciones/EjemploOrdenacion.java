
package colecciones;

import java.util.*;

public class EjemploOrdenacion {

    public static void main(String[] args) {

        List<String> letras = new ArrayList<>();
        letras.add("D");
        letras.add("F");
        letras.add("B");
        letras.add("A");

        //Ordenamos la lista
        Collections.sort(letras);

        for (String letra: letras){
            System.out.println(letra);
        }

        List<Integer> numeros = Arrays.asList(5,7,9, 12, 2, 66);

        //Ordenamos la lista de forma INVERSA
        numeros.sort(Comparator.reverseOrder());
        System.out.println(numeros);

        List<Estudiante> estudiantesErasmus = Arrays.asList(
                new Estudiante(1, "Johan", 5.2, "111111A"),
                new Estudiante(2, "Alice", 9.1, "222222A"),
                new Estudiante(3, "Bob", 9.1, "0000000A")
        );

        System.out.println("Los estudiantes Erasmus son: ");
        //Collections.sort(estudiantesErasmus);

        //Ejemplo, queremos comparar por otro campo, el numero estudiante:
        estudiantesErasmus.sort(Comparator.comparingInt(Estudiante::getNumEstudiante));

        for(Estudiante est: estudiantesErasmus){
            System.out.println(est);
        }

        System.out.println("\n ************** \n");
        System.out.println("Ordenando por nota media:");

        //Hacer ordenacion por nota media...
        estudiantesErasmus.sort(
                Comparator
                        .comparingDouble(Estudiante::getNotaMedia)
                        .thenComparing(Estudiante::getDni)
                        .reversed());

        for(Estudiante est: estudiantesErasmus){
            System.out.println(est);
        }

        System.out.println("\n ************** \n");
        System.out.println("Ordenando por DNI:");

        estudiantesErasmus.sort(Comparator.comparing(Estudiante::getDni));
        for(Estudiante est: estudiantesErasmus){
            System.out.println(est);
        }

    }
}
