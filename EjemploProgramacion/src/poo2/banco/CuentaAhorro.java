package poo2.banco;

public class CuentaAhorro extends CuentaBancaria{
    public static final double saldoMinimo = 2000;

    public CuentaAhorro(String iban, double saldo) {
        super(iban, saldo);
    }

    @Override
    public double calcularIntereses() {
        double intereses = 0;
        if (saldo < saldoMinimo){
            intereses = (CuentaBancaria.interesAnualBasico / 2) * saldo;
        }else{
            intereses = (CuentaBancaria.interesAnualBasico * 2) * saldo;
        }
        this.saldo += intereses;

        return intereses;
    }
}
