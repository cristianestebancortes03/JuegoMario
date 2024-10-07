package com.library.excel.personajes;

public class PersonajesHeroes {

    private String nombre;
    private int vida;
    private int posicionTablero;
    private String avanzar;
    private boolean saltar;

    public PersonajesHeroes(String nombre, int vida, int posicionTablero, String avanzar, boolean saltar) {
        this.nombre = nombre;
        this.vida = vida;
        this.posicionTablero = posicionTablero;
        this.avanzar = avanzar;
        this.saltar = saltar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getPosicionTablero() {
        return posicionTablero;
    }

    public void setPosicionTablero(int posicionTablero) {
        this.posicionTablero = posicionTablero;
    }

    public String getAvanzar() {
        return avanzar;
    }

    public void setAvanzar(String avanzar) {
        this.avanzar = avanzar;
    }

    public boolean getSaltar() {
        return saltar;
    }

    public void setSaltar(boolean saltar) {
        this.saltar = saltar;
    }
}
