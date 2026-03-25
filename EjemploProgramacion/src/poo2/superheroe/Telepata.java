package poo2.superheroe;

public class Telepata extends Superheroe {
    public Telepata(String nombre) {
        super(nombre);
    }

    @Override
    public void usarPoder() {
        if (getEnergia() < 15){
            System.out.println("Lo siento, pero el telepata no puede usar su poder");
            return;
        }

        setEnergia(getEnergia() - 15);
        setNivel(getNivel() + 3);
        System.out.println("El telepata está en racha");
    }
}
