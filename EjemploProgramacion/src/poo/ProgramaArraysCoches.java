package poo;

import java.util.Random;

public class ProgramaArraysCoches {
    public static void main(String[] args) {

        Coche[] coches = new Coche[5];
        Coche coche1 = new Coche("Seat", "Leon", "Diesel",5);

        Coche coche2 = new Coche("Seat", "Ibiza","Gasolina",5);

        Coche coche3 = new Coche("Tesla","V5","Híbrido",5);

        Coche coche4 = new Coche("Alfa Romeo", "Polaris","Gasolina",5);

        Coche coche5 = new Coche("Volkswagen","Polo","Diesel",5);

        coches[0] = coche1;
        coches[1] = coche2;
        coches[2] = coche3;
        coches[3] = coche4;
        coches[4] = coche5;



        for (int cont = 0; cont < coches.length; cont++) {
            Coche unCoche = coches[cont];
            unCoche.conducir();

        }

        mostrarTodosLosCoches(coches);
        Coche menorCombustible = cocheConMenosCombustible(coches);

        System.out.println("El coche con menos combustible es: " + menorCombustible.getMarca() + " " + menorCombustible.getModelo() + " con " + menorCombustible.getCombustibleRestante() + " litros");

        //TODO: Carrera, poner a conducir todos los coches.(invocar a metodo conducir).
        //TODO: mostrar informacion de todos los coches.
        //TODO: luego, ver qué coche tiene menos combustible
        //TODO: luego, 5 vueltas a conducir.Todo con bucles.
        //Utilizar dos for.
        for (int cont = 0; cont < coches.length; cont++) {
            Coche unCoche = coches[cont];
            for (int contt = 0; contt < coches.length; contt++) {
                unCoche.conducir();
            }
        }
        //TODO: crear una función que genere 1 coche aleatoriamente. Deberá generar la marca entre una serie de opciones predefinidas(Seat, Tesla, Volkswagen, Fiat)
        //Se deberá generar con un tipo de combustible de forma aleatoria
        //Cada marca tiene asociados unos modelos:
        /*
        Seat:Ibiza,León,Arona,Ateca
        Tesla: Model 3,Model Y,Model S, Model X
        Volkswagen:
         */

        System.out.println(generarCoche());
    }


    public static String generarCoche(){
        Random aleatorio = new Random();

        String[] marcas = {"Seat","Tesla","Volkswagen","Fiat"};

        String[] seatModelos = {"Ibiza", "León","Arona","Ateca"};
        String[] teslaModelos = {"Model 3", "Model Y", "Model S", "Model X"};
        String[] volkswagenModelos = {"Golf", "Tiguan", "ID.4", "T-Roc"};
        String[] fiatModelos = {"500", "Panda", "600", "Tipo"};

        String[] combustible = {"Gasolina", "Diesel", "Híbrido"};

        String marcaAleatoria = marcas[aleatorio.nextInt(marcas.length)];

        String modelo = "";
        switch (marcaAleatoria){
            case "Seat":
                modelo = seatModelos[aleatorio.nextInt(seatModelos.length)];
                break;
            case "Tesla":
                modelo = teslaModelos[aleatorio.nextInt(teslaModelos.length)];
                break;
            case "Volkswagen":
                modelo = volkswagenModelos[aleatorio.nextInt(volkswagenModelos.length)];
                break;
            case "Fiat":
                modelo = fiatModelos[aleatorio.nextInt(fiatModelos.length)];
                break;

        }

        String combustibleAleatorio = combustible[aleatorio.nextInt(combustible.length)];

        return marcaAleatoria + " " + modelo + " (" + combustibleAleatorio + ")";

    }


    public static Coche cocheConMenosCombustible(Coche[] coches){
        Coche minimo = coches[0];
        for (int cont = 0; cont < coches.length; cont++) {
            if (coches[cont].getCombustibleRestante() < minimo.getCombustibleRestante()){
                minimo = coches[cont];
            }
        }
        return minimo;
    }

    public static void mostrarTodosLosCoches(Coche[] coches){
        for (int cont = 0; cont < coches.length; cont++) {
            Coche unCoche = coches[cont];
            unCoche.imprimirCoche();
        }
    }


}
