package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		
		Producto productoA = new Producto("Temp","Temp",0,0);
		Producto productoB = new Producto("Temp","Temp",0,0);
		Producto productoC = new Producto("Temp","Temp",0,0);
		
		//4.Modificar los atributos
		productoA.nombre = "Paracetamol";
		productoA.descripcion = "Analgesico";
		productoA.precio = 2.50;
		productoA.stockActual = 100;
		
		
		productoB.nombre = "Ibuprofeno";
		productoB.descripcion = "Antiinflamatorio";
		productoB.precio = 3.50;
		productoB.stockActual = 250;
		
		
		productoC.nombre = "Vitamina C";
		productoC.descripcion = "Refuerza defensas";
		productoC.precio = 4.20;
		productoC.stockActual = 80;
		
		//7. Mostrar datos
        System.out.println("Producto A: " + productoA.nombre + " - $" + productoA.precio + " - Stock: " + productoA.stockActual);
        System.out.println("Producto B: " + productoB.nombre + " - $" + productoB.precio + " - Stock: " + productoB.stockActual);
        System.out.println("Producto C: " + productoC.nombre + " - $" + productoC.precio + " - Stock: " + productoC.stockActual);
    
	}
}
