package poo.aficiones;

import poo.dawbank.Utils;

import java.util.Arrays;

/**
 * Ejemplo parta utilizar arrays de objetos en la clase
 */

public class Persona {

    private String nombre;
    private int edad;
    private Aficion[] hobbies;
    private int numHobbies = 0;
    public static final int MAX_HOBBIES = 5;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        hobbies = new Aficion[MAX_HOBBIES];
    }

    public void agregarHobbies(Aficion nuevo){
        if (hobbies == null){
            hobbies = new Aficion[MAX_HOBBIES];
        }
        hobbies[numHobbies] = nuevo;
        numHobbies++;
    }

    public void mostrarHobbies(){
        for (int cont = 0; cont < numHobbies; cont++) {
            Aficion hob = hobbies[cont];
            System.out.println("Hobbie Nº " + (cont + 1));
            System.out.println("\t Nombre: " + hob.getNombre());
            System.out.println("\t Dificultad: " + hob.getNivelDificultad());
            System.out.println("\t ¿Es Riesgoso?: " + Utils.convertirValorBooleanAString(hob.isEsRiesgoso()));
        }
    }

    public void mostrarHobbiesRiesgosos(){
        System.out.println("*** MOSTRANDO HOBBIES RIESGOSOS ***");
        for (int cont = 0; cont < hobbies.length; cont++) {
            Aficion hob = hobbies[cont];
            if (hob.isEsRiesgoso()){
                System.out.println("\t Nombre: " + hob.getNombre());
                System.out.println("\t Dificultad: " + hob.getNivelDificultad());
                System.out.println("\t ¿Es Riesgoso?: " + Utils.convertirValorBooleanAString(hob.isEsRiesgoso()));
            }
        }
    }

    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public Aficion[] getHobbies() {
        return hobbies;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", hobbies=" + Arrays.toString(hobbies) +
                '}';
    }
}
