package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto p = new Producto("Laptop", -1000);

        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Precio corregido: " + p.getPrecio());

        double promo = p.calcularPrecioPromo(10);
        System.out.println("Precio con descuento: " + promo);

	}

}
