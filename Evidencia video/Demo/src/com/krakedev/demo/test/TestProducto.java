package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto pro1 = new Producto(001,"Atun");
		pro1.setDescripcion("Producto enlatado de pescado fresco");
		pro1.setPeso(15);
		
		System.out.println("********************");
		System.out.println("Codigo: " + pro1.getCodigo());
		System.out.println("Nombre: " + pro1.getNombre());
		System.out.println("Descripcion: " + pro1.getDescripcion());
		System.out.println("Peso: " +pro1.getPeso());
		System.out.println("********************");
	}

}
