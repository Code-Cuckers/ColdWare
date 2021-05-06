package PartidaNormal;

import OpcionesMenu.MenuPrincipal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import menucoldware.FrameGeneral;

/**
 *
 * @author david
 */
public class Partida extends javax.swing.JPanel {

    //Creacion de las variables
    Planeta crearEquipo;
    public int contadorGuardar;
    private int x, y, z; //Variables bucles
    private ArrayList<Planeta> equiposPartida = new ArrayList<>();
    private int numeroEquipos;
    private int equiposMuertos = 0;
    private int numRonda = 1;
    private static int numTurno = 0;
    private int indexEquipo = 0;
    private int indexObjetivo = 0;
    private int tipoObjetivo;
    private int magnitudAtaque;
    private boolean oscuroActivo;
    private boolean cargado;
    private int resultado;
    private int misilesBase;

    public Partida(ArrayList<Planeta> equipos, int numEquipos, boolean cargar) {
        initComponents();

        equiposPartida = equipos;
        numeroEquipos = numEquipos;
        labelNumRonda.setText("Ronda " + numRonda);
        activarPasivaVegeta();

        cargado = cargar;
        
  

        
        if (cargado) {

            Connection cn2 = null;
            Statement stm2 = null;
            ResultSet rs = null;

            try {
                connection conexion = new connection();

                cn2 = (Connection) conexion.Conectar();
                stm2 = (Statement) cn2.createStatement();

                String query2 = "SELECT * FROM jugadores ORDER BY idjugadores ASC";

                rs = stm2.executeQuery(query2);


                while (rs.next()) {
                    String nomjugador = rs.getString(1);
                    int idjugadores = rs.getInt(2);
                    int tipo_jugador = rs.getInt(3);
                    int vidas = rs.getInt(4);
                    int misiles = rs.getInt(5);

                    System.out.println(misiles);
                    

                    crearEquipo = (new Planeta(nomjugador, tipo_jugador,cargado,vidas,misiles));
                    equiposPartida.add(crearEquipo);
                    
                }

                selectRonda();

            } catch (java.sql.SQLException e) {

            }

        }

        if (!cargar) {
            numTurno = 0;
            insertarTextoLog("<Fase de preparación -- Ronda " + numRonda + ">");
            siguienteTurno();
        }

    }

    public void selectEquipos() {

        Connection cn2 = null;
        Statement stm2 = null;

        try {
            
            connection conexion = new connection();
            
            cn2 = (Connection) conexion.Conectar();
            stm2 = (Statement) cn2.createStatement();
            
            
            ResultSet rs2 = null;
            
            
            String query3 = "SELECT COUNT(idjugadores) from jugadores";
            rs2 = stm2.executeQuery(query3);

            while (rs2.next()) {
                int numeroJugadores = rs2.getInt(1);

                numeroEquipos = numeroJugadores;

                System.out.println(numeroEquipos);
                
                
                
            }
            
            siguienteTurno();

        } catch (java.sql.SQLException e) {

        }
    }

    public void selectRonda() {

        Connection cn2 = null;
        Statement stm2 = null;
        ResultSet rs = null;

        try {
            connection conexion = new connection();

            cn2 = (Connection) conexion.Conectar();
            stm2 = (Statement) cn2.createStatement();

            System.out.println();

            String query2 = "SELECT * FROM partida";
            rs = stm2.executeQuery(query2);

            while (rs.next()) {
                int numeroRonda = rs.getInt(1);
                int equiposMuertos1 = rs.getInt(2);
                int numerojugadores = rs.getInt(3);

                numRonda = numeroRonda;
                equiposMuertos = equiposMuertos1;
                numeroEquipos = numerojugadores;
                labelNumRonda.setText("Ronda " + numRonda);
                insertarTextoLog("<Fase de preparación -- Ronda " + numRonda + ">");

                cambiarInfoTurnoActual();
                System.out.println(numeroRonda);
                
                

            }

            selectEquipos();
            
        } catch (java.sql.SQLException e) {

        }
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollLogAcciones = new javax.swing.JScrollPane();
        logAcciones = new javax.swing.JTextArea();
        labelLogAcciones = new javax.swing.JLabel();
        scrollListaRivales = new javax.swing.JScrollPane();
        listaRivales = new javax.swing.JTextArea();
        labelListaEquipos = new javax.swing.JLabel();
        labelNumRonda = new javax.swing.JLabel();
        panelTurnoEquipo = new javax.swing.JPanel();
        panelAtaque = new javax.swing.JPanel();
        labelObjetivos = new javax.swing.JLabel();
        listaObjetivosAtaque = new javax.swing.JComboBox<>();
        labelMagnitudAtk = new javax.swing.JLabel();
        inputValorAtaque = new javax.swing.JTextField();
        labelPanelAtaque = new javax.swing.JLabel();
        botonCrearAtaque = new javax.swing.JButton();
        botonDefender = new javax.swing.JButton();
        panelMovimTurno = new javax.swing.JScrollPane();
        listaMovimientosTurno = new javax.swing.JTextArea();
        labelMovimTurno = new javax.swing.JLabel();
        botonElimMovim = new javax.swing.JButton();
        labelEquipoActual = new javax.swing.JLabel();
        barraVidas = new javax.swing.JProgressBar();
        labelVidas = new javax.swing.JLabel();
        labelNumVidas = new javax.swing.JLabel();
        barraMisiles = new javax.swing.JProgressBar();
        labelMisiles = new javax.swing.JLabel();
        labelNumMisiles = new javax.swing.JLabel();
        botonFinalizTurno = new javax.swing.JButton();
        botonVolver = new javax.swing.JButton();
        GuardarPartida = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scrollLogAcciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        logAcciones.setEditable(false);
        logAcciones.setBackground(new java.awt.Color(166, 166, 166));
        logAcciones.setColumns(20);
        logAcciones.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        logAcciones.setLineWrap(true);
        logAcciones.setRows(5);
        logAcciones.setWrapStyleWord(true);
        logAcciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        scrollLogAcciones.setViewportView(logAcciones);

        add(scrollLogAcciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 107, 790, 250));

