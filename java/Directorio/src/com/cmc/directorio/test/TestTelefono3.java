package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {
	public static void main(String[] args) {

        Telefono t1 = new Telefono(1, "movi", "111");
        Telefono t2 = new Telefono(2, "claro", "222");
        Telefono t3 = new Telefono(3, "movi", "333");

        AdminTelefono at = new AdminTelefono();

        int resultado = at.contarMovi(t1, t2, t3);

        System.out.println("Cantidad movi: " + resultado);
    }
}
