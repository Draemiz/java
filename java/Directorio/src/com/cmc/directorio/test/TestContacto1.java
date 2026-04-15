package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {
	public static void main(String[] args) {

        Telefono t = new Telefono(1, "movi", "999999");

        Contacto c = new Contacto("Ale", "Perez", t, 65.5);

        System.out.println("Operadora: " + c.getTelefono().getOperadora());
        System.out.println("Número: " + c.getTelefono().getNumero());
    }
}
