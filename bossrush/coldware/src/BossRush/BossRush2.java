 package BossRush;

import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;
import menucoldware.FrameGeneral;
import javax.swing.SwingUtilities;

public class BossRush2 extends javax.swing.JPanel {

    
    //Creacion de las variables 
    int vida_enemigo = 300;
    int vidaa_jugador;
    int curacion_enemigo;
    int ataque_enemigo;
    int daño_jugador;
    int daño_enemigo;
    int recursos = 10;
    int cd_curacion = 4;
    int cd_fireball = 5;
    int efectos;
    int boost_atk;
    int boost_hp;
    int eleccion_atk;
    int reduccion_enemigo;
    int usos_fb;
    int usos_heal;
    int daño_fireball;
    int boost_fireball;
    
    public BossRush2(String Nombre_Usuario , int boost_hp, int boost_elec,int vida_jugador, int reduccion_dmg) {
        initComponents();
        Nombre_Jugador.getText();
        Nombre_Jugador.setText(Nombre_Usuario);
        
        reduccion_enemigo = reduccion_dmg;
        daño_enemigo = reduccion_enemigo - daño_enemigo;
       
        vidaa_jugador = vida_jugador;
        vidaa_jugador = vidaa_jugador + boost_hp;
        daño_jugador = daño_jugador + boost_atk;
        
        Barra_jugador.setValue(vida_jugador);
        hp_enemigo.setText(String.valueOf(vida_enemigo+" HP"));
        hp_jugador.setText(String.valueOf(vidaa_jugador+" HP"));
        Barra_jugador.setValue(vida_jugador);
        //cd_heal.setText(String.valueOf(cd_curacion+ " Turnos"));
        //FireBall_label.setText(String.valueOf(cd_fireball + " Turnos"));

        eleccion_atk = boost_elec; 
        Nombre_Jugador.setText(Nombre_Usuario);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        Salir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Nombre_Jugador = new javax.swing.JLabel();
        Barra_recursos = new javax.swing.JProgressBar();
        Barra_jugador = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        hp_jugador = new javax.swing.JLabel();
        atacar = new javax.swing.JButton();
        random_effect = new javax.swing.JToggleButton();
        Fire_Ball = new javax.swing.JButton();
        Curacion = new javax.swing.JButton();
        Barra_enemigo = new javax.swing.JProgressBar();
        hp_enemigo = new javax.swing.JLabel();
        Boss_Name = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1280, 768));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/klmlklj.gif"))); // NOI18N

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/c0d38c518fdbf6012e0475bb7a0598a5.gif"))); // NOI18N

        Nombre_Jugador.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Nombre_Jugador.setLabelFor(Barra_enemigo);
        Nombre_Jugador.setText("TU");

        Barra_recursos.setForeground(new java.awt.Color(0, 51, 204));
        Barra_recursos.setMaximum(10);
        Barra_recursos.setValue(10);

        Barra_jugador.setForeground(new java.awt.Color(51, 232, 22));
        Barra_jugador.setValue(100);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setText("Recursos");

        hp_jugador.setText("% Vida");

        atacar.setText("Atacar");
        atacar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atacarMouseClicked(evt);
            }
        });
        atacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atacarActionPerformed(evt);
            }
        });

        random_effect.setText("Random effect ");
        random_effect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                random_effectActionPerformed(evt);
            }
        });

        Fire_Ball.setText("Fire Ball");
        Fire_Ball.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fire_BallActionPerformed(evt);
            }
        });

        Curacion.setText("Heal");
        Curacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuracionActionPerformed(evt);
            }
        });

        Barra_enemigo.setForeground(new java.awt.Color(51, 232, 22));
        Barra_enemigo.setMaximum(300);
        Barra_enemigo.setToolTipText("");
        Barra_enemigo.setValue(300);

        hp_enemigo.setText("HP");

        Boss_Name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Boss_Name.setLabelFor(Barra_enemigo);
        Boss_Name.setText("Alex mamadisimo");

        jButton6.setText("?");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/orstein.gif"))); // NOI18N

        jLayeredPane3.setLayer(Salir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(Nombre_Jugador, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(Barra_recursos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(Barra_jugador, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(hp_jugador, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(atacar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(random_effect, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(Fire_Ball, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(Curacion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(Barra_enemigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(hp_enemigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(Boss_Name, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jButton6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(hp_jugador)
                            .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Barra_jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(Barra_recursos, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jLayeredPane3Layout.createSequentialGroup()
                                    .addComponent(Nombre_Jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 513, Short.MAX_VALUE)
                        .addComponent(Curacion, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(random_effect, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jLayeredPane3Layout.createSequentialGroup()
                                    .addComponent(atacar, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(45, 45, 45)
                                    .addComponent(Fire_Ball, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1))))
                .addGap(95, 95, 95))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                                .addComponent(hp_enemigo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Boss_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Barra_enemigo, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65))))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(201, 201, 201)
                        .addComponent(jLabel3))
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(hp_enemigo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boss_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Barra_enemigo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1)))
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Nombre_Jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(Barra_recursos, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(atacar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Fire_Ball, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(39, 39, 39)
                        .addComponent(Barra_jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Curacion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(random_effect, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hp_jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLayeredPane3)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 6, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

   
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        
        //Sale de la partida al presionar Salir
        FrameGeneral marco=(FrameGeneral) SwingUtilities.getWindowAncestor(this);
	marco.remove(this);
	marco.add(new Nombre_Boss_Rush());
	marco.setVisible(true);
        
    }//GEN-LAST:event_SalirActionPerformed

    private void atacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atacarActionPerformed
        // TODO add your handling code here:
        
        String Nombre_Usuario = Nombre_Jugador.getText();

        recursos = recursos -2;
        
        
        Random rand = new Random();
        daño_jugador = rand.nextInt(18) +1;
        daño_jugador = daño_jugador + eleccion_atk;
        daño_jugador = daño_jugador + boost_atk;
        vida_enemigo = vida_enemigo - daño_jugador;
        
        
        //Update barras de vida
        ResetBarras();
        
        
        
        //Comprobaciones: el enemigo muere, el jugador muere y uso de recursos
        if (recursos <= 0){
          JOptionPane.showMessageDialog(this,"Turno del enemigo");
          
          if (vida_enemigo <= 0){
              
        FrameGeneral marco=(FrameGeneral) SwingUtilities.getWindowAncestor(this);
	marco.remove(this);
	marco.add(new Eleccion_Jugador2(Nombre_Usuario,vidaa_jugador));
	marco.setVisible(true);
              
          }else{
            Turno_Enemigo(); 
          
          }
        }
        
        
        if (vida_enemigo <= 0 ){
         JOptionPane.showMessageDialog(this,"a morido");
         
        
        FrameGeneral marco=(FrameGeneral) SwingUtilities.getWindowAncestor(this);
	marco.remove(this);
	marco.add(new Eleccion_Jugador2(Nombre_Usuario,vidaa_jugador));
	marco.setVisible(true);
        

        }
        
        if (vidaa_jugador <= 0 ){
        
        JOptionPane.showMessageDialog(this,"Game Over");

        FrameGeneral marco=(FrameGeneral) SwingUtilities.getWindowAncestor(this);
	marco.remove(this);
	marco.add(new YouDied());
	marco.setVisible(true);
             
        }
        if (recursos < 5){
            
            Fire_Ball.setEnabled(false);
            
        }else if (usos_fb < 2 ){
            
            Fire_Ball.setEnabled(true);
            
        }
        
        boost_atk = 0;
        Barra_recursos.setValue(recursos);
        //log.setText("El jugador acaba de hacer " + daño_jugador);
              
    }//GEN-LAST:event_atacarActionPerformed

    private void atacarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atacarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_atacarMouseClicked

    private void CuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuracionActionPerformed
        // TODO add your handling code here:
        
        
          //Curacion del jugador
        vidaa_jugador = vidaa_jugador + 40;
        
        Barra_jugador.setValue(vidaa_jugador);
        
        
        //Curacion.setEnabled(false);
        
        usos_heal++;
        
        if (usos_heal == 2){
            
            Curacion.setEnabled(false);
            
        }
        
                
    }//GEN-LAST:event_CuracionActionPerformed

    private void Fire_BallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fire_BallActionPerformed
        // TODO add your handling code here:
        
        String Nombre_Usuario = Nombre_Jugador.getText();

        daño_fireball = 25;
        recursos = recursos -5;
        
        daño_fireball = daño_fireball + boost_fireball;
        vida_enemigo = vida_enemigo - daño_fireball;
         
       
        ResetBarras();
        
        usos_fb++;
        
        if (recursos <= 0){
          JOptionPane.showMessageDialog(this,"Turno del enemigo");
          
          if (vida_enemigo <= 0){
              
        FrameGeneral marco=(FrameGeneral) SwingUtilities.getWindowAncestor(this);
	marco.remove(this);
	marco.add(new Eleccion_Jugador2(Nombre_Usuario,vidaa_jugador));
	marco.setVisible(true);
              
          }else{
            Turno_Enemigo(); 
            
          }
        }
        
        if (vidaa_jugador <= 0 ){
        
        JOptionPane.showMessageDialog(this,"Game Over");

        FrameGeneral marco=(FrameGeneral) SwingUtilities.getWindowAncestor(this);
	marco.remove(this);
	marco.add(new YouDied());
	marco.setVisible(true);
             
        }
        
        
       if (vida_enemigo <= 0 ){
           
           JOptionPane.showMessageDialog(this,"a morido");
         
        
        FrameGeneral marco=(FrameGeneral) SwingUtilities.getWindowAncestor(this);
	marco.remove(this);
	marco.add(new Eleccion_Jugador2(Nombre_Usuario,vidaa_jugador));
	marco.setVisible(true);
        

       }
       
       if (usos_fb == 2){
           
         Fire_Ball.setEnabled(false);

       }
       
        boost_fireball = 0;
        ResetBarras();
        
    }//GEN-LAST:event_Fire_BallActionPerformed

    private void random_effectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_random_effectActionPerformed
        // TODO add your handling code here:
        
        //Random efect cuando presionas el boton 
        Random efecto_random = new Random();
        efectos = efecto_random.nextInt(50);
        
        
        if (efectos <= 10){

            boost_atk = boost_atk + 60;
            JOptionPane.showMessageDialog(this,"Tienes un boost de daño de 60 al atacar normal ");
            
            

        }else if (efectos >= 11 && efectos <= 20){
            
            boost_hp = boost_hp +40;
            vidaa_jugador = vidaa_jugador + boost_hp;
            JOptionPane.showMessageDialog(this,"Acabas de recuperar 40 de vida ");
            

        }else if (efectos >= 21 && efectos <= 30) {
            
            boost_atk = 80;
            boost_hp = 80;
            JOptionPane.showMessageDialog(this,"Acabas de ser bendezido por Eir y recuperas 80 de vida y tienes 80 de daño para el siguiente ataque");
   
        }else if (efectos >= 31 && efectos <= 40) {
            
            vidaa_jugador = vidaa_jugador - 30;
            JOptionPane.showMessageDialog(this,"Vaya parece que la suerte no esta de tu lado hoy, lo siento pero 30 puntos de vida menos ");

        }else if(efectos >= 41 && efectos <= 50){
            
            boost_fireball = boost_fireball + 100;
            JOptionPane.showMessageDialog(this,"Sientes una gran energia recorriendo tu cuerpo, Merlin parece estar de buen humor hoy +50 de ataque en la proxima Bola de fuego ");
            
        }
        
        random_effect.setEnabled(false);
        ResetBarras();
        
        
        
    }//GEN-LAST:event_random_effectActionPerformed

    public void Turno_Enemigo(){
        
        
        // Generacion de numeros aleatorios para: el ataque, el daño que va a hacer el enemigo y la curacion que va a recibir
        Random random_Enemigo = new Random();
        ataque_enemigo = random_Enemigo.nextInt(3) +1;
        
        Random daño_random = new Random();
        daño_enemigo = daño_random.nextInt(25);
        
        Random vida_random = new Random();
        curacion_enemigo = vida_random.nextInt(30);
        
        
        if (ataque_enemigo == 1){
            
            vidaa_jugador = vidaa_jugador - daño_enemigo;
            
            Barra_jugador.setValue(vidaa_jugador);
                        
            //log.setText("Le acierta un golpe con la espada y le hace " + daño_enemigo + "!");

            
        }
        else if (ataque_enemigo == 2){
            
            vida_enemigo = vida_enemigo + curacion_enemigo;
            
            if (vida_enemigo > 200){
                
                vida_enemigo = 200;
            }
            Barra_enemigo.setValue(vida_enemigo);
                        
            //og.setText("Oh no acaba de tomarse una pocion y acaba de curarse " + curacion_enemigo + "!");

            
        }else if (ataque_enemigo == 3){
            
            daño_enemigo= daño_enemigo *2;
            
            vidaa_jugador = vidaa_jugador - daño_enemigo;
            
            Barra_jugador.setValue(vidaa_jugador);
                        
            //log.setText("Acaba de hacer " + daño_enemigo + " de un golpe critico!!!!!!");
            
            
        }
        
         ResetBarras();

         atacar.setEnabled(true);
         recursos = 10;
    }


    
    
    
    public void ResetBarras(){
        
        
        Barra_jugador.setValue(vidaa_jugador);
        Barra_enemigo.setValue(vida_enemigo);
        Barra_recursos.setValue(recursos);
        hp_enemigo.setText(String.valueOf(vida_enemigo + " HP"));
        hp_jugador.setText(String.valueOf(vidaa_jugador+ " HP"));
        
        
    }
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Barra_enemigo;
    private javax.swing.JProgressBar Barra_jugador;
    private javax.swing.JProgressBar Barra_recursos;
    private javax.swing.JLabel Boss_Name;
    private javax.swing.JButton Curacion;
    private javax.swing.JButton Fire_Ball;
    private javax.swing.JLabel Nombre_Jugador;
    private javax.swing.JButton Salir;
    private javax.swing.JButton atacar;
    private javax.swing.JLabel hp_enemigo;
    private javax.swing.JLabel hp_jugador;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JToggleButton random_effect;
    // End of variables declaration//GEN-END:variables
}
