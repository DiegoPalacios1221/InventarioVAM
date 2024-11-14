package controlador;

import conexion.Conexion;
import modelo.Usuario;
import java.sql.*;
import javax.swing.JOptionPane;

public class Ctrl_Usuario {

    // Método para registrar usuario con validación de cédula
    public boolean Usuario(Usuario usuario) {
        
        // Verificar si la cédula ya está en uso
        if (usuario.verificarCCExistente(usuario.getCc())) {
            JOptionPane.showMessageDialog(null, "Este número de cédula ya está en uso.");
            return false;  // La cédula ya está registrada, no registrar al usuario
        }
        
        // Si la cédula es única, registrar al usuario
        try (Connection cn = Conexion.conectar()) {
            String sql = "INSERT INTO usuario (nombre, apellido, cc, email, usuario, contraseña) "
                       + "VALUES (?, ?, ?, ?, ?, ?)";
            
            try (PreparedStatement pst = cn.prepareStatement(sql)) {
                pst.setString(1, usuario.getNombre());
                pst.setString(2, usuario.getApellido());
                pst.setInt(3, usuario.getCc());
                pst.setString(4, usuario.getEmail());
                pst.setString(5, usuario.getUsuario());
                pst.setString(6, usuario.getContraseña());
                
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Usuario registrado con éxito.");
                return true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar el usuario: " + e.getMessage());
            return false;
        }
    }

    // Método para el login
    public boolean LoginUser(Usuario objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        String sql = "SELECT usuario, contraseña FROM usuario WHERE usuario = '" 
                     + objeto.getUsuario() + "' AND contraseña = '" + objeto.getContraseña() + "'";
        Statement st;
        
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al iniciar sesión");
            JOptionPane.showMessageDialog(null, "Error al iniciar sesión");
        }

        return respuesta;
    }
    
    public boolean verificarCCExistente(int cc) {
    boolean existe = false;
    String sql = "SELECT * FROM usuario WHERE cc = ?";
    
    try (Connection cn = Conexion.conectar(); 
         PreparedStatement pst = cn.prepareStatement(sql)) {
        pst.setInt(1, cc);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            existe = true;
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al verificar la cédula: " + e.getMessage());
    }
    
    return existe;
}
    
   public boolean guardar(Usuario objeto){
       boolean respuesta = false;
       Connection cn = Conexion.conectar();
        try{
            PreparedStatement consulta = cn.prepareStatement("INSER INTO usuario values ( ?, ?, ?, ?, ?, ?)");
            consulta.setString(1, objeto.getNombre());
            consulta.setString(2, objeto.getApellido());
            consulta.setInt(3, objeto.getCc());
            consulta.setString(4, objeto.getEmail());
            consulta.setString(5, objeto.getUsuario());
            consulta.setString(6, objeto.getContraseña());
            if(consulta.executeUpdate() > 0){
                respuesta = true;
            }
            
        }catch (SQLException e){
            System.out.println("Error al guardar usuario");
        }
        return respuesta;
   }
   
   public boolean existeUsuario(String usuario){
       boolean respuesta = false; 
       String sql = ("SELECT usuario FROM usuario WHERE usuario = '" + usuario + "';");
       Statement st;
       try{
           Connection cn = Conexion.conectar();
           st = cn.createStatement();
           ResultSet rs = st.executeQuery(sql);
           while(rs.next()){
               respuesta = true;
           }
       }catch (SQLException e){
           System.out.println("Error al consultar usuario");
       }
       return respuesta = false;
   }
   
}

