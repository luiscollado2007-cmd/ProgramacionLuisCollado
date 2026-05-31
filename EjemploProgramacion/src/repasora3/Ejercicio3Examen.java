package repasora3;

import java.util.Scanner;

public class Ejercicio3Examen {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("*** MONITORIZACIÓN DE SERVIDORES ***");
        System.out.println("¿Cuántos servidores registramos?");
        int numServidores = teclado.nextInt();
        int[] servidores = new int[numServidores];
        String[] nombreServidor = new String[numServidores];
        double[] cpuServidor = new double[numServidores];
        double[] ramServidor = new double[numServidores];
        double[] indice = new double[numServidores];


        for (int cont = 0; cont < servidores.length; cont++) {
            System.out.println("- INTRODUCE DATOS DEL SERVIDOR " + (cont + 1) + " (Nombre,CPU,RAM)");
            nombreServidor[cont] = teclado.next();
            cpuServidor[cont] = teclado.nextDouble();
            teclado.nextLine();
            ramServidor[cont] = teclado.nextDouble();

            indice[cont] = cpuServidor[cont] + (ramServidor[cont]/100) * 10;
        }

        System.out.println("****** RESULTADO ******");
        for (int cont = 0; cont < servidores.length; cont++) {
            String resultadoCarga ;
            if (indice[cont] >= 35){
                resultadoCarga = "Carga alta";
            }else if (indice[cont] >= 25 && indice[cont] < 35){
                resultadoCarga = "Carga media";
            }else{
                resultadoCarga = "Baja carga";
            }
            System.out.println(nombreServidor[cont] + ": " + resultadoCarga);
        }
    }
}
