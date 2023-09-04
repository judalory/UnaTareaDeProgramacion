package com.mycompany.metodosconstructores;
public class Persona {
    private String nmbr;
    private int edd;
    public Persona(String nombre, int edad) {
        this.nmbr = nombre;
        this.edd = edad;
    }
    public String Nombre() {
        return nmbr;
    }
    public int Edad() {
        return edd;
    }
    public String saludar() {
        return "Hola, soy " + nmbr + " y tengo " + edd + " años.";
    }
}
