package poo2.seniorDeLosAnillos;

public class Nazguls extends senio{
    public Nazguls(String nombre, int cantidad, int coordX, int coordY) {
        super(nombre, cantidad, coordX, coordY);
    }

    public void gritar(){
        System.out.println("CHILLIDOO");
    }

    public void avisarSauron(){
        System.out.println("Heyyy Sauron, ya hemos llegado");
    }
}
