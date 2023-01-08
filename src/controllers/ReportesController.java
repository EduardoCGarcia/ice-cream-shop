package controllers;

import config.MySQLConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import models.Producto;
import models.Venta;

/**
 *
 * @author echav
 */
public class ReportesController {

    public static Venta reporteDelDia() {
        ArrayList<Producto> productos = new ArrayList();
        Venta venta = new Venta();
        venta.setFecha(LocalDate.now());
        
        float totalDelDia = 0;
        
        MySQLConnection conn = new MySQLConnection();
        conn.conectar();

        String query = "SELECT * FROM venta v NATURAL JOIN venta_producto vp NATURAL JOIN producto WHERE v.fecha_venta='" + LocalDate.now() + "';";

        try {

            ResultSet consulta = conn.getConn().createStatement().executeQuery(query);

            while (consulta.next()) {

                productos.add(new Producto(
                        Integer.parseInt(consulta.getString("id_producto")),
                        consulta.getString("nombre_producto"),
                        Float.parseFloat(consulta.getString("precio_producto")),
                        Integer.parseInt(consulta.getString("cantidad"))
                ));

            }
            
            venta.setProductos(productos);
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        conn.desconectar();
        return venta;
    }
}
