package com.app.equipo6.MasterMain.Problema;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;

public class Problema {
	
	public Problema() {}
	
	public Color[] getProblema(int i) {
		ArrayList<Color> colores= new ArrayList<>();
		colores.add(Color.ORANGE);
		colores.add(Color.PINK);
		colores.add(Color.RED);
		colores.add(Color.green);
		colores.add(Color.BLUE);
		colores.add(Color.CYAN);
		if(i == 1) {
			colores.remove(Color.BLUE);
			colores.remove(Color.CYAN);
		}else if(i == 2) {
			colores.remove(Color.CYAN);
		}
		Collections.shuffle(colores);
		Color[] colors = new Color[i];
		int aux = 0;
		for (Color color : colores) {
			colors[aux] = color;
			aux++;
			if(aux == (i-1)) {break;}
		}
		return colors;
	}
	
}
