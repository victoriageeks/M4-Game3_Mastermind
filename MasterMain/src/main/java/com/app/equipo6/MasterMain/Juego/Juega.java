package com.app.equipo6.MasterMain.Juego;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.app.equipo6.MasterMain.Boton.Boton;
import com.app.equipo6.MasterMain.Control.Control;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Juega extends JPanel {
	public Juega(Juego juego) {
		initJuego(juego);
		
		
	}
	private void initJuego(Juego juego) {
		setForeground(new Color(0, 0, 0));
		setBackground(new Color(255, 255, 255));
		setLayout(null);
		JButton button1 = new JButton();
		button1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(MouseEvent.BUTTON2==e.getButton()) {
					Color color=button1.getForeground();
					color=Juego.cambiaColorMenos(color,juego.getColordef());
					button1.setForeground(color);
					juego.setColorresp(0, color);
					
				}
				if(MouseEvent.BUTTON1==e.getButton()) {
					Color color=button1.getForeground();
					color=Juego.cambiaColorMas(color,juego.getColordef());
					button1.setForeground(color);
					juego.setColorresp(0, color);
					
				}
			}
		});
		button1.setForeground(juego.getColordef(0));
		button1.setBounds(57,27,37,37);
		add(button1);
		
		JButton button2 = new JButton();
		button2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(MouseEvent.BUTTON2==e.getButton()) {
					Color color=button2.getForeground();
					color=Juego.cambiaColorMenos(color,juego.getColordef());
					button2.setForeground(color);
					juego.setColorresp(1, color);
					
				}
				if(MouseEvent.BUTTON1==e.getButton()) {
					Color color=button2.getForeground();
					color=Juego.cambiaColorMas(color, juego.getColordef());
					button2.setForeground(color);
					juego.setColorresp(1, color);
				}
			}
		});
		button2.setForeground(juego.getColordef(0));
		button2.setBounds(104,27,37,37);
		add(button2);
		
		JButton button3 = new JButton();
		button3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(MouseEvent.BUTTON2==e.getButton()) {
					Color color=button3.getForeground();
					color=Juego.cambiaColorMenos(color,juego.getColordef());
					button3.setForeground(color);
					juego.setColorresp(2, color);
					
				}
				if(MouseEvent.BUTTON1==e.getButton()) {
					Color color=button3.getForeground();
					color=Juego.cambiaColorMas(color,juego.getColordef());
					button3.setForeground(color);
					juego.setColorresp(2, color);
					
					
				}
			}
		});
		button3.setForeground(juego.getColordef(0));
		button3.setBounds(151,27,37,37);
		add(button3);
		
		JButton button4 = new JButton();
		button4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(MouseEvent.BUTTON2==e.getButton()) {
					Color color=button4.getForeground();
					color=Juego.cambiaColorMenos(color,juego.getColordef());
					button4.setForeground(color);
					juego.setColorresp(3, color);
					
				}
				if(MouseEvent.BUTTON1==e.getButton()) {
					Color color=button4.getForeground();
					color=Juego.cambiaColorMas(color,juego.getColordef());
					button4.setForeground(color);
					juego.setColorresp(3, color);
					
					
				}
			}
		});
		button4.setForeground(juego.getColordef()[0]);
		button4.setBounds(198,27,37,37);
		add(button4);
		
		
		JButton button5 = new JButton();
		button5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(MouseEvent.BUTTON2==e.getButton()) {
					Color color=button5.getForeground();
					color=Juego.cambiaColorMenos(color,juego.getColordef());
					button5.setForeground(color);
					juego.setColorresp(4, color);
					
				}
				if(MouseEvent.BUTTON1==e.getButton()) {
					Color color=button5.getForeground();
					color=Juego.cambiaColorMas(color,juego.getColordef());
					button5.setForeground(color);
					juego.setColorresp(4, color);
					
				}
			}
		});
		button5.setForeground(juego.getColordef()[0]);
		button5.setBounds(245,27,37,37);
		add(button5);
		
		JButton button6 = new JButton();
		button6.setBackground(new Color(0, 0, 255));
		button6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(MouseEvent.BUTTON2==e.getButton()) {
					Color color=button6.getForeground();
					color=Juego.cambiaColorMenos(color,juego.getColordef());
					button6.setForeground(color);
					juego.setColorresp(5, color);
					
				}
				if(MouseEvent.BUTTON1==e.getButton()) {
					Color color=button6.getForeground();
					color=Juego.cambiaColorMas(color,juego.getColordef());
					button6.setForeground(color);
					juego.setColorresp(5, color);
					
				}
			}
		});
		button6.setForeground(new Color(0, 0, 255));
		button6.setBounds(10,27,37,37);
		add(button6);
		
		if(juego.getColordef().length<6) {
			button5.setVisible(false);
			if(juego.getColordef().length<5) button6.setVisible(false);
		}
		
		JButton comp = new JButton("Comp");
		comp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comp.setVisible(false);
				juego.setIntento(juego.getIntento()+1);
			}
		});
		comp.setBounds(292,32,59,32);
		
		add(comp);
	}
	
}
