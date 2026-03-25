package Production;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class CalculadoraTest {

    @Test
    public void testSuma() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.suma(2, 3), "2 + 3 debería ser 5");
    }

    @Test
    public void testResta() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.resta(5, 3), "5 - 3 debería ser 2");

    }

    @Test
    public void testMultiplicacion() {
        Calculadora calc = new Calculadora();
        assertEquals(6, calc.multiplicacion(2, 3), "2 * 3 debería ser 6");
    }

    @Test
    public void testDivision() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.division(6, 3), "6 / 3 debería ser 2");
    }

    @Test
    public void testDivisionPorCero() {
        Calculadora calc = new Calculadora();
        assertThrows(ArithmeticException.class, () -> calc.division(5, 0), "Dividir por cero debería lanzar ArithmeticException");
    }

    @ParameterizedTest
    @CsvSource({"2,2,4","100,105,205"})
    public void testSuma2() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.suma(2, 3), "2 + 3 debería ser 5");
    }
    /*
    public void testSuma2(int a, int b, int esperado) {
        Calculadora calc = new Calculadora();
        assertEquals(esperado, calc.suma(a, b));
    }*/

    @ParameterizedTest
    @ValueSource (ints ={2,3,5})
    public void testParMultiplesNumeros(int numero) {
        Calculadora calc = new Calculadora();
        boolean resultadoEsPar =calc.esPar(numero);
        assertTrue(resultadoEsPar);
    }

/*
@ParameterizedTest
@CsvSource({"2,2,4","100,105,205"})
public void testSuma2() {
    Calculadora calc = new Calculadora();
    assertEquals(5, calc.suma(2, 3), "2 + 3 debería ser 5");
}
¿Qué intenta hacer @CsvSource?
@CsvSource define filas de datos, separadas por comas:
2,2,4
100,105,205
Cada fila normalmente se asigna a parámetros del método.

Pero aquí hay un problema importante
El método no recibe parámetros, así que JUnit ignora esos valores.
¿Qué pasa realmente al ejecutarse?
El test se ejecuta dos veces (una por cada fila)
Pero siempre ejecuta exactamente lo mismo:
calc.suma(2, 3)
Los valores del CsvSource no se usan para nada
En la práctica, este test no está aprovechando el test parametrizado.

Cómo debería verse correctamente
@ParameterizedTest
@CsvSource({"2,3,5", "100,105,205"})
void testSuma2(int a, int b, int esperado) {
    Calculadora calc = new Calculadora();
    assertEquals(esperado, calc.suma(a, b));
}
*/



}
