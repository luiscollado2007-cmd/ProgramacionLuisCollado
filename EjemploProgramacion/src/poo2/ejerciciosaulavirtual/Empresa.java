package poo2.ejerciciosaulavirtual;

import java.util.Arrays;

public class Empresa implements ObligacionesHacienda {
    public static final int MAX_EMPLEADOS = 5;
    private String nombre;
    private String cif;
    private int telefono;
    private String direccion;
    private Empleado[] empleado;
    private int posProxEmpleado = 0;
    private double facturacion;

    public Empresa(String nombre, String cif) {
        this.nombre = nombre;
        this.cif = cif;
        this.empleado = new Empleado[MAX_EMPLEADOS];
    }

    public String getNombre() {
        return nombre;
    }

    public double getFacturacion() {
        return facturacion;
    }

    public void setFacturacion(double facturacion) {
        this.facturacion = facturacion;
    }

    public String getCif() {
        return cif;
    }


    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Empleado[] getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado[] empleado) {
        this.empleado = empleado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void anyadirEmpleado(Empleado em){
        if (posProxEmpleado != MAX_EMPLEADOS){
            empleado[posProxEmpleado] = em;
            posProxEmpleado++;
        }
    }

    public void eliminarEmpleado(Empleado e){

    }

    public void informacionEmpleados(){
        System.out.println("*** INFORMACIÓN DE LOS EMPLEADOS ***");
        for (int cont = 0; cont < posProxEmpleado; cont++) {
            Empleado e = empleado[cont];
            e.informacionEmpleado();
            System.out.println();
        }
    }

    public void informacionCortaEmpleados(){
        System.out.println("*** INFORMACIÓN DE LOS EMPLEADOS ***");
        for (int cont = 0; cont < posProxEmpleado; cont++) {
            Empleado empleado1 = empleado[cont];
            System.out.println("DNI: " + empleado1.getDni());
            System.out.println("Sueldo bruto: " + empleado1.getSueldoBruto());
            System.out.println("Sueldo neto: " + empleado1.calcularSueldoNetoMensual());
            System.out.println();
        }
    }

    public double totalSueldoBrutoEmpleados(){
        double total = 0;
        for (int cont = 0; cont < posProxEmpleado; cont++) {
            Empleado nuevo = empleado[cont];
            total += nuevo.getSueldoBruto();
        }
        return total;
    }

public double totalSueldoNetoEmpleados(){
    double total = 0;
    for (int cont = 0; cont < posProxEmpleado; cont++) {
        Empleado n = empleado[cont];
        total += n.calcularSueldoNetoMensual();
        }
    return total;
    }

    @Override
    public double declarar() {
        return 0;
    }
}
