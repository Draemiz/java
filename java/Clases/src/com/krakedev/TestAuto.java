package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1 = new Auto(); //1. Declarar e Instanciar un objeto Auto, referenciarlo con auto1
		Auto auto2 = new Auto(); //2. Declarar e Instanciar un objeto Auto, referenciarlo con auto2
		
		//3.Modificar los atributos auto1
		auto1.setMarca ("Mitsubishi");
		auto1.setAnio (2006);
		auto1.setPrecio (20000);
			
		//4. Accedo a los atributos autos1
		System.out.println("Marca: " + auto1.getMarca());
		System.out.println("Año: " + auto1.getAnio());
		System.out.println("Precio: $" + auto1.getPrecio());
		
		//5.Modificar los atributos auto1
		auto2.setMarca ("Lamborghini");
		auto2.setAnio (2022);
		auto2.setPrecio (360000);
		
		System.out.println("====================");
		//6. Accedo a los atributos autos1
			System.out.println("Marca: " + auto2.getMarca());
			System.out.println("Año: " + auto2.getAnio());
			System.out.println("Precio: $" + auto2.getPrecio());
	}
}
