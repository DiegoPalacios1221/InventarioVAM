package modelo;

/**
 *
 * @author Admin
 */
public class Categoria {

    private int id_categoria;
    private String descripcion;

    public Categoria() {
        this.id_categoria = 0;
        this.descripcion = "";
    }

    public Categoria(int idCategoria, String descripcion) {
        this.id_categoria = idCategoria;
        this.descripcion = descripcion;
    }

    public int getIdCategoria() {
        return id_categoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.id_categoria = idCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
