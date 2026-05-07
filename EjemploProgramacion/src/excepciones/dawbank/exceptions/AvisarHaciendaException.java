package excepciones.dawbank.exceptions;

import excepciones.dawbank.Persona;

public class AvisarHaciendaException extends Exception {

    private Persona titular;
    private String iban;
    private String nombreOperacion;

    public AvisarHaciendaException(Persona titular, String iban, String nombreOperacion) {
        this.titular = titular;
        this.iban = iban;
        this.nombreOperacion = nombreOperacion;
    }

    @Override
    public String getMessage() {
        return "AVISO HACIENDA: El titular " + titular.getNombre() + " con IBAN " + iban + " ha realizado la operacion " + nombreOperacion;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getNombreOperacion() {
        return nombreOperacion;
    }

    public void setNombreOperacion(String nombreOperacion) {
        this.nombreOperacion = nombreOperacion;
    }
}