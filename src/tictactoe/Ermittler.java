/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Felix
 */
public class Ermittler {
    private int i = -1;
    private Icon kreisIcon = new ImageIcon(GUI.class.getResource(
                "Kreis.png"));
    
    private Icon kreuzIcon = new ImageIcon(GUI.class.getResource(
                "Kreuz.png"));
    
    public Ermittler() {
         this.kreisIcon = kreisIcon;
         this.kreuzIcon = kreuzIcon;
         this.i = i;
    }
       
   
   private int checkicon(){
       if(i % 2 == 0){
           System.out.println(i);
           return 0;
       }else{
           System.out.println(i);
           return 1;
       }
   }
   
   public boolean checkwin(){
       return false;
   }
   
   public Icon geticon(){
       i++;
       if(checkicon() == 0){
           return kreuzIcon;
       }else{
           return kreisIcon;
       }
   }
    
}
