package com.app.equipo6.MasterMain.Control;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.app.equipo6.MasterMain.Juego.Juega;
import com.app.equipo6.MasterMain.PanelControl.PanelControl;

public class ControlJPanel extends JPanel {

	private JButton[][] cbutton;
	/**
	 * Create the panel.
	 * @param maxintentos 
	 */
	public ControlJPanel(Control control, int maxintentos) {
		
		cbutton=new JButton[maxintentos][control.getRespuesta().length];
		setForeground(new Color(0, 0, 0));
		setBackground(new Color(255, 255, 255));
		setLayout(new GridLayout(8,1));
		VControl[] vista =new VControl[maxintentos];
		
		for(int i=0;i<vista.length;i++) {
			vista[i]=new VControl(control);
			vista[i].setVisible(true);
			add(vista[i]);
		}
		for(int i=0;i<maxintentos;i++) {
			cbutton[i]=vista[i].getCButton();
		}

	}
	public void changeColor(Color[] comp, Control control) {
		int intento= (control.getContador())-1;
		for(int i=0;i<control.getRespuesta().length;i++) {
			this.cbutton[intento][i].setBackground(comp[i]);
			System.out.println(this.cbutton[intento].length);
		}
		
	}

}
