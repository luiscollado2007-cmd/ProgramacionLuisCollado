package poo.navidad;

public class ProgramaReyesMagos {
    public static void main(String[] args) {
        ReyMago melchor = new ReyMago("Melchor",false,"Azul");
        melchor.setRegalo("Incienso");
        melchor.presentarse();


        ReyMago gaspar = new ReyMago("Gaspar",true,"Roja");
        gaspar.setRegalo("Oro");
        gaspar.presentarse();


        ReyMago baltasar = new ReyMago("Baltasar",false,"Verde");
        baltasar.setRegalo("Mirra");
        baltasar.presentarse();
    }
}
