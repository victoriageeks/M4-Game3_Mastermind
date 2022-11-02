package com.app.equipo6.MasterMain.SelectColor;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SelectColor extends JFrame {

	private JPanel contentPane;
	private JButton jb;
	private Boolean flag;
	private int cantidadColor;
	
	public SelectColor(JButton jb, int i) {
		this.cantidadColor = i;
		this.jb = jb;
		setType(Type.UTILITY);
		setTitle("PictureBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 358, 265);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnOrange = new JButton();
		btnOrange.setBounds(10, 21, 85, 84);
		contentPane.add(btnOrange);
		btnOrange.setBackground(Color.ORANGE);
		
		JButton btnPink = new JButton();
		btnPink.setBounds(120, 21, 85, 84);
		contentPane.add(btnPink);
		btnPink.setBackground(Color.PINK);
		
		JButton btnRed = new JButton();
		btnRed.setBounds(10, 124, 85, 84);
		contentPane.add(btnRed);
		btnRed.setBackground(Color.RED);
		
		JButton btnGreen = new JButton();
		btnGreen.setBounds(237, 21, 85, 84);
		contentPane.add(btnGreen);
		btnGreen.setBackground(Color.GREEN);
		
		JButton btnBlue = new JButton();
		btnBlue.setBounds(120, 124, 85, 84);
		contentPane.add(btnBlue);
		btnBlue.setBackground(Color.BLUE);
		
		JButton btnCyan = new JButton();
		btnCyan.setBounds(237, 124, 85, 84);
		contentPane.add(btnCyan);
		btnCyan.setBackground(Color.CYAN);
		

		//desactivamos los botones segun los niveles
		
		if(i == 1) {
			btnBlue.setEnabled(false);
			btnCyan.setEnabled(false);
			btnBlue.setBackground(Color.BLACK);
			btnCyan.setBackground(Color.BLACK);
		}else if(i == 2) {
			btnCyan.setEnabled(false);
			btnCyan.setBackground(Color.BLACK);
		}
		//funciones
		
		btnRed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setColor(jb,Color.red);
			}
		});
		
		btnGreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setColor(jb,Color.GREEN);
			}
		});
		
		btnBlue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setColor(jb,Color.blue);
			}
		});
		
		btnCyan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setColor(jb,Color.CYAN);
			}
		});
		
		btnOrange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setColor(jb,Color.ORANGE);
			}
		});
		btnPink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setColor(jb,Color.PINK);
			}
		});
		
		
		
	}
	//recibe un boton y le asigna un color cuando lo asigna
	//se elimina este frame
	public void setColor(JButton jb,Color color) {
		jb.setBackground(color);
		this.dispose();
	}

	
}
