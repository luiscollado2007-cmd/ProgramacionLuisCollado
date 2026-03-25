package poo2;

public class ProgramaVehiculos {
    public static void main(String[] args) {

        Coche miCoche = new Coche("Seat", "León" , 4,4);
        System.out.println("La marca del coche es: " + miCoche.getMarca());
        System.out.println("Mi número de puertas es: " + miCoche.getNumPuertas());
        System.out.println("Mi coche tiene " + miCoche.getNumRuedas() + " ruedas");
        miCoche.imprimirDatos();
        System.out.println();

        Moto miMoto = new Moto("Honda", "V4",2,true);
        System.out.println("AHORA LA MOTO:");
        miMoto.imprimirDatos();
    }
}
