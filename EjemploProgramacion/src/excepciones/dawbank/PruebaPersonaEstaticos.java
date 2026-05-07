package excepciones.dawbank;

import excepciones.dawbank.exceptions.CuentaException;
import excepciones.dawbank.exceptions.IbanInvalidoException;

public class PruebaPersonaEstaticos {

    public static void main(String[] args) throws IbanInvalidoException {

        boolean ibanValido = CuentaBancaria.validarIBANCuenta("13456");

        CuentaBancaria una = null;
        try {
            una = new CuentaBancaria("1234",
                    new Persona("Paco", "",""));
            CuentaBancaria otra = new CuentaBancaria("4567", new Persona("Paco", "",""));

            una.retirar(25, "Paga");
        } catch (CuentaException e) {
            throw new RuntimeException(e);
        }

        /// otra.ingresar(500, "Nomina");

        System.out.println("Nuym total morosos: " + CuentaBancaria.NUMERO_TOTAL_MOROSOS);



    }
}