package excepciones.dawbank.exceptions;

public class IbanInvalidoException extends Exception{

    private String ibanInvalido;

    public IbanInvalidoException(String ibanInformado) {
        this.ibanInvalido = ibanInformado;
    }

    public String getIbanInvalido() {
        return ibanInvalido;
    }
}