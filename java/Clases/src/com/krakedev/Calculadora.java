package com.krakedev;

public class Calculadora {
	
	public int sumar ( int valor1,int valor2) {
		int resultado; //declaro la variable
		resultado = valor1+valor2;
		return resultado;
	}
	
	public double restar (int valor1,int valor2) {
		double  resultado;
		resultado = valor1 - valor2;
		return resultado;
	}
	
	public double multiplicar(double valor1, double valor2) {
	    return valor1 * valor2;
	}

	public double dividir(double dividendo, double divisor) {
	    return dividendo / divisor;
	}

	public double promediar(double valor1, double valor2, double valor3) {
	    return (valor1 + valor2 + valor3) / 3;
	}

	public void mostrarResultado() {
	    System.out.println("Ahorita no joven, Sali al almuerzo. Regreso en 15 minutos");
	}
}
