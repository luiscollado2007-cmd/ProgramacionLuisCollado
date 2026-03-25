package poo;

public class ProgramaPersonas {

    public static void main(String[] args) {

        //Crea un objeto de la clase Persona
        //en una variable llamada "miVecino"
        Persona miVecino = new Persona();
        miVecino.nombre = "Jose";
        miVecino.peso = 70;
        miVecino.altura = 175;
        miVecino.sexo = "Masculino";

        System.out.println("Datos de mi vecino:");
        System.out.println("Nombre: " + miVecino.nombre);
        System.out.println("Peso: " + miVecino.peso);
        System.out.println("Altura: " + miVecino.altura);
        System.out.println("Sexo: " + miVecino.sexo);

        Persona unProfe = new Persona();
        unProfe.nombre = "Paco";
        unProfe.peso = 90;
        System.out.println();
        System.out.println("Datos de un profe:");
        System.out.println("Nombre: " + unProfe.nombre);
        System.out.println("Peso: " + unProfe.peso);
        System.out.println("Altura: " + unProfe.altura);
        System.out.println("Sexo: " + unProfe.sexo);

    }
}
