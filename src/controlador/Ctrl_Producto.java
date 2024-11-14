package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Producto;


/**
 *
 * @author Admin
 */
public class Ctrl_Producto {
   
    public boolean guardar(Producto objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            
            PreparedStatement consulta = cn.prepareStatement("INSERT INTO producto  VALUES (?, ?, ?, ?, ?, ?, ? )");
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getNombre());
            consulta.setDouble(3, objeto.getPrecio());
            consulta.setInt(4, objeto.getCantidad_existente());
            consulta.setInt(5, objeto.getStock_minimo());
            consulta.setInt(6, objeto.getStock_maximo());
            consulta.setInt(7, objeto.getId_categoria());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar producto: " + e);
        }

        return respuesta;
    }

    //metodo para verificar si ya existe un producto
    public boolean productoExistente(String producto) {
        boolean respuesta = false;
       
        String sql = "SELECT nombre FROM producto WHERE nombre = '"+ producto +"'";
        Statement st;
        
        try{
             Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al verificar existencia de producto: " + e);
        }

        return respuesta;
    }
    
    public boolean actualizar(Producto producto, int idProducto) {
    try (Connection con = Conexion.conectar();
         PreparedStatement pst = con.prepareStatement("UPDATE producto SET nombre = ?, precio = ?, cantidad_existente = ?, stock_minimo = ?, stock_maximo = ?, categoria_id_categoria = ? WHERE id_producto = ?")) {
        
        pst.setString(1, producto.getNombre());
        pst.setDouble(2, producto.getPrecio());
        pst.setInt(3, producto.getCantidad_existente());
        pst.setInt(4, producto.getStock_minimo());
        pst.setInt(5, producto.getStock_maximo());
        pst.setInt(6, producto.getId_categoria());
        pst.setInt(7, idProducto);

        int filasAfectadas = pst.executeUpdate();

        // Si se actualizó al menos una fila, el update fue exitoso
        return filasAfectadas > 0;

    } catch (SQLException e) {
        System.out.println("Error al actualizar producto: " + e.getMessage());
        return false;  // Si hay un error, devolvemos false
    }
}

    
    public boolean eliminar(int idProducto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            
            PreparedStatement consulta = cn.prepareStatement("DELETE FROM producto WHERE id_producto = '"+idProducto+"'");
            consulta.executeUpdate(); 

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al eliminar producto: " + e);
        }

        return respuesta;
    }
    
}
