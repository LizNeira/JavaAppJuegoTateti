/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegotateti;

/**
 *
 * @author Liz
 */
public class JuegoTateti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tateti t = new Tateti();
        System.out.println("Las posiciones de los numeros van en orden del teclado");
        t.generarTablero();
        t.mostrarTablero();
        Jugador j1 = new Jugador("x", "pepe", t);
        Jugador j2 = new Jugador("0", "pepe2", t);

        boolean ganador = false;
        
        while (ganador == false) {
            j1.jugar();
            t.mostrarTablero();
            if (!(ganador = t.hayGanador())) {
                j2.jugar();
                t.mostrarTablero();
                ganador=t.hayGanador();
            }

        }
        if(ganador==true)
        {
            System.out.println(" Hay ganador y es "+t.getFichaGan()); 
            
        }
        else {
            System.out.println(" no hay nagador");
        }

    }

}
