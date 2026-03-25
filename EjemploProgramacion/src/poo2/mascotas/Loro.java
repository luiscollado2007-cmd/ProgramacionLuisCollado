package poo2.mascotas;

import java.time.LocalDate;

public class Loro extends Aves{
    private String origen;
    private boolean habla;

    public Loro(String nombre, int edad, EstadoMascota estado, LocalDate fechaNacimiento, String pico, boolean vuela, String origen, boolean habla) {
        super(nombre, edad, estado, fechaNacimiento, pico, vuela);
        this.origen = origen;
        this.habla = habla;
    }



    @Override
    public void volar() {
        if (this.vuela){
            System.out.println("Yuhuuu puedo volar");
        }else{
            System.out.println("No puedo volar :(");
        }
    }

    @Override
    public void muestra() {
        System.out.println("Soy un loro y mi nombre es: " + this.nombre);
    }

    @Override
    public void habla() {
        if (this.habla){
            System.out.println("¿¿No ves que estoy hablando?");
        }else{
            System.out.println("No puedo hablar (en teoría)");
        }
    }
}
