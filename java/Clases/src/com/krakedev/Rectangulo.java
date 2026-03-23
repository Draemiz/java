package com.krakedev;

public class Rectangulo {
//Atributos
	private int base;
	private int altura;
	
//Métodos	
	
	public int calcularArea(){
		int area = base*altura;
		return area;
	}
	
	public int calcularPerimetro() {
		int perimetro = 2*(base + altura);
		return perimetro;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	
}
