package poo;

import java.util.Random;

public class Coche {

    //Atributos
    private String marca;
    private String modelo;
    private int numRuedas;
    private String tipoCombustible;
    private int puertas;
    private int kmRecorridos;
    private int combustibleRestante;
    private double consumo;

    public Coche(){
        combustibleRestante = 100;
        tipoCombustible = "ninguno";
        numRuedas = 4;
        puertas = 5;
    }
    public Coche(String marcaInicial, String modeloInicial, String tipoCombustibleInicial, int puertasInicial){
        marca = marcaInicial;
        modelo = modeloInicial;
        tipoCombustible = tipoCombustibleInicial;
        puertas = puertasInicial;
        numRuedas = 4;
        combustibleRestante = 100;
        consumo = generarValorConsumo();
    }

    //Métodos
    public void conducir(){
        combustibleRestante -= consumoCombustible();
        kmRecorridos+=5;
    }

    public void imprimirCoche(){
        System.out.println("DATOS DEL COCHE");
        System.out.println("\t Marca: " + marca);
        System.out.println("\t Modelo: " + modelo);
        System.out.println("\t Nº de ruedas: " + numRuedas);
        System.out.println("\t Tipo de combustible: " + tipoCombustible);
        System.out.println("\t Nº de puertas: " + puertas);
        System.out.println("\t Km recorridos: " + kmRecorridos);
        System.out.println("\t Combustible restante: " + combustibleRestante);
    }

    /**
     * Obtiene el valor del atributo marca
     * @return Devuelve la marca
     */

    public String getMarca(){
        return marca;
    }


    /**
     * Asina un nuevo valor a la marca
     * @param marcaNueva El valor de marca que se va a asignar
     */
    public void setMarca(String marcaNueva) {
        marca = marcaNueva;
    }

    public int getKmRecorridos() {
        return kmRecorridos;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String nuevoModelo){
        modelo = nuevoModelo;
    }

    public int getNumRuedas(){
        return numRuedas;
    }

    public int getPuertas() {
        return puertas;
    }

    public int getCombustibleRestante() {
        return combustibleRestante;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    private double generarValorConsumo(){
        Random aleatorios = new Random();
        return aleatorios.nextDouble(1,100);
    }
    /*
    Este método devuelve cuánto consume de combustible el coche según su tipo de combustible y según su consumo
    La regla es:
    -Si es diesel, consumo * 0.5
    -Si es híbrido, consumo * 0.01
    -En cualquier otro caso, consumo * 0.1
     */
    private int consumoCombustible(){
        System.out.println("BRUUUUUMMMMM");
        int cantidadConsumida = 0;
        if (tipoCombustible.equalsIgnoreCase("diesel")){
            cantidadConsumida = (int) (consumo * 0.5);

        }else if (tipoCombustible.equalsIgnoreCase("hibrido")){
            cantidadConsumida = (int) (consumo * 0.01);
        }else{
            cantidadConsumida = (int) (consumo * 0.1);
        }
        return cantidadConsumida;
    }
}
