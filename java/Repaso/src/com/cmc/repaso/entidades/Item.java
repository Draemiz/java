package com.cmc.repaso.entidades;

public class Item {
	private String nombre;
    private int productosActuales;
    private int productosDevueltos;
    private int productosVendidos;

    // getters y setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProductosActuales(int productosActuales) {
        this.productosActuales = productosActuales;
    }

    public int getProductosActuales() {
        return productosActuales;
    }

    public int getProductosVendidos() {
        return productosVendidos;
    }

    public int getProductosDevueltos() {
        return productosDevueltos;
    }

    // imprimir
    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Stock actual: " + productosActuales);
        System.out.println("Vendidos: " + productosVendidos);
        System.out.println("Devueltos: " + productosDevueltos);
        System.out.println("----------------------");
    }

    // vender
    public void vender(int cantidad) {
        productosActuales -= cantidad;
        productosVendidos += cantidad;
    }

    // devolver
    public void devolver(int cantidad) {
        productosActuales += cantidad;
        productosDevueltos += cantidad;
        productosVendidos -= cantidad;
    }
}
