package com.app.equipo6.MasterMain.testControl;

import java.awt.Color;

import com.app.equipo6.MasterMain.Control.Control;

public class testControl {

	
	
	public static void main(String[] args) {
		Color[] c1 = new Color[5];
		c1[0] = new Color(255,51,51);
		c1[1] = new Color(0,0,150);
		c1[2] = new Color(0,0,255);
		c1[3] = new Color(255,0,0);
		c1[4] = new Color(0,0,150);
		//Control control = new Control(c1);
		Color[] c2 = new Color[5];
		c2[0] = new Color(255,51,51);
		c2[1] = new Color(0,0,255);
		c2[2] = new Color(0,0,150);
		c2[3] = new Color(255,0,0);
		c2[4] = new Color(0,0,150);
		//Color[] c = control.respuesta(c2);
		
		//show(c);
	}
	
	public static void show(Color[] c) {
		for (Color color : c) {
			System.out.println("c1:" + color.getRed() + color.getGreen() + color.getGreen());
		}

		
	}
}
