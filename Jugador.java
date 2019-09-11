/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegotateti;

import java.util.Scanner;

/**
 *
 * @author Liz
 */
public class Jugador {

    private String ficha;
    private String nombre;
    private Tateti t;

    public Jugador(String ficha, String nombre, Tateti t) {
        this.ficha = ficha;
        this.nombre = nombre;
        this.t=t;
    }

    public void jugar() {
        int f = 0;
        int c = 0;
        Scanner s = new Scanner(System.in);
        System.out.println(" ingrese un numero del 1 al 9 " + " jugador " +ficha);
        int j = s.nextInt();
        switch (j) {
            default:
                System.out.println(" valor incorrecto");
                break;
            case 1:
                f = 2;
                c = 0;
                break;
            case 2:
                f = 2;
                c = 1;
                break;
            case 3:
                f = 2;
                c = 2;
                break;
            case 4:
                f = 1;
                c = 0;
                break;
            case 5:
                f = 1;
                c = 1;
                break;
            case 6:
                f = 1;
                c = 2;
                break;
            case 7:
                f = 0;
                c = 0;
                break;
            case 8:
                f = 0;
                c = 1;
                break;
            case 9:
                f = 0;
                c = 2;
                break;
        }
        if (t.ponerFicha(f, c, ficha) == false) {
            System.out.println(" jugada incorrecta");
        }
    }

}