        labelLogAcciones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelLogAcciones.setForeground(new java.awt.Color(0, 0, 0));
        labelLogAcciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLogAcciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/action.png"))); // NOI18N
        labelLogAcciones.setText(" Registro de Acciones");
        labelLogAcciones.setToolTipText("");
        labelLogAcciones.setAlignmentX(0.5F);
        add(labelLogAcciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 71, -1, -1));

        scrollListaRivales.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 4), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        scrollListaRivales.setMinimumSize(new java.awt.Dimension(350, 500));

        listaRivales.setEditable(false);
        listaRivales.setBackground(new java.awt.Color(166, 166, 166));
        listaRivales.setColumns(20);
        listaRivales.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        listaRivales.setRows(5);
        listaRivales.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        scrollListaRivales.setViewportView(listaRivales);

        add(scrollListaRivales, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 107, 350, 500));

        labelListaEquipos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelListaEquipos.setForeground(new java.awt.Color(0, 0, 0));
        labelListaEquipos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelListaEquipos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/equipos.png"))); // NOI18N
        labelListaEquipos.setText("Rivales");
        labelListaEquipos.setToolTipText("");
        labelListaEquipos.setAlignmentX(0.5F);
        add(labelListaEquipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1018, 71, -1, -1));

        labelNumRonda.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelNumRonda.setForeground(new java.awt.Color(255, 255, 255));
        labelNumRonda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNumRonda.setAlignmentX(0.5F);
        labelNumRonda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(labelNumRonda, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, -1, 47));

        panelTurnoEquipo.setBackground(new java.awt.Color(166, 166, 166));
        panelTurnoEquipo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        panelAtaque.setBackground(new java.awt.Color(166, 166, 166));
        panelAtaque.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, null, null));

        labelObjetivos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelObjetivos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelObjetivos.setText("Objetivo");

        listaObjetivosAtaque.setFocusable(false);

        labelMagnitudAtk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelMagnitudAtk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMagnitudAtk.setText("Magnitud");

        inputValorAtaque.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        inputValorAtaque.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout panelAtaqueLayout = new javax.swing.GroupLayout(panelAtaque);
        panelAtaque.setLayout(panelAtaqueLayout);
        panelAtaqueLayout.setHorizontalGroup(
            panelAtaqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAtaqueLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAtaqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listaObjetivosAtaque, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputValorAtaque)
                    .addGroup(panelAtaqueLayout.createSequentialGroup()
                        .addGroup(panelAtaqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelObjetivos)
                            .addComponent(labelMagnitudAtk))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelAtaqueLayout.setVerticalGroup(
            panelAtaqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAtaqueLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelObjetivos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listaObjetivosAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelMagnitudAtk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputValorAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        labelPanelAtaque.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelPanelAtaque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPanelAtaque.setText("Ataque");

        botonCrearAtaque.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonCrearAtaque.setText("Atacar");
        botonCrearAtaque.setActionCommand("boton (con lista)");
        botonCrearAtaque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCrearAtaque.setFocusable(false);
        botonCrearAtaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearAtaqueActionPerformed(evt);
            }
        });

        botonDefender.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonDefender.setText("Todo a Defensa");
        botonDefender.setActionCommand("boton (con lista)");
        botonDefender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonDefender.setFocusable(false);
        botonDefender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDefenderActionPerformed(evt);
            }
        });

        panelMovimTurno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        listaMovimientosTurno.setEditable(false);
        listaMovimientosTurno.setBackground(new java.awt.Color(63, 66, 68));
        listaMovimientosTurno.setColumns(20);
        listaMovimientosTurno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        listaMovimientosTurno.setForeground(new java.awt.Color(255, 255, 255));
        listaMovimientosTurno.setLineWrap(true);
        listaMovimientosTurno.setRows(5);
        listaMovimientosTurno.setWrapStyleWord(true);
        listaMovimientosTurno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        panelMovimTurno.setViewportView(listaMovimientosTurno);

        labelMovimTurno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelMovimTurno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMovimTurno.setText("Movimientos");

        botonElimMovim.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonElimMovim.setText("Elim. Movimientos");
        botonElimMovim.setActionCommand("boton (con lista)");
        botonElimMovim.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonElimMovim.setFocusable(false);
        botonElimMovim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonElimMovimActionPerformed(evt);
            }
        });

        labelEquipoActual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        barraVidas.setForeground(new java.awt.Color(51, 204, 0));
        barraVidas.setValue(100);

        labelVidas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelVidas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelVidas.setText("Vidas");

        labelNumVidas.setForeground(new java.awt.Color(102, 146, 61));
        labelNumVidas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNumVidas.setText("200");

        barraMisiles.setValue(100);

        labelMisiles.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelMisiles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMisiles.setText("Misiles");

        labelNumMisiles.setForeground(new java.awt.Color(74, 136, 199));
        labelNumMisiles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNumMisiles.setText("200");

        javax.swing.GroupLayout panelTurnoEquipoLayout = new javax.swing.GroupLayout(panelTurnoEquipo);
        panelTurnoEquipo.setLayout(panelTurnoEquipoLayout);
        panelTurnoEquipoLayout.setHorizontalGroup(
            panelTurnoEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTurnoEquipoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTurnoEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTurnoEquipoLayout.createSequentialGroup()
                        .addGroup(panelTurnoEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTurnoEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(barraVidas, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                .addComponent(barraMisiles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelTurnoEquipoLayout.createSequentialGroup()
                                .addComponent(labelVidas)
                                .addGap(79, 79, 79)
                                .addComponent(labelNumVidas))
                            .addGroup(panelTurnoEquipoLayout.createSequentialGroup()
                                .addComponent(labelMisiles)
                                .addGap(80, 80, 80)
                                .addComponent(labelNumMisiles)))
                        .addGap(35, 35, 35)
                        .addGroup(panelTurnoEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTurnoEquipoLayout.createSequentialGroup()
                                .addComponent(botonDefender)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonCrearAtaque, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                            .addComponent(panelAtaque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addGroup(panelTurnoEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelMovimTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(botonElimMovim, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addGap(25, 25, 25))
                    .addGroup(panelTurnoEquipoLayout.createSequentialGroup()
                        .addGroup(panelTurnoEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTurnoEquipoLayout.createSequentialGroup()
                                .addComponent(labelEquipoActual)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTurnoEquipoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(labelPanelAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(118, 118, 118)))
                        .addComponent(labelMovimTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
        );
        panelTurnoEquipoLayout.setVerticalGroup(
            panelTurnoEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTurnoEquipoLayout.createSequentialGroup()
                .addGroup(panelTurnoEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelTurnoEquipoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelEquipoActual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelTurnoEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelMisiles)
                            .addComponent(labelNumMisiles))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(barraMisiles, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelTurnoEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelVidas)
                            .addComponent(labelNumVidas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(barraVidas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTurnoEquipoLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(labelMovimTurno)
                        .addGap(170, 170, 170)
                        .addComponent(botonElimMovim, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                    .addGroup(panelTurnoEquipoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelPanelAtaque)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelTurnoEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelTurnoEquipoLayout.createSequentialGroup()
                                .addComponent(panelMovimTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48))
                            .addGroup(panelTurnoEquipoLayout.createSequentialGroup()
                                .addComponent(panelAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelTurnoEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(botonCrearAtaque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botonDefender, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );

        add(panelTurnoEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 432, -1, -1));

        botonFinalizTurno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonFinalizTurno.setText("Finalizar Turno");
        botonFinalizTurno.setActionCommand("boton (con lista)");
        botonFinalizTurno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonFinalizTurno.setFocusable(false);
        botonFinalizTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFinalizTurnoActionPerformed(evt);
            }
        });
        add(botonFinalizTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 625, 350, 75));

        botonVolver.setBackground(new java.awt.Color(51, 51, 51));
        botonVolver.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/X button.png"))); // NOI18N
        botonVolver.setToolTipText("Salir al menú principal");
        botonVolver.setActionCommand("boton (con lista)");
        botonVolver.setBorder(null);
        botonVolver.setBorderPainted(false);
        botonVolver.setContentAreaFilled(false);
        botonVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVolver.setFocusable(false);
        botonVolver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonVolver.setMaximumSize(new java.awt.Dimension(80, 31));
        botonVolver.setMinimumSize(new java.awt.Dimension(80, 31));
        botonVolver.setPreferredSize(new java.awt.Dimension(80, 31));
        botonVolver.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/X button peque.png"))); // NOI18N
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });
        add(botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 19, 40, 40));

        GuardarPartida.setText("Guardar Partida");
        GuardarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarPartidaActionPerformed(evt);
            }
        });
        add(GuardarPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/proba.gif"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 770));
    }// </editor-fold>//GEN-END:initComponents

    private void botonCrearAtaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearAtaqueActionPerformed
        String ataque;
        boolean numIntroducido = true;
        boolean error = false;
        boolean ataqueNuevo = true;
        indexObjetivo = listaObjetivosAtaque.getSelectedIndex();

        if (indexObjetivo == indexEquipo) {
            JOptionPane.showMessageDialog(this, "¡No puedes atacarte a ti mismo!");
        } else {
            try {
                magnitudAtaque = Integer.parseInt(inputValorAtaque.getText()); // Solo aceptaremos numeros.
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Debes introducir un numero para atacar.");
                numIntroducido = false;
                error = true;
            }
            if (numIntroducido && magnitudAtaque < 1) {
                JOptionPane.showMessageDialog(this, "No puedes atacar con 0 misiles o menos.");
                error = true;
            }
            if (equiposPartida.get(indexEquipo).getMisilesRonda() < magnitudAtaque) {
                JOptionPane.showMessageDialog(this, "No tienes suficientes misiles para hacer ese ataque.");
                error = true;
            }
            if (!error) {
                for (x = 0; x < equiposPartida.get(indexEquipo).objetivos.size(); x++) { // Recorremos el arraylist objetivos del equipo atacante.
                    if (indexObjetivo == equiposPartida.get(indexEquipo).getObjetivoPosicion(x)) {
                        ataqueNuevo = false;

                        tipoObjetivo = equiposPartida.get(indexObjetivo).getTipoPlaneta();
                        equiposPartida.get(indexEquipo).usarMisiles(magnitudAtaque);
                        if (equiposPartida.get(indexEquipo).getTipoPlaneta() == 7) { // Si el atacante es de tipo Oscuro comprobamos si se activa su pasiva.
                            pasivaOscuro();
                        }
                        equiposPartida.get(indexEquipo).ventajasColores(tipoObjetivo, magnitudAtaque);
                        barraMisiles.setValue(equiposPartida.get(indexEquipo).getMisilesRonda());
                        labelNumMisiles.setText("" + equiposPartida.get(indexEquipo).getMisilesRonda() + "/" + equiposPartida.get(indexEquipo).getMisilesBase());
                        ataque = "Ataque a " + equiposPartida.get(indexObjetivo).getNombreEquipo() + " con " + magnitudAtaque + " misiles.";
                        insertarMovimiento(ataque);
                        equiposPartida.get(indexEquipo).sumarAtaque(magnitudAtaque, x); // Sumamos la magnitud al primer ataque hecho hacia ese objetivo.

                        x = equiposPartida.get(indexEquipo).objetivos.size();
                    }
                }
                if (ataqueNuevo) { // Si se trata de un nuevo objetivo.
                    equiposPartida.get(indexEquipo).introducirObjetivo(indexObjetivo);
                    tipoObjetivo = equiposPartida.get(indexObjetivo).getTipoPlaneta();
                    equiposPartida.get(indexEquipo).usarMisiles(magnitudAtaque);
                    if (equiposPartida.get(indexEquipo).getTipoPlaneta() == 7) { // Si el atacante es de tipo Oscuro comprobamos si se activa su pasiva.
                        pasivaOscuro();
                    }
                    equiposPartida.get(indexEquipo).ventajasColores(tipoObjetivo, magnitudAtaque);
                    equiposPartida.get(indexEquipo).introducirAtaque(magnitudAtaque);
                    barraMisiles.setValue(equiposPartida.get(indexEquipo).getMisilesRonda());
                    labelNumMisiles.setText("" + equiposPartida.get(indexEquipo).getMisilesRonda() + "/" + equiposPartida.get(indexEquipo).getMisilesBase());
                    ataque = "Atacar a " + equiposPartida.get(indexObjetivo).getNombreEquipo() + " con " + magnitudAtaque + " misiles.";
                    insertarMovimiento(ataque);
                }
            }
        }
        inputValorAtaque.setText("");
    }//GEN-LAST:event_botonCrearAtaqueActionPerformed

    private void botonDefenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDefenderActionPerformed
        String cantidadDefensa;
        if (equiposPartida.get(indexEquipo).getTipoPlaneta() != 6) {
            if (equiposPartida.get(indexEquipo).getMisilesRonda() != 0) {
                equiposPartida.get(indexEquipo).defender(equiposPartida.get(indexEquipo).getMisilesRonda());
                cantidadDefensa = "Defender con " + (equiposPartida.get(indexEquipo).getMisilesRonda() / 2) + " (" + equiposPartida.get(indexEquipo).getMisilesRonda() + " misiles)";
                insertarMovimiento(cantidadDefensa);
                equiposPartida.get(indexEquipo).usarMisiles(equiposPartida.get(indexEquipo).getMisilesRonda());
                barraMisiles.setValue(equiposPartida.get(indexEquipo).getMisilesRonda());
                labelNumMisiles.setText("" + equiposPartida.get(indexEquipo).getMisilesRonda() + "/" + equiposPartida.get(indexEquipo).getMisilesBase());
            } else {
                JOptionPane.showMessageDialog(this, "¡No te quedan misiles!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "AAAAAAAAAARGH! *Inserte musica de DOOM* (¡Un berserk no puede defenderse!)");
        }
    }//GEN-LAST:event_botonDefenderActionPerformed

    private void botonElimMovimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonElimMovimActionPerformed
        // TODO add your handling code here:
        eliminarMovimientos();
    }//GEN-LAST:event_botonElimMovimActionPerformed

    private void botonFinalizTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFinalizTurnoActionPerformed
        // TODO add your handling code here:

        if (equiposPartida.get(indexEquipo).getMisilesRonda() != 0) { // Si no ha gastado los misiles no finaliza el turno.
            JOptionPane.showMessageDialog(this, "Debes gastar todos los misiles antes de terminar el turno.");
        } else { // Si ha gastado los misiles finaliza el turno.
            listaMovimientosTurno.setText("");
            if (numTurno == numeroEquipos) { //Si este era el ultimo turno de la ronda.
                efectosRonda();
                resetFinalRonda();
                if (equiposPartida.size() > 1) { // Si queda más de un equipo
                    siguienteRonda();
                    siguienteTurno();
                } else { // Queda uno o menos equipos (la partida termina).
                    if (equiposPartida.size() == 1) { // Si queda un equipo (hay un ganador).
                        mostrarGanador();
                    } else { // Si no queda ningún equipo (empate).
                        empate();
                    }
                    finalizarPartida();
                }
            } else {
                siguienteTurno();
            }
        }
    }//GEN-LAST:event_botonFinalizTurnoActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        // TODO add your handling code here:
        FrameGeneral marco = (FrameGeneral) SwingUtilities.getWindowAncestor(this);
        marco.remove(this);
        marco.add(new MenuPrincipal());
        marco.setVisible(true);
    }//GEN-LAST:event_botonVolverActionPerformed

    private void GuardarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarPartidaActionPerformed
        // TODO add your handling code here:

        int vidas;
        String nombreEquipo;
        int tipoPlaneta;

        Connection cn = null;
        Statement stm = null;
        
        
   String[] buttons = { "Si", "No"  };

     resultado = JOptionPane.showOptionDialog(null, "Quiere usted guardar caballero ?", "Confirmation",
        JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[0]);


    
        if (resultado == 0){
                
            try {
                
                elminarDatosJugadores();
                
                connection conexion = new connection();

                cn = (Connection) conexion.Conectar();
                stm = (Statement) cn.createStatement();

                for (x = 0; x < equiposPartida.size(); x++) {

                    vidas = equiposPartida.get(x).getVidas();
                    nombreEquipo = equiposPartida.get(x).getNombreEquipo();
                    tipoPlaneta = equiposPartida.get(x).getTipoPlaneta();
                    misilesBase = equiposPartida.get(x).getMisilesBase();

                    System.out.println(equiposPartida.get(x).getNumEquipos());

                    String query1 = "INSERT INTO jugadores " + "VALUES ('" + nombreEquipo + "','" + x + "','" + tipoPlaneta + "','" + vidas + "', '"+misilesBase+"')";
                    stm.executeUpdate(query1);

                }
              
                insertPartida();

            } catch (SQLException e) {

            }
        }
       
        
        
        
    }//GEN-LAST:event_GuardarPartidaActionPerformed

    public void elminarDatosJugadores(){
        
        Connection cn2 = null;
        Statement stm2 = null;

        try {
            connection conexion = new connection();

            cn2 = (Connection) conexion.Conectar();
            stm2 = (Statement) cn2.createStatement();

            String query2 = "TRUNCATE TABLE jugadores";
            stm2.executeUpdate(query2);
            
            eliminarDatosPartida();

        } catch (SQLException e) {

        }
        
        
    }
    
    public void eliminarDatosPartida(){
        
                Connection cn2 = null;
        Statement stm2 = null;

        try {
            connection conexion = new connection();

            cn2 = (Connection) conexion.Conectar();
            stm2 = (Statement) cn2.createStatement();

            String query2 = "TRUNCATE TABLE partida";
            stm2.executeUpdate(query2);
            
            

        } catch (SQLException e) {

        }
        
        
    }

    public void insertPartida() {

        Connection cn2 = null;
        Statement stm2 = null;

        try {
            connection conexion = new connection();

            cn2 = (Connection) conexion.Conectar();
            stm2 = (Statement) cn2.createStatement();

            String query2 = "INSERT INTO partida " + "VALUES ('"+numRonda+"','"+equiposMuertos+"','"+numeroEquipos+"')";
            stm2.executeUpdate(query2);
            
            
            
            

    
    

        } catch (SQLException e) {

        }

    }

    // CURSO DE LA PARTIDA
    public void siguienteRonda() {

        numRonda++;
        labelNumRonda.setText("Ronda " + numRonda);

    
        activarPasivaNecro();
        for (x = 0; x < equiposPartida.size(); x++) {
            if (equiposPartida.get(x).getTipoPlaneta() == 4) {
                equiposPartida.get(x).pasivaGaseoso();
                insertarTextoLog(equiposPartida.get(x).getNombreMasTipo() + " crece...");
            }
        }
        numTurno = 0;
        indexEquipo = 0;
        insertarTextoLog("\n<Fase de preparación -- Ronda " + numRonda + ">");
    }

    public void siguienteTurno() {

        System.out.println(numTurno + " numero turno");
   
        if(cargado){
            numTurno = 0;
            cargado = false;
        }
        
        
        
        if (numTurno < numeroEquipos) {
            numTurno++;
        }
        if (numTurno > 1) {
            indexEquipo++;
        }

        cambiarInfoTurnoActual();
    }

    //APLICAR EFECTOS DE ACCIONES
    public void efectosRonda() {
        insertarTextoLog("\n<-- EMPIEZA LA BATALLA -->");
        for (x = 0; x < equiposPartida.size(); x++) { // Este bucle recorre cada equipo y printa si se ha defendido + si le han atacado.
            insertarTextoLog(""); // Literalmente un br.
            if (equiposPartida.get(x).getMisilesDefensa() != 0) {
                insertarTextoLog(equiposPartida.get(x).getNombreEquipo() + " se defiende con "
                        + equiposPartida.get(x).getMisilesDefensa() + " puntos.");
            } else {
                if (equiposPartida.get(x).getTipoPlaneta() == 6) {
                    insertarTextoLog("¡" + equiposPartida.get(x).getNombreEquipo() + " es un valiente guerrero! Pero es un poco tonto y no sabe defenderse.");
                } else {
                    insertarTextoLog(equiposPartida.get(x).getNombreEquipo() + " no se ha defendido.");
                }
            }
            hacerAtaques();
        }
        eliminarEquipos();
    }

    public void hacerAtaques() {
        // y = Equipo atacante
        // z =  Posicion de los arrays

        boolean noAtaque = true;
        int totalAtk = 0, defensa = equiposPartida.get(x).getMisilesDefensa();

        for (y = 0; y < equiposPartida.size(); y++) { // Recorre los posibles atacantes del equipo con posicion x.
            for (z = 0; z < equiposPartida.get(y).objetivos.size(); z++) { // Recorre el array objetivos del posible atacante.
                if (equiposPartida.get(y).objetivos.get(z) == x) { // Comprobamos si el equipo atacante esta atacando al equipo con posicion x.
                    insertarTextoLog("El equipo " + equiposPartida.get(y).getNombreMasTipo() + " le ha atacado con "
                            + equiposPartida.get(y).cantidadAtk.get(z) + " misiles.");
                    if (equiposPartida.get(x).getTipoPlaneta() == 5 && equiposPartida.get(x).planetaEnano() == 1) {
                        insertarTextoLog(equiposPartida.get(x).getNombreEquipo() + " es jodido matrix (¡Esquiva el ataque!)\n");
                    } else {
                        equiposPartida.get(x).calcularDmg(equiposPartida.get(y).cantidadAtk.get(z)); // Comprueba la cantidad del ataque y lo hace.
                        totalAtk = totalAtk + equiposPartida.get(y).cantidadAtk.get(z);
                    }
                    noAtaque = false;
                }
            }
        }
        if (noAtaque) {
            insertarTextoLog("Nadie le ha atacado...");
        } else { // Si ese equipo ha sido atacado.
            if (defensa == 0) {
                insertarTextoLog(equiposPartida.get(x).getNombreEquipo() + " recibe " + totalAtk + " puntos de daño.");
            } else if (defensa >= totalAtk) {
                insertarTextoLog(equiposPartida.get(x).getNombreEquipo() + " bloquea todos los misiles.");
            } else if (defensa < totalAtk) {
                totalAtk = totalAtk - defensa;
                insertarTextoLog(equiposPartida.get(x).getNombreEquipo() + " bloquea " + defensa + " misiles y recibe " + totalAtk + " puntos de daño.");
            }
            if (equiposPartida.get(x).getVidas() == 0) { // Si los ataques han acabado con ese equipo.
                insertarTextoLog("¡" + equiposPartida.get(x).getNombreEquipo() + " ha sido abatido!");
            }
        }
        insertarTextoLog(""); // Otro br.
    }

    public void eliminarEquipos() {
        int pElimin; // Guarda la posicion del equipo a eliminar desde el array equiposElimin.

        ArrayList<Integer> equiposElimin = new ArrayList<Integer>(); // Guarda la posición de los equipos eliminados.

        for (x = equiposPartida.size() - 1; x >= 0; x--) {

            if (!equiposPartida.get(x).isVivo()) {
                equiposElimin.add(x); // Guarda la posicion del equipo a eliminar en el array equiposElimin.
                insertarTextoLog("< El equipo " + equiposPartida.get(x).getNombreEquipo() + " ha sido eliminado >");
            }
        }

        for (y = 0; y < equiposElimin.size(); y++) {
            pElimin = equiposElimin.get(y);
            equiposPartida.remove(pElimin);
            equiposMuertos++;
        }
        insertarTextoLog("");
    }

    // MENSAJES FINAL PARTIDA
    public void mostrarGanador() {
        JOptionPane.showMessageDialog(this, "Sólo queda un equipo con vida...");
        JOptionPane.showMessageDialog(this, "El máximo campeón mundial súper guay de esta partida es... ¡"
                + equiposPartida.get(0).getNombreEquipo() + "! Estava cantado.");
        insertarTextoLog("\n ¡" + equiposPartida.get(0).getNombreEquipo() + " es el vencedor de ColdWar!");
    }

    public void empate() {
        JOptionPane.showMessageDialog(this, "Todos los equipos han sido eliminados, menudo bochorno....");
        insertarTextoLog("\n¡Todos los equipos han sido derrotados! Di no a la guerra.");
    }

    public void finalizarPartida() {
        JOptionPane.showMessageDialog(this, "Partida terminada. \n\nHaz click sobre la X en la parte superior derecha para volver al menú principal.");
        insertarTextoLog("Fin de la partida.");
        equiposPartida.clear();
        listaObjetivosAtaque.removeAllItems();
        listaRivales.setText("");
        //Vaciar lista equipos

        botonDefender.setEnabled(false);
        botonCrearAtaque.setEnabled(false);
        listaObjetivosAtaque.setEnabled(false);
        inputValorAtaque.setEnabled(false);
        botonElimMovim.setEnabled(false);
        botonFinalizTurno.setEnabled(false);
    }

    // FEEDBACK VISUAL
    public void cambiarInfoTurnoActual() {
        int equipoActual = indexEquipo;
        inputValorAtaque.setText("");
        listaObjetivosAtaque.removeAllItems();

        labelEquipoActual.setText("Turno de " + equiposPartida.get(equipoActual).getNombreEquipo());
        if (numTurno == numeroEquipos) {
            botonFinalizTurno.setText("Finalizar Ronda");
        } else {
            botonFinalizTurno.setText("Finalizar Turno");
        }

        //Info Misiles
        labelNumMisiles.setText("" + equiposPartida.get(indexEquipo).getMisilesRonda() + "/" + equiposPartida.get(indexEquipo).getMisilesBase());
        barraMisiles.setMaximum(equiposPartida.get(indexEquipo).getMisilesBase());
        barraMisiles.setValue(equiposPartida.get(indexEquipo).getMisilesRonda());

        //Info Vidas
        labelNumVidas.setText("" + equiposPartida.get(indexEquipo).getVidas() + "/" + equiposPartida.get(indexEquipo).getVidasBase());
        barraVidas.setMaximum(equiposPartida.get(indexEquipo).getVidasBase());
        barraVidas.setValue(equiposPartida.get(indexEquipo).getVidas());

        rellenarListaObjetivos(equipoActual);
    }

    public void rellenarListaObjetivos(int equipoActual) {
        float calculoOscuridad;
        listaRivales.setText("");

        for (x = 0; x < equiposPartida.size(); x++) {
            oscuroActivo = false;
            if (x == equipoActual) { // Si el objetivo es tu equipo.
                listaObjetivosAtaque.addItem(equiposPartida.get(x).getNombreEquipo() + " (Tu equipo)");
            } else { // Si el objetivo no es tu equipo.
                if (equiposPartida.get(equipoActual).getTipoPlaneta() == 7) { // Si el equipo atacante es de tipo Oscuro.
                    calculoOscuridad = (float) equiposPartida.get(x).getVidas() / (float) equiposPartida.get(x).getVidasBase();
                    if (calculoOscuridad * 100 <= 20) {
                        oscuroActivo = true;
                    }
                    if (oscuroActivo && equiposPartida.get(x).getTipoPlaneta() == 5) { // Si se activa la pasiva oscuro y el objetivo es de tipo enano.
                        listaObjetivosAtaque.addItem(equiposPartida.get(x).getNombreEquipo() + " (Daño x2, 50% de fallar)");
                    } else if (oscuroActivo) { // Si solo se activa la pasiva oscuro.
                        listaObjetivosAtaque.addItem(equiposPartida.get(x).getNombreEquipo() + " (Poca vida, Daño x2)");
                    } else if (equiposPartida.get(x).getTipoPlaneta() == 5) { // Si no se activa la pasiva oscuro y el objetivo es enano.
                        listaObjetivosAtaque.addItem(equiposPartida.get(x).getNombreEquipo() + " (Enano, 50% de fallar)");
                    } else { // Si no se activa la pasiva y el objetivo no es enano.
                        listaObjetivosAtaque.addItem(equiposPartida.get(x).getNombreEquipo());
                    }
                } else if (equiposPartida.get(x).getTipoPlaneta() == 1
                        || equiposPartida.get(x).getTipoPlaneta() == 2
                        || equiposPartida.get(x).getTipoPlaneta() == 3) { // Si el tipo del objetivo es algun color.
                    listaObjetivosColores(equipoActual);
                } else if (equiposPartida.get(x).getTipoPlaneta() == 5) { //Si el objetivo es de tipo Enano.
                    listaObjetivosAtaque.addItem(equiposPartida.get(x).getNombreEquipo() + " (Enano, 50% de fallar)");
                } else { // Objetivo sin anotaciones.
                    listaObjetivosAtaque.addItem(equiposPartida.get(x).getNombreEquipo());
                }
            }
            if (x != equipoActual) { // Se genera la lista con la info de los equipos sin añadir tu propio equipo.
                listaRivales.append("\n  |" + equiposPartida.get(x).getNombreMasTipo() + "\n  |Vidas: " + equiposPartida.get(x).getVidas() + "\n\n");
            }
        }
    }

    public void eliminarMovimientos() {
        equiposPartida.get(indexEquipo).resetArrays();
        equiposPartida.get(indexEquipo).resetDefensa();
        equiposPartida.get(indexEquipo).setMisilesRonda(equiposPartida.get(indexEquipo).getMisilesBase());
        labelNumMisiles.setText("" + equiposPartida.get(indexEquipo).getMisilesRonda() + "/" + equiposPartida.get(indexEquipo).getMisilesBase());
        barraMisiles.setValue(equiposPartida.get(indexEquipo).getMisilesRonda());
        listaMovimientosTurno.setText("");
    }

    public void resetFinalRonda() {
        for (x = 0; x < equiposPartida.size(); x++) {
            equiposPartida.get(x).resetArrays();
            equiposPartida.get(x).resetDefensa();
            equiposPartida.get(x).resetMisiles();
        }
        numeroEquipos = equiposPartida.size(); // Actualizamos el numero de equipos que quedan en partida.
    }

    public void listaObjetivosColores(int equipoActual) {
        if (equiposPartida.get(equipoActual).getTipoPlaneta() == 1) { // Condiciones equipo rojo
            if (equiposPartida.get(x).getTipoPlaneta() == 3) { // Equipo verde, atk*2
                listaObjetivosAtaque.addItem(equiposPartida.get(x).getNombreEquipo() + " (Verde, Daño x2)");
            } else if (equiposPartida.get(x).getTipoPlaneta() == 2) { // Equipo azul, atk/2
                listaObjetivosAtaque.addItem(equiposPartida.get(x).getNombreEquipo() + " (Azul, Daño /2)");
            }
        } else if (equiposPartida.get(equipoActual).getTipoPlaneta() == 2) { // Condiciones equipo azul
            if (equiposPartida.get(x).getTipoPlaneta() == 1) { // Equipo rojo, atk*2
                listaObjetivosAtaque.addItem(equiposPartida.get(x).getNombreEquipo() + " (Rojo, Daño x2)");
            } else if (equiposPartida.get(x).getTipoPlaneta() == 3) { // Equipo verde, atk/2
                listaObjetivosAtaque.addItem(equiposPartida.get(x).getNombreEquipo() + " (Verde, Daño /2)");
            }
        } else if (equiposPartida.get(equipoActual).getTipoPlaneta() == 3) { // Condiciones equipo verde
            if (equiposPartida.get(x).getTipoPlaneta() == 2) { // Equipo azul, atk*2
                listaObjetivosAtaque.addItem(equiposPartida.get(x).getNombreEquipo() + " (Azul, Daño x2)");
            } else if (equiposPartida.get(x).getTipoPlaneta() == 1) { // Equipo rojo, atk/2
                listaObjetivosAtaque.addItem(equiposPartida.get(x).getNombreEquipo() + " (Rojo, Daño /2)");
            }
        } else {
            listaObjetivosAtaque.addItem(equiposPartida.get(x).getNombreEquipo());
        }
    }

    public void insertarTextoLog(String texto) {
        logAcciones.append("\n " + texto);
    }

    public void insertarMovimiento(String texto) {
        listaMovimientosTurno.append(texto + "\n");
    }

    // PASIVAS
    public void activarPasivaVegeta() {
        boolean insertarNumEquipos = false;

        for (x = 0; x < equiposPartida.size(); x++) { // Comprobamos si debemos activar la pasiva Planeta Vegeta
            equiposPartida.get(x).pasivaVegeta(numeroEquipos, equiposPartida.get(x).getTipoPlaneta());
            if (equiposPartida.get(x).getTipoPlaneta() == 8) {
                if (!insertarNumEquipos) {
                    insertarTextoLog("Hay " + numeroEquipos + " equipos. ¡Vegeta aumenta su poder ante la adversidad!");
                    insertarNumEquipos = true;
                }
                if (insertarNumEquipos) {
                    insertarTextoLog(equiposPartida.get(x).getNombreEquipo() + " recibe " + (100 * (numeroEquipos - 1)) + " de vida y " + (10 * (numeroEquipos - 1)) + " misiles.");
                }
            }
        }
        insertarTextoLog(""); // Un br bonico
    }

    public void activarPasivaNecro() {
        int atkNecro = 0, hpNecro = 0;

        for (x = 0; equiposPartida.size() > x; x++) { // Comprobamos si debemos activar la pasiva de los planetas nigromantes.
            if (equiposPartida.get(x).getTipoPlaneta() == 9) {
                if (equiposMuertos > 0) {
                    for (y = 0; y < equiposMuertos; y++) {
                        atkNecro = atkNecro + 20;
                        hpNecro = hpNecro + 40;
                    }
                    equiposPartida.get(x).pasivaNigromante(equiposMuertos);
                    insertarTextoLog("El equipo " + equiposPartida.get(x).getNombreMasTipo() + " recibe " + atkNecro
                            + " misiles y se cura " + hpNecro + " de vida por cada equipo muerto.");
                    equiposPartida.get(x).resetMisiles();
                    equiposMuertos = 0;
                }
            }
        }
    }

    public int pasivaOscuro() {
        float calculoOscuridad;
        oscuroActivo = false;

        calculoOscuridad = (float) equiposPartida.get(indexObjetivo).getVidas() / (float) equiposPartida.get(indexObjetivo).getVidasBase();
        if (calculoOscuridad * 100 <= 20) {
            magnitudAtaque = magnitudAtaque * 2;
            oscuroActivo = true;
        }
        return magnitudAtaque;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GuardarPartida;
    private javax.swing.JProgressBar barraMisiles;
    private javax.swing.JProgressBar barraVidas;
    private javax.swing.JButton botonCrearAtaque;
    private javax.swing.JButton botonDefender;
    private javax.swing.JButton botonElimMovim;
    private javax.swing.JButton botonFinalizTurno;
    private javax.swing.JButton botonVolver;
    private javax.swing.JTextField inputValorAtaque;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelEquipoActual;
    private javax.swing.JLabel labelListaEquipos;
    private javax.swing.JLabel labelLogAcciones;
    private javax.swing.JLabel labelMagnitudAtk;
    private javax.swing.JLabel labelMisiles;
    private javax.swing.JLabel labelMovimTurno;
    private javax.swing.JLabel labelNumMisiles;
    private javax.swing.JLabel labelNumRonda;
    private javax.swing.JLabel labelNumVidas;
    private javax.swing.JLabel labelObjetivos;
    private javax.swing.JLabel labelPanelAtaque;
    private javax.swing.JLabel labelVidas;
    private javax.swing.JTextArea listaMovimientosTurno;
    private javax.swing.JComboBox<String> listaObjetivosAtaque;
    private javax.swing.JTextArea listaRivales;
    private javax.swing.JTextArea logAcciones;
    private javax.swing.JPanel panelAtaque;
    private javax.swing.JScrollPane panelMovimTurno;
    private javax.swing.JPanel panelTurnoEquipo;
    private javax.swing.JScrollPane scrollListaRivales;
    private javax.swing.JScrollPane scrollLogAcciones;
    // End of variables declaration//GEN-END:variables

}
