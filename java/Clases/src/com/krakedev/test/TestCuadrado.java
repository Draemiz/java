package com.krakedev.test;

import com.krakedev.Cuadrado;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado c1 = new Cuadrado(0);
		Cuadrado c2 = new Cuadrado(0);
		Cuadrado c3 = new Cuadrado(0);
		
		int area1;
		int area2;
		int area3;
		int perimetro1;
		int perimetro2;
		int perimetro3;
		
		c1.setLado(4);
		c2.setLado(5);
		c3.setLado(6);
		
		area1 = c1.calcularArea();
		area2 = c2.calcularArea();
		area3 = c3.calcularArea();
		
		perimetro1 = c1.calcularPerimetro();
		perimetro2 = c2.calcularPerimetro();
		perimetro3 = c3.calcularPerimetro();
		
		System.out.println("|- CUADRADO =========|");

        System.out.println("Area c1: " + area1);
        System.out.println("Area c2: " + area2);
        System.out.println("Area c3: " + area3);

        System.out.println("|====================|");
        System.out.println("Perimetro c1: " + perimetro1);
        System.out.println("Perimetro c2: " + perimetro2);
        System.out.println("Perimetro c3: " + perimetro3);
	}
}
