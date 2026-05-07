package excepciones.dawbank;

import excepciones.dawbank.exceptions.CuentaException;
import excepciones.dawbank.exceptions.IbanInvalidoException;

import java.util.Scanner;
//ES6112343456420456323532
public class DawBank {

    public static String ROJO = "\u001B[31m";
    public static String RESET = "\u001B[0m";
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        boolean datosValidos = false;
        CuentaBancaria cuenta = null;
        do {
            System.out.println("--- REGISTRO DE CUENTA ---");
            System.out.print("Introduzca IBAN: ");
            String iban = sc.nextLine();
            System.out.print("Introduzca información del titular. Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Introduzca información del titular. Apellido1: ");
            String apellido1 = sc.nextLine();
            System.out.print("Introduzca información del titular. DNI: ");
            String dni = sc.nextLine();

            Persona titular = new Persona(nombre, apellido1, dni);

            // Creamos el objeto de la lógica

            try {
                cuenta = new CuentaBancaria(iban, titular);

                System.out.println("Cuenta creada");
                datosValidos = true;

            } catch (IbanInvalidoException e) {
                System.out.println(ROJO + "Error al crear cuenta con iban invalido: " + e.getIbanInvalido() + RESET);
            } catch (CuentaException e){
                System.out.println(ROJO + "Error al crear cuenta: " + e.getMessage() + RESET);
            }

            if(!datosValidos){
                System.out.println(" (Por favor, inténtelo de nuevo)");
            }

        }while (!datosValidos);

        int opcion;
        do {
            System.out.println("\n--- MENÚ BANCARIO ---");
            System.out.println("1. Datos de la cuenta\n2. IBAN\n3. Titular\n4. Saldo");
            System.out.println("5. Ingreso\n6. Retirada\n7. Movimientos\n8. Buscar movimientos por concepto");
            System.out.println("9. Buscar movimientos por importe minimo");
            System.out.println("\n0. Salir");
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

                    try {
                        if (cuenta.ingresar(importe, conceptoIngresar)) {
                            System.out.println("Ingreso realizado.");
                        } else {
                            System.out.println("Error en el ingreso.");
                        }
                    }catch (CuentaException cuentaEx){
                        System.err.println("Error al ingresar: " + cuentaEx.getMessage());
                    }
                    break;
                case 6:
                    System.out.print("Cantidad a retirar: ");
                    double importeRetirada = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("¿Qué ponemos en el concepto?: ");
                    String conceptoRetirada = sc.nextLine();
                    try{
                        if (cuenta.retirar(importeRetirada, conceptoRetirada)) {
                            System.out.println("Retirada realizada.");
                        } else {
                            System.out.println("Saldo insuficiente o cantidad inválida.");
                        }
                    }catch (CuentaException cuentaEx){
                        System.err.println("Error al retirar: " + cuentaEx.getMessage());
                    }
                    break;
                case 7:
                    System.out.println("--- HISTORIAL ---");
                    cuenta.mostrarMovimientos();
                    break;
                case 8:
                    System.out.println("Dime una cadena para buscar por concepto");
                    String concepto = sc.nextLine();

                    //cuenta.mostrarMovimientoPorConcepto(concepto);
                    cuenta.mostrarMovimientosPorConcepto(concepto);

                    break;
                case 9:
                    System.out.println("Dime una precio minimo para buscar movimientos");
                    double importeMinimo = sc.nextDouble();

                    Movimiento[] movs =cuenta.buscarMovimientosPorImporteMinimo(importeMinimo);

                    if(movs != null){
                        for(int pos = 0; pos < movs.length; pos++){
                            movs[pos].imprimirMovimiento();
                        }
                    }


                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}