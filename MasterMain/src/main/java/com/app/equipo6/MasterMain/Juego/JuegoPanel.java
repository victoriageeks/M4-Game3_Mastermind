package com.app.equipo6.MasterMain.Juego;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class JuegoPanel extends JPanel {
	/**
	 * Create the panel.
	 * @param juego 
	 */
	public JuegoPanel(Juego juego) {
		
		setForeground(new Color(0, 0, 0));
		setBackground(new Color(255, 255, 255));
		setLayout(new GridLayout(8,1));
		Juega[] paneles =new Juega[juego.getMaxintent()];
		paneles[0]=new Juega(juego);
		paneles[0].setVisible(true);
		add(paneles[0]);
		for(int i=1;i<juego.getMaxintent();i++) {
			paneles[i]=new Juega(juego);
			paneles[i].setVisible(true);
			add(paneles[i]);
		}
	}

}
