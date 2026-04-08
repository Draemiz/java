package com.cmc.repaso.entidades;

public class Producto {
	private String nombre;
    private double precio;

    // Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        setPrecio(precio);
    }

    // setters
    public void setPrecio(double precio) {
        if (precio < 0) {
            this.precio = precio * -1;
        } else {
            this.precio = precio;
        }
    }

    // getter
    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    // Método de descuento
    public double calcularPrecioPromo(double descuento) {
        return precio - (precio * descuento / 100);
    }
}
