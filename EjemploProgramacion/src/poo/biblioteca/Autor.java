package poo.biblioteca;

public class Autor {
    private String nombre;
    private String apellidos;
    private String nacionalidad;
    private int anyoNacimiento;

    public Autor() {
        this.nombre = "Anónimo";
        this.anyoNacimiento = 1900;
    }

    public Autor(String nombre) {
        this.nombre = nombre;
    }

    public Autor(String nombre, String apellidos, String nacionalidad, int anyoNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nacionalidad = nacionalidad;
        this.anyoNacimiento = anyoNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getAnyoNacimiento(){
        return anyoNacimiento;
    }

    public String toString(){
        return "\t" + "Nombre Completo: " + nombre + " " + apellidos + "\n"
                + "Nacionalidad: " + nacionalidad + "\n" + "Año de nacimiento: " + anyoNacimiento;
    }
}
