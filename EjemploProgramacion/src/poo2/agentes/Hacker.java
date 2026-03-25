package poo2.agentes;

public class Hacker extends Agente implements Infiltrador{
    public Hacker(String nombre) {
        super(nombre);
        this.especialidadAgente = "Ciberseguridad y black hat";
    }


    @Override
    public int probabilidadExito() {
        return (int) (50 - bonusInfiltrador());
    }

    @Override
    public String obtenerTipoAgente() {
        return "HACKER";
    }

    @Override
    public void retirada(String objetivo) {
        String misionCumplida = this.misionCompletada ? "SI" : "NO";
        System.out.println("El hacker con nombre " + nombre + " " + misionCumplida + " ha cumplido su misión para" +
                "el objetivo " + objetivo);
    }


    @Override
    public double bonusInfiltrador() {
        return 0.1;
    }
}
