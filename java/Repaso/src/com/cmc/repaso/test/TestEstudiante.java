package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante e = new Estudiante("Ale");

        e.calificar(9);

        System.out.println(e.getNombre());
        System.out.println(e.getNota());
        System.out.println(e.getResultado());

	}

}
