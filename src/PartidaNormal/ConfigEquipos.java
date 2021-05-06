package PartidaNormal;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import menucoldware.FrameGeneral;


/**
 *
 * @author david
 */
public class ConfigEquipos extends javax.swing.JPanel {

    //Creacion de las variables 
    int numeroEquipos;
    int contadorNumEquipos;
    Planeta crearEquipo;
    boolean cargar = false;
    //IMPORTANT: La ArrayList se crea de nuevo cada vez que "refrescamos" el panel, encontrar una solución.
    ArrayList<Planeta> equipos = new ArrayList<Planeta>();
    int vidasCargar = 0; 
    int misilesCargar = 0;
    
    
          
    
    //Vidas y misiles de cada tipo de equipo para poder mostrarlos.
    String vidasNormal = "200";
    String misilesNormal = "50";
    String vidasRojo = "200";
    String misilesRojo = "50";
    String vidasAzul = "200";
    String misilesAzul = "50";
    String vidasVerde = "200";
    String misilesVerde = "50";
    String vidasGaseoso = "400";
    String misilesGaseoso = "10";
    String vidasEnano = "100";
    String misilesEnano = "50";
    String vidasBerserk = "100";
    String misilesBerserk = "150";
    String vidasOscuro = "200";
    String misilesOscuro = "50";
    String vidasVegeta = "100";
    String misilesVegeta = "30";
    String vidasNigromante = "175";
    String misilesNigromante = "40";
    
    //Descripción de las habilidades de los planetas para poder mostrarlas.
    String skillNormal = "No tiene ninguna habilidad especial.";
    String skillRojo = "Ataques efectivos contra equipos verdes (x2). Poco efectivos contra equipos azules (/2).";
    String skillAzul = "Ataques efectivos contra equipos rojos (x2). Poco efectivos contra equipos verdes (/2).";
    String skillVerde = "Ataques efectivos contra equipos azules (x2). Poco efectivos contra equipos rojos (/2).";
    String skillGaseoso = "Gana 10 misiles máximos por ronda.";
    String skillEnano = "Tiene una probabilidad del 50% de esquivar los ataques.";
    String skillBerserk = "No puede defenderse.";
    String skillOscuro = "Inflinge el doble de daño a los objetivos con menos del 20% de su salud máxima.";
    String skillVegeta = "Obtiene +100 de vida y +10 misiles por equipo en la partida.";
    String skillNigromante = "Cuando un equipo muere, se cura 40 puntos de vida y recibe +20 misiles.";
    
    
    
