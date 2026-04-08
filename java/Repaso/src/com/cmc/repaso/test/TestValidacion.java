package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		Validacion v = new Validacion();

        boolean resultado = v.validarMonto(10);

        System.out.println("Resultado: " + resultado);

	}

}
