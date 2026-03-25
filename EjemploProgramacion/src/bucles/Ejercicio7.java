package bucles;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Tienes DNI o NIE?Responde 'DNI' para DNI, 'NIE' para NIE");
        String respuesta = teclado.nextLine();

        if (respuesta.equals("DNI")) {
            //TODO: hacer tratamiento dni
            System.out.println("Ok, dime los numeros de DNI sin la letra. Te calculo yo la letra");
            int numero = teclado.nextInt();
            int resto = numero % 23;
            char letraDocumento = switch (resto) {
                case 0 -> 'T';
                case 1 -> 'R';
                case 2 -> 'W';
                case 3 -> 'A';
                case 4 -> 'G';
                case 5 -> 'M';
                case 6 -> 'Y';
                case 7 -> 'F';
                case 8 -> 'P';
                case 9 -> 'D';
                case 10 -> 'X';
                case 11 -> 'B';
                case 12 -> 'N';
                case 13 -> 'J';
                case 14 -> 'Z';
                case 15 -> 'S';
                case 16 -> 'Q';
                case 17 -> 'V';
                case 18 -> 'H';
                case 19 -> 'L';
                case 20 -> 'C';
                case 21 -> 'K';
                case 22 -> 'E';
                default -> ' ';
            };

            System.out.println("Tu letra es: " + letraDocumento);

        } else if (respuesta.equals("NIE")) {
            //TODO: hacer tratamiento nie
            //X3.562.585
            System.out.println("Dime la primera letra de tu NIE");
            String primeraLetra = teclado.nextLine();
            int primerNumero = switch (primeraLetra) {
                case "X" -> 0;
                case "Y" -> 1;
                case "Z" -> 2;
                default -> -1;
            };
            if (primerNumero != -1) {
                System.out.println("Introduce el número de tu NIE sin letra😊");
                int numDocumento = teclado.nextInt();

                primerNumero = primerNumero * 10_000_000;
                int numeroNieEntero = primerNumero + numDocumento;
                System.out.println("numeroNieEntero = " + numeroNieEntero);

                int resto = numeroNieEntero % 23;
                char letraDocumento = switch (resto) {
                    case 0 -> 'T';
                    case 1 -> 'R';
                    case 2 -> 'W';
                    case 3 -> 'A';
                    case 4 -> 'G';
                    case 5 -> 'M';
                    case 6 -> 'Y';
                    case 7 -> 'F';
                    case 8 -> 'P';
                    case 9 -> 'D';
                    case 10 -> 'X';
                    case 11 -> 'B';
                    case 12 -> 'N';
                    case 13 -> 'J';
                    case 14 -> 'Z';
                    case 15 -> 'S';
                    case 16 -> 'Q';
                    case 17 -> 'V';
                    case 18 -> 'H';
                    case 19 -> 'L';
                    case 20 -> 'C';
                    case 21 -> 'K';
                    case 22 -> 'E';
                    default -> ' ';
                };

                System.out.println("Tu letra es: " + letraDocumento);

            } else {
                System.out.println("Letra no soportada...");
            }
        }
    }
}