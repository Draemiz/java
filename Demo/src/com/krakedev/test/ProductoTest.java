package com.krakedev.test;

import com.krakedev.demo.Producto;

public class ProductoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Producto pro1 = new Producto(123, "Cereal");
		
		pro1.setDescripcion("Producto en caja de sabor a frutas");
		pro1.setPeso(15);
		
		System.out.println("______________________________");
		System.out.println();
		System.out.println("Codigo: " +pro1.getCodigo());
		System.out.println("Nombre: " +pro1.getNombre());
		System.out.println("Descripcion: " +pro1.getDescripcion());
		System.out.println("Peso: " +pro1.getPeso());
		System.out.println("______________________________");


	}

}
