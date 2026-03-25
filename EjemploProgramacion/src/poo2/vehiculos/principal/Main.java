package poo2.vehiculos.principal;


import poo2.vehiculos.hijos.VehiculoAcuatico;
import poo2.vehiculos.hijos.VehiculoAereo;
import poo2.vehiculos.hijos.VehiculoTerrestre;
import poo2.vehiculos.nietos.*;
import poo2.vehiculos.padre.Vehiculo;

public class Main {
    public static void main(String[] args) {
        Vehiculo[] p = new Vehiculo[9];
        p[0] = new VehiculoCoche("- 4821 LKM","- Toyota Corolla",4,false);
        p[1] = new VehiculoMoto("7395 HTP","- Honda CBR 600",2,"rojo");
        p[2] = new VehiculoBarco("0158 JDR","- Seat León","LWL",true);
        p[3] = new VehiculoSubmarino("9264 BXF","Kawasaki Ninja 400","LWL",370);
        p[4] = new VehiculoAvion("- 5810 KZV", "Yamaha WaveRunner VX",270,10000);
        p[5] = new VehiculoHelicoptero("- 3047 MNG","- Cessna 172 Skyhawk",2,3);
        p[6] = new VehiculoTerrestre("- 8672 LRP","- Bombardier Challenger 350",4);
        p[7] = new VehiculoAereo("- 1193 FQS","Beneteau Oceanis 38",375);
        p[8] = new VehiculoAcuatico("7429 GHL","Ford Mustang GT","LWL");

        for (int cont = 0; cont < p.length; cont++) {
            p[cont].imprimir();
            System.out.println();
        }
    }
}
