package poo2.ejerciciosaulavirtual;

public class Empleado implements ObligacionesHacienda {
    public static final int SUELDO_MINIMO = 12000;
    public static final int SUELDO_MEDIO = 25000;
    private String dni;
    private String nombre;
    private double sueldoBruto;
    private int edad;
    private int telefono;
    private String direccion;


    public Empleado(String dni, String nombre, double sueldoBruto) {
        this.dni = dni;
        this.nombre = nombre;
        this.sueldoBruto = sueldoBruto;
    }

    public String getDni() {
        return dni;
    }


    public String getNombre() {
        return nombre;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void informacionEmpleado(){
        System.out.println("DNI: " + getDni());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Sueldo bruto: " + getSueldoBruto());
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", sueldoBruto=" + sueldoBruto +
                ", edad=" + edad +
                ", telefono=" + telefono +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    public double porcentajeIrpf(){
        double sueldoFinal = sueldoBruto * 12;
        double irpf = 0;
        if (sueldoFinal < SUELDO_MINIMO){
            irpf = 0.2;
        } else if (sueldoBruto <= SUELDO_MEDIO) {
            irpf = 0.3;
        }else{
            irpf = 0.4;
        }

        return irpf;
    }

    public double calcularSueldoNetoMensual(){
        double irpf = porcentajeIrpf();
        return sueldoBruto * (1 - irpf);
    }

    @Override
    public double declarar() {
        return sueldoBruto * 0.1;
    }
}
