package poo2.superheroe;

public class Velocista extends Superheroe {


    public Velocista(String nombre) {
        super(nombre);
    }

    @Override
    public void usarPoder() {
        if (getEnergia() < 5){
            System.out.println("Lo siento, pero el velocista no puede usar su poder");
            return;
        }
        setEnergia(getEnergia() - 5);
        setNivel(getNivel() + 2);
        System.out.println("El velocista se mueve de manera increíble");
    }
}
