package tictactoe;

import java.awt.Button;
import java.awt.Component;
import java.io.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fmarggra
 */
public class GUI extends javax.swing.JFrame {

    //Variablen
    private int zaehler = -1;
    private Icon kreisIcon = new ImageIcon(GUI.class.getResource(
            "Kreis.png"));
    private Icon kreuzIcon = new ImageIcon(GUI.class.getResource(
            "Kreuz.png"));
    private Icon leerIcon = new ImageIcon(GUI.class.getResource(
            "Leer.png"));

    private Ermittler e;

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        e = new Ermittler();
        tictactoefeld.setVisible(false);
        newgame.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jFrame1 = new javax.swing.JFrame();
        tictactoefeld = new javax.swing.JPanel();
        button1 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        spielanzahl1 = new javax.swing.JLabel();
        winskreuz = new javax.swing.JLabel();
        winskreis = new javax.swing.JLabel();
        unentschieden = new javax.swing.JLabel();
        newgame = new javax.swing.JButton();
        feld = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        quizfeld = new javax.swing.JPanel();
        quizfeldbild = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuDatei = new javax.swing.JMenu();
        spielstarten1 = new javax.swing.JMenuItem();
        hintergrundmusik = new javax.swing.JMenuItem();
        cheat = new javax.swing.JMenuItem();
        Trennlinie1 = new javax.swing.JPopupMenu.Separator();
        Hilfe = new javax.swing.JMenuItem();
        uber = new javax.swing.JMenuItem();
        ToggleMusic = new javax.swing.JCheckBoxMenuItem();
        Trennlinie = new javax.swing.JPopupMenu.Separator();
        beenden = new javax.swing.JMenuItem();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 0));
        setMinimumSize(new java.awt.Dimension(750, 550));
        getContentPane().setLayout(null);

        tictactoefeld.setBackground(new java.awt.Color(63, 81, 181));
        tictactoefeld.setMinimumSize(new java.awt.Dimension(950, 550));
        tictactoefeld.setLayout(null);

        button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoe/Leer.png"))); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        tictactoefeld.add(button1);
        button1.setBounds(10, 10, 150, 140);

        button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoe/Leer.png"))); // NOI18N
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        tictactoefeld.add(button2);
        button2.setBounds(190, 10, 150, 140);

        button3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoe/Leer.png"))); // NOI18N
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        tictactoefeld.add(button3);
        button3.setBounds(370, 10, 150, 140);

        button4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoe/Leer.png"))); // NOI18N
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        tictactoefeld.add(button4);
        button4.setBounds(10, 180, 150, 140);

        button5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoe/Leer.png"))); // NOI18N
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });
        tictactoefeld.add(button5);
        button5.setBounds(190, 180, 150, 140);

        button6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoe/Leer.png"))); // NOI18N
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });
        tictactoefeld.add(button6);
        button6.setBounds(370, 180, 140, 140);

        button7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoe/Leer.png"))); // NOI18N
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });
        tictactoefeld.add(button7);
        button7.setBounds(10, 350, 150, 140);

        button8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoe/Leer.png"))); // NOI18N
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });
        tictactoefeld.add(button8);
        button8.setBounds(190, 350, 150, 140);

        button9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoe/Leer.png"))); // NOI18N
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });
        tictactoefeld.add(button9);
        button9.setBounds(370, 350, 150, 140);

        spielanzahl1.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        spielanzahl1.setForeground(new java.awt.Color(255, 255, 255));
        spielanzahl1.setText("Spielanzahl:");
        tictactoefeld.add(spielanzahl1);
        spielanzahl1.setBounds(540, 360, 190, 50);

        winskreuz.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        winskreuz.setForeground(new java.awt.Color(255, 255, 255));
        tictactoefeld.add(winskreuz);
        winskreuz.setBounds(660, 70, 60, 50);

        winskreis.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        winskreis.setForeground(new java.awt.Color(255, 255, 255));
        winskreis.setToolTipText("");
        tictactoefeld.add(winskreis);
        winskreis.setBounds(560, 70, 100, 50);

        unentschieden.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        unentschieden.setForeground(new java.awt.Color(255, 255, 255));
        unentschieden.setText("Unentschieden: ");
        tictactoefeld.add(unentschieden);
        unentschieden.setBounds(540, 250, 200, 70);

        newgame.setText("Neues Spiel");
        newgame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newgameActionPerformed(evt);
            }
        });
        tictactoefeld.add(newgame);
        newgame.setBounds(540, 430, 180, 50);

        feld.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoe/Feld.png"))); // NOI18N
        tictactoefeld.add(feld);
        feld.setBounds(0, 0, 530, 496);

        jLabel1.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Kreuz");
        tictactoefeld.add(jLabel1);
        jLabel1.setBounds(660, 30, 70, 40);

        jLabel2.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Kreis    ||");
        tictactoefeld.add(jLabel2);
        jLabel2.setBounds(550, 30, 120, 40);

        getContentPane().add(tictactoefeld);
        tictactoefeld.setBounds(0, 0, 740, 500);

        quizfeld.setMinimumSize(new java.awt.Dimension(950, 550));

        quizfeldbild.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoe/jeopardyfeld.png"))); // NOI18N

        javax.swing.GroupLayout quizfeldLayout = new javax.swing.GroupLayout(quizfeld);
        quizfeld.setLayout(quizfeldLayout);
        quizfeldLayout.setHorizontalGroup(
            quizfeldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quizfeldLayout.createSequentialGroup()
                .addComponent(quizfeldbild, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 422, Short.MAX_VALUE))
        );
        quizfeldLayout.setVerticalGroup(
            quizfeldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quizfeldLayout.createSequentialGroup()
                .addComponent(quizfeldbild)
                .addGap(0, 54, Short.MAX_VALUE))
        );

        getContentPane().add(quizfeld);
        quizfeld.setBounds(0, 0, 530, 500);

        jMenuBar1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jMenuBar1.setBorderPainted(false);

        jMenuDatei.setBackground(new java.awt.Color(51, 255, 102));
        jMenuDatei.setText("Optionen");

        spielstarten1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        spielstarten1.setBackground(new java.awt.Color(0, 51, 153));
        spielstarten1.setText("Spiel starten");
        spielstarten1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spielstarten1ActionPerformed(evt);
            }
        });
        jMenuDatei.add(spielstarten1);

        hintergrundmusik.setText("Hintergrundmusik starten");
        hintergrundmusik.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        hintergrundmusik.setFocusable(true);
        hintergrundmusik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hintergrundmusikActionPerformed(evt);
            }
        });
        jMenuDatei.add(hintergrundmusik);

        cheat.setText("Cheat Code");
        cheat.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cheat.setFocusable(true);
        jMenuDatei.add(cheat);
        jMenuDatei.add(Trennlinie1);

        Hilfe.setText("Hilfe");
        Hilfe.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Hilfe.setFocusable(true);
        Hilfe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HilfeActionPerformed(evt);
            }
        });
        jMenuDatei.add(Hilfe);

        uber.setText("Über");
        uber.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        uber.setFocusable(true);
        uber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uberActionPerformed(evt);
            }
        });
        jMenuDatei.add(uber);

        ToggleMusic.setSelected(true);
        ToggleMusic.setText("Toggle Musik");
        jMenuDatei.add(ToggleMusic);
        jMenuDatei.add(Trennlinie);

        beenden.setText("Beenden");
        beenden.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        beenden.setFocusable(true);
        beenden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beendenActionPerformed(evt);
            }
        });
        jMenuDatei.add(beenden);

        jMenuBar1.add(jMenuDatei);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void spielstarten1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spielstarten1ActionPerformed
        tictactoefeld.setVisible(true);
    }//GEN-LAST:event_spielstarten1ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        button9.setIcon(e.setIcon(9));
        e.checkwin();
    }//GEN-LAST:event_button9ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        button1.setIcon(e.setIcon(1));
        e.checkwin();
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        button2.setIcon(e.setIcon(2));
        e.checkwin();
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        button3.setIcon(e.setIcon(3));
        e.checkwin();
    }//GEN-LAST:event_button3ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        button6.setIcon(e.setIcon(6));
        e.checkwin();
    }//GEN-LAST:event_button6ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        button5.setIcon(e.setIcon(5));
        e.checkwin();
    }//GEN-LAST:event_button5ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        button4.setIcon(e.setIcon(4));
        e.checkwin();
    }//GEN-LAST:event_button4ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        button7.setIcon(e.setIcon(7));
        e.checkwin();
    }//GEN-LAST:event_button7ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        button8.setIcon(e.setIcon(8));
        e.checkwin();
    }//GEN-LAST:event_button8ActionPerformed

    private void newgameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newgameActionPerformed
        // TODO add your handling code here:
        button1.setIcon(leerIcon);
        button2.setIcon(leerIcon);
        button3.setIcon(leerIcon);
        button4.setIcon(leerIcon);
        button5.setIcon(leerIcon);
        button6.setIcon(leerIcon);
        button7.setIcon(leerIcon);
        button8.setIcon(leerIcon);
        button9.setIcon(leerIcon);
        e.zaehler = -1;
        e.gewonnen = false;
        newgame.setVisible(false);
        for (int j = 0; j < e.buttonIcons.length; j++) {
            e.buttonIcons[j] = 0;
        }
    }//GEN-LAST:event_newgameActionPerformed
