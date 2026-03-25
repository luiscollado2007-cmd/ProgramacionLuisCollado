package persona;

public class Persona {
    private int edad;

    public Persona(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
        this.edad = edad;
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public boolean puedeJubilarse() {
        return edad >= 65;
    }

    public String  getCategoriaEdad() {
        if (edad < 2) return "infant";
        if (edad < 18) return "child";
        if (edad <= 65) return "adult";
        return "senior";
    }
    public static void main(String[] args) {
        Persona p =new Persona(1);
        System.out.println("la persona con edad:"+p.edad+" tiene esta categoría:"+p.getCategoriaEdad());
    }
}
