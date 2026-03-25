import java.util.Scanner;

public class EjemplosCondiciones {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime tu edad");
        int edad = teclado.nextInt();
        float puntos = 0;
        System.out.println("Me dices que tienes " + edad + " años");

        if(edad < 0){
            System.out.println("No se admiten edades negativas");
        }else{
            if(edad >= 18){
                System.out.println("Eres mayor de edad");
                puntos += 5;
            }else if(edad == 17){//Sino si
                System.out.println("Casi!! Te doy más puntos");
                puntos += 1.5f;
            }else{
                System.out.println("Todavía no llegas");
                puntos +=1;
            }

            System.out.println("Puntos: " + puntos);
            System.out.println("Fin del programa");
        }
        }




}
