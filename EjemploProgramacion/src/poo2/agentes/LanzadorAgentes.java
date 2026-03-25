package poo2.agentes;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class LanzadorAgentes {
    public static void main(String[] args) {
      //  Agente friki = new Hacker("Z3r0Co0l");
        //friki.ejecutarMision("robar credenciales");

        //TODO: crear las clases ninja y diplomático que heredan de Agente
        //Todo: crear array de agentes, metiendo 2 objetos de hakcer, 1 de diplomaticos y 2 ninjas
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime cuántas misiones de máximo lanzamos");
        int numMaxMisiones = teclado.nextInt();
        Agente[] agentesSecretos = generarListaAgentes();
        int numMisiones = 0;
        boolean misionCompletada = false;
        do {
           numMisiones++;
            System.out.printf("\n **** LANZANDO MISION %d **** \n", numMisiones);
            misionCompletada = lanzarMision(agentesSecretos);
        }while (!misionCompletada && numMisiones < numMaxMisiones);

        if (misionCompletada){
            System.out.println("**** LOS AGENTES COMPLETARON LA MISIÓN EN " + numMisiones + " INTENTOS ****");
        }else{
            System.out.println("**** LOS AGENTES NO HAN COMPLETADO LA MISIÓN");
        }



        //TODO: USANDO UN FOR, pasar por todos los objetos haciendo que se ejecute el objetivo "ROBAR EL BANCO"
        //TODO: hay que saber si TODOS LOS AGENTES han cumplido su parte de la misión.
        //Si es que si, Mostrar "OBJETIVO CUMPLIDO CON ÉXITO"
        //      si es que no, mostrar "Alguien ha fallado en su misión"
        // echar la culpa a alguien --> mostrar qué agente ha fallado

        //TODO BONUS: quremos lanzar la misión las veces que haga falta hasta que
        //todos los agentes cumplan la misión. En este caso debemos mostrar cuántas
        //veces hemos tenido que lanzar la misión para que se complete.
    }

    private static boolean lanzarMision(Agente[] agentesSecretos) {
        boolean misionCompletada = true;

        for (int cont = 0; cont < agentesSecretos.length; cont++) {
            Agente agente = agentesSecretos[cont];
            if (agente != null){
                agente.ejecutarMision("ROBAR EL BANCO");
                if (!agente.isMisionCompletada()){
                    System.out.println("El agente " + agente.getNombre() + " ha fallado en su misión");
                }
                misionCompletada = misionCompletada && agente.isMisionCompletada();
            }
        }
        if(!misionCompletada){
            System.out.println();
            System.out.println("ALGUIEN HA FALLADO EN SU MISIÓN");
            System.out.println();
        }
        return misionCompletada;
    }

    public static Agente[] generarListaAgentes(){
        Agente[] agentes = {new Hacker("ZeroCool"),
        new Hacker("IT Guy"),
        new Diplomatico("Donaldo Trumpo"),
        new Ninja("Bruce"),
        new Ninja("Lee")};
        return agentes;
    }



}
