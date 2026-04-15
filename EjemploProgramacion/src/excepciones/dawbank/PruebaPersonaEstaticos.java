package excepciones.dawbank;

public class PruebaPersonaEstaticos {

    public static void main(String[] args) throws IbanInvalidoException {

        boolean ibanValido = CuentaBancaria.validarIBANCuenta("13456");

        CuentaBancaria una = new CuentaBancaria("1234",
                new Persona("Paco", "",""));
        CuentaBancaria otra = new CuentaBancaria("4567", new Persona("Paco", "",""));

        una.retirar(25, "Paga");

        /// otra.ingresar(500, "Nomina");

        System.out.println("Nuym total morosos: " + CuentaBancaria.NUMERO_TOTAL_MOROSOS);



    }
}