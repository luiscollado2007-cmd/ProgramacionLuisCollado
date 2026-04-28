package accesobd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

public class PruebaTransacciones {

    public static void main(String[] args) {
        Connection conex = null;
        try{
            conex= DriverManager.getConnection(ConstantesBD.URL, ConstantesBD.USER, ConstantesBD.PASS);
            conex.setAutoCommit(false);//se dsactiva el autocommit

            PreparedStatement sentenciaNuevoPedido = conex.prepareStatement("INSERT INTO pedidos(id_cliente, fecha, estado, total) VALUES(?, ?, ?, ?)");

            sentenciaNuevoPedido.setInt(1, 1);

            LocalDate fechaPedido = LocalDate.of(2026, 04, 25);

            sentenciaNuevoPedido.setObject(2, fechaPedido);
            sentenciaNuevoPedido.setString(3, "PENDIENTE");
            sentenciaNuevoPedido.setDouble(4, 150.0);

            int numPedidosInsertados = sentenciaNuevoPedido.executeUpdate();

            if(numPedidosInsertados != 1){
                System.out.println("Algo ha pasado...");
            }else{
                sentenciaNuevoPedido.close();

                PreparedStatement sentenciaLineaPedido = conex.prepareStatement("INSERT INTO detalle_PEDIDOU(asdufgh34h4h)");
                //   sentenciaLineaPedido.executeUpdate();
            }

            conex.commit();

        }catch (SQLException e){
            try {
                System.out.println("Error al operar con la BD:" + e);
                if(conex != null){
                    conex.rollback();
                    conex.close();
                }
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }

        }

    }
}