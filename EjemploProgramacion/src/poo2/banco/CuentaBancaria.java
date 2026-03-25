package poo2.banco;

public abstract class CuentaBancaria {
    protected String iban;
    protected double saldo;
    public static final double interesAnualBasico = 0.08;

    public CuentaBancaria(String iban, double saldo) {
        this.iban = iban;
        this.saldo = saldo;
    }

    public void consultar(){

    }

    public boolean ingresar(double cantidad){
        return false;
    }

    private void anyadir(double cantidad) {
        this.saldo += cantidad;
    }

    public boolean retirar(double cantidad){
        return false;
    }

    public void traspaso(CuentaBancaria otra, double cantidad){
    }

    protected abstract double calcularIntereses();

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteresAnualBasico() {
        return interesAnualBasico;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "iban='" + iban + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
