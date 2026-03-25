package poo;

public class Persona {

    String nombre;
    int peso;
    int altura;
    String sexo;
    String[] alergias;


    //Constructor
    public Persona(){
        sexo = "Indefinido";
        alergias = new String[10];
        System.out.println("(personas naciendo)");
    }

}
