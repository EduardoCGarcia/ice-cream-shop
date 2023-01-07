/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author echav
 */
public class Producto {
    private String nombre;
    private int precio;
    private int cantidad;
    
    public final int PRECIO_ALPURA = 12;
    public final int PRECIO_HELADO_SENCILLO = 15;
    public final int PRECIO_HELADO_DOBLE = 20;
    public final int PRECIO_CANASTA = 30;
    public final int PRECIO_CUARTO = 35;
    public final int PRECIO_MEDIO = 55;
    public final int PRECIO_LITRO = 110;
    public final int PRECIO_PALETA_CHICA = 4;
    public final int PRECIO_PALETA_GRANDE = 12;
    public final int PRECIO_DANONINO = 6;
    public final int PRECIO_CHAMOYADA = 12;

    public Producto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    
}
