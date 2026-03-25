package com.krakedev;

public class Producto {
	public String nombre;
	public String descripcion;
	public double precio;
	public int stockActual;

	public Producto(String nombre, String descripcion, double precio, int stockActual) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stockActual = stockActual;
	}
}