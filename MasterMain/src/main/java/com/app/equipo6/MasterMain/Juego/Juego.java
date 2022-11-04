package com.app.equipo6.MasterMain.Juego;

import java.awt.Color;
import java.awt.EventQueue;


public class Juego {
	private int intento;
	private int maxintent;
	private Color[] colordef;
	private Color[] colorresp;
	
	public Juego(int intent, int maxintentos, Color[] colordefault, Color[] colorrespuesta) {
		// TODO Auto-generated constructor stub
		this.setIntento(intent);
		this.setMaxintent(maxintentos);
		this.setColordef(colordefault);
		this.colorresp= new Color[colordefault.length];
		for(int i=0;i<colordefault.length;i++) {
			this.colorresp[i]=colordefault[0];
		}
	}
	public  Color cambiaColorMas(Color color, Color[] jdcolores) {
		int i=compruebacolor(color,jdcolores);
		if(i<(jdcolores.length)-1) i++;
		else i=0;
		return jdcolores[i];
	}


	public  Color cambiaColorMenos(Color color, Color[] jdcolores) {
		
		int i=compruebacolor(color,jdcolores);
		if(i!=0) i--;
		else i=(jdcolores.length)-1;
		return jdcolores[i];
	}
	

	private  int compruebacolor(Color color, Color[] jdcolores) {
		// TODO Auto-generated method stub
		int i=0;
		while( i<jdcolores.length) {
			if(color==jdcolores[i]) return i;
			i++;
		}
		return i;
	}
	public int getIntento() {
		return intento;
	}
	public void setIntento(int intento) {
		this.intento = intento;
	}
	public int getMaxintent() {
		return maxintent;
	}
	public void setMaxintent(int maxintent) {
		this.maxintent = maxintent;
	}
	public Color[] getColordef() {
		return colordef;
	}
	public Color getColordef(int pos) {
		return colordef[pos];
	}
	public void setColordef(Color[] colordef) {
		this.colordef = colordef;
	}
	public Color[] getColorresp() {
		return colorresp;
	}
	public void setColorresp(Color[] colorresp) {
		this.colorresp = colorresp;
	}
	public void setColorresp(int pos,Color color) {
		this.colorresp[pos]=color;
	}

	

}
