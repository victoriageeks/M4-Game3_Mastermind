package com.app.equipo6.MasterMain.Boton;

import java.awt.Color;

import javax.swing.JButton;

public class Boton {
	
	private JButton button;
	private Color color;
	
	public Boton(JButton button) {
		this.button = button;
	}

	//metodos
	public void setColor(Color color) {
		button.setForeground(color);
		this.color = color;
	}
	
	public void setPosition(int[] p) {
		button.setBounds(p[0], p[1], p[2],p[0] );
	}
	
	public Color getColor() {
		return this.color;
	}
	
}
