package com.app.equipo6.MasterMain;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.app.equipo6.MasterMain.Juego.Juego;
import com.app.equipo6.MasterMain.Juego.JuegoPanel;

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
		intento=2;
		boolean comp=false;
		colorrespuesta=new Color[4];
		colordefault= new Color[]{new Color(255,255,255),new Color(255,0,0),new Color(0,255,0),new Color(0,0,255)};
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1085, 904);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1,3));
		Juego juego = new Juego(intento,maxintentos,colordefault,colorrespuesta);
		JuegoPanel juegopanel = new JuegoPanel(juego);
		juegopanel.setVisible(true);
		contentPane.add(juegopanel);
		
		
	}

}
