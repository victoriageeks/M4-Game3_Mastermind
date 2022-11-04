package com.app.equipo6.MasterMain.Problema;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;

public class Problema {
	private Color[] respuesta;
	private Color[] coloresDisponibles = {null};
	private int[] orden;
	
	public Problema(ArrayList<Color> colores,int i) {
		//si es la primera vez que se juega se utilizan todos los colores;
		//si no es los que el usuario eligio;
		if(this.coloresDisponibles[0] == null) {
			this.coloresDisponibles = getColoresDisponibles(colores);
		}
		for (Color color : colores) {
		}
		Color[] colors = new Color[nivel(i)];
		this.orden = new int[this.coloresDisponibles.length];
		for (int j = 0; j < colors.length; j++) {
			colors[j] = this.coloresDisponibles[j];	
		}
		generarProblema(colors,i);

	}
	
	public Color[] getRespuesta() {
		return this.respuesta;
	}

	public Color[] getColoresDisponibles() {
		return this.coloresDisponibles;
	}
	
	public int[] getOrden() {
		return this.orden;
	}
	
	private Color[] getColoresDisponibles(ArrayList<Color> colores) {
		Collections.shuffle(colores);
		//borramos los colores sobrantes segun el nivel
		int aux=0;
		Color[] colors = new Color[6];
			for (Color color : colores) {
				colors[aux] = color;
				aux++;
				if(aux == 6) {break;}
			}
		return colors;
	}
	
	//genera el el problema (la respuesta)
	//y asigna el orden de los colores
	public void generarProblema(Color[] colors,int i) {
		for (int j = 0; j < nivel(i); j++) {
			int random = (int) (Math.random() * (nivel(i)));
			this.orden[j] = random;
			colors[j] = colors[random];
		}
		this.respuesta = colors;
	}
	//segun el nivel seleciona una cantidad minima de colores
	private int nivel(int i) {
		switch (i) {
		case 1: return 4;
		case 2: return 5;
		case 3: return 6;
		default: return 6;
		}
	}
	
}
