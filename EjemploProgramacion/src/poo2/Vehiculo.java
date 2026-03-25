package poo2;

public class Vehiculo {

    private String marca;
    private String modelo;
    private int numRuedas;
    private int kmRecorridos;
    private String tipoCombustible;
    private int combustibleRestante;

    public Vehiculo(String marca, String modelo, int numRuedas) {
        this.marca = marca;
        this.modelo = modelo;
        this.numRuedas = numRuedas;
    }

    public void imprimirDatos(){
        System.out.println("** DATOS VEHÍCULO **");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Nº ruedas: " + numRuedas);
        System.out.println("Km recorridos: " + kmRecorridos);
        System.out.println("Tipo de combustible: " + tipoCombustible);
        System.out.println("Combustible restante: " + combustibleRestante);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public int getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(int kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getCombustibleRestante() {
        return combustibleRestante;
    }

    public void setCombustibleRestante(int combustibleRestante) {
        this.combustibleRestante = combustibleRestante;
    }
}
