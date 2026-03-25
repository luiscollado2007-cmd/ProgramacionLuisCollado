package poo2.simulacroexamen;

public abstract class Empleado {
    public static final int MENSUAL = 4;
    protected String id;
    protected String nombre;
    protected double precioHora;
    public static final int HORAS_POR_SEMANA = 40;


    public Empleado(String id, String nombre, double precioHora) {
        this.id = id;
        this.nombre = nombre;
        this.precioHora = precioHora;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(int precioHora) {
        this.precioHora = precioHora;
    }

    public void mostrarInformacionEmpleado(){
        System.out.println("***INFORMACIÓN DEL EMPLEADO***");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio por la hora: " + precioHora);
    }

    public double calcularNominaMensual(){
        return HORAS_POR_SEMANA * MENSUAL * precioHora;
    }

}
