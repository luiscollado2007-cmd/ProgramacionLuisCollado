import java.util.Scanner;

public class EjemploSwitch {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un número de dia a la semana, y te digo cómo se llama");
        int numDia = teclado.nextInt();

        String diaDeSemana = null;
        switch (numDia){
            case 1:
                diaDeSemana = "LUNES";
                break;
            case 2:
                diaDeSemana = "MARTES";
                break;
            case 3:
                diaDeSemana = "MIÉRCOLES";
                break;
            case 4:
                diaDeSemana = "JUEVES";
                break;
            case 5:
                diaDeSemana = "VIERNES";
                break;
            case 6:
                diaDeSemana = "SÁBADO";
                break;
            case 7:
                diaDeSemana = "DOMINGO";
                break;
            default:
                System.out.println("Ese día no lo tengo registrado");
        }

        if(diaDeSemana != null){
            System.out.println("Es el día: " + diaDeSemana);
        }
    }
}
