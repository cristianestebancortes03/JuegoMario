package com.library.excel;

import com.library.excel.personajes.AccionesHeroe;
import com.library.excel.personajes.PersonajesHeroes;

public class Main {

    public static void main(String[] args) {

        AccionesHeroe personaje = new AccionesHeroe("Mario", 3, 0, "s", true);

        System.out.println("Inicio del juego");
        System.out.println("Mario es tu personaje, tienes\n"
                + "que caminar y superar los obtaculos\n"
                + "Tu Avatar Mario tiene 3 vidas\n"
                + "Ingresando la letra S para avanzas\n"
                + "Ingresando dos veces la letra S para saltas\n"
                + "Puedes perder una vida si presionas otra tecla\n"
                + "Si pierdes las 3 vidas se acaba el juego\n"
                + "\n"
                + "\n"
                + "\n"
                + "EMPECEMOS EL JUEGO\n"
        );
        System.out.println("");
        System.out.println("");

        System.out.println(personaje);
        for (int i = 1; i <= 100; i++) {
            if (!personaje.validarVida()) {
                return;
            }
            personaje.avanzar();

        }
    }
}
