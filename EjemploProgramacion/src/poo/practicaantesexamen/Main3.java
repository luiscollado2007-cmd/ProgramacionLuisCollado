package poo.practicaantesexamen;

public class Main3 {
    public static void main(String[] args) {
        Alumno2 paco = new Alumno2("Ibra",20, "DAM", 4.5);
        paco.setNotaMedia(9.25);
        paco.setCurso("DAW");

        Alumno2 seso = new Alumno2("Alejandro", 25, "DAW", 7.5);
        seso.setNotaMedia(9);
        seso.setCurso("ASIR");


        Alumno2 derto = new Alumno2("Alvaro",19, "ASIR", 8);
        derto.setNotaMedia(7.25);
        derto.setCurso("DAM");


        paco.mostrarInfo();
        System.out.println("¿Está aprobado? " + paco.estaAprobado());
        System.out.println();
        seso.mostrarInfo();
        System.out.println("¿Está aprobado? " + seso.estaAprobado());
        System.out.println();
        derto.mostrarInfo();
        System.out.println("¿Está aprobado? " + derto.estaAprobado());
        System.out.println();



        if (paco.getNotaMedia() > seso.getNotaMedia()){
            System.out.println("La mayor nota media entre " + paco.getNombre() + " y " + seso.getNombre() + " es de "
                    + paco.getNombre() + " con un " + paco.getNotaMedia());
        }else{
            System.out.println("La mayor nota media entre " + paco.getNombre() + " y " + seso.getNombre() + " es de "
                    + seso.getNombre() + " con un " + seso.getNotaMedia());
        }
    }
}
