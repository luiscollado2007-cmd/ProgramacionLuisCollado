package Casting;

public class EjemplosCastings {
    public static void main(String[] args) {

        final double PI = 3.1416;
        System.out.println("PI = " + PI);
        float f = (float) PI;
        System.out.println("f = " + f);

        int unInt = 5000;
        byte unByte = (byte) unInt;
        System.out.println("unByte = " + unByte);


        String informacionAlumno = "MARCOS,19,DAW,7.8";
        String[] palabras = informacionAlumno.split(",");

        String edad = "25";
        int edadNumero = Integer.parseInt(edad);
        if (edadNumero > 18){
            System.out.println("Eres mayor de edad");
        }

        int numeroDni = 52487456;
        String mensaje = String.valueOf(numeroDni);
        System.out.println("mensaje = " + mensaje);

        char codigo = 'A';
        String cadena = Character.toString(codigo);
        System.out.println("cadena = " + cadena.toLowerCase());

        boolean valorBoolean = Boolean.parseBoolean("false");

        String[] lineas = {"PACO|49|DAW|8.4"};
    }
}
