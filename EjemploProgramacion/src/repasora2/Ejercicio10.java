package repasora2;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un día");
        int dia = sc.nextInt();
        sc.nextLine();

        System.out.println("Ahora, dame el mes");
        int mes = sc.nextInt();
        sc.nextLine();

        System.out.println("Y dame el año");
        int anyo = sc.nextInt();
        sc.nextLine();

        System.out.println("La fecha que has introducido es: " + (fechaCorrecta(dia,mes,anyo) ? "Correcta" : "Incorrecta"));
    }

    public static boolean fechaCorrecta(int a, int b, int c){
        return (a >= 1 && a <= 30) && (b >= 1 && b <= 12) && (c > 0);
    }
}
