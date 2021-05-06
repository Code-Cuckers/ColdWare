/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OpcionesMenu;

import BossRush.BossRushTutorial;
import BossRush.Nombre_Boss_Rush;
import BossRush.PanelBossRush;
import menucoldware.FrameGeneral;
import InformacionPaneles.InfoBossRush;
import InformacionPaneles.InfoPartidaNormal;
import PartidaNormal.EleccionNumEquipos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;

/**
 *
 * @author rasca
 */
public class MenuModo extends javax.swing.JPanel implements ActionListener  {

    /**
     * Creates new form EleccionPartida
     */
    public MenuModo() {
        initComponents();
            infoPartidaNormal.addActionListener(this);
            Volver.addActionListener(this);
            BossRush.addActionListener(this);
            partidaNormal.addActionListener(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        partidaNormal = new javax.swing.JButton();
        BossRush = new javax.swing.JButton();
        infoPartidaNormal = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        Tutorial = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        partidaNormal.setText("Cold War");
        partidaNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partidaNormalActionPerformed(evt);
            }
        });
        add(partidaNormal, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 310, 147, 39));

        BossRush.setText("Boss Rush");
        BossRush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BossRushActionPerformed(evt);
            }
        });
        add(BossRush, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 367, 147, 39));

        infoPartidaNormal.setText("?");
        add(infoPartidaNormal, new org.netbeans.lib.awtextra.AbsoluteConstraints(648, 310, -1, 39));

        Volver.setText("Volver");
        add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 660, 91, 47));

        Tutorial.setText("Tutorial");
        Tutorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TutorialActionPerformed(evt);
            }
        });
        add(Tutorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, 108, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_equipo.gif"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void BossRushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BossRushActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_BossRushActionPerformed

    private void TutorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TutorialActionPerformed
        // TODO add your handling code here:
        
        FrameGeneral marco=(FrameGeneral) SwingUtilities.getWindowAncestor(this);
	marco.remove(this);
	marco.add(new BossRushTutorial());
	marco.setVisible(true);
        
    }//GEN-LAST:event_TutorialActionPerformed

    private void partidaNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partidaNormalActionPerformed
        // TODO add your handling code here:
        
        FrameGeneral marco=(FrameGeneral) SwingUtilities.getWindowAncestor(this);
	marco.remove(this);
	marco.add(new EleccionNumEquipos());
	marco.setVisible(true);
    }//GEN-LAST:event_partidaNormalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BossRush;
    private javax.swing.JButton Tutorial;
    private javax.swing.JButton Volver;
    private javax.swing.JButton infoPartidaNormal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton partidaNormal;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Volver){
        FrameGeneral marco=(FrameGeneral) SwingUtilities.getWindowAncestor(this);
	marco.remove(this);
	marco.add(new MenuPrincipal());
	marco.setVisible(true);
        }
        
            if(e.getSource()==infoPartidaNormal){
        FrameGeneral marco=(FrameGeneral) SwingUtilities.getWindowAncestor(this);
	marco.remove(this);
	marco.add(new InfoPartidaNormal());
	marco.setVisible(true);
        }
             
            if(e.getSource()==BossRush){
        FrameGeneral marco=(FrameGeneral) SwingUtilities.getWindowAncestor(this);
	marco.remove(this);
	marco.add(new Nombre_Boss_Rush());
	marco.setVisible(true);
        }
             
        
        
        
    }
}