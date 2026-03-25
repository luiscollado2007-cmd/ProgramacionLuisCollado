import java.util.Scanner;

public class EjemploSwitchDiaSemana {

    public static void main(String[] args) {
        /*
        Tenemos que pedir al usuario un día de la semana en String.
        Utilizaremos un switch para mostrar por pantalla qué se va a hacer en cada día.
        De lunes a Viernes, se mostrará al INSTITUTO.
        El sábado, ESCAPE ROOM.
        El domingo, CINE
        para cualquier otro día , mostraremos que no es válido.
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un día de la semana y te diré la rutina.Los posibles valores son:");
        System.out.println("Lunes, Martes, Miércoles, Jueves, Viernes, Sábado, Domingo");
        String diaSemana = teclado.nextLine();

        switch (diaSemana){
            case "Lunes":
            case "Martes":
            case "Miércoles":
            case "Jueves":
            case "Viernes":
                System.out.println("Ir al instituto");
                break;
            case "Sábado":
                System.out.println("Ir a un Escape Room");
                break;
            case "Domingo":
                System.out.println("Ir al cine");
                break;
            default:
                System.out.println("Ese día no lo tengo y ni rutina tiene");

        }
        System.out.println("Dime tu edad por favor");
        int edad = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Me dices que tienes " + edad + " años");

        System.out.println("Dime tu nombre por favor");
        String nombre = teclado.nextLine();
        System.out.println("Tu nombre es: " + nombre);
    }
}
