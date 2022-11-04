package com.app.equipo6.MasterMain.Control;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.app.equipo6.MasterMain.Juego.Juego;

public class VControl extends JPanel {

	/**
	 * Create the panel.
	 */
	private JButton[] cbutton;
	
	public VControl() {
		
	}

	public VControl(Control control) {
		cbutton=new JButton[6];
		setForeground(new Color(0, 0, 0));
		setBackground(new Color(255, 255, 255));
		setLayout(null);
		JButton cbutton1 = new JButton();
		cbutton1.setBounds(57,27,37,37);
		add(cbutton1);
		
		JButton cbutton2 = new JButton();
		cbutton2.setBounds(104,27,37,37);
		add(cbutton2);
		
		JButton cbutton3 = new JButton();
		cbutton3.setBounds(151,27,37,37);
		add(cbutton3);
		
		JButton cbutton4 = new JButton();
		cbutton4.setBounds(198,27,37,37);
		add(cbutton4);
		
		if(control.getRespuesta().length>=5) {
			
			JButton cbutton5 = new JButton();
			cbutton5.setBounds(245,27,37,37);
			cbutton[4]=cbutton5;
			add(cbutton5);
			
			if(control.getRespuesta().length>=6) {
				
				JButton cbutton6 = new JButton();
				cbutton6.setBounds(10,27,37,37);
				cbutton[5]=cbutton6;
				add(cbutton6);
			}
		}
		
		cbutton[0]=cbutton1;
		cbutton[1]=cbutton2;
		cbutton[2]=cbutton3;
		cbutton[3]=cbutton4;
		
	}
	public JButton[] getCButton() {
		return this.cbutton;
	}

}
