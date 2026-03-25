package poo.ejercicios;

import java.util.Random;

public class Punto {

    private int coordX;
    private int coordY;

    public Punto(int nuevaX, int nuevaY){
        this.coordX = nuevaX;
        this.coordY = nuevaY;
    }

    /*
    Deberá crear un
nuevo Punto (utiliza el constructor) con x e y entre -100 y 100, y luego devolverlo (con return).
     */
    public static Punto creaPuntoAleatorio(){
        //generar x e y aleatorios entre -100 y 100
        int xAleatoria, yAleatoria;
        Random aleat = new Random();
        xAleatoria = aleat.nextInt(-100, 101);
        yAleatoria = aleat.nextInt(-100, 101);
        //crear el nuevo objeto con esas coordenadas
        Punto puntoAleatorio = new Punto(xAleatoria, yAleatoria);
        //devolver el objeto
        return puntoAleatorio;
    }

    public boolean esMayorA(Punto otro){
        return (this.coordX <= otro.getCoordX() && this.coordY <= otro.getCoordY());
    }

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public void imprime(){
        System.out.println(String.format("(%d, %d)", this.coordX, this.coordY));
    }
    // Modifica ambas coordenadas. Es como un setter doble.
    public void setXY(int nuevaX, int nuevaY){
        this.coordX = nuevaX;
        this.coordY = nuevaY;
    }
    // Desplaza el punto la cantidad (dx,dy) indicada.
    public void desplaza(int dx, int dy){
        this.coordX += dx;
        this.coordY += dy;
    }

    /*
    // Calcula y devuelve la distancia entre el propio objeto (this) y
    otro objeto (Punto p) que se pasa como parámetro: distancia entre dos coordenadas.

     */
    public int distancia(Punto otro){
        int resultadoDistancia = 0;

        int restaX = Math.abs(this.coordX - otro.getCoordX());
        int restaY = Math.abs(this.coordY - otro.getCoordY());

        double cuadradoRestasX = Math.pow(restaX, 2);
        double cuadradoRestasY = Math.pow(restaY, 2);
        double raizCuadradaRestas = Math.sqrt( cuadradoRestasX + cuadradoRestasY);

        resultadoDistancia = (int) raizCuadradaRestas;

        return resultadoDistancia;
    }
}
