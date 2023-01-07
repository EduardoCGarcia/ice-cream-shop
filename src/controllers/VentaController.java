package controllers;

import java.sql.Statement;
import config.MySQLConnection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.Venta;

/**
 *
 * @author echav
 */
public class VentaController {

    public static void crearVenta(Venta venta) {
        MySQLConnection conn = new MySQLConnection();
        String query = "INSERT INTO venta(fecha_venta,total_venta) VALUES('" + venta.getFecha() + "',0.0)";
        try {
            Statement st = conn.conectar().createStatement();
            st.executeLargeUpdate(query);
            JOptionPane.showMessageDialog(null, "Venta realizada con éxito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar la venta");
            System.out.println(ex);
        }
        conn.desconectar();
    }
}
