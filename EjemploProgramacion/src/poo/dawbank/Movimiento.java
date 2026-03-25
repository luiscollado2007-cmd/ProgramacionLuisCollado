package poo.dawbank;

import java.time.LocalDateTime;

public class Movimiento {

    public static final String TIPO_MOVIMIENTO_INGRESO = "Ingreso";
    public static final String TIPO_MOVIMIENTO_RETIRADA = "Retirada";
    public static final String TIPO_MOVIMIENTO_TRANSFERENCIA = "Transferencia";

    private double importe;
    private String concepto;
    private LocalDateTime fechaHora;
    private String tipoMovimiento;

    public Movimiento(double importe, String concepto, String tipoMovimiento){
        this.importe = importe;
        this.concepto = concepto;
        this.tipoMovimiento = tipoMovimiento;
        fechaHora = LocalDateTime.now();
    }

    public void imprimirMovimiento(){
        //Ejemplo linea movimiento: [INGRESO] Nomina: 1000 €
        //%s -> string
        //%f -> valor coma flotante
        //%d -> entero decimal
        String lineaMovimiento = "[%s] %f€ %s (%s)";
        System.out.println(String.format(lineaMovimiento,this.tipoMovimiento.toUpperCase(),
                this.importe,
                this.concepto,
                Utils.formatearFecha(this.fechaHora)));


    }




    public double getImporte() {
        return importe;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }


}
