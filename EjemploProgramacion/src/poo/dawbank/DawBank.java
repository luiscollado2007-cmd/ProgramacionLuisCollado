package poo.dawbank;

import java.util.Scanner;

public class DawBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- REGISTRO DE CUENTA ---");
        System.out.print("Introduzca IBAN: ");
        String iban = sc.nextLine();
        System.out.print("Introduzca información del Titular. Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Introduzca información del Titular. DNI: ");
        String dni = sc.nextLine();
        System.out.print("Introduzca información del Titular. Apellido: ");
        String apellido1 = sc.nextLine();

        Persona titularUsuario = new Persona(nombre, apellido1, dni);

        // Creamos el objeto de la lógica
        CuentaBancaria cuenta = new CuentaBancaria(iban,titularUsuario);

        int opcion;
        do {
            System.out.println("\n--- MENÚ BANCARIO ---");
            System.out.println("1. Datos de la cuenta\n2. IBAN\n3. Titular\n4. Saldo");
            System.out.println("5. Ingreso\n6. Retirada\n7. Movimientos\n8. Buscar movimientos por concepto");
            System.out.println("9.Buscar movimientos por importe mínimo");
            System.out.println("0. Salir");
            System.out.print("Seleccione opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    cuenta.imprimirCuentaBancaria();
                    break;
                case 2:
                    System.out.println("IBAN: " + cuenta.getIban());
                    break;
                case 3:
                    System.out.println("Titular: " + cuenta.getTitular());
                    break;
                case 4:
                    System.out.println("Saldo actual: " + cuenta.getSaldo() + "€");
                    break;
                case 5:
                    System.out.print("Cantidad a ingresar: ");
                    double importe = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("¿Qué ponemos en el concepto?: ");
                    String conceptoIngresar = sc.nextLine();

                    if (cuenta.ingresar(importe, conceptoIngresar)) {
                        System.out.println("Ingreso realizado.");
                    } else {
                        System.out.println("Error en el ingreso.");
                    }
                    break;
                case 6:
                    System.out.print("Cantidad a retirar: ");
                    double importeRetirada = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("¿Qué ponemos en el concepto?: ");
                    String conceptoRetirada = sc.nextLine();
                    if (cuenta.retirar(importeRetirada, conceptoRetirada)) {
                        System.out.println("Retirada realizada.");
                    } else {
                        System.out.println("Saldo insuficiente o cantidad inválida.");
                    }
                    break;
                case 7:
                    System.out.println("--- HISTORIAL ---");
                    cuenta.mostrarMovimientos();
                    break;
                case 8:
                    System.out.println("Dime una cadena para buscar por concepto");
                    String concepto = sc.nextLine();
                    break;

                case 9:
                    System.out.println("Dime un precio minimo para buscar movimientos");
                    double importeMinimo = sc.nextDouble();
                    Movimiento[] movs = cuenta.buscarMovimientoPorCantidadMinima(importeMinimo);
                    if (movs != null){
                        for (int cont = 0; cont < movs.length; cont++) {
                            movs[cont].imprimirMovimiento();
                        }
                    }
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 8);

        sc.close();
    }
}
