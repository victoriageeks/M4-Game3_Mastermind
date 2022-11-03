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
import com.app.equipo6.MasterMain.SelectColor.SelectColor;

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
		//dani con esto se crea el problema y se obtiene los colores selecionados
		//en selectColor tiene como minimo 8 y usa un arraylist
		//en problema tenes 2 get para obtener los colores en juego que en este caso son 4
		// y la respuesta:)
		// despues en Control tenes un arrayList con los intentos, el resultado espereado
		SelectColor selectColor = new SelectColor();
		Problema prob= new Problema(selectColor.getColors(),1);
		//esto
		// lo deje igual que estaba antes esta funcionando igual
		//pero con lo que me pediste y con los metodos cambiados en el main
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1085, 904);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		Control control = new Control (prob.getRespuesta());
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1,3));
		Juego juego = new Juego(intento,maxintentos,colordefault,colorrespuesta);
		JuegoPanel juegopanel = new JuegoPanel(juego,control);
		juegopanel.setVisible(true);
		contentPane.add(juegopanel);
		
		
	}

}
