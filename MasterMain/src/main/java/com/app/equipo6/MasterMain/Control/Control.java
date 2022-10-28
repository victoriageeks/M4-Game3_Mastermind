package com.app.equipo6.MasterMain.Control;

import java.awt.Color;

public class Control {
	
	public Color[] respuesta(Color[] a,Color[] b) {
		int count = 0;
		Color[] respuesta = new Color[a.length];
		boolean[] auxb = new boolean[a.length];
		boolean[] auxa = new boolean[a.length];
		//if es true pintamos una casilla con negro si es false
		//marcamos las casillas como no resuelta
		for (int i = 0; i < a.length; i++) {
			if(control(a,b,i)) {
				respuesta[count]=new Color(0,0,0);
				count++;
				auxa[i] = true;
				auxb[i] = true;
			}else{
				auxa[i] = false;
				auxb[i] = false;
			}
		} 
		System.out.println(auxa[0] + "-" +auxa[1]+ "-" +auxa[2]+ "-" +auxa[3] );
		System.out.println(auxb[0] + "-" +auxb[1]+ "-" +auxb[2]+ "-" +auxb[3] );
		//si la casilla auxb es true resulta que a[i] y b[i] son iguales y ya esta pintado
		//si es false analizamos si hay un color restante que coincida
		
		for (int i = 0; i < a.length; i++) {
			if(auxb[i]) {
				continue;
			}else {
				//si la casilla estab vacia inica un segundo control
				//que controla si esta disponible el control
				for (int j = 0; j < a.length; j++) {
					//si este control ya obtuvo respuesta salta
					if(auxa[j]) {
						continue;
					}else {
						//si no se revisa si existe un color que coincida no importa la posicion
						if(control2(a,b,i,j)) {
							auxa[j] = true;
							respuesta[count] = new Color(255,255,255);
							count++;
							}
						}
					}
				}
			}
		for (int  i= 0; i < auxa.length; i++) {
			if(respuesta[i] == null) {
				respuesta[count]= new Color(160,160,160);
			}
				
		}
		return respuesta;
		}
		//si el color y posicion coinciden devuelve true
		public boolean control(Color[] a,Color b[],int i) {
			System.out.println("a:" + a[i].getRed()+ "-" + a[i].getGreen() +"-" + a[i].getBlue());
			System.out.println("b:" + b[i].getRed()+ "-" + b[i].getGreen() +"-" + b[i].getBlue());
			if(a[i].getRed() == b[i].getRed() && a[i].getGreen() == b[i].getGreen()&&
					a[i].getBlue() == b[i].getBlue()) {
				System.out.println("True");
				return true;
		}
			System.out.println("false");
			return false;
	}
		
		public boolean control2(Color[] a,Color b[],int i,int j) {
			if(a[j].getRed() == b[i].getRed() && a[j].getGreen() == b[i].getGreen()
					&& a[j].getBlue() == b[i].getBlue()) {
				return true;
		}
			return false;
			}
	
}
