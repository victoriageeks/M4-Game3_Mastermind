package com.app.equipo6.MasterMain.testControl;

import java.awt.Color;

import com.app.equipo6.MasterMain.Control.Control;

public class testControl {

	
	
	public static void main(String[] args) {
		Control control = new Control();
		Color[] c1 = new Color[4];
		c1[0] = new Color(255,51,51);
		c1[1] = new Color(0,0,150);
		c1[2] = new Color(0,0,255);
		c1[3] = new Color(255,0,0);
		Color[] c2 = new Color[4];
		c2[0] = new Color(255,51,52);
		c2[1] = new Color(0,0,0);
		c2[2] = new Color(0,0,150);
		c2[3] = new Color(255,0,0);
		Color[] c = control.respuesta(c1, c2);
		
		show(c);
	}
	
	public static void show(Color[] c) {
		System.out.println("c1:" + c[0].getRed() + c[0].getGreen() + c[0].getGreen());
		System.out.println("c1:" + c[1].getRed() + c[1].getGreen() + c[1].getGreen());
		System.out.println("c1:" + c[2].getRed() + c[2].getGreen() + c[2].getGreen());
		System.out.println("c1:" + c[3].getRed() + c[3].getGreen() + c[3].getGreen());
		
	}
}
