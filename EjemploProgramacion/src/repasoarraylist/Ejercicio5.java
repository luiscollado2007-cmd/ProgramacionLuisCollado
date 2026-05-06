package repasoarraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio5 {

    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<>();

        notas.add(9.25);
        notas.add(5.25);
        notas.add(6.0);
        notas.add(7.25);
        notas.add(8.25);

        double notaMedia = 0;
        for (Double nota : notas){
            notaMedia += nota;
        }

        notaMedia = notaMedia / notas.size();

        System.out.println("La nota media es: " + notaMedia);

        double maxNota = Collections.max(notas);

        System.out.println("La máxima nota es: " + maxNota);

        double minNota = Collections.min(notas);

        System.out.println("La mínima nota es: " + minNota);
    }
}
