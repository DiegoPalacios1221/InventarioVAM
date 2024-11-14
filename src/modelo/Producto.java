package modelo;

/**
 *
 * @author Admin
 */
public class Producto {
    
    private int id_producto;
    private String nombre;
    private int cantidad_existente;
    private double precio;
    private String descripcion;
    private int stock_minimo;
    private int stock_maximo;
    private int id_categoria;
    
    
    public Producto(){
        this.id_producto = 0;
        this.nombre = "";
        this.cantidad_existente = 0;
        this.precio = 0.0;
        this.descripcion = "";
        this.stock_minimo = 0;
        this.stock_maximo = 0;
        this.id_categoria = 0;
    }

    public Producto(int id_producto, String nombre, int cantidad_existente, double precio, String descripcion, int stock_minimo, int stock_maximo, int id_categoria) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.cantidad_existente = cantidad_existente;
        this.precio = precio;
        this.descripcion = descripcion;
        this.stock_minimo = stock_minimo;
        this.stock_maximo = stock_maximo;
        this.id_categoria = id_categoria;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad_existente() {
        return cantidad_existente;
    }

    public void setCantidad_existente(int cantidad_existente) {
        this.cantidad_existente = cantidad_existente;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock_minimo() {
        return stock_minimo;
    }

    public void setStock_minimo(int stock_minimo) {
        this.stock_minimo = stock_minimo;
    }

    public int getStock_maximo() {
        return stock_maximo;
    }

    public void setStock_maximo(int stock_maximo) {
        this.stock_maximo = stock_maximo;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }
    
    
}
