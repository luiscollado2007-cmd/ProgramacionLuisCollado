package poo2.instituto;

public class Empleado extends Persona{
    private int codEmpleado;
    private double sueldo;


    public Empleado(String nombre, String apellidos, String dni, int codEmpleado, double sueldo) {
        super(nombre, apellidos, dni);
        this.codEmpleado = codEmpleado;
        this.sueldo = sueldo;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("*** INFO DEL EMPLEADO ***");
        super.imprimirDatos();
        System.out.println("\tCodEmpleado: " + codEmpleado);
        System.out.println("\tSueldo: " + sueldo);
    }

    @Override
    public String toString() {
        return super.toString() + " - Empleado{" +
                "codEmpleado=" + codEmpleado +
                ", sueldo=" + sueldo +
                '}';
    }

    public int getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(int codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
