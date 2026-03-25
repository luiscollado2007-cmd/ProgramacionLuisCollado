package bucles;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        final int TARIFA_BASICA = 12;
        final int TARIFA_INTERMEDIO = 15;
        final int TARIFA_ALTA = 25;
        int sueldoEmpleado;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime cuántas horas trabajas y te digo el sueldo");
        int horas = teclado.nextInt();

        if (horas < 0){
            System.out.println("Lo siento, no te puedo hacer la tarifa con ese número");
        }else if (horas < 20) {
            sueldoEmpleado =  horas * TARIFA_BASICA;
            System.out.println("El sueldo es: " + sueldoEmpleado + "€");
        } else if (horas == 20){
            sueldoEmpleado =  20 * TARIFA_BASICA;
            System.out.println("El sueldo es: " + sueldoEmpleado + "€");
        } else if  (horas < 30){
            sueldoEmpleado =  20 * TARIFA_BASICA + (horas - 20) * TARIFA_INTERMEDIO;
            System.out.println("El sueldo es: " + sueldoEmpleado + "€");
        } else if (horas == 30) {
            sueldoEmpleado = 20 * TARIFA_BASICA + 10 * TARIFA_INTERMEDIO;
            System.out.println("El sueldo es: " + sueldoEmpleado + "€");
        } else {
            sueldoEmpleado = 20 * TARIFA_BASICA + 10 * TARIFA_INTERMEDIO + (horas - 30) * TARIFA_ALTA;
            System.out.println("El sueldo es: " + sueldoEmpleado + "€");
        }
    }

}
