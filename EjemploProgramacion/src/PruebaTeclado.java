import java.util.Scanner;

public class PruebaTeclado {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime tu edad, por favor");
        int edad = teclado.nextInt();
        System.out.println("Tu edad es: " + edad);

        System.out.println("Dime tu nota, por favor");
        float nota = teclado.nextFloat();
        System.out.println("Tu nota  es: " + nota);
    }
}
