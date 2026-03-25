package poo.navidad;

public class ReyMago {

    private String nombre;
    private boolean canoso;
    private String colorTunica;
    private boolean vaEnCamello;
    private String regalo;


    public ReyMago(String nombreInicial, boolean canosoInicial, String colorTunicaInicial){
        nombre = nombreInicial;
        canoso = canosoInicial;
        colorTunica = colorTunicaInicial;
    }

    public String obtenerPoderMagico(){
        if (colorTunica.equalsIgnoreCase("verde")){
            return "Naturaleza";
        }else if (colorTunica.equalsIgnoreCase("rojo")){
            return "Fuego";
        }else{
            if (regalo.contains("o")){
                return "Agua";
            }
        }
        return "NO TIENES PODER";
    }

    public void presentarse(){
        System.out.println("********** ");
        System.out.println("Hola, soy " + nombre);
        if (vaEnCamello){
            System.out.println("Voy en camello");
        }else{
            System.out.println("NO voy en camello");
        }
        System.out.println("Mi túnica es de color: " + colorTunica);
        if (regalo != null){
        System.out.println("Y traigo el regalo: " + regalo);
        }
        System.out.println("El poder que tengo es: " + obtenerPoderMagico());
        System.out.println();
    }
    public String getNombre(){
        return nombre;
    }

    public boolean isCanoso(){
        return canoso;
    }

    public void setCanoso(boolean nuevoValor) {
        canoso = nuevoValor;
    }

    public String getColorTunica() {
        return colorTunica;
    }

    public void setColorTunica(String nuevoColor) {
        colorTunica = nuevoColor;
    }

    public String getRegalo() {
        return regalo;
    }

    public void setRegalo(String nuevoRegalo) {
        regalo = nuevoRegalo;
    }
}
