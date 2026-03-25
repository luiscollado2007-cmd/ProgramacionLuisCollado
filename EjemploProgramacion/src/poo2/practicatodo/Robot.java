package poo2.practicatodo;

public class Robot implements Movible{

    private String id;
    private int x;
    private int y;
    private int bateria;

    public Robot(String id, int x, int y, int bateria) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "id='" + id + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", bateria=" + bateria +
                '}';
    }

    @Override
    public void mover(int dx, int dy) {
        int consumo = 2 * (Math.abs(dx) + Math.abs(dy));
        if (this.bateria > consumo){
            int nuevaX = this.x + dx;
            int nuevaY = this.y + dy;
            this.bateria -= consumo;
            System.out.println("La nueva posición del jugador es:  (" + nuevaX + "," + nuevaY + ") , cuyo batería es: "
            + bateria);
        }else{
            System.out.println("El jugador no puede moverse");
        }
    }
}
