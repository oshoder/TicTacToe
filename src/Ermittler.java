/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Felix
 */
public class Ermittler {
    //Variablen
    public int zaehler = -1;
    private Icon kreisIcon = new ImageIcon(GUI.class.getResource(
            "Kreis.png"));
    private Icon kreuzIcon = new ImageIcon(GUI.class.getResource(
            "Kreuz.png"));
    private Icon leerIcon = new ImageIcon(GUI.class.getResource(
            "Leer.png"));

    private static int KREUZ = 1;
    public int[] buttonIcons = new int[10];
    public boolean gewonnen = false;

    private int kreuzwin = 0;
    private int kreiswin = 0;
    private int patt = 0;
    private int spielanzahl = 0;
    


    
    
 //ermittler
    private int checkicon() {
        if (zaehler % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean checkwin() {
        //für kreuz:
        if(! gewonnen){
        if (buttonIcons[1] == 1 && buttonIcons[2] == 1 && buttonIcons[3] == 1
                || buttonIcons[4] == 1 && buttonIcons[5] == 1 && buttonIcons[6] == 1
                || buttonIcons[7] == 1 && buttonIcons[8] == 1 && buttonIcons[9] == 1
                || buttonIcons[1] == 1 && buttonIcons[5] == 1 && buttonIcons[9] == 1
                || buttonIcons[3] == 1 && buttonIcons[5] == 1 && buttonIcons[7] == 1
                || buttonIcons[1] == 1 && buttonIcons[4] == 1 && buttonIcons[7] == 1
                || buttonIcons[2] == 1 && buttonIcons[5] == 1 && buttonIcons[8] == 1
                || buttonIcons[3] == 1 && buttonIcons[6] == 1 && buttonIcons[9] == 1) {
            gewonnen = true;
            kreuzwin++;
            spielanzahl++;
            GUI.winskreuz.setText(" " + kreuzwin);
            GUI.spielanzahl1.setText("Spielanzahl:" + spielanzahl);
            GUI.newgame.setVisible(true);
            return true;
        }
        //für kreis
        if (buttonIcons[1] == 2 && buttonIcons[2] == 2 && buttonIcons[3] == 2
                || buttonIcons[4] == 2 && buttonIcons[5] == 2 && buttonIcons[6] == 2
                || buttonIcons[7] == 2 && buttonIcons[8] == 2 && buttonIcons[9] == 2
                || buttonIcons[1] == 2 && buttonIcons[5] == 2 && buttonIcons[9] == 2
                || buttonIcons[3] == 2 && buttonIcons[5] == 2 && buttonIcons[7] == 2
                || buttonIcons[1] == 2 && buttonIcons[4] == 2 && buttonIcons[7] == 2
                || buttonIcons[2] == 2 && buttonIcons[5] == 2 && buttonIcons[8] == 2
                || buttonIcons[3] == 2 && buttonIcons[6] == 2 && buttonIcons[9] == 2) {
            gewonnen = true;
            kreiswin++;
            spielanzahl++;
            GUI.newgame.setVisible(true);
            GUI.spielanzahl1.setText("Spielanzahl:" + spielanzahl);
            GUI.winskreis.setText(" " + kreiswin);
            return true;
        }
        if (zaehler == 8 && !gewonnen) {
            patt++;
            spielanzahl++;
            gewonnen = true;
            GUI.newgame.setVisible(true);
            GUI.unentschieden.setText("Unentschieden: " + patt);
            GUI.spielanzahl1.setText("Spielanzahl:" + spielanzahl);
        }
        
        }

        return false;
    }

    private Icon getIcon(int id) {
        if (buttonIcons[id] == KREUZ) {
            return kreuzIcon;
        }
        if (buttonIcons[id] == 2) {
            return kreisIcon;
        } else {
            return leerIcon;
        }

    }

    public Icon setIcon(int id) {
        zaehler++;
        if (! gewonnen) {
            if (alreadyUsed(id) == false) {
                if (checkicon() == 0) {
                    buttonIcons[id] = 1;
                    return kreuzIcon;
                } else {
                    buttonIcons[id] = 2;
                    return kreisIcon;
                }
            } else {
                return getIcon(id);
            }
        }
        return getIcon(id);
    }

    private boolean alreadyUsed(int id) {
        if (buttonIcons[id] == 2 || buttonIcons[id] == 1) {
            zaehler--;
            if (zaehler <= -1) {
                zaehler = 0;
            }
            return true;
        } else {
            return false;
        }
    }
    
}
