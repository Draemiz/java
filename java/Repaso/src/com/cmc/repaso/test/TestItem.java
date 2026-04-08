package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		Item item = new Item();

        item.setNombre("Colchón");
        item.setProductosActuales(20);
        
        item.imprimir();

        // venta
        item.vender(5);
        item.imprimir();

        // devolución
        item.devolver(2);
        item.imprimir();
	}

}
