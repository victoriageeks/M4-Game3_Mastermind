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
			paneles[i].setVisible(false);
			add(paneles[i]);
		}
		if(juego.getIntento()>0) {
			paneles[1].setVisible(true);
		}
		if(juego.getIntento()>1) {
			paneles[2].setVisible(true);
		}
		if(juego.getIntento()>2) {
			paneles[3].setVisible(true);
		}
		if(juego.getIntento()>3) {
			paneles[4].setVisible(true);
		}
		if(juego.getIntento()>4) {
			paneles[5].setVisible(true);
		}
		if(juego.getIntento()>5) {
			paneles[6].setVisible(true);
		}
		if(juego.getIntento()>6) {
			paneles[7].setVisible(true);
		}
	

	}

}
