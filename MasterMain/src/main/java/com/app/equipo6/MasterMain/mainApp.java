package com.app.equipo6.MasterMain;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.app.equipo6.MasterMain.Control.Control;
import com.app.equipo6.MasterMain.Control.ControlJPanel;
import com.app.equipo6.MasterMain.Juego.Juego;
import com.app.equipo6.MasterMain.Juego.JuegoPanel;
import com.app.equipo6.MasterMain.PanelControl.PanelControl;
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
		int maxintentos=6;
		intento=0;
		boolean comp=false;
		colorrespuesta=new Color[6];
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1085, 904);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1,3));
		
		PanelControl panelcontrol= new PanelControl(3);
		Control control = new Control (panelcontrol.getRespuesta());
		ControlJPanel controlp = new ControlJPanel(control,maxintentos);
		Juego juego = new Juego(intento,maxintentos,panelcontrol.getDefaultColor(),colorrespuesta);
		JuegoPanel juegopanel = new JuegoPanel(juego,control,controlp);
		juegopanel.setVisible(true);
		contentPane.add(juegopanel);
		controlp.setVisible(true);
		contentPane.add(controlp);
		panelcontrol.setVisible(true);
		contentPane.add(panelcontrol);
		
		
		
	}

}
