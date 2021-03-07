 package BossRush;

import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;
import menucoldware.FrameGeneral;
import javax.swing.SwingUtilities;

public class BossRush3 extends javax.swing.JPanel {

    
    //Creacion de las variables 
    int vida_enemigo = 400;
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
    int pamaxi;
    int usos_fb;
    int usos_heal;
    int daño_fireball;
    int boost_fireball;
    
    boolean eleccion;
    boolean sifireball;
    
    public BossRush3(String Nombre_Usuario, int boost_hp, int pamax ,int vida_jugador, boolean fireball, boolean pa) {
        initComponents();
        Nombre_Jugador.getText();
        Nombre_Jugador.setText(Nombre_Usuario);
        
        pamaxi = pamax;
        recursos = recursos + pamaxi;
        Barra_recursos.setMaximum(recursos);
        
        
        vidaa_jugador = vida_jugador;
        vidaa_jugador = vidaa_jugador + boost_hp;
        daño_jugador = daño_jugador + boost_atk;
        
        eleccion = pa;
        
        sifireball = fireball;
        
        Barra_jugador.setValue(vida_jugador);
        hp_enemigo.setText(String.valueOf(vida_enemigo+" HP"));
        hp_jugador.setText(String.valueOf(vidaa_jugador+" HP"));
        Barra_recursos.setValue(recursos);
        //cd_heal.setText(String.valueOf(cd_curacion+ " Turnos"));
        //FireBall_label.setText(String.valueOf(cd_fireball + " Turnos"));

        //Nombre_Jugador.setText(Nombre_Usuario);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        Salir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Nombre_Jugador = new javax.swing.JLabel();
        Barra_recursos = new javax.swing.JProgressBar();
        Barra_jugador = new javax.swing.JProgressBar();
        hp_jugador = new javax.swing.JLabel();
        hp_enemigo = new javax.swing.JLabel();
        Barra_enemigo = new javax.swing.JProgressBar();
        Boss_Name = new javax.swing.JLabel();
        atacar = new javax.swing.JButton();
        random_effect = new javax.swing.JToggleButton();
        Fire_Ball = new javax.swing.JButton();
        Curacion = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1280, 768));

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setText("Recursos");

        Nombre_Jugador.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Nombre_Jugador.setLabelFor(Barra_enemigo);
        Nombre_Jugador.setText("TU");

        Barra_recursos.setForeground(new java.awt.Color(0, 51, 204));
        Barra_recursos.setMaximum(10);
        Barra_recursos.setValue(10);

        Barra_jugador.setForeground(new java.awt.Color(51, 232, 22));
        Barra_jugador.setValue(100);

        hp_jugador.setText("% Vida");

        hp_enemigo.setText("HP");

        Barra_enemigo.setForeground(new java.awt.Color(51, 232, 22));
        Barra_enemigo.setMaximum(400);
        Barra_enemigo.setToolTipText("");
        Barra_enemigo.setValue(400);

        Boss_Name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Boss_Name.setLabelFor(Barra_enemigo);
        Boss_Name.setText("David mamadisimo");

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

        jButton6.setText("?");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/c0d38c518fdbf6012e0475bb7a0598a5.gif"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/d9vknnd-9ae1664d-3f3f-4caa-a0a2-5977bc7b8582.gif"))); // NOI18N

        jLayeredPane1.setLayer(Salir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Nombre_Jugador, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Barra_recursos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Barra_jugador, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(hp_jugador, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(hp_enemigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Barra_enemigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Boss_Name, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(atacar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(random_effect, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Fire_Ball, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Curacion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(hp_enemigo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                                .addComponent(Boss_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Barra_enemigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                            .addComponent(Nombre_Jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(65, 65, 65)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(hp_jugador))
                                    .addComponent(Barra_jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 266, Short.MAX_VALUE)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addGap(439, 439, 439)
                                        .addComponent(jButton6))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(random_effect, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(atacar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(49, 49, 49)
                                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Fire_Ball, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Curacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(28, 28, 28))))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(Barra_recursos, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(47, 47, 47))
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hp_enemigo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boss_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Barra_enemigo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6)
                        .addContainerGap())
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nombre_Jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Barra_recursos, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(atacar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Fire_Ball, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Barra_jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Curacion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(random_effect, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hp_jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
       
        recursos = recursos - 2 ;
        
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
	marco.add(new YouWin());
	marco.setVisible(true);
              
          }else{
            Turno_Enemigo(); 
           
          }
        }
        
        
        if (vida_enemigo <= 0 ){
         JOptionPane.showMessageDialog(this,"a morido");
         
        
        FrameGeneral marco=(FrameGeneral) SwingUtilities.getWindowAncestor(this);
	marco.remove(this);
	marco.add(new YouWin());
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
            
        }else if (usos_fb <2 ){
            
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
        vidaa_jugador = vidaa_jugador + 30;
        
        Barra_jugador.setValue(vidaa_jugador);
        
        
        
        //Curacion.setEnabled(false);
        
        usos_heal++;
        
        if (usos_heal == 2){
            
            Curacion.setEnabled(false);
            
        }
        
    }//GEN-LAST:event_CuracionActionPerformed

    private void Fire_BallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fire_BallActionPerformed
        // TODO add your handling code here:
        
        
        daño_jugador = 25;
        recursos = recursos -5;
        
        daño_fireball = daño_jugador + boost_fireball;
        vida_enemigo = vida_enemigo - daño_fireball;
         
        ResetBarras();
        
        usos_fb++;
        
        if (recursos <= 0){
          JOptionPane.showMessageDialog(this,"Turno del enemigo");
          
          if (vida_enemigo <= 0){
              
        FrameGeneral marco=(FrameGeneral) SwingUtilities.getWindowAncestor(this);
	marco.remove(this);
	marco.add(new Nombre_Boss_Rush());
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
	marco.add(new Nombre_Boss_Rush());
	marco.setVisible(true);
        

       }
       
        if(usos_fb == 3 & sifireball){
            
            Fire_Ball.setEnabled(false);
        
        }else if(usos_fb == 2 & !sifireball){
            
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
            boost_hp = boost_hp + 80;
            vidaa_jugador = vidaa_jugador + boost_hp;
            JOptionPane.showMessageDialog(this,"Acabas de ser bendezido por Eir y recuperas 80 de vida y tienes 80 de daño para el siguiente ataque");
   
        }else if (efectos >= 31 && efectos <= 40) {
            
            vidaa_jugador = vidaa_jugador - 30;
            JOptionPane.showMessageDialog(this,"Vaya parece que la suerte no esta de tu lado hoy, lo siento pero 10 puntos de vida menos ");

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
        daño_enemigo = daño_random.nextInt(35);
        
        Random vida_random = new Random();
        curacion_enemigo = vida_random.nextInt(50);
        
        
        if (ataque_enemigo == 1){
            
            vidaa_jugador = vidaa_jugador - daño_enemigo;
            
            Barra_jugador.setValue(vidaa_jugador);
            
            System.out.println("toma daño");
            
            //log.setText("Le acierta un golpe con la espada y le hace " + daño_enemigo + "!");

            
        }
        else if (ataque_enemigo == 2){
            
            vida_enemigo = vida_enemigo + curacion_enemigo;
            
            if (vida_enemigo > 200){
                
                vida_enemigo = 200;
            }
            Barra_enemigo.setValue(vida_enemigo);
            
            
            //log.setText("Oh no acaba de tomarse una pocion y acaba de curarse " + curacion_enemigo + "!");

            
        }else if (ataque_enemigo == 3){
            
            daño_enemigo= daño_enemigo *2;
            
            vidaa_jugador = vidaa_jugador - daño_enemigo;
            
            Barra_jugador.setValue(vidaa_jugador);
                        
            //log.setText("Acaba de hacer " + daño_enemigo + " de un golpe critico!!!!!!");
            
            
        }
        
         ResetBarras();

         
         atacar.setEnabled(true);
         
         if (eleccion){
             
             recursos = 14;
             
         }else {
             
             recursos = 10;
             
         }
         
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
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JToggleButton random_effect;
    // End of variables declaration//GEN-END:variables
}
