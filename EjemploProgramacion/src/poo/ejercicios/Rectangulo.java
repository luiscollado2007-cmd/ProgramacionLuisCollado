package poo.ejercicios;

public class Rectangulo {

    public static final int MAX = 100;
    public static final int MIN = 0;
    private Punto punto1;
    private Punto punto2;


    public Rectangulo(Punto punto1, Punto punto2){
        if (punto1.esMayorA(punto2)){
            //TA TO BIEN
            this.punto1 = punto1;
            this.punto2 = punto2;
        } else {
            System.err.println("ERROR! Las coordenadas del primer punto NO son inferiores a las del segundo punto");
        }
    }

    //TODO: hacer un método donde dibuje el rectangulo, considerando que tengo la base y la altura.
    public void dibujeRectangulo(){
    }




    public void imprimir() {
        System.out.println("Rectangulo: ");
        punto1.imprime();
        punto2.imprime();
    }

    public int getArea() {
        return obtenerBase() * obtenerAltura();
    }

    public int getPerimetro() {
        int base = obtenerBase();
        int altura = obtenerAltura();

        return base * 2 + altura * 2;
    }

    public int obtenerBase() {
        return  Math.abs(this.punto1.getCoordX() - this.punto2.getCoordX());
    }

    public int obtenerAltura() {
        return Math.abs(this.punto1.getCoordY() - this.punto2.getCoordY());
    }

    public static boolean esValorValido(int valor) {
        return valor > MIN && valor < MAX;
    }

    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }
}
