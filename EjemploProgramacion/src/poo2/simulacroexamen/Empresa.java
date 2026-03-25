package poo2.simulacroexamen;


public class Empresa {
    private String nombre;
    private Empleado[] empleados;
    private int numEmpleados;
    private Coordinador coordinador;
    private double facturacion;

    public Empresa(String nombre) {
        this.nombre = nombre;
        empleados = new Empleado[100];

    }

    public boolean anyadirEmpleado(Empleado empleado){
        if (empleado == null){
            System.out.println("No se puede añadir un empleado nulo");
            return false;
        }
        for (int cont = 0; cont < numEmpleados; cont++) {
            if (empleados[cont].getId().equalsIgnoreCase(empleado.getId())){
                System.out.println("El empleado ya está asignado a este coordinador");
                return false;
            }
        }

        empleados[numEmpleados] = empleado;
        numEmpleados++;
        return true;
    }

    public String getNombre() {
        return nombre;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public int getNumEmpleados() {
        return numEmpleados;
    }

    public Coordinador getCoordinador() {
        return coordinador;
    }

    public double getFacturacion() {
        return facturacion;
    }

    public void recibirTrabajo(String descripcion, double coste, int dificultad){
        System.out.println("----- NUEVO TRABAJO RECIBIDO -----");
        System.out.println("Descripción: " + descripcion);
        System.out.println("Coste: " + coste);
        System.out.println("Dificultad: " + dificultad);
    }

    public double calcularNominasTotal(){
        double total = 0;
        for (int cont = 0; cont < numEmpleados; cont++) {
            total += empleados[cont].calcularNominaMensual();
        }

        return total;
    }
}
