package com.app.equipo6.MasterMain.Juego;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

import com.app.equipo6.MasterMain.Control.Control;
import com.app.equipo6.MasterMain.Control.ControlJPanel;

public class JuegoPanel extends JPanel {
	/**
	 * Create the panel.
	 * @param juego 
	 * @param control 
	 */
	public JuegoPanel() {
		
	}
	public JuegoPanel(Juego juego, Control control, ControlJPanel controlp) {
		
		setForeground(new Color(0, 0, 0));
		setBackground(new Color(255, 255, 255));
		setLayout(new GridLayout(8,1));
		Juega[] paneles =new Juega[juego.getMaxintent()];
		
		for(int i=0;i<juego.getMaxintent();i++) {
			paneles[i]=new Juega(juego,control,controlp);
			paneles[i].setVisible(true);
			add(paneles[i]);
		}
	}

}
