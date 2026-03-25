package bucles;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ve dandome notas y te digo si hubo alguna con valor 10. Escribe -1 para terminar");
        float nota;
        boolean huboNota10 = false;
        do {
            System.out.println("Dime nota:");
            nota = teclado.nextFloat();

            if ( (nota < 0 || nota > 10) && nota != -1){
                System.out.println("Nota fuera del rango");
            }

            if (nota == 10){
                huboNota10 = true;
            }
        }while (nota != -1);

        if (huboNota10){
            System.out.println("Hubo nota con valor 10");
        }else{
            System.out.println("No hubo ninguna nota de 10");
        }
    }
}
