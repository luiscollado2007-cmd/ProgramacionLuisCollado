package excepciones;

import java.util.Scanner;

public class PruebaDivisionCero {

    public static void main(String[] args) {

        try{


            Scanner teclado = new Scanner(System.in);
            System.out.println("Hago la division entre 2 numeros. dimelos");
            int numero1 = teclado.nextInt();
            int numero2 = teclado.nextInt();

            System.out.println("La division es: " + dividir(numero1, numero2));

        }catch (ArithmeticException ex){
            System.out.println("Probablemente se dividió por cero: " + ex);
        }catch (Exception e){
            System.out.println("Se ha producido un error general: " + e);
        }


    }
    private static double dividir(int numero1, int numero2){
        return numero1 / numero2;
    }

}