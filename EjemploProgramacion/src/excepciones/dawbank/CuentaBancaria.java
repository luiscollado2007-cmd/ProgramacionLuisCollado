package excepciones.dawbank;

import java.math.BigInteger;
import java.util.Arrays;

public class CuentaBancaria {

    public static int NUMERO_TOTAL_MOROSOS;
    public static final int MAX_MOVIMIENTOS = 4;
    public static final int IMPORTE_MAXIMO_HACIENDA = 3000;
    public static final int LIMITE_MINIMO_CUENTA = -50;
    private final String iban;
    private Persona titular;
    private double saldo;
    private Movimiento[] movimientos;
    private int posicionProximoMovimiento = 0;

    //TODO: Si el IBAN no es valido, elevar una excepcion de "IbanInvalidoException"
    public CuentaBancaria(String iban, Persona titularCuenta) throws IbanInvalidoException {

        if(!validarIBANCuenta(iban)){
            // lanzar excepcion propia
            throw new IbanInvalidoException(iban);
        }
        this.iban = iban;
        this.titular = titularCuenta;
        movimientos = new Movimiento[MAX_MOVIMIENTOS];
    }

    public boolean ingresar(double importe, String concepto){

        if(importe > 0){
            this.saldo += importe;
            registrarMovimiento(importe, concepto, Movimiento.TIPO_MOVIMIENTO_INGRESO);
            comprobacionHacienda(importe);

            if(this.saldo >= 0){
                this.titular.setEsMoroso(false);
                NUMERO_TOTAL_MOROSOS--;
            }

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
                comprobacionHacienda(importe);

                if(this.saldo < 0){
                    this.titular.setEsMoroso(true);
                    NUMERO_TOTAL_MOROSOS++;
                }

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

    public void mostrarMovimientosPorConcepto(String concepto){
        System.out.println("BUSCANDO MOVIMIENTOS POR CONCEPTO: " + concepto);

        for(int cont = 0; cont < movimientos.length; cont++){
            Movimiento mov = movimientos[cont];
            if(mov != null){
                String conceptoMovimiento = mov.getConcepto();
                if(conceptoMovimiento.contains(concepto)){
                    mov.imprimirMovimiento();
                }
            }
        }
    }

    public void mostrarMovimientoPorConcepto(String concepto){

        System.out.println("BUSCANDO MOVIMIENTOS POR CONCEPTO: " + concepto);
        boolean encontrado = false;
        int cont = 0;
        //iterar sobre la lista de movimientos
        while(!encontrado && cont< movimientos.length){
            Movimiento mov = movimientos[cont];
            //para cada movimiento, coger su concepto y compararlo con el de parametros
            if(mov != null && mov.getConcepto().contains(concepto)){
                //si lo encontramos, el bucle se detiene. Tendré que mostrar el movimiento
                encontrado = true;
                mov.imprimirMovimiento();
            }
            cont++;
        }
        if(!encontrado){
            System.out.println(" -> NO HAY COINCIDENCIAS CON EL CONCEPTO: " + concepto);
        }

    }

    /**
     * Devuelve un array con los movimientos que SUPERAN el importe minimo
     * @param importeMinimo
     * @return
     */
    public Movimiento[] buscarMovimientosPorImporteMinimo(double importeMinimo){

        Movimiento[] coincidencias = null;
        int[] posicionesCoincidencias = new int[MAX_MOVIMIENTOS];
        Arrays.fill(posicionesCoincidencias, -1); // rellenar todo el array con -1
        int contadorPosiciones = 0;
        //recorrer lista de movimientos
        for(int cont=0; cont < movimientos.length; cont++){
            //quedarme con las posiciones de los movimientos que coinciden
            Movimiento mov = movimientos[cont];
            if(mov != null) {
                double importeMov = Math.abs(mov.getImporte());
                if (importeMov >= importeMinimo) {
                    posicionesCoincidencias[contadorPosiciones++] = cont;
                }
            }
        }

        if(contadorPosiciones != 0){
            coincidencias = new Movimiento[contadorPosiciones];
            int posicionArrayDestino = 0;
            //recorrer esa estructura auxiliar de posiciones e ir cogiendo los movimientos
            for(int pos = 0; pos < posicionesCoincidencias.length; pos++){
                int posicionMov = posicionesCoincidencias[pos];
                if(posicionMov != -1){
                    Movimiento mov = movimientos[posicionMov];
                    //cada uno meterlo en el array destino
                    coincidencias[posicionArrayDestino++] = mov;
                }
            }

        }else{
            System.out.println("NO HAY COINCIDENCIAS");
        }


        return coincidencias;
    }

    public static boolean transferenciaCuentas(CuentaBancaria origen, CuentaBancaria destino, double importe){
        if(origen != null && destino != null){
            boolean resultado = origen.retirar(importe, Movimiento.TIPO_MOVIMIENTO_TRANSFERENCIA);
            if(resultado){
                resultado = destino.ingresar(importe, Movimiento.TIPO_MOVIMIENTO_TRANSFERENCIA);
                return resultado;
            }
        }else{
            System.out.println("Alguna de las cuentas es nula");
        }
        return false;
    }

    public void imprimirCuentaBancaria(){
        System.out.println("*** INFO CUENTA BANCARIA ***");
        System.out.println("IBAN: " + iban);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);

    }

    public static boolean validarIBANCuenta(String iban){
        boolean valido = false;
        if (iban.length() ==24){
            if (Character.isLetter(iban.charAt(0)) && Character.isLetter(iban.charAt(1))){
                System.out.println("Letras Correctas");
                for (int cont = 2; cont < 24; cont++) {
                    if (Character.isDigit(iban.charAt(cont))) {
                        if (cont == 23){
                            System.out.println("Números Correctos");
                        }
                        valido = true;
                    }else if (!Character.isDigit(iban.charAt(cont))){
                        System.out.println("Números Inorrectos");
                        valido = false;
                        cont = 23;
                    }
                }
            }else {
                System.out.println("Letras Incorrectas");

            }
        }else {
            System.out.println("Longitud del iban incorrecta");
        }
        return valido;
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