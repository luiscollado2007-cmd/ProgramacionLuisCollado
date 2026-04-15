package excepciones;

public class PersonaValidacion {

    //dni, nombre, apellidos y edad.
    private String nombre;
    private String apellidos;
    private String dni;
    private int edad;

    public PersonaValidacion(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;

    }

    public PersonaValidacion(String nombre, String apellidos, String dni, int edad) throws DniInvalidoException {
        this.nombre = nombre;
        this.apellidos = apellidos;
        //TODO: validamos el DNI, y si es invalido, elevamos una excepcion
        if(!PersonaValidacion.validarDNI(dni)){
            throw new DniInvalidoException("El DNI: " + dni + " no es válido");
        }
        this.dni = dni;
        this.edad = edad;
    }

    public void imprime(){
        System.out.println("** DATOS DE LA PERSONA ** ");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellidos: " + this.apellidos);
        System.out.println("DNI: " + this.dni);
        System.out.println("Edad: " + this.edad);
    }
    // Devuelve true si tiene 65 años o más (false si no).
    public boolean esJubilado(){
        return (this.edad >= 65);
    }
    public boolean esMayorEdad(){
        return (this.edad >= 18);
    }

    public int diferenciaEdad(PersonaValidacion otro){
        int edadDelOtro = otro.getEdad();
        return Math.abs( this.edad - edadDelOtro );
    }

    public boolean validarDniPersona(){
        return PersonaValidacion.validarDNI(this.dni);
    }

    public static boolean validarDNI(String dni){
        //tiene 8 números y una letra
        boolean esValido = true;
        //comprobar...la longitud
        if(dni ==null || dni.length() != 9){
            return false;
        }

        int cont = 0;
        //1º compruebo los 8 digitos
        while(esValido && cont < 8){
            char numero = dni.charAt(cont);
            if(!Character.isDigit(numero)){
                esValido = false;
            }
            cont++;
        }

        //2º compruebo la letra final
        if(esValido && !Character.isLetter(dni.charAt(dni.length()-1))){
            esValido = false;
        }

        return esValido;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}