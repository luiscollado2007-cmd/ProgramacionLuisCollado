package poo2.ejemplo;

public class Main {
    public static void main(String[] args) {

        Empresa empresa = new Empresa(10);

        empresa.agregarEmpleado(new Empleado(1, "Ana"));
        empresa.agregarEmpleado(new Empleado(2, "Luis"));
        empresa.agregarEmpleado(new Empleado(3, "Marta"));

        empresa.listarEmpleados();

        System.out.println("Eliminando a un empleado...");
        empresa.eliminarEmpleado(3);

        empresa.listarEmpleados();
    }
}