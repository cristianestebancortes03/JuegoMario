package com.library.excel.personajes;

import java.util.Objects;
import java.util.Scanner;



public class AccionesHeroe extends PersonajesHeroes{
    
        
    public AccionesHeroe(String nombre, int vida, int posicionTablero, String avanzar, boolean saltar) {
        super(nombre, vida, posicionTablero, avanzar, saltar);
    }
    public void avanzar(){
        this.setPosicionTablero(this.getPosicionTablero()+1);

        if(this.getPosicionTablero() == 10){
            System.out.println("Se encuentra un obtaculo en el camino");
            if(preguntas().isEmpty()){
                System.out.println("perdiste una vida, te quedan :" +this.getVida());
            }
            System.out.println("Continua eres un ganador");
        }


        if(this.preguntas().equalsIgnoreCase(this.getAvanzar())){
            System.out.println("Continua eres un ganador");
        }else{
            this.perderVida();
            System.out.println("perdiste una vida, te quedan :" +this.getVida());
        }
    }

    public void perderVida(){
        this.setVida(this.getVida()-1);

    }
    public boolean validarVida(){
        if(this.getVida()<1){
            System.out.println("GAME OVER :" +this.getVida());
            return false;
        }
        return  true;
    }
    public String preguntas(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Avanza:");
        return scanner.nextLine();
    }

}
