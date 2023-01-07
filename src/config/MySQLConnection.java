package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author echav
 */
public class MySQLConnection {
    private String bd ="paleteria";
    private String url = "jdbc:mysql://localhost:3306/";
    private String user = "root";
    private String pass = "";
    private String driver = "com.mysql.cj.jdbc.Driver";
    private Connection conn;
    public MySQLConnection(){
    }
    
    public Connection conectar(){
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url+bd, user, pass);
            System.out.println("Conexión Exitosa");
        } catch (ClassNotFoundException|SQLException ex) {
            System.out.println("No se pudo conectar a la base de datos");
        }
        return conn;
    }
    
    public void desconectar(){
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Error al desconectar");
        }
    }
    
}
