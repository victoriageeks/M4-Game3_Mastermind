package com.app.equipo6.MasterMain.SelectColor;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class SelectColor extends JFrame {

	private JPanel contentPane;
	private JButton jb;
	private int cantidad;
	private boolean[] posicion;
	private int minColor;
	
	public SelectColor() {
		cantidad = 0;
		minColor = 3;
		posicion = new boolean[11];
		for (int i = 0; i < posicion.length; i++) {
			posicion[i] = true;
		}
		setType(Type.UTILITY);
		setTitle("PictureBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 439);
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
		
		JLabel lblNewLabel = new JLabel("min 8 colores");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(339, 255, 97, 69);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Black = no disponible");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 350, 426, 42);
		contentPane.add(lblNewLabel_1);
	
		
		//funciones
		
		btnRed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cantidad < minColor && posicion[0]) {
					btnRed.setBackground(Color.BLACK);
					cantidad++;
					posicion[0] = false;
				}else if(!posicion[0]){
					btnRed.setBackground(Color.red);
					posicion[0] = true;
					cantidad--;
				}
			}
		});
		
		btnGreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cantidad < minColor && posicion[1]) {
					btnGreen.setBackground(Color.BLACK);
					cantidad++;
					posicion[1] = false;
				}else if(!posicion[1]){
					btnGreen.setBackground(Color.GREEN);
					posicion[1] = true;
					cantidad--;
				}
			}
		});
		
		btnBlue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cantidad < minColor && posicion[2]) {
					btnBlue.setBackground(Color.BLACK);
					cantidad++;
					posicion[2] = false;
				}else if(!posicion[2]){
					btnBlue.setBackground(Color.blue);
					posicion[2] = true;
					cantidad--;
				}
			}
		});
		
		btnCyan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cantidad < minColor && posicion[3]) {
					btnCyan.setBackground(Color.BLACK);
					cantidad++;
					posicion[3] = false;
				}else if(!posicion[3]){
					btnCyan.setBackground(Color.CYAN);
					posicion[3] = true;
					cantidad--;
				}
			}
		});
		
		btnOrange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cantidad < minColor && posicion[4]) {
					btnOrange.setBackground(Color.BLACK);
					cantidad++;
					posicion[4] = false;
				}else if(!posicion[4]){
					btnOrange.setBackground(Color.ORANGE);
					posicion[4] = true;
					cantidad--;
				}
			}
		});
		btnPink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cantidad < minColor && posicion[5]) {
					btnPink.setBackground(Color.BLACK);
					cantidad++;
					posicion[5] = false;
				}else if(!posicion[5]){
					btnPink.setBackground(Color.PINK);
					posicion[5] = true;
					cantidad--;
				}
			}
		});
		btnYellow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cantidad < minColor && posicion[6]) {
					btnYellow.setBackground(Color.BLACK);
					cantidad++;
					posicion[6] = false;
				}else if(!posicion[6]){
					btnYellow.setBackground(new Color(255, 255, 128));
					posicion[6] = true;
					cantidad--;
				}
			}
		});
		
		btnPurple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cantidad < minColor && posicion[7]) {
					btnPurple.setBackground(Color.BLACK);
					cantidad++;
					posicion[7] = false;
				}else if(!posicion[7]){
					btnPurple.setBackground(new Color(128, 0, 255));
					posicion[7] = true;
					cantidad--;
				}
			}
		});
		
		btnBrown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cantidad < minColor && posicion[8]) {
					btnBrown.setBackground(Color.BLACK);
					cantidad++;
					posicion[8] = false;
				}else if(!posicion[8]){
					btnBrown.setBackground(new Color(128, 128, 0));
					posicion[8] = true;
					cantidad--;
				}
			}
		});
		
		btnMarino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cantidad < minColor && posicion[9]) {
					btnMarino.setBackground(Color.BLACK);
					cantidad++;
					posicion[9] = false;
				}else if(!posicion[9]){
					btnMarino.setBackground(new Color(64, 128, 128));
					posicion[9] = true;
					cantidad--;
				}
			}
		});
		
		btnPurpleLigth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cantidad < minColor && posicion[10]) {
					btnPurpleLigth.setBackground(Color.BLACK);
					cantidad++;
					posicion[10] = false;
				}else if(!posicion[10]){
					btnPurpleLigth.setBackground(new Color(204, 127, 198));
					posicion[10] = true;
					cantidad--;
				}
			}
		});
	
	}
	
	public ArrayList<Color>  getColors() {
		ArrayList<Color> coloresDisponibles =  new ArrayList<>();
		Color[] colores = {Color.red,Color.GREEN,Color.blue,Color.CYAN,
				Color.ORANGE,Color.PINK,
				new Color(255, 255, 128),new Color(128, 0, 255),
				new Color(128, 128, 0),new Color(64, 128, 128),
				new Color(204, 127, 198)};
		for (int i = 0; i < posicion.length; i++) {
			if(posicion[i]) {
				coloresDisponibles.add(colores[i]);
			}
		}
		return coloresDisponibles;
	}

}
