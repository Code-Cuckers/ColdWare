/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ColdWar;

import BossRush.PanelBossRush;
import java.util.ArrayList;
import javax.swing.SwingUtilities;
import menucoldware.FrameGeneral;

/**
 *
 * @author Haru
 */
public class Eleccion_Personaje extends javax.swing.JPanel {

    
    public Eleccion_Personaje() {
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

        Jugar = new javax.swing.JButton();
        equipo3 = new javax.swing.JTextField();
        equipo1 = new javax.swing.JTextField();
        planetas2 = new javax.swing.JComboBox<>();
        planetas1 = new javax.swing.JComboBox<>();
        equipo2 = new javax.swing.JTextField();
        planetas3 = new javax.swing.JComboBox<>();
        equipo5 = new javax.swing.JTextField();
        equipo6 = new javax.swing.JTextField();
        equipo4 = new javax.swing.JTextField();
        planetas4 = new javax.swing.JComboBox<>();
        planetas5 = new javax.swing.JComboBox<>();
        planetas6 = new javax.swing.JComboBox<>();

        Jugar.setText("Jugar");
        Jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JugarActionPerformed(evt);
            }
        });

        equipo3.setText("Equipo 3");

        equipo1.setText("Equipo 1 ");

        planetas2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Planeta Rojo", "Planeta Azul", "Planeta Verde" }));

        planetas1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Planeta Rojo", "Planeta Azul", "Planeta Verde" }));

        equipo2.setText("Equipo 2 ");

        planetas3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Planeta Rojo", "Planeta Azul", "Planeta Verde" }));

        equipo5.setText("Equipo 3");

        equipo6.setText("Equipo 3");

        equipo4.setText("Equipo 3");

        planetas4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Planeta Rojo", "Planeta Azul", "Planeta Verde" }));

        planetas5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Planeta Rojo", "Planeta Azul", "Planeta Verde" }));
        planetas5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planetas5ActionPerformed(evt);
            }
        });

        planetas6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Planeta Rojo", "Planeta Azul", "Planeta Verde" }));
        planetas6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planetas6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(planetas5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(planetas3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(planetas2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(planetas4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(459, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(equipo6, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addComponent(planetas6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(equipo5, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(equipo4, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(equipo3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(equipo2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(equipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(planetas1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Jugar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(221, 221, 221))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(planetas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equipo2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(planetas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equipo3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(planetas3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equipo4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(planetas4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equipo5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(planetas5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equipo6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(planetas6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(Jugar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JugarActionPerformed
        // TODO add your handling code here:
        

        String jugador1 = "" + equipo1.getText();
        String jugador2 = "" + equipo2.getText();
        String jugador3 = "" + equipo3.getText();
        String jugador4 = "" + equipo4.getText();
        String jugador5 = "" + equipo5.getText();
        String jugador6 = "" + equipo6.getText();

        
        FrameGeneral marco=(FrameGeneral) SwingUtilities.getWindowAncestor(this);
	marco.remove(this);
	marco.add(new Pelea_ColdWar(jugador1,jugador2,jugador3,jugador4,jugador5,jugador6));
	marco.setVisible(true);
    
         
        
        
    }//GEN-LAST:event_JugarActionPerformed

    private void planetas5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planetas5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_planetas5ActionPerformed

    private void planetas6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planetas6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_planetas6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jugar;
    private javax.swing.JTextField equipo1;
    private javax.swing.JTextField equipo2;
    private javax.swing.JTextField equipo3;
    private javax.swing.JTextField equipo4;
    private javax.swing.JTextField equipo5;
    private javax.swing.JTextField equipo6;
    private javax.swing.JComboBox<String> planetas1;
    private javax.swing.JComboBox<String> planetas2;
    private javax.swing.JComboBox<String> planetas3;
    private javax.swing.JComboBox<String> planetas4;
    private javax.swing.JComboBox<String> planetas5;
    private javax.swing.JComboBox<String> planetas6;
    // End of variables declaration//GEN-END:variables
}