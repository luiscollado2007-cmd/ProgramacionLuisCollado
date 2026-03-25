package poo;

public class ProgramaArray20Coches {
    public static void main(String[] args) {
        String[] coches = new String[20];

        for (int cont = 0; cont < coches.length; cont++) {
            coches[cont] = ProgramaArraysCoches.generarCoche();
        }

        System.out.println("Listado de coches generados: ");
        for (int cont = 0; cont < coches.length; cont++) {
            System.out.println((cont + 1) + ". " + coches[cont]);
        }


    }
}
