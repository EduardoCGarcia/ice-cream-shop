package controllers;

import java.sql.Statement;
import config.MySQLConnection;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import models.Producto;
import models.Venta;

/**
 *
 * @author echav
 */
public class VentaController {

    public static void crearVenta(Venta venta) {
        MySQLConnection conn = new MySQLConnection();
        conn.conectar();
        String query = "INSERT INTO venta(fecha_venta,total_venta) VALUES('" + venta.getFecha() + "',0.0)";
        try {
            Statement st = conn.getConn().createStatement();
            st.executeLargeUpdate(query);
            llenarVenta(venta);
            JOptionPane.showMessageDialog(null, "Venta realizada con éxito");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar la venta");
            System.out.println(ex);
        }
        conn.desconectar();
    }

    public static void llenarVenta(Venta venta) throws SQLException {
        MySQLConnection conn = new MySQLConnection();
        conn.conectar();
        String query = "SELECT MAX(venta.id_venta) AS id_venta FROM venta";
        ResultSet consulta = conn.getConn().createStatement().executeQuery(query);
        consulta.next();
        String id_venta = consulta.getString("id_venta");
        for (Producto p : venta.getProductos()) {
            System.out.println("hool");
            query = "INSERT INTO venta_producto(id_venta,id_producto,precio_venta,cantidad) VALUES('" + id_venta + "','" + p.getId() + "','" + p.getPrecio() + "','" + p.getCantidad() + "');";
            conn.getConn().createStatement().executeUpdate(query);
        }
        conn.desconectar();
    }
}
