package excepciones;

public class PruebaExcepcionDni {

    public static void main(String[] args) {

        try {
            PersonaValidacion personita = new PersonaValidacion("Paco", "Martinez Soria", "45058741L", 56);

            System.out.println("Persona creada: " + personita.getNombre());
        } catch (DniInvalidoException e) {
            System.out.println("Dni invalido: " + e.getMessage());
        }
    }
}