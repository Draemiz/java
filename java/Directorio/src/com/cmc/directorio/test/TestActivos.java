package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {
	public static void main(String[] args) {

        Telefono t = new Telefono(1, "movi", "999");

        Contacto c = new Contacto("Carlos", "Diaz", t, 60);

        System.out.println("Activo antes: " + c.isActivo());

        AdminTelefono at = new AdminTelefono();
        at.activarMensajeria(t);

        AdminContactos ac = new AdminContactos();
        ac.activarUsuario(c);

        System.out.println("Activo después: " + c.isActivo());
    }
}
