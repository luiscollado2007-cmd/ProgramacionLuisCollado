package poo2.superheroe;

public class Forzudo extends Superheroe{
    public Forzudo(String nombre) {
        super(nombre);
    }

    @Override
    public void usarPoder() {
        if (getEnergia() < 20){
            System.out.println("Lo siento, pero el forzudo no puede usar su poder");
            return;
        }
        setEnergia(getEnergia() - 20);
        setNivel(getNivel() + 1);
        System.out.println("El forzudo está a tope");
    }
}
