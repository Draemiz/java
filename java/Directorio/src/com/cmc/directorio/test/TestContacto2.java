package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto2 {
	public static void main(String[] args) {

        Telefono t1 = new Telefono(1, "movi", "111");
        Telefono t2 = new Telefono(2, "claro", "222");

        Contacto c1 = new Contacto("Ana", "Lopez", t1, 70);
        Contacto c2 = new Contacto("Luis", "Perez", t2, 80);

        AdminContactos ac = new AdminContactos();

        Contacto mayor = ac.buscarMasPesado(c1, c2);
        System.out.println("Más pesado: " + mayor.getPeso());

        boolean misma = ac.compararOperadoras(c1, c2);
        System.out.println("Misma operadora: " + misma);
    }
}
