package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA = new Producto(); //1. Declarar e Instanciar un objeto Producto, referenciarlo con productoA
		Producto productoB = new Producto(); //2. Declarar e Instanciar un objeto Producto, referenciarlo con productoB
		Producto productoC = new Producto(); //3. Declarar e Instanciar un objeto Producto, referenciarlo con productoC
		
		//4.Modificar los atributos auto1
		productoA.nombre = "Paracetamol";
		productoA.descripcion = "Analgesico";
		productoA.precio = 2.50;
		productoA.stockActual = 100;
		
		//5.Modificar los atributos auto1
		productoB.nombre = "Ibuprofeno";
		productoB.descripcion = "Antiinflamatorio";
		productoB.precio = 3.50;
		productoB.stockActual = 250;
		
		//6.Modificar los atributos auto1
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
