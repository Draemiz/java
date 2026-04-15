package com.cmc.directorio.entidades;

public class Contacto {
	private String nombre;
    private String apellido;
    private boolean activo;
    private Telefono telefono;
    private double peso;

    public Contacto(String nombre, String apellido, Telefono telefono, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.peso = peso;
        this.activo = false;
    }

    // getters
    public Telefono getTelefono() { return telefono; }
    public double getPeso() { return peso; }

    public boolean isActivo() { return activo; }
    public void setActivo(boolean activo) { this.activo = activo; }
}

