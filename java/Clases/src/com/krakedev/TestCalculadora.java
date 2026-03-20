package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu;
		int resultadoSuma;
		double resultadoRestar;
		double resultadoMultiplicar;
		double resultadoDividir;
		double resultadoPromedio;
		
		calcu = new Calculadora();
		resultadoSuma = calcu.sumar(5,3);
		resultadoRestar = calcu.restar(10,3);
		resultadoMultiplicar = calcu.multiplicar(10,5);
		resultadoDividir = calcu.dividir(10,2);
		resultadoPromedio = calcu.promediar(10,8,9);
		
		System.out.println("RESULTADO SUMA: " +resultadoSuma);
		System.out.println("RESULTADO RESTA: " +resultadoRestar);
		System.out.println("RESULTADO MULTIPLICAR: " + resultadoMultiplicar);
		System.out.println("RESULTADO DIVIDIR: " + resultadoDividir);
		System.out.println("RESULTADO PROMEDIO: " + resultadoPromedio);

		calcu.mostrarResultado();
		
	}

}
