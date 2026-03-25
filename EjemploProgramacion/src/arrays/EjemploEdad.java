package arrays;

public class EjemploEdad {
    public static void main(String[] args) {

        double[] edad = new double[3];
        edad[0] = 18;
        edad[1] = 19;
        edad[2] = 18;
        System.out.println("Edad posición 0: " + edad[0]);
        System.out.println("Edad posición 1: " + edad[1]);
        System.out.println("Edad posición 2: " + edad[2]);

        double primerEdad = edad[0] * 7;
        System.out.println("primerEdad = " + primerEdad);
    }
}
