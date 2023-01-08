package models;


/**
 *
 * @author echav
 */
public class Producto {
    private int id;
    private String nombre;
    private float precio;
    private int cantidad;
    
    public Producto() {
    }

    public Producto(int id, String nombre, float precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto(int id, String nombre, float precio, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
    
}
