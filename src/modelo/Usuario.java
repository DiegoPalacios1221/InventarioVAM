    package modelo;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Usuario {

    //Atributos
        private int id_Usuario;
    private String nombre;
    private String apellido;
    private int cc;
    private String email;
    private String usuario;
    private String contraseña;

    // Constructor con parámetros
    public Usuario(int id_Usuario, String nombre, String apellido, int cc, String email, String usuario, String contraseña) {
        this.id_Usuario = id_Usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cc = cc;
        this.email = email;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    // Constructor vacío para permitir instanciación sin parámetros
    public Usuario() {
        // Solo inicializa los valores a sus valores por defecto
        this.id_Usuario = 0;
        this.nombre = "";
        this.apellido = "";
        this.cc = 0;
        this.email = "";
        this.usuario = "";
        this.contraseña = "";
    }

    // Getters y setters
    public int getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(int id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public boolean verificarCCExistente(int cc) {
    boolean existe = false;
    String sql = "SELECT 1 FROM usuario WHERE cc = ?";
    try (Connection cn = Conexion.conectar(); PreparedStatement pst = cn.prepareStatement(sql)) {
        pst.setInt(1, cc);
        try (ResultSet rs = pst.executeQuery()) {
            if (rs.next()) {
                existe = true; // Si encuentra algún registro, la cédula ya está en uso
            }
        }
    } catch (SQLException e) {
        e.printStackTrace(); // Puedes agregar manejo de excepciones o registros de errores
    }
    return existe;
}

}
