package poo.dawbank;

import java.util.Arrays;

public class CuentaBancaria {

    public static final int MAX_MOVIMIENTOS = 4;
    public static final int IMPORTE_MAXIMO_HACIENDA = 3000;
    public static final int LIMITE_MINIMO_CUENTA = -50;
    private final String iban;
    private Persona titular;
    private double saldo;
    private Movimiento[] movimientos;
    private int posicionProximoMovimiento = 0;

    public CuentaBancaria(String iban, Persona titular) {
        this.iban = iban;
        this.titular = titular;
        movimientos = new Movimiento[MAX_MOVIMIENTOS];
    }
    public void buscarMovimientoPorConcepto(String concepto){
        System.out.println("BUSCANDO MOVIMIENTOS POR CONCEPTO: " + concepto);
        boolean encontrado = false;
        int cont = 0;
        while (!encontrado && cont < movimientos.length){
            Movimiento mov = movimientos[cont];
            if (mov != null && mov.getConcepto().contains(concepto)){
                encontrado = true;
            }
            cont++;
        }

        if (!encontrado){
            System.out.println(" -> NO HAY COINCIDENCIAS CON EL CONCEPTO: " + concepto);
        }

        //TODO: iterar sobre la lista de movimientos
        //TODO: para cada movimiento, coger su concepto y comprarlo con el de parámetros
        //TODO: si lo encontramos, el bucle se detiene. Tendré que mostrar el movimiento

    }

    public Movimiento[] buscarMovimientoPorCantidadMinima(double cantidad){

        Movimiento[] coincidencias = null;
        int[] posicionesCoincidencias = new int[MAX_MOVIMIENTOS];
        Arrays.fill(posicionesCoincidencias, -1); //rellenar todo el array con -1.
        int contadorPosiciones = 0;
        for (int cont = 0; cont < movimientos.length; cont++) {
            Movimiento mov = movimientos[cont];
            if (mov != null){
                double importe = Math.abs(mov.getImporte());
                if (importe >= cantidad){
                    posicionesCoincidencias[contadorPosiciones++] = cont;
                }
            }

        }
        if (contadorPosiciones != 0){
            coincidencias = new Movimiento[contadorPosiciones];
            int posicionArrayDestino = 0;
            for (int cont = 0; cont < posicionesCoincidencias.length; cont++) {
                int posicion = posicionesCoincidencias[cont];
                if (posicion != -1){
                    Movimiento mov = movimientos[posicion];
                    coincidencias[posicionArrayDestino++] = mov;
                }
            }
        }else{
            System.out.println("NO HAY COINCIDENCIAS");
        }

        //TODO: recorrer lista de movimientos
        //TODO: quedarme con las posiciones de los movimientos que coinciden
        //TODO: recorrer esa estructura auxiliar de posiciones e ir cogiendo los movimientos
        //TODO: cada uno meterlo en el array destino
        return coincidencias;
    }

    public static boolean transferenciaCuentas(CuentaBancaria origen, CuentaBancaria destino, double importe){
        if (origen != null && destino != null){
            boolean resultadoRetirada = origen.retirar(importe, Movimiento.TIPO_MOVIMIENTO_TRANSFERENCIA);
            if (resultadoRetirada){
                destino.ingresar(importe, Movimiento.TIPO_MOVIMIENTO_TRANSFERENCIA);
                return true;
            }
        }else{
            System.out.println("Alguna de las cuentas es nula");
        }
        return false;
    }

    public boolean validarIBAN(String iban) {
        if (iban == null) {
            return false;
        }


        iban = iban.replace(" ", "").toUpperCase();


        if (iban.length() != 24) {
            return false;
        }


        if (!Character.isLetter(iban.charAt(0)) || !Character.isLetter(iban.charAt(1))) {
            return false;
        }


        for (int contador = 2; contador < iban.length(); contador++) {
            if (!Character.isDigit(iban.charAt(contador))) {
                return false;
            }
        }

        return true;
    }

    public boolean ingresar(double importe, String concepto){
        if(importe > 0){
            this.saldo += importe;
            registrarMovimiento(importe, concepto, Movimiento.TIPO_MOVIMIENTO_INGRESO);
            if (saldo >= 0){
                titular.setEsMoroso(false);
            }
            comprobacionHacienda(importe);
            return true;
        }
        return false;
    }
    public boolean retirar(double importe, String concepto){
        if(importe > 0){
            if( (this.saldo - importe) < LIMITE_MINIMO_CUENTA){
                System.out.printf("ERROR: Saldo de la cuenta es %f y se quiere retirar %f. Se va a superar mínimo disponible de %d", saldo, importe, LIMITE_MINIMO_CUENTA);
            }else{
                this.saldo -= importe;
                registrarMovimiento( (importe * -1), concepto, Movimiento.TIPO_MOVIMIENTO_RETIRADA);
                if (saldo < 0){
                    titular.setEsMoroso(true);
                }
                comprobacionHacienda(importe);
                return true;
            }
        }
        return false;
    }

    private void comprobacionHacienda(double importe) {
        if(importe >= IMPORTE_MAXIMO_HACIENDA){
            System.out.println("SE HA SUPERADO EL IMPORTE MÁXIMO PARA HACIENDA (" + IMPORTE_MAXIMO_HACIENDA + "). EMITIENDO AVISO");
        }

    }

    private void registrarMovimiento(double importe, String concepto, String tipoMovimiento) {

        Movimiento mov = new Movimiento(importe, concepto, tipoMovimiento);

        if(posicionProximoMovimiento < MAX_MOVIMIENTOS){
            movimientos[posicionProximoMovimiento] = mov;
            posicionProximoMovimiento++;
        }else{
            desplazarMovimientos();
            movimientos[movimientos.length - 1] = mov;
        }

    }

    public void mostrarMovimientos(){
        System.out.println("** MOSTRANDO MOVIMIENTOS (del más reciente al más antiguo)");
        int posicionInicio;
        if(posicionProximoMovimiento != movimientos.length){
            posicionInicio = posicionProximoMovimiento;
        }else{
            posicionInicio = movimientos.length;
        }

        for(int pos = posicionInicio-1; pos >= 0; pos--){
            Movimiento mov = movimientos[pos];
            mov.imprimirMovimiento();
        }
    }

    private void desplazarMovimientos() {
        for(int cont = 0; cont < movimientos.length-1; cont++){
            movimientos[cont] = movimientos[cont + 1];
        }

    }

    public void imprimirCuentaBancaria(){
        System.out.println("*** INFO CUENTA BANCARIA ***");
        System.out.println("IBAN: " + iban);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);

    }

    public String getIban() {
        return iban;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }
}
