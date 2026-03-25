package poo2.mascotas;

import java.time.LocalDate;

public class Perro extends Mascotas{
    private String raza;
    private boolean pulgas;

    public Perro(String nombre, int edad, EstadoMascota estado, LocalDate fechaNacimiento, String raza, boolean pulgas) {
        super(nombre, edad, estado, fechaNacimiento);
        this.raza = raza;
        this.pulgas = pulgas;
    }

    @Override
    public void muestra() {
        System.out.println("Soy un perro y me llamo " + nombre);
    }

    @Override
    public void habla() {
        System.out.println("Guau o che guau rofl!!");
    }
}
