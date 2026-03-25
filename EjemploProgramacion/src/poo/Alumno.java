package poo;

public class Alumno {
    private String nombre;
    private int edad;
    private String curso;
    private double notaMedia;


    public Alumno(String nombreInicial, int edadInicial, String cursoInicial, double notaMediaInicial){
        nombre = nombreInicial;
        edad = edadInicial;
        curso = cursoInicial;
        notaMedia = notaMediaInicial;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String setNombre(String nombreNuevo) {
        nombre = nombreNuevo;
        return nombreNuevo;
    }

    public String getCurso() {
        return curso;
    }

    public String setCurso(String cursoNuevo) {
        curso = cursoNuevo;
        return cursoNuevo;
    }

    public int setEdad(int edadNueva) {
        edad = edadNueva;
        return edadNueva;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMediaNueva) {
        if (notaMediaNueva < 0 || notaMediaNueva > 10){
            System.out.println("\t Nota no válida");
        }else{
            notaMedia = notaMediaNueva;
        }

    }

    public void mostrarInfo(){
        System.out.println("DATOS DEL ALUMNO");
        System.out.println("\t Nombre: " + nombre);
        System.out.println("\t Edad: " + edad);
        System.out.println("\t Curso: " + curso);
        System.out.println("\t Nota media: " + notaMedia);
    }




    public boolean estaAprobado(double notaMedia){
        boolean nota;
        if (notaMedia >= 5){
            nota = true;
            System.out.println("\t "+ nombre + " Está aprobado");
        }else{
            nota = false;
            System.out.println("\t " + nombre + " Está suspenso");
        }
        return nota;
    }

    public boolean esMayorEdad(int edad){
        return edad >= 18;
    }

    /**
     * Recibe los puntos que debe incrementar a la nota media
     * @param puntos Puntos que se van a sumar a la nota
     */
    public void subirNota(double puntos){
        notaMedia += puntos;
    }


    /*
    HACER UN ORDEN EN UNA CLASE OBJETO:
    1º ATRIBUTOS
    2º CONSTRUCTORES
    3º MÉTODOS ÚTILES/IMPORTANTES
    4º MÉTODOS GET Y SET
     */
}