    public ConfigEquipos(int numEquipos, int contNumEquipos) {
        initComponents();
        
            
            
            numeroEquipos = numEquipos;
            contadorNumEquipos = contNumEquipos;
            
            textNumeroEquipo.setText(String.valueOf("Equipo " + contNumEquipos));

            //Iniciamos los valores a los del equipo normal (que esta seleccionado de forma predeterminada).
            numeroVidasTipo.setText(vidasNormal);
            numeroMisilesTipo.setText(misilesNormal);
            descSkillTipo.setText(skillNormal);
            
            //Hacemos que seleccionar un tipo de equipo de la lista cuente como una acción para poder cambiar la información que se muestra.
            listaTipos.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    listaTiposActionPerformed(evt);
                }
            });
            
            //Añadimos un ActionListener al boton de "continuar".
            botonFinalizarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFinalizarEquipoActionPerformed(evt);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textNumeroEquipo = new javax.swing.JTextField();
        nombreEquipo = new javax.swing.JTextField();
        listaTipos = new javax.swing.JComboBox<>();
        labelVidas = new javax.swing.JLabel();
        labelMisiles = new javax.swing.JLabel();
        labelHabilidad = new javax.swing.JLabel();
        labelIntroduceNombre = new javax.swing.JLabel();
        labelEligeTipo = new javax.swing.JLabel();
        labelStatsTipo = new javax.swing.JLabel();
        numeroVidasTipo = new javax.swing.JTextField();
        numeroMisilesTipo = new javax.swing.JTextField();
        panelDescSkill = new javax.swing.JScrollPane();
        descSkillTipo = new javax.swing.JTextArea();
        botonFinalizarEquipo = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1280, 768));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textNumeroEquipo.setEditable(false);
        textNumeroEquipo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        textNumeroEquipo.setForeground(new java.awt.Color(255, 255, 255));
        textNumeroEquipo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textNumeroEquipo.setOpaque(false);
        add(textNumeroEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 1268, 90));

        nombreEquipo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nombreEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreEquipoActionPerformed(evt);
            }
        });
        add(nombreEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 176, 265, 70));

        listaTipos.setBackground(new java.awt.Color(204, 204, 204));
        listaTipos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        listaTipos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Rojo", "Azul", "Verde", "Gaseoso", "Enano", "Berserk", "Oscuro", "Vegeta Super Saiyan 2", "Nigromante" }));
        listaTipos.setToolTipText("El tipo del equipo cambia sus estadísticas y habilidades (si tiene).");
        listaTipos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listaTipos.setFocusable(false);
        add(listaTipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 457, 270, 70));

        labelVidas.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelVidas.setForeground(new java.awt.Color(255, 255, 255));
        labelVidas.setText("VIDAS:");
        add(labelVidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(688, 264, -1, -1));

        labelMisiles.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelMisiles.setForeground(new java.awt.Color(255, 255, 255));
        labelMisiles.setText("MISILES:");
        add(labelMisiles, new org.netbeans.lib.awtextra.AbsoluteConstraints(688, 363, -1, -1));

        labelHabilidad.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelHabilidad.setForeground(new java.awt.Color(255, 255, 255));
        labelHabilidad.setText("HABILIDAD:");
        add(labelHabilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(688, 498, -1, -1));

        labelIntroduceNombre.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelIntroduceNombre.setForeground(new java.awt.Color(255, 255, 255));
        labelIntroduceNombre.setText("Introduce el nombre del equipo:");
        add(labelIntroduceNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 196, -1, -1));

        labelEligeTipo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelEligeTipo.setForeground(new java.awt.Color(255, 255, 255));
        labelEligeTipo.setText("Elige el tipo (clase) del equipo:");
        add(labelEligeTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 478, -1, -1));

        labelStatsTipo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelStatsTipo.setForeground(new java.awt.Color(255, 255, 255));
        labelStatsTipo.setText("Estadísticas del tipo");
        add(labelStatsTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(849, 196, -1, -1));

        numeroVidasTipo.setEditable(false);
        numeroVidasTipo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        numeroVidasTipo.setForeground(new java.awt.Color(0, 255, 0));
        numeroVidasTipo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numeroVidasTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroVidasTipoActionPerformed(evt);
            }
        });
        add(numeroVidasTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(963, 264, -1, 33));

        numeroMisilesTipo.setEditable(false);
        numeroMisilesTipo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        numeroMisilesTipo.setForeground(new java.awt.Color(255, 51, 51));
        numeroMisilesTipo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numeroMisilesTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroMisilesTipoActionPerformed(evt);
            }
        });
        add(numeroMisilesTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(963, 361, -1, 33));

        panelDescSkill.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        panelDescSkill.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        descSkillTipo.setEditable(false);
        descSkillTipo.setColumns(20);
        descSkillTipo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        descSkillTipo.setLineWrap(true);
        descSkillTipo.setRows(5);
        descSkillTipo.setWrapStyleWord(true);
        panelDescSkill.setViewportView(descSkillTipo);

        add(panelDescSkill, new org.netbeans.lib.awtextra.AbsoluteConstraints(849, 457, 320, -1));

        botonFinalizarEquipo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        botonFinalizarEquipo.setText("Continuar");
        botonFinalizarEquipo.setFocusable(false);
        add(botonFinalizarEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 650, -1, 62));

        botonCancelar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botonCancelar.setText("Cancelar y volver");
        botonCancelar.setFocusable(false);
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });
        add(botonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 660, -1, 62));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/config_equips_.gif"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 770));
    }// </editor-fold>//GEN-END:initComponents

    private void nombreEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreEquipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreEquipoActionPerformed

    private void numeroVidasTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroVidasTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroVidasTipoActionPerformed

    private void numeroMisilesTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroMisilesTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroMisilesTipoActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        // TODO add your handling code here:
        FrameGeneral marco=(FrameGeneral) SwingUtilities.getWindowAncestor(this);
	marco.remove(this);
	marco.add(new EleccionNumEquipos());
	marco.setVisible(true);
    }//GEN-LAST:event_botonCancelarActionPerformed
    
    private void botonFinalizarEquipoActionPerformed(java.awt.event.ActionEvent evt) {
        //Guardamos el equipo con los parametros seleccionados por el jugador.
        boolean errorNombre = false;
        int x;

        //Comprobamos que el nombre tenga los carácteres indicados.
        if (nombreEquipo.getText().length() < 3){
            JOptionPane.showMessageDialog(this, "El nombre debe tener 3 carácteres como mínimo.");
            errorNombre = true;
        }else if (nombreEquipo.getText().length() > 15){
            JOptionPane.showMessageDialog(this, "El nombre puede tener 15 carácteres como máximo.");
            errorNombre = true;
        }
        
        for (x = 0; x < equipos.size(); x++) {
            //Comprobamos que el nombre del equipo sea diferente al de los otros.
            if (equipos.get(x).getNombreEquipo().equals(nombreEquipo.getText())) {
                JOptionPane.showMessageDialog(this, "El nombre del equipo ya está en uso. Introduce un nombre único.");
                errorNombre = true;
            }
        }
        if (errorNombre == false) {
            //Cuando el nombre no está repetido creamos el equipo y "refrescamos" el jpanel hasta que se hayan creado todos los equipos.
            crearEquipo = (new Planeta(nombreEquipo.getText(), listaTipos.getSelectedIndex(),cargar,vidasCargar,misilesCargar));
            equipos.add(crearEquipo);

            if (contadorNumEquipos < numeroEquipos) {
                botonFinalizarEquipo.revalidate();
                botonFinalizarEquipo.repaint();
                nombreEquipo.setText("");
                listaTipos.setSelectedIndex(0);
                contadorNumEquipos++;
                textNumeroEquipo.setText(String.valueOf("Equipo " + contadorNumEquipos));
            } else {
                FrameGeneral marco = (FrameGeneral) SwingUtilities.getWindowAncestor(this);
                marco.remove(this);
                marco.add(new Partida(equipos, numeroEquipos,cargar));
                marco.setVisible(true);
            }
        }
    }
    
    private void listaTiposActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        //Condiciones para cambiar la información mostrada dependiendo del tipo seleccionado.
        if(listaTipos.getSelectedIndex() == 0){
            numeroVidasTipo.setText(vidasNormal);
            numeroMisilesTipo.setText(misilesNormal);
            descSkillTipo.setText(skillNormal);
        }else if (listaTipos.getSelectedIndex() == 1){
            numeroVidasTipo.setText(vidasRojo);
            numeroMisilesTipo.setText(misilesRojo);
            descSkillTipo.setText(skillRojo);
        }else if (listaTipos.getSelectedIndex() == 2){
            numeroVidasTipo.setText(vidasAzul);
            numeroMisilesTipo.setText(misilesAzul);
            descSkillTipo.setText(skillAzul);
        }else if (listaTipos.getSelectedIndex() == 3){
            numeroVidasTipo.setText(vidasVerde);
            numeroMisilesTipo.setText(misilesVerde);
            descSkillTipo.setText(skillVerde);
        }else if (listaTipos.getSelectedIndex() == 4){
            numeroVidasTipo.setText(vidasGaseoso);
            numeroMisilesTipo.setText(misilesGaseoso);
            descSkillTipo.setText(skillGaseoso);
        }else if (listaTipos.getSelectedIndex() == 5){
            numeroVidasTipo.setText(vidasEnano);
            numeroMisilesTipo.setText(misilesEnano);
            descSkillTipo.setText(skillEnano);
        }else if (listaTipos.getSelectedIndex() == 6){
            numeroVidasTipo.setText(vidasBerserk);
            numeroMisilesTipo.setText(misilesBerserk);
            descSkillTipo.setText(skillBerserk);
        }else if (listaTipos.getSelectedIndex() == 7){
            numeroVidasTipo.setText(vidasOscuro);
            numeroMisilesTipo.setText(misilesOscuro);
            descSkillTipo.setText(skillOscuro);
        }else if (listaTipos.getSelectedIndex() == 8){
            numeroVidasTipo.setText(vidasVegeta);
            numeroMisilesTipo.setText(misilesVegeta);
            descSkillTipo.setText(skillVegeta);
        }else if (listaTipos.getSelectedIndex() == 9){
            numeroVidasTipo.setText(vidasNigromante);
            numeroMisilesTipo.setText(misilesNigromante);
            descSkillTipo.setText(skillNigromante);
        }
    }                 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonFinalizarEquipo;
    private javax.swing.JTextArea descSkillTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelEligeTipo;
    private javax.swing.JLabel labelHabilidad;
    private javax.swing.JLabel labelIntroduceNombre;
    private javax.swing.JLabel labelMisiles;
    private javax.swing.JLabel labelStatsTipo;
    private javax.swing.JLabel labelVidas;
    private javax.swing.JComboBox<String> listaTipos;
    private javax.swing.JTextField nombreEquipo;
    private javax.swing.JTextField numeroMisilesTipo;
    private javax.swing.JTextField numeroVidasTipo;
    private javax.swing.JScrollPane panelDescSkill;
    private javax.swing.JTextField textNumeroEquipo;
    // End of variables declaration//GEN-END:variables

   
           
          }

