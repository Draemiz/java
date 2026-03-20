package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1 = new Auto(); //1. Declarar e Instanciar un objeto Auto, referenciarlo con auto1
		Auto auto2 = new Auto(); //2. Declarar e Instanciar un objeto Auto, referenciarlo con auto2
		
		//3.Modificar los atributos auto1
		auto1.marca = "Mitsubishi";
		auto1.anio = 2006;
		auto1.precio = 20000;
			
		//4. Accedo a los atributos autos1
		System.out.println("Marca: " + auto1.marca);
		System.out.println("Año: " + auto1.anio);
		System.out.println("Precio: $" + auto1.precio);
		
		//5.Modificar los atributos auto1
		auto2.marca = "Lamborghini";
		auto2.anio = 2022;
		auto2.precio = 360000;
		
		System.out.println("====================");
		//6. Accedo a los atributos autos1
			System.out.println("Marca: " + auto2.marca);
			System.out.println("Año: " + auto2.anio);
			System.out.println("Precio: $" + auto2.precio);
	}
}
