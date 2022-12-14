package com.app.equipo6.MasterMain.Control;

import java.awt.Color;
import java.util.ArrayList;

public class Control {
	private int contador;
	private Color[] resp;
	private Color[][] intentos;
	
	public int getContador() {
		return contador;
	}

	public Color[][] getIntentos() {
		return intentos;
	}

	public Control(Color[] respuesta) {
		this.contador = 0;
		this.resp = respuesta;
		this.intentos= new Color[8][this.resp.length];
		for(int i=0;i<this.intentos.length;i++) {
			for(int j=0;j<this.resp.length;j++) {
				this.intentos[i][j]= Color.white;
			}
		}
	}
	public Color[] respuesta(Color[] b) {
		int count = 0;
		Color[] a=this.resp;
		
		Color[] respuesta = new Color[a.length];
		boolean[] auxb = new boolean[a.length];
		boolean[] auxa = new boolean[a.length];
		for (int i = 0; i < respuesta.length; i++) {
			 respuesta[i]= new Color(160,160,160);
			
		}
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
		this.intentos[this.contador]=respuesta;
		this.contador++;
		return respuesta;
		}
		//si el color y posicion coinciden devuelve true
		public boolean control(Color[] a,Color b[],int i) {
		
			if(a[i].getRed() == b[i].getRed() && a[i].getGreen() == b[i].getGreen()&&
					a[i].getBlue() == b[i].getBlue()) {
				return true;
		}
			return false;
	}
		
		public boolean control2(Color[] a,Color b[],int i,int j) {
			if(a[j].getRed() == b[i].getRed() && a[j].getGreen() == b[i].getGreen()
					&& a[j].getBlue() == b[i].getBlue()) {
				return true;
			}
			return false;
		}
		
	public Color[] getRespuesta() {
		return this.resp;
	}
	public void setContador(int cont) {
		this.contador=cont;
	}
	public Boolean compMatrix(Color[] comp) {
		int i=0;
		while(i<comp.length) {
			if(comp[i].getRed() != Color.BLACK.getRed() || comp[i].getGreen() !=  Color.BLACK.getGreen()
					|| comp[i].getBlue() !=  Color.BLACK.getBlue()) return false;
			i++;
		}
		return true;
	}
		
}
