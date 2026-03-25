package Matrices;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime de cuántas personas quieres saber su sueldo y dime el sueldo de hombres y " +
                "el sueldo de mujeres");
        int personas = teclado.nextInt();
        int sueldoHombre = teclado.nextInt();
        int sueldoMujer = teclado.nextInt();
        teclado.nextLine();
        int[] empleados = new int [personas];
        int contHombres = 0;
        int contMujeres = 0;


        for (int cont = 0; cont < personas; cont++) {
            System.out.println("Dime la persona " + (cont+1));
            System.out.println("Pulsa 0 si es varon o 1 si es hembra");
            int genero = teclado.nextInt();
            switch (genero){
                case 0:
                    System.out.println("La persona " + (cont+1) + " es varon");
                    break;
                case 1:
                    System.out.println("La persona " + (cont+1) + " es Hembra");
                    break;
                default:
                    System.out.println("No es válido");
            }

            if (genero == 0){
                contHombres++;
            }else{
                contMujeres++;
            }


        }
        if (sueldoHombre > sueldoMujer){
            System.out.println("Existe brecha salarial.Los hombres cobran más");
        } else if (sueldoMujer > sueldoHombre) {
            System.out.println("Existe brecha salarial.Las mujeres cobran más");
        }else {
            System.out.println("No hay brecha salarial.Cobran por igual.");
        }
        System.out.println("Hay " + contHombres + " Varones");
        System.out.println("Hay " + contMujeres + " Hembras");
        System.out.println("El sueldo medio de los hombres es " + sueldoHombre);
        System.out.println("El sueldo medio de las mujeres es " + sueldoMujer);
    }
}
