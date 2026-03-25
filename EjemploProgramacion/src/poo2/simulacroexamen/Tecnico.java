package poo2.simulacroexamen;

public abstract class Tecnico extends EmpleadosConTareas {
    public static final int PRECIO_HORA_TECNICO = 30;
    private int trabajosCompletados;
    public Tecnico(String id, String nombre, int precioHora) {
        super(id, nombre, PRECIO_HORA_TECNICO);
    }

    public int getTrabajosCompletados() {
        return trabajosCompletados;
    }

    @Override
    protected void actualizarDatos() {
        trabajosCompletados++;
        System.out.println("Yuhuuu. He completado otro trabajo. Llevo " + trabajosCompletados + " trabajos completados");
    }

    @Override
    protected boolean tareaCompletada(int nivelDificultad) {
        return nivelDificultad <= 3;
    }

    @Override
    public void mostrarInformacionEmpleado() {
        super.mostrarInformacionEmpleado();
        System.out.println("Técnico. Trabajos completados: " + trabajosCompletados);
    }
}
