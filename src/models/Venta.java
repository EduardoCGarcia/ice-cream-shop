package models;

import java.time.LocalDate;
import java.util.ArrayList;
import models.Producto;

/**
 *
 * @author echav
 */
public class Venta {

    private ArrayList<Producto> productos;
    private LocalDate fecha;
    private float total;

    public Venta() {
        this.productos = new ArrayList();
        this.total = 0;
        this.fecha = LocalDate.now();
    }

    public ArrayList getProductos() {
        return productos;
    }

    public void setProductos(ArrayList productos) {
        this.productos = productos;
    }

    public void addProducto(Producto nuevo) {
        this.productos.add(nuevo);
    }

    public boolean inVenta(String nombre) {
        for (Producto p : productos) {
            if (p.getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(String nombre) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getNombre().equals(nombre)) {
                return i;
            }
        }
        return -1;
    }

    public void guardarVenta() {
        productos.clear();
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public static void main(String[] args) {
        Venta v = new Venta();
        System.out.println(v.getFecha());
    }
}