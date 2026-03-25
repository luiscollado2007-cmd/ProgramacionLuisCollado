package poo2.ejerciciosaulavirtual;

public class ProgramaEmpleado {
    public static void main(String[] args) {
        Empleado uno = new Empleado("32456789J","Ibra",1000);
        Empleado dos = new Empleado("42132122V","Alejandro",2000);
        Empresa w = new Empresa("Alsa","33we43444");
        w.anyadirEmpleado(uno);
        w.anyadirEmpleado(dos);
        w.informacionCortaEmpleados();
        System.out.println("El total del sueldo bruto de los empleados es: " + w.totalSueldoBrutoEmpleados());
        System.out.println("El total del sueldo neto de los empleados es: " + w.totalSueldoNetoEmpleados());
    }
}
