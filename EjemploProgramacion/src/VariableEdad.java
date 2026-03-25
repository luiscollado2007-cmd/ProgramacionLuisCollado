import java.util.Scanner;

public class VariableEdad {
    public static void main(String[] args) {
        System.out.println("Dime tu edad y la divido entre 7");
        int edad = 18;
        float i = 18 / 7f;
        System.out.println("Tu edad dividida es: " + i);
        boolean esViejo = ( i > 10);
        System.out.println("¿Es más viejo que 10?" + esViejo);

        //Lectura de datos del teclado
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime tu nombre");
        String nombre = teclado.nextLine();
        System.out.println("Encantado de conocerte, Don/Dña " + nombre);
    }
}
