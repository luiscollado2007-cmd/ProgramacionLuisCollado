import java.util.Scanner;

public class EjercicioNotas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime tu nota y te digo la calificación");
        float nota = teclado.nextFloat();

        if(nota > 0 && nota < 5){
            System.out.println("Tu calificación es un suspenso");
        }else if (nota < 6 && nota > 5){
            System.out.println("Tu calificación es un suficiente");
        }else if (nota < 7 && nota > 6) {
            System.out.println("Tu calificación es un bien ");
        }else if (nota < 9 && nota > 7) {
            System.out.println("Tu calificación es un notable");
        }else if (nota > 9 && nota < 10){
            System.out.println("Tu calificación es un sobresaliente");
        }else if (nota == 10){
            System.out.println("Tu calificación es una matrícula de honor");
        }else if (nota < 0){
            System.out.println("Tu nota no es válida");
        }else if (nota > 10){
            System.out.println("Tu nota no es válida");
        }

    }


}
