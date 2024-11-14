package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    // Conexion Local
    public static Connection conectar() {

        try {
            // Desactivar SSL con el parámetro useSSL=false
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/InventarioVAM?useSSL=false", "root", "1234");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la conexion con la base de datos " + e);
        }
        return null;

    }
}
