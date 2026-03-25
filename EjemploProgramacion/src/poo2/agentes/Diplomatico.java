package poo2.agentes;

public class Diplomatico extends Agente {
    public Diplomatico(String nombre) {
        super(nombre);
        this.especialidadAgente = "- Gestión profesional de las relaciones internacionales";
    }

    @Override
    public int probabilidadExito() {
        return 90;
    }

    @Override
    public String obtenerTipoAgente() {
        return "DIPLOMÁTICO";
    }

    @Override
    public void retirada(String objetivo) {
        String misionCumplida = this.misionCompletada ? "SI" : "NO";
        System.out.println("El diplomático con nombre " + nombre + " " + misionCumplida + " ha cumplido su misión para" +
                "el objetivo " + objetivo);
    }
}
