package poo;

public class PersonaNueva {
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;



    public PersonaNueva(String nombreIni, String dniIni,String apellidosIni, int edadIni){
        nombre = nombreIni;
        dni = dniIni;
        apellidos = apellidosIni;
        edad = edadIni;

    }

    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Apellido: " + apellidos);
        System.out.println("Edad: " + edad);
    }

    public boolean esJubilado(){
        return this.edad >= Constantes.Edad_Jublicacion;
    }

    public boolean esMayorEdad(){
        return this.edad >= Constantes.Mayoria_Edad;
    }

    public int diferenciaEdad(PersonaNueva otro){
        int edadDelOtro = otro.getEdad();
        return Math.abs(this.edad - edadDelOtro);
    }

    public boolean validarDniPersona(){
        return PersonaNueva.validarDNI(this.dni);
    }

    static boolean validarDNI(String dni){
        boolean esValido = true;
        int cont = 0;

        if (dni == null || dni.length() != 9){
            return false;
        }
        //1º compruebo los 8 dígitos
        while (esValido && cont < 8){
            char numero = dni.charAt(cont);
            if (!Character.isDigit(numero)){
                esValido = false;
            }
            cont++;
        }

        //2º compruebo la letra final
        if (esValido && !Character.isLetter(dni.charAt(dni.length() - 1))){
            esValido = false;
        }

        return esValido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
