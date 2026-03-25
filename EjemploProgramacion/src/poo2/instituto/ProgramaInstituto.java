package poo2.instituto;

public class ProgramaInstituto {
    public static void main(String[] args) {
        Alumno miAlumno = new Alumno("Ibrahim","Epea","34213217H",256793847,"DAW");
        System.out.println(miAlumno);
        System.out.println("El alumno es del curso: " + miAlumno.getCurso());

        Profesor miProfesor = new Profesor("Alejandro","Montero","06078959K", 332145
        , 2005.55,"Matemático");
        System.out.println(miProfesor);
        System.out.println("La especialidad del profesor es: " + miProfesor.getEspecialidad());

        Conserje miConserje = new Conserje("Pepe", "Pérez","04050667N", 203456
        , 1307.99, "Limpiador");
        miConserje.imprimirDatos();
        System.out.println("El dni del conserje es: " + miConserje.getDni());
    }
}
