package poo.dawbank;

public class Persona {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private final String dni;
    private boolean esMoroso;

    public Persona(String nombre, String apellido1, String apellido2, String dni) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
    }

    public Persona(String nombre, String apellido1, String dni) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public boolean isEsMoroso() {
        return esMoroso;
    }

    public void setEsMoroso(boolean esMoroso) {
        this.esMoroso = esMoroso;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Información Persona: " +
                "- Nombre='" + nombre + '\'' +
                "- Apellido1='" + apellido1 + '\'' +
                "- Apellido2='" + apellido2 + '\'' +
                "- Dni='" + dni + '\'' +
                "- esMoroso=" + Utils.convertirValorBooleanAString(esMoroso);
    }
}
