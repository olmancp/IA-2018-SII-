/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_ia;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Fer Alvarado
 */
public class Inicio extends javax.swing.JFrame {
    public Clip clip;
    public String ruta="/Sonido/";
    /**
     * @param args the command line arguments
     */
    public void sonido(String archivo) throws LineUnavailableException, UnsupportedAudioFileException, IOException{
        clip=AudioSystem.getClip();
        clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(ruta+ archivo+ ".wav")));
        clip.start();
    }

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        num = new javax.swing.JLabel();
        circulo = new javax.swing.JLabel();
        Escala = new javax.swing.JLabel();
        Escala1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Do = new javax.swing.JButton();
        DoS = new javax.swing.JButton();
        Re = new javax.swing.JButton();
        ReS = new javax.swing.JButton();
        Mi = new javax.swing.JButton();
        Fa = new javax.swing.JButton();
        FaS = new javax.swing.JButton();
        Sol = new javax.swing.JButton();
        SolS = new javax.swing.JButton();
        La = new javax.swing.JButton();
        LaS = new javax.swing.JButton();
        Si = new javax.swing.JButton();
        Do1 = new javax.swing.JButton();
        Do1S = new javax.swing.JButton();
        Re1 = new javax.swing.JButton();
        Re1S = new javax.swing.JButton();
        Mi1 = new javax.swing.JButton();
        Fa1 = new javax.swing.JButton();
        Fa1S = new javax.swing.JButton();
        Sol1 = new javax.swing.JButton();
        Sol1S = new javax.swing.JButton();
        La1 = new javax.swing.JButton();
        La1S = new javax.swing.JButton();
        Si1 = new javax.swing.JButton();
        Do2 = new javax.swing.JButton();
        Do2S = new javax.swing.JButton();
        Re2 = new javax.swing.JButton();
        Re2S = new javax.swing.JButton();
        Mi2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        num.setBackground(new java.awt.Color(0, 0, 0));
        num.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        num.setForeground(new java.awt.Color(204, 153, 0));
        num.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num.setText("24");
        num.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 153, 0)));

        circulo.setBackground(new java.awt.Color(0, 0, 0));
        circulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circulo de quintas.png"))); // NOI18N

        Escala.setBackground(new java.awt.Color(0, 0, 0));
        Escala.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        Escala.setForeground(new java.awt.Color(204, 153, 0));
        Escala.setText("Escala: ");

        Escala1.setBackground(new java.awt.Color(0, 0, 0));
        Escala1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        Escala1.setForeground(new java.awt.Color(204, 153, 0));
        Escala1.setText("Hola");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(circulo)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(Escala)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Escala1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(189, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(circulo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(148, 148, 148)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Escala)
                            .addComponent(Escala1))))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        Do.setBackground(new java.awt.Color(255, 255, 255));
        Do.setAlignmentY(0.0F);
        Do.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        Do.setBorderPainted(false);
        Do.setName("Do"); // NOI18N
        Do.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoActionPerformed(evt);
            }
        });

        DoS.setBackground(new java.awt.Color(0, 0, 0));
        DoS.setAlignmentY(0.0F);
        DoS.setBorder(new javax.swing.border.MatteBorder(null));
        DoS.setBorderPainted(false);

        Re.setBackground(new java.awt.Color(255, 255, 255));
        Re.setAlignmentY(0.0F);
        Re.setBorder(null);
        Re.setBorderPainted(false);
        Re.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReActionPerformed(evt);
            }
        });

        ReS.setBackground(new java.awt.Color(0, 0, 0));
        ReS.setAlignmentY(0.0F);
        ReS.setBorder(null);
        ReS.setBorderPainted(false);

        Mi.setBackground(new java.awt.Color(255, 255, 255));
        Mi.setAlignmentY(0.0F);
        Mi.setBorder(null);
        Mi.setBorderPainted(false);
        Mi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiActionPerformed(evt);
            }
        });

        Fa.setBackground(new java.awt.Color(255, 255, 255));
        Fa.setAlignmentY(0.0F);
        Fa.setBorder(null);
        Fa.setBorderPainted(false);
        Fa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FaActionPerformed(evt);
            }
        });

        FaS.setBackground(new java.awt.Color(0, 0, 0));
        FaS.setAlignmentY(0.0F);
        FaS.setBorder(null);
        FaS.setBorderPainted(false);

        Sol.setBackground(new java.awt.Color(255, 255, 255));
        Sol.setAlignmentY(0.0F);
        Sol.setBorder(null);
        Sol.setBorderPainted(false);
        Sol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SolActionPerformed(evt);
            }
        });

        SolS.setBackground(new java.awt.Color(0, 0, 0));
        SolS.setAlignmentY(0.0F);
        SolS.setBorder(null);
        SolS.setBorderPainted(false);

        La.setBackground(new java.awt.Color(255, 255, 255));
        La.setAlignmentY(0.0F);
        La.setBorder(null);
        La.setBorderPainted(false);
        La.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaActionPerformed(evt);
            }
        });

        LaS.setBackground(new java.awt.Color(0, 0, 0));
        LaS.setAlignmentY(0.0F);
        LaS.setBorder(null);
        LaS.setBorderPainted(false);

        Si.setBackground(new java.awt.Color(255, 255, 255));
        Si.setAlignmentY(0.0F);
        Si.setBorder(null);
        Si.setBorderPainted(false);
        Si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiActionPerformed(evt);
            }
        });

        Do1.setBackground(new java.awt.Color(255, 255, 255));
        Do1.setAlignmentY(0.0F);
        Do1.setBorder(null);
        Do1.setBorderPainted(false);

        Do1S.setBackground(new java.awt.Color(0, 0, 0));
        Do1S.setAlignmentY(0.0F);
        Do1S.setBorder(null);
        Do1S.setBorderPainted(false);

        Re1.setBackground(new java.awt.Color(255, 255, 255));
        Re1.setAlignmentY(0.0F);
        Re1.setBorder(null);
        Re1.setBorderPainted(false);

        Re1S.setBackground(new java.awt.Color(0, 0, 0));
        Re1S.setAlignmentY(0.0F);
        Re1S.setBorder(null);
        Re1S.setBorderPainted(false);

        Mi1.setBackground(new java.awt.Color(255, 255, 255));
        Mi1.setAlignmentY(0.0F);
        Mi1.setBorder(null);
        Mi1.setBorderPainted(false);

        Fa1.setBackground(new java.awt.Color(255, 255, 255));
        Fa1.setAlignmentY(0.0F);
        Fa1.setBorder(null);
        Fa1.setBorderPainted(false);

        Fa1S.setBackground(new java.awt.Color(0, 0, 0));
        Fa1S.setAlignmentY(0.0F);
        Fa1S.setBorder(null);
        Fa1S.setBorderPainted(false);

        Sol1.setBackground(new java.awt.Color(255, 255, 255));
        Sol1.setAlignmentY(0.0F);
        Sol1.setBorder(null);
        Sol1.setBorderPainted(false);

        Sol1S.setBackground(new java.awt.Color(0, 0, 0));
        Sol1S.setAlignmentY(0.0F);
        Sol1S.setBorder(null);
        Sol1S.setBorderPainted(false);

        La1.setBackground(new java.awt.Color(255, 255, 255));
        La1.setAlignmentY(0.0F);
        La1.setBorder(null);
        La1.setBorderPainted(false);

        La1S.setBackground(new java.awt.Color(0, 0, 0));
        La1S.setAlignmentY(0.0F);
        La1S.setBorder(null);
        La1S.setBorderPainted(false);

        Si1.setBackground(new java.awt.Color(255, 255, 255));
        Si1.setAlignmentY(0.0F);
        Si1.setBorder(null);
        Si1.setBorderPainted(false);

        Do2.setBackground(new java.awt.Color(255, 255, 255));
        Do2.setAlignmentY(0.0F);
        Do2.setBorder(null);
        Do2.setBorderPainted(false);

        Do2S.setBackground(new java.awt.Color(0, 0, 0));
        Do2S.setAlignmentY(0.0F);
        Do2S.setBorder(null);
        Do2S.setBorderPainted(false);

        Re2.setBackground(new java.awt.Color(255, 255, 255));
        Re2.setAlignmentY(0.0F);
        Re2.setBorder(null);
        Re2.setBorderPainted(false);

        Re2S.setBackground(new java.awt.Color(0, 0, 0));
        Re2S.setAlignmentY(0.0F);
        Re2S.setBorder(null);
        Re2S.setBorderPainted(false);

        Mi2.setBackground(new java.awt.Color(255, 255, 255));
        Mi2.setAlignmentY(0.0F);
        Mi2.setBorder(null);
        Mi2.setBorderPainted(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(Do, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DoS, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Re, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ReS, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Mi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Fa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FaS, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sol, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SolS, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(La, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LaS, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Si, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Do1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Do1S, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Re1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Re1S, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Mi1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Fa1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Fa1S, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sol1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sol1S, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(La1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(La1S, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Si1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Do2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Do2S, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Re2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Re2S, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Mi2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Do, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Re, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Mi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Fa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Sol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(La, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Si, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Do1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Re1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Mi1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Fa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Sol1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(La1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Si1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Do2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Re2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Mi2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DoS, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReS, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FaS, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SolS, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LaS, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Do1S, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Re1S, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Fa1S, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sol1S, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(La1S, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Do2S, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Re2S, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoActionPerformed
        try {
            // TODO add your handling code here:
            sonido("DO");
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DoActionPerformed

    private void MiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiActionPerformed
        try {
            // TODO add your handling code here:
            sonido("MI");
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MiActionPerformed

    private void ReActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReActionPerformed
        try {
            // TODO add your handling code here:
            sonido("RE");
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ReActionPerformed

    private void FaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FaActionPerformed
        try {
            // TODO add your handling code here:
            sonido("FA");
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_FaActionPerformed

    private void SolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SolActionPerformed
        try {
            // TODO add your handling code here:
            sonido("SOL");
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SolActionPerformed

    private void LaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaActionPerformed
        try {
            // TODO add your handling code here:
            sonido("LA");
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_LaActionPerformed

    private void SiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiActionPerformed
        try {
            // TODO add your handling code here:
            sonido("SI");
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SiActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Do;
    private javax.swing.JButton Do1;
    private javax.swing.JButton Do1S;
    private javax.swing.JButton Do2;
    private javax.swing.JButton Do2S;
    private javax.swing.JButton DoS;
    private javax.swing.JLabel Escala;
    private javax.swing.JLabel Escala1;
    private javax.swing.JButton Fa;
    private javax.swing.JButton Fa1;
    private javax.swing.JButton Fa1S;
    private javax.swing.JButton FaS;
    private javax.swing.JButton La;
    private javax.swing.JButton La1;
    private javax.swing.JButton La1S;
    private javax.swing.JButton LaS;
    private javax.swing.JButton Mi;
    private javax.swing.JButton Mi1;
    private javax.swing.JButton Mi2;
    private javax.swing.JButton Re;
    private javax.swing.JButton Re1;
    private javax.swing.JButton Re1S;
    private javax.swing.JButton Re2;
    private javax.swing.JButton Re2S;
    private javax.swing.JButton ReS;
    private javax.swing.JButton Si;
    private javax.swing.JButton Si1;
    private javax.swing.JButton Sol;
    private javax.swing.JButton Sol1;
    private javax.swing.JButton Sol1S;
    private javax.swing.JButton SolS;
    private javax.swing.JLabel circulo;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel num;
    // End of variables declaration//GEN-END:variables
}
