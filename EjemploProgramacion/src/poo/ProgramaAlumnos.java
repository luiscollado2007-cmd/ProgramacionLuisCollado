package poo;

import java.util.Scanner;

public class ProgramaAlumnos {
    public static void main(String[] args) {
        Alumno paco = new Alumno("Luis", 19, "DAW",8);
        paco.setCurso("DAM");
        paco.setNotaMedia(4.9);
        paco.mostrarInfo();
        paco.estaAprobado(paco.getNotaMedia());
        paco.esMayorEdad(paco.getEdad());

        Alumno alejandro = new Alumno("Ibrahim", 17, "DAM", 7);
        alejandro.setCurso("ASIR");
        alejandro.setNotaMedia(14);
        alejandro.mostrarInfo();
        alejandro.estaAprobado(alejandro.getNotaMedia());
        alejandro.esMayorEdad(alejandro.getEdad());

        double media1 = paco.getNotaMedia();
        double media2 = alejandro.getNotaMedia();

        if (media1 > media2){
            System.out.println("La mejor media la tiene " + paco.getNombre());
        }else{
            System.out.println("La mejor media la tiene: " + alejandro.getNombre());
        }
        //PARTE 5(OPCIONAL)
        System.out.println("*****PARTE 5 OPCIONAL *****");
        System.out.println();

        System.out.println("Vamos a subirle los puntos a Luis.Introduce cuántos puntos se incrementa la nota. Si quieres bajarle" +
                "la nota pon un nº negativo");
        Scanner teclado = new Scanner(System.in);
        double puntos = teclado.nextDouble();

        paco.subirNota(puntos);
        paco.mostrarInfo();


    }
}
