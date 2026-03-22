package com.krakedev;

public class Rectangulo {
//Atributos
	public int base;
	public int altura;
	
//Métodos	
	
	public int calcularArea(){
		int area = base*altura;
		return area;
	}
	
	public int calcularPerimetro() {
		int perimetro = 2*(base + altura);
		return perimetro;
	}
}
