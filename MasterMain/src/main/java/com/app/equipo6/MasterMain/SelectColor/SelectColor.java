package com.app.equipo6.MasterMain.SelectColor;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class SelectColor extends JFrame {

	private JPanel contentPane;
	private JButton jb;
	
	public SelectColor(JButton jb) {
		this.jb = jb;
		setType(Type.UTILITY);
		setTitle("PictureBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 389);
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
		btnRed.setBounds(339, 21, 85, 84);
		contentPane.add(btnRed);
		btnRed.setBackground(Color.RED);
		
		JButton btnGreen = new JButton();
		btnGreen.setBounds(237, 21, 85, 84);
		contentPane.add(btnGreen);
		btnGreen.setBackground(Color.GREEN);
		
		JButton btnBlue = new JButton();
		btnBlue.setBounds(10, 124, 85, 84);
		contentPane.add(btnBlue);
		btnBlue.setBackground(Color.BLUE);
		
		JButton btnCyan = new JButton();
		btnCyan.setBounds(120, 124, 85, 84);
		contentPane.add(btnCyan);
		btnCyan.setBackground(Color.CYAN);
		
		JButton btnYellow = new JButton();
		btnYellow.setBackground(new Color(255, 255, 128));
		btnYellow.setBounds(237, 124, 85, 84);
		contentPane.add(btnYellow);
		
		JButton btnPurple = new JButton();
		btnPurple.setBackground(new Color(128, 0, 255));
		btnPurple.setBounds(339, 124, 85, 84);
		contentPane.add(btnPurple);
		
		JButton btnBrown = new JButton();
		btnBrown.setBackground(new Color(128, 128, 0));
		btnBrown.setBounds(10, 240, 85, 84);
		contentPane.add(btnBrown);
		
		JButton btnMarino = new JButton();
		btnMarino.setBackground(new Color(64, 128, 128));
		btnMarino.setBounds(120, 240, 85, 84);
		contentPane.add(btnMarino);
		
		JButton btnPurpleLigth = new JButton();
		btnPurpleLigth.setBackground(new Color(204, 127, 198));
		btnPurpleLigth.setBounds(237, 240, 85, 84);
		contentPane.add(btnPurpleLigth);
		
		JButton btnBlack = new JButton();
		btnBlack.setBackground(Color.BLACK);
		btnBlack.setBounds(339, 240, 85, 84);
		contentPane.add(btnBlack);
	
		
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
		btnYellow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setColor(jb,new Color(255, 255, 128));
			}
		});
		
		btnPurple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setColor(jb,new Color(128, 0, 255));
			}
		});
		
		btnBrown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setColor(jb,new Color(128, 128, 0));
			}
		});
		
		btnMarino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setColor(jb,new Color(64, 128, 128));
			}
		});
		
		btnPurpleLigth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setColor(jb,new Color(204, 127, 198));
			}
		});
		btnBlack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setColor(jb,Color.BLACK);
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
