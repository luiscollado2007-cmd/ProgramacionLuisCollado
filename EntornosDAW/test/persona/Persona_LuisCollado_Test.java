package persona;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Persona_LuisCollado_Test {

    @BeforeAll
    static void setup(){
        System.out.println("[INICIO]. HAN COMENZADO LOS TESTS. HECHO POR: LUIS ANTONIO COLLADO SANTOS");
    }

    @AfterAll
    static void teardown(){
        System.out.println("[FIN]. HAN TERMINADO LOS TESTS. HECHO POR: LUIS ANTONIO COLLADO SANTOS");
    }

    @Test
    void personaConEdadNegativa() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Persona(-5);
        });
    }

    @Test
    void esMayorDeeEdad() {
        Persona persona1 = new Persona(18);
        assertTrue(persona1.esMayorDeEdad());
    }

    @Test
    void esMayorDeEdad2(){
        Persona persona2 = new Persona(20);
        assertTrue(persona2.esMayorDeEdad());
    }

    @Test
    void esMenorEdad(){
        Persona personaMenor = new Persona(17);
        assertFalse(personaMenor.esMayorDeEdad());
    }

    @Test
    void sePuedeJubilarse(){
        Persona viejo = new Persona(66);
        assertTrue(viejo.puedeJubilarse());
    }

    @Test
    void sePuedeJubilarse2(){
        Persona jubilada =new Persona(64);
        assertFalse(jubilada.puedeJubilarse());
    }

    @ParameterizedTest
    @ValueSource(ints = {18,20,30,19})
    void esMayorDeEdad(int edad){
        Persona personita = new Persona(edad);
        assertTrue(personita.esMayorDeEdad());
    }

    @ParameterizedTest
    @ValueSource (ints = {0,5,10,15,17})
    void esMayorrDeEdad(int edad){
        Persona elMenol = new Persona(edad);
        assertFalse(elMenol.esMayorDeEdad());
    }


    @ParameterizedTest
    @ValueSource (ints = {17,18,64})
    void puedeJubilarse(int edad){
        Persona loNuevo = new Persona(edad);
        assertFalse(loNuevo.puedeJubilarse());
    }

    @ParameterizedTest
    @ValueSource (ints = {65,70})
    void puedenJubilarse(int edad){
        Persona loNuevo = new Persona(edad);
        assertTrue(loNuevo.puedeJubilarse());
    }


}