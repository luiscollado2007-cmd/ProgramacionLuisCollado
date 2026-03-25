package poo2.simulacroexamen;

public class Coordinador extends Empleado implements Mandador{

    public static final int PRECIO_HORA_COORDINADOR = 30;
    public static final String PALABRA_CLAVE_VENTA = "venta";
    public static final String ARREGLAR = "arreglar";
    private EmpleadosConTareas[] empleadosConTareas;
    private int numEmpleados;


    public Coordinador(String id, String nombre, double precioHora) {
        super(id, nombre, precioHora);
        empleadosConTareas = new EmpleadosConTareas[50];
    }

    public boolean anyadirEmpleado(EmpleadosConTareas empleadosConTareas1){
        if (empleadosConTareas1 == null){
            System.out.println("No se puede añadir un empleado nulo");
            return false;
        }
        for (int cont = 0; cont < numEmpleados; cont++) {
            if (empleadosConTareas[cont].getId().equalsIgnoreCase(empleadosConTareas1.getId())){
                System.out.println("El empleado ya está asignado a este coordinador");
                return false;
            }
        }

        empleadosConTareas[numEmpleados] = empleadosConTareas1;
        numEmpleados++;
        return true;
    }

    @Override
    public boolean mandarTarea(String descripcion, int dificultad) {
        boolean estadoTarea = false;
        System.out.println("El coordinador " + nombre + " recibe la tarea " + descripcion);

        if (numEmpleados > 0){
            descripcion =  descripcion.toLowerCase();
            if (descripcion.contains(PALABRA_CLAVE_VENTA)){
                for (int cont = 0; cont < numEmpleados; cont++) {
                    if (empleadosConTareas[cont] instanceof Vendedor){
                        System.out.println("Se va a pasar la tarea al vendedor: " + empleadosConTareas[cont].getNombre());
                        estadoTarea = empleadosConTareas[cont].ejecutarTarea(descripcion, dificultad);
                        break;
                    }
                }
            }else if(descripcion.contains(ARREGLAR)){
                for (int cont = 0; cont < numEmpleados; cont++) {
                    if (empleadosConTareas[cont] instanceof Tecnico){
                        System.out.println("Se va a pasar la tarea al Técnico: " + empleadosConTareas[cont].getNombre());
                        estadoTarea = empleadosConTareas[cont].ejecutarTarea(descripcion, dificultad);
                        break;
                    }
                }
            }
        }


        return estadoTarea;
    }
}
