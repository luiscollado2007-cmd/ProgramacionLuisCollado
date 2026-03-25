package poo2.practicatodo;

public class Jugador implements Movible{

    private String nombre;
    private int x;
    private int y;
    private int energia;

    public Jugador(String nombre, int x, int y, int energia) {
        this.nombre = nombre;
        this.x = x;
        this.y = y;
        this.energia = energia;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", energia=" + energia +
                '}';
    }

    @Override
    public void mover(int dx, int dy) {
        if (this.energia != 0){
            int nuevaX = x + dx;
            int nuevaY = y + dy;
            int nuevaEnergia = this.energia - (Math.abs(nuevaX) + Math.abs(nuevaY));
            System.out.println("La nueva posición del jugador es:  (" + nuevaX + "," + nuevaY + ") , cuya energía es: "
            + nuevaEnergia);
        }else{
            energia = 0;
            System.out.println("El jugador no puede moverse");
        }

    }
}
