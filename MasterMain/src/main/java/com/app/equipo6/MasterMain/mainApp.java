package com.app.equipo6.MasterMain;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.app.equipo6.MasterMain.Control.Control;
import com.app.equipo6.MasterMain.Juego.Juego;
import com.app.equipo6.MasterMain.Juego.JuegoPanel;
import com.app.equipo6.MasterMain.Problema.Problema;

public class mainApp extends JFrame {

	private JPanel contentPane;
	private Color[] colordefault;
	private Color[] colorrespuesta;
	private int  intento;
	/**
	 * Create the frame.
	 */
	public mainApp() {
		int maxintentos=8;
		intento=0;
		boolean comp=false;
		colorrespuesta=new Color[4];
		
		Problema prob= new Problema();
		colordefault= prob.getProblema(1) ;
		Color[] respuesta =prob.getProblema(1);
		for (Color color : respuesta) {
			System.out.println("c1:" + color.getRed() + color.getGreen() + color.getGreen());
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1085, 904);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		Control control = new Control (respuesta);
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1,3));
		Juego juego = new Juego(intento,maxintentos,colordefault,colorrespuesta);
		JuegoPanel juegopanel = new JuegoPanel(juego,control);
		juegopanel.setVisible(true);
		contentPane.add(juegopanel);
		
		
	}

}
