/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegotateti;

public class Tateti {

    private String Tablero[][] = new String[3][3];
    private String fichaGan;

    public String getFichaGan() {
        return fichaGan;
    }

  public void mostrarTablero() {
        System.out.println(" ");
        for (int f = 0; f < Tablero.length; f++) {
            for (int c = 0; c < Tablero[0].length; c++)
            {
                System.out.print(Tablero[f][c] + " ");
            }
            System.out.println(" ");
        }
    }

    public void generarTablero() {
        for (int f = 0; f < Tablero.length; f++) {
            for (int c = 0; c < Tablero[0].length; c++) {
                Tablero[f][c] = "-";
            }
        }
    }

    public boolean ponerFicha(int posF, int posC, String ficha){
        
        if (Tablero[posF][posC]!= null)
        {
            if (Tablero[posF][posC] == "-") 
            {
                Tablero[posF][posC] = ficha;
                return (true);
            } else {
                return (true);
            }
        }
        else {
            return false;
        }

    }
    public boolean hayGanador(){
        // fila 
     if((Tablero[0][0]!="-")&&(Tablero[0][0]==Tablero[0][1])&&(Tablero[0][1]==Tablero[0][2]))
             {
                 fichaGan=Tablero[0][0];
                 return(true);
             }
     if((Tablero[1][0]!="-")&&(Tablero[1][0]==Tablero[1][1])&&(Tablero[1][1]==Tablero[1][2]))
             {
                 fichaGan=Tablero[1][0];
                 return(true);
             }
     if((Tablero[2][0]!="-")&&(Tablero[2][0]==Tablero[2][1])&&(Tablero[2][1]==Tablero[2][2]))
             {
                 fichaGan=Tablero[2][0];
                 return(true);
             }
     //columnas 
     if((Tablero[0][0]!="-")&&(Tablero[0][0]==Tablero[1][0])&&(Tablero[1][0]==Tablero[2][0]))
             {
                 fichaGan=Tablero[0][0];
                 return(true);
             }
     if((Tablero[0][1]!="-")&&(Tablero[0][1]==Tablero[1][1])&&(Tablero[1][1]==Tablero[2][1]))
             {
                 fichaGan=Tablero[0][1];
                 return(true);
             }
     if((Tablero[0][2]!="-")&&(Tablero[0][2]==Tablero[1][2])&&(Tablero[1][2]==Tablero[2][2]))
             {
                 fichaGan=Tablero[0][2];
                 return(true);
             }
     //diagonal baja 
     if((Tablero[0][0]!="-")&&(Tablero[0][0]==Tablero[1][1])&&(Tablero[1][1]==Tablero[2][2]))
             {
                 fichaGan=Tablero[0][0];
                 return(true);
             }
     // diagonal sube
      if((Tablero[2][0]!="-")&&(Tablero[2][0]==Tablero[1][1])&&(Tablero[1][1]==Tablero[0][2]))
             {
                 fichaGan=Tablero[2][0];
                 return(true);
             }
      // no hay tateti
      return (false);
      
    }
}
