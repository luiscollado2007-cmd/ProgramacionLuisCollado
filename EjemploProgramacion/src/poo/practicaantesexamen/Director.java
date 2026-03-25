package poo.practicaantesexamen;

public class Director {
    private String nombre;
    private String pais;
    private int anyoNacimiento;


    public Director(String nombre, String pais, int anyoNacimiento) {
        this.nombre = nombre;
        this.pais = pais;
        this.anyoNacimiento = anyoNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public int getAnyoNacimiento() {
        return anyoNacimiento;
    }

    @Override
    public String toString() {
        return "Director{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", anyoNacimiento=" + anyoNacimiento +
                '}';
    }
}
