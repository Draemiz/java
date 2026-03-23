package com.krakedev;

public class Calculadora {

    private double resultado; // Agregue un atributo

    public int sumar(int valor1, int valor2) {
        resultado = valor1 + valor2;
        return (int) resultado;
    }

    public double restar(int valor1, int valor2) {
        resultado = valor1 - valor2;
        return resultado;
    }

    public double multiplicar(double valor1, double valor2) {
        resultado = valor1 * valor2;
        return resultado;
    }

    public double dividir(double dividendo, double divisor) {
        resultado = dividendo / divisor;
        return resultado;
    }

    public double promediar(double valor1, double valor2, double valor3) {
        resultado = (valor1 + valor2 + valor3) / 3;
        return resultado;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public void mostrarResultado() {
        System.out.println("Resultado guardado: " + resultado);
    }
}