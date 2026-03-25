package poo2.practicatodo;

public class Enemigo implements Movible{

    private String tipo;
    private int x;
    private int y;
    private int agresividad;

    public Enemigo(String tipo, int x, int y, int agresividad) {
        this.tipo = tipo;
        this.x = x;
        this.y = y;
        this.agresividad = agresividad;
    }

    @Override
    public String toString() {
        return "Enemigo{" +
                "tipo='" + tipo + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", agresividad=" + agresividad +
                '}';
    }

    @Override
    public void mover(int dx, int dy) {
        if (this.agresividad > 0){
            this.x = dx * this.agresividad;
            this.y = dy * this.agresividad;
            System.out.println("La nueva posición del jugador es:  (" + this.x + "," + this.y + ") , cuya agresividad es: " +
                    this.agresividad);
        }else{
            System.err.println("No se puede realizar movimientos");
        }

    }
}
