package excepciones.dawbank;

import excepciones.dawbank.exceptions.AvisarHaciendaException;
import excepciones.dawbank.exceptions.CuentaException;
import excepciones.dawbank.exceptions.IbanInvalidoException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CuentaBancaria {

    public static int NUMERO_TOTAL_MOROSOS;
    public static final int MAX_MOVIMIENTOS = 4;
    public static final int IMPORTE_MAXIMO_HACIENDA = 3000;
    public static final int LIMITE_MINIMO_CUENTA = -50;
    private final String iban;
    private Persona titular;
    private double saldo;
    private List<Movimiento> movimientos;
    private int posicionProximoMovimiento = 0;

    //TODO: Si el IBAN no es valido, elevar una excepcion de "IbanInvalidoException"
    public CuentaBancaria(String iban, Persona titularCuenta) throws IbanInvalidoException, CuentaException {

        if(!validarIBANCuenta(iban)){
            // lanzar excepcion propia
            throw new IbanInvalidoException(iban);
        }
        this.iban = iban;
        if(titularCuenta == null || titularCuenta.getNombre().isEmpty()){
            throw new CuentaException("El titular de la cuenta no puede ser nulo");
        }
        this.titular = titularCuenta;
        movimientos = new ArrayList<>();
    }

    public boolean ingresar(double importe, String concepto) throws CuentaException {

        if(importe > 0){
            this.saldo += importe;
            registrarMovimiento(importe, concepto, Movimiento.TIPO_MOVIMIENTO_INGRESO);
            try {
                comprobacionHacienda(importe, Movimiento.TIPO_MOVIMIENTO_INGRESO);
            } catch (AvisarHaciendaException e) {
                //TODO: sustituir por llamada a grabar en fichero hacienda.log
                System.out.println(e.getMessage());
            }

            if(this.saldo >= 0){
                this.titular.setEsMoroso(false);
                NUMERO_TOTAL_MOROSOS--;
            }
            return true;
        }else{
            throw new CuentaException("Cantidad no válida al ingresar. Tiene que ser un nº positivo: " + importe);
        }
        // return false;
    }
    public boolean retirar(double importe, String concepto) throws CuentaException {
        if(importe > 0){
            if( (this.saldo - importe) < LIMITE_MINIMO_CUENTA){
                System.out.printf("ERROR: Saldo de la cuenta es %f y se quiere retirar %f. Se va a superar mínimo disponible de %d", saldo, importe, LIMITE_MINIMO_CUENTA);
            }else{
                this.saldo -= importe;
                registrarMovimiento( (importe * -1), concepto, Movimiento.TIPO_MOVIMIENTO_RETIRADA);
                try {
                    comprobacionHacienda(importe, Movimiento.TIPO_MOVIMIENTO_RETIRADA);
                } catch (AvisarHaciendaException e) {
                    System.out.println(e.getMessage());
                }

                if(this.saldo < 0){
                    this.titular.setEsMoroso(true);
                    NUMERO_TOTAL_MOROSOS++;
                }

                return true;
            }
        }else{
            throw new CuentaException("Cantidad no válida al retirar. Tiene que ser un nº positivo: " + importe);
        }
        return false;
    }

    private void comprobacionHacienda(double importe, String tipoMovimiento) throws AvisarHaciendaException {
        if(importe >= IMPORTE_MAXIMO_HACIENDA){
            throw new AvisarHaciendaException(titular, iban, tipoMovimiento);
        }

    }

    private void registrarMovimiento(double importe, String concepto, String tipoMovimiento) {

        movimientos.add(new Movimiento(importe, concepto, tipoMovimiento));
    }

    public void mostrarMovimientos(){
        System.out.println("** MOSTRANDO MOVIMIENTOS (del más reciente al más antiguo)");

        for (int numPos = movimientos.size()-1; numPos >= 0; numPos--) {
            movimientos.get(numPos).imprimirMovimiento();
        }
    }


    public void mostrarMovimientosPorConcepto(String concepto){
        System.out.println("BUSCANDO MOVIMIENTOS POR CONCEPTO: " + concepto);

        for(int cont = 0; cont < movimientos.size(); cont++){
            Movimiento mov = movimientos.get(cont);
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
        while(!encontrado && cont< movimientos.size()){
            Movimiento mov = movimientos.get(cont);
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
        for(int cont=0; cont < movimientos.size(); cont++){
            //quedarme con las posiciones de los movimientos que coinciden
            Movimiento mov = movimientos.get(cont);
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
                    Movimiento mov = movimientos.get(posicionMov);
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
            try {
                boolean resultado = origen.retirar(importe, Movimiento.TIPO_MOVIMIENTO_TRANSFERENCIA);
                if (resultado) {
                    resultado = destino.ingresar(importe, Movimiento.TIPO_MOVIMIENTO_TRANSFERENCIA);
                    return resultado;
                }
            }catch (CuentaException ex){
                System.err.println("No hemos podido realizar el retiro o el ingreso. Más info: " + ex.getMessage());
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