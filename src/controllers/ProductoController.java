package controllers;

import config.MySQLConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.Producto;

/**
 *
 * @author echav
 */
public class ProductoController {

    public static ArrayList<Producto> getPrecios() {

        ArrayList<Producto> productos = new ArrayList();

        MySQLConnection conn = new MySQLConnection();
        conn.conectar();

        String query = "SELECT * FROM producto";

        try {

            ResultSet consulta = conn.getConn().createStatement().executeQuery(query);

            while (consulta.next()) {
                
                productos.add(new Producto(
                        Integer.parseInt(consulta.getString("id_producto")),
                        consulta.getString("nombre_producto"),
                        Float.parseFloat(consulta.getString("precio_producto"))
                ));
                
            }
            conn.desconectar();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return productos;
    }
}
