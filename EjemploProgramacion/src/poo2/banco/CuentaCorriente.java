package poo2.banco;

public class CuentaCorriente extends CuentaBancaria{

    public CuentaCorriente(String iban, double saldo) {
        super(iban, saldo);
    }

    @Override
    public double calcularIntereses() {
        double intereses = saldo * CuentaBancaria.interesAnualBasico;
        saldo += intereses;
        return intereses;
    }
}
