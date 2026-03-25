package poo2.superheroe;

public class ProgramaSuperHeroe {
    public static void main(String[] args) {
        Velocista miVelocista = new Velocista("PEPE");
        miVelocista.usarPoder();
        miVelocista.usarPoder();
        miVelocista.usarPoder();
        miVelocista.mostrarEstado();
        System.out.println();


        Forzudo miForzudo = new Forzudo("EUSTAQUIO");
        miForzudo.usarPoder();
        miForzudo.usarPoder();
        miForzudo.usarPoder();
        miForzudo.mostrarEstado();
        System.out.println();

        Telepata miTelepata = new Telepata("TITO");
        miTelepata.usarPoder();
        miTelepata.usarPoder();
        miTelepata.usarPoder();
        miTelepata.mostrarEstado();
    }
}
