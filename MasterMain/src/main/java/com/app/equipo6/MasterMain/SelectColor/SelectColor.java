package com.app.equipo6.MasterMain.SelectColor;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SelectColor extends JFrame {

	private JPanel contentPane;
	private Color color;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectColor frame = new SelectColor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SelectColor() {
		setType(Type.UTILITY);
		setTitle("PictureBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 456, 355);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBlack = new JButton();
		btnBlack.setBounds(10, 21, 85, 84);
		contentPane.add(btnBlack);
		btnBlack.setBackground(Color.BLACK);
		
		JButton btnWhite = new JButton();
		btnWhite.setBounds(120, 21, 85, 84);
		contentPane.add(btnWhite);
		btnWhite.setBackground(Color.WHITE);
		
		JButton btnRed = new JButton();
		btnRed.setBounds(351, 21, 85, 84);
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
		
		JButton btnOrange = new JButton();
		btnOrange.setBounds(237, 124, 85, 84);
		contentPane.add(btnOrange);
		btnOrange.setBackground(Color.ORANGE);
		
		JButton btnPink = new JButton();
		btnPink.setBounds(351, 124, 85, 84);
		contentPane.add(btnPink);
		btnPink.setBackground(Color.PINK);
		
		JButton btnYellow = new JButton();
		btnYellow.setBackground(Color.YELLOW);
		btnYellow.setBounds(10, 224, 85, 84);
		contentPane.add(btnYellow);

		JButton btnLigthGray = new JButton();
		btnLigthGray.setBackground(Color.lightGray);
		btnLigthGray.setBounds(120, 224, 85, 84);
		contentPane.add(btnLigthGray);
		
		JButton btnDarkGray = new JButton();
		btnDarkGray.setBackground(Color.DARK_GRAY);
		btnDarkGray.setBounds(237, 224, 85, 84);
		contentPane.add(btnDarkGray);

		JButton btnPurple = new JButton();
		btnPurple.setBackground(new Color(255,44,233));
		btnPurple.setBounds(351, 224, 85, 84);
		contentPane.add(btnPurple);
		
		//funciones

		
		btnBlack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getColor(Color.black);
			}
		});
		
		btnWhite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getColor(Color.white);
			}
		});
		
		btnRed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getColor(Color.red);
			}
		});
		
		btnGreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getColor(Color.GREEN);
			}
		});
		
		btnBlue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getColor(Color.blue);
			}
		});
		
		btnCyan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getColor(Color.CYAN);
			}
		});
		
		btnOrange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getColor(Color.ORANGE);
			}
		});
		btnPink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getColor(Color.PINK);
			}
		});
		btnYellow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getColor(Color.YELLOW);
			}
		});
		btnLigthGray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getColor(Color.lightGray);
			}
		});
		btnDarkGray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getColor(Color.darkGray);
			}
		});
		btnPurple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getColor(new Color(255,44,233));
			}
		});
		
		
		
	}
	public void getColor(Color color) {
		this.color = color;
	}
}
