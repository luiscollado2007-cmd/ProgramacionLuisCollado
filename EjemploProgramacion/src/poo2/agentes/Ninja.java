package poo2.agentes;

public class Ninja extends Agente implements Infiltrador{

    public Ninja(String nombre) {
        super(nombre);
        this.especialidadAgente = "Artes Marciales especiales";
    }

    @Override
    public int probabilidadExito() {
        return (int) (75 - bonusInfiltrador());
    }

    @Override
    public String obtenerTipoAgente() {
        return "NINJA";
    }

    @Override
    public void retirada(String objetivo) {
        String misionCumplida = this.misionCompletada ? "SI" : "NO";
        System.out.println("El ninja con nombre " + nombre + " " + misionCumplida + " ha cumplido su misión para " +
                "el objetivo " + objetivo);
    }

    @Override
    public double bonusInfiltrador() {
        return 20;
    }
}
