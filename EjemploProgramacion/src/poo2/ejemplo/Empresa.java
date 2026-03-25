package poo2.ejemplo;

public class Empresa {

    private Empleado[] empleados;
    private int contador; // cuántos empleados hay realmente

    public Empresa(int capacidad) {
        empleados = new Empleado[capacidad];
        contador = 0;
    }

    public void agregarEmpleado(Empleado e) {
        if (contador < empleados.length) {
            empleados[contador] = e;
            contador++;
        } else {
            System.out.println("No hay espacio para más empleados");
        }
    }

    public boolean eliminarEmpleado(int id) {
        // 1. Buscar el índice del empleado
        int indice = -1;
        for (int i = 0; i < contador; i++) {
            if (empleados[i].getId() == id) {
                indice = i;
                break;
            }
        }

        if (indice == -1) {
            return false; // No encontrado
        }

        // 2. Mover los elementos hacia atrás
        for (int i = indice; i < contador - 1; i++) {
            empleados[i] = empleados[i + 1];
        }

        // 3. Eliminar la última referencia y reducir contador
        empleados[contador - 1] = null;
        contador--;

        return true;
    }

    public void listarEmpleados() {
        for (int i = 0; i < contador; i++) {
            empleados[i].imprimir();
        }
    }
}