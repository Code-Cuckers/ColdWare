/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menucoldware;

import OpcionesMenu.MenuPrinicipal;
import OpcionesMenu.MenuPrinicipal;
import javax.swing.JFrame;

/**
 *
 * @author DAW2
 */
public class FrameGeneral extends JFrame {
    
    	FrameGeneral(){
		
		setSize(1280,768); 
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setLocationRelativeTo(null);
                setResizable(false);
                setTitle("ColdWar");
                

		add(new MenuPrinicipal());

		setVisible(true);
		
	}
    
}
