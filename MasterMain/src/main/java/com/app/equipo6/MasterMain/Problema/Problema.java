package com.app.equipo6.MasterMain.Problema;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;

public class Problema {
	private Color[] respuesta;
	private Color[] coloresDisponibles;
	
	public Problema(ArrayList<Color> colores,int i) {
		Color[] colors = getColoresDisponibles(colores,i);
		for (int j = 0; j < colors.length; j++) {
			int random = (int) (Math.random() * (colors.length-1));
			colors[j] = colors[random]; 
			System.out.println(random);
			
		}
		this.respuesta = colors;
	}
	
	public Color[] getRespuesta() {
		return respuesta;
	}

	public Color[] getColoresDisponibles() {
		return coloresDisponibles;
	}

	
	private Color[] getColoresDisponibles(ArrayList<Color> colores,int i) {
		Collections.shuffle(colores);
		//borramos los colores sobrantes segun el nivel
			for (int j = nivel(i); j < colores.size(); j++) {
				colores.remove(j);
				}
			int aux = (colores.size()-1);
				colores.remove(aux);
		Color[] colors = new Color[colores.size()];
		aux = 0;
		for (Color color : colores) {
			colors[aux] = color;
			aux++;
		}
		for (int j = 0; j < colors.length; j++) {
			System.out.println("c1:" + colors[j].getRed() 
			+ colors[j].getGreen() 
			+ colors[j].getGreen());
		}
		this.coloresDisponibles = colors;
		return colors;
	}
	
	//segun el nivel seleciona una cantidad minima de colores
	private int nivel(int i) {
		switch (i) {
		case 1: return 0;
		case 2: return 2;
		case 3: return 4;
		default: return 4;
		}
	}
	
}
