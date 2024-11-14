package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Categoria;

/**
 *
 * @author Admin
 */
public class Ctrl_Categoria {

    //metodo para registrar o guardar categoria
    public boolean guardar(Categoria objeto) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {

            
            PreparedStatement consulta = cn.prepareStatement("INSERT INTO categoria (descripcion) VALUES (?)");
            consulta.setString(1, objeto.getDescripcion());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar categoria: " + e);
        }

        return respuesta;
    }

    //metodo para verificar si ya existe una categoria
    public boolean categoriaExistente(String categoria) {
        boolean respuesta = false;
       
        String sql = "SELECT descripcion FROM categoria WHERE descripcion = ?";

        try (Connection cn = Conexion.conectar();
             PreparedStatement st = cn.prepareStatement(sql)) {

            st.setString(1, categoria);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al verificar existencia de categoria: " + e);
        }

        return respuesta;
    }

    //metodo para actualizar categoria
    public boolean actualizar(Categoria objeto, int idCategoria) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {
            
            PreparedStatement consulta = cn.prepareStatement("UPDATE categoria SET descripcion = ? WHERE id_categoria = ?");
            consulta.setString(1, objeto.getDescripcion());
            consulta.setInt(2, idCategoria); 

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al actualizar categoria: " + e);
        }

        return respuesta;
    }

    //metodo para eliminar categoria
    public boolean eliminar(int idCategoria) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            
            PreparedStatement consulta = cn.prepareStatement("DELETE FROM categoria WHERE id_categoria = ?");
            consulta.setInt(1, idCategoria); 

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al eliminar categoria: " + e);
        }

        return respuesta;
    }
}
