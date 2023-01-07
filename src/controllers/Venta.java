package controllers;

import java.util.ArrayList;
import models.Producto;

/**
 *
 * @author echav
 */
public class Venta {

    private ArrayList<Producto> productos = new ArrayList();

    public Venta() {
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

}
