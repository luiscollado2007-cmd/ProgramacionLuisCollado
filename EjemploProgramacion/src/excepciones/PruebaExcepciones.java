package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PruebaExcepciones {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime tu edad, por favor");
        try {
            int numero = teclado.nextInt();
            System.out.println("Tu edad es: " + numero);
            int[] array = new int[2];
            array[5] = 999;
        }catch (InputMismatchException exception){
            System.out.println("Hay que decir exactamente el número de tu edad: " + exception);
        }catch (IllegalStateException ex){
            System.out.println("Parece que se ha cerrado el scanner... Más info: " + ex.getLocalizedMessage());
        } catch (Exception e) {
            System.out.println("Se ha producido una excepción genérica: " + e);
        }
        System.out.println("Adios!!!!!");
    }
}
