package com.app.equipo6.MasterMain.SelectColor;

import java.awt.Color;
import java.util.ArrayList;

public class ColoresDisponibles {
	private ArrayList<Color> disponibles;
	
	//12 colores disponibles;
	public ArrayList<Color> getAllcolors() {
		ArrayList<Color> colores =new ArrayList<>();
		colores.add(Color.BLACK);
		colores.add(new Color(204, 127, 198));
		colores.add(new Color(64, 128, 128));
		colores.add(new Color(128, 128, 0));
		colores.add(new Color(128, 0, 255));
		colores.add(new Color(255, 255, 128));
		colores.add(Color.PINK);
		colores.add(Color.ORANGE);
		colores.add(Color.CYAN);
		colores.add(Color.blue);
		colores.add(Color.GREEN);
		colores.add(Color.red);
		return colores;
		
	}
}
