package examen;

import java.util.Scanner;

public class Ej3_LuisCollado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("*** MONITORIZACIÓN DE SERVIDORES ***");
        System.out.println("¿Cuántos servidores registramos?");
        int numServidores = teclado.nextInt();
        double indiceServidor;
        String valorIndice = "";
        String nombreServidor = "";
        double cpuServidor = 0;
        double ramServidor = 0;

        for (int cont = 0; cont < numServidores; cont++) {
            System.out.println("INTRODUCE DATOS DEL SERVIDOR " + (cont+1) + " (Nombre, CPU, RAM)");
            nombreServidor = teclado.next();
            cpuServidor = teclado.nextDouble();
            ramServidor = teclado.nextDouble();


        }
        for (int contServidores = 0; contServidores < numServidores; contServidores++) {
            indiceServidor = cpuServidor + (ramServidor/100) * 10;
            if (indiceServidor < 25){
                valorIndice = "Baja carga";
            } else if (indiceServidor >= 25 && indiceServidor < 35) {
                valorIndice = "Carga media";
            }else if (indiceServidor >= 35){
                valorIndice = "Carga alta";
            }
        }


        System.out.println("***** RESULTADO ********");
        for (int cont1 = 0; cont1 < numServidores; cont1++) {
            System.out.println(nombreServidor + ":" + valorIndice);
        }



    }
}
