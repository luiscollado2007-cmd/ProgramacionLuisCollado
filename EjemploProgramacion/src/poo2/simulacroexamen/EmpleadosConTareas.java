package poo2.simulacroexamen;

public abstract class EmpleadosConTareas extends Empleado implements EjecutarTarea{
    public EmpleadosConTareas(String id, String nombre, int precioHora) {
        super(id, nombre, precioHora);
    }

    @Override
    public final boolean ejecutarTarea(String descripcion, int nivelDificultad) {
        System.out.println("----- " + nombre + " COMIENZA LA TAREA: " + descripcion + " --------");

        actualizarDatos();

        boolean exito = tareaCompletada(nivelDificultad);

        if (exito){
            System.out.println("El empleado " + nombre + " ha completado la tarea con éxito");
        }else{
            System.out.println("El empleado " + nombre + " no ha completado la tarea");
        }
        return exito;
    }

    protected abstract void actualizarDatos();
    protected abstract boolean tareaCompletada(int nivelDificultad);
}