//Musik einspeisung; AndereAPIs waren nicht Erfolgreich
//Open License:https://www.youtube.com/audiolibrary/music;
//Maybe This Time, JR Tundra
    
    
    private void hintergrundmusikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hintergrundmusikActionPerformed
        InputStream in;
        try {
            in = new FileInputStream(new File("D:\\#My Projects\\Offline\\TicTacToe-master\\src\\tictactoe\\Maybe_This_Time.wav"));
            AudioStream audios = new AudioStream(in);
            AudioPlayer.player.start(audios);
        } catch (Exception t) {
            JOptionPane.showMessageDialog(null, t);
    }//GEN-LAST:event_hintergrundmusikActionPerformed
    }
    
    
    
    private void beendenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beendenActionPerformed
        System.exit(0);
    }//GEN-LAST:event_beendenActionPerformed

    private void uberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uberActionPerformed
        JOptionPane.showMessageDialog(jFrame1,
                "<html><br>TicTacToe Version 2.1<br>This is not a free/open programm<br>"
                        + "Access has to be granted by the following owners<br>"
                        + "Oshoder, Cevapci? and kinqqqqqq<br>"
                        + "WGO BERLIN</html>",
                "Über das Programm",
                JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_uberActionPerformed

    private void HilfeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HilfeActionPerformed
                JOptionPane.showMessageDialog(jFrame1,
                "<html><br>Das Grundprinzip ist Simpel:<br>Es muss lediglich ein Spieler<br>"
                        + "3 gleiche Objekte entweder<br>"
                        + "Diagonal, Horizontal oder Vertikal anlegen<br>"
                        + "wer zuerts dies erreicht, gewinnt !</html>",
                "Wie spielt man dieses Spiel",
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_HilfeActionPerformed

            
    
    
    
  /*  private void ToggleMusicActionPerformed(java.awt.event.ActionEvent evt) {
        InputStream in;
        try {
            in = new FileInputStream(new File("D:\\#My Projects\\Offline\\TicTacToe-master\\src\\tictactoe\\Maybe_This_Time.wav"));
            AudioStream audios = new AudioStream(in);
            AudioPlayer.player.start(audios);
        } catch (Exception t) {
            JOptionPane.showMessageDialog(null, t);
        }

    }
*/


/**
 * @param args the command line arguments
 */
public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                

}
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Hilfe;
    private javax.swing.JCheckBoxMenuItem ToggleMusic;
    private javax.swing.JPopupMenu.Separator Trennlinie;
    private javax.swing.JPopupMenu.Separator Trennlinie1;
    private javax.swing.JMenuItem beenden;
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JMenuItem cheat;
    private javax.swing.JLabel feld;
    private javax.swing.JMenuItem hintergrundmusik;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuDatei;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    public static javax.swing.JButton newgame;
    private javax.swing.JPanel quizfeld;
    private javax.swing.JLabel quizfeldbild;
    public static javax.swing.JLabel spielanzahl1;
    private javax.swing.JMenuItem spielstarten1;
    private javax.swing.JPanel tictactoefeld;
    private javax.swing.JMenuItem uber;
    public static javax.swing.JLabel unentschieden;
    public static javax.swing.JLabel winskreis;
    public static javax.swing.JLabel winskreuz;
    // End of variables declaration//GEN-END:variables
}
