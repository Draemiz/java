package com.krakedev;

public class TestCalculadora {

    public static void main(String[] args) {

        Calculadora calcu = new Calculadora();

        calcu.sumar(5, 3);
        System.out.println("SUMA: " + calcu.getResultado());

        calcu.restar(10, 3);
        System.out.println("RESTA: " + calcu.getResultado());

        calcu.multiplicar(10, 5);
        System.out.println("MULTIPLICAR: " + calcu.getResultado());

        calcu.dividir(10, 2);
        System.out.println("DIVIDIR: " + calcu.getResultado());

        calcu.promediar(10, 8, 9);
        System.out.println("PROMEDIO: " + calcu.getResultado());

        calcu.setResultado(100);
        System.out.println("Resultado cambiado manualmente: " + calcu.getResultado());

        calcu.mostrarResultado();
    }
}