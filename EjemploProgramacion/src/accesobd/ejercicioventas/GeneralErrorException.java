package accesobd.ejercicioventas;

public class GeneralErrorException extends Exception {

    public GeneralErrorException() {
        super("Error general en la aplicacion");
    }

    public GeneralErrorException(String message) {
        super(message);
    }
}