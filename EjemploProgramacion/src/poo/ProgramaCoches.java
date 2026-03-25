package poo;

public class ProgramaCoches {
    public static void main(String[] args) {

        Coche lamborghini = new Coche("Lamborghini","Aventador","gasolina",3);
        lamborghini.setMarca("Lamborghini");
        lamborghini.setModelo("Aventador");
        System.out.println(lamborghini.getMarca());
        //hacer metodo get del nº de ruedas
        //hacer metodo get de tipo de combustible
        //hacer metodo get del nº de puertas
        //hacer metodo get de los km recorridos

       lamborghini.imprimirCoche();

        lamborghini.conducir();
        lamborghini.conducir();
        lamborghini.conducir();
        lamborghini.conducir();

        System.out.println("Combustible restante: " + lamborghini.getCombustibleRestante());
        System.out.println("Km recorridos: " + lamborghini.getKmRecorridos());

        Coche ferrari = new Coche("Ferrari","SF90 stradale","diesel",5);
        ferrari.setMarca("Ferrari");
        ferrari.setModelo("SF90 stradale PLUS");
        //hacer metodo get del nº de ruedas
        //hacer metodo get de tipo de combustible
        //hacer metodo get del nº de puertas
        //hacer metodo get de los km recorridos

        ferrari.imprimirCoche();

        ferrari.conducir();
        ferrari.conducir();
        ferrari.conducir();
        ferrari.conducir();
        System.out.println("Combustible restante: " + ferrari.getCombustibleRestante());
        System.out.println("Km recorrido: " + ferrari.getKmRecorridos());
    }
}
