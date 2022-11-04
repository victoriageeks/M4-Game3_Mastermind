package com.app.equipo6.MasterMain;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

public class MenuPrincipal extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int nivel;
	private int intentos;

	public MenuPrincipal() {
		setTitle("Menu Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 304, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtn0 = new JRadioButton("Facil");
		rdbtn0.setBounds(96, 49, 94, 29);
		rdbtn0.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(rdbtn0);
		
		JRadioButton rdbtn1 = new JRadioButton("Dificil");
		rdbtn1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rdbtn1.setBounds(96, 111, 94, 29);
		contentPane.add(rdbtn1);
		
		JRadioButton rdbtn2 = new JRadioButton("Normal");
		rdbtn2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rdbtn2.setBounds(96, 80, 94, 29);
		contentPane.add(rdbtn2);
		
		JLabel lblNewLabel = new JLabel("Negro bien el lugar y color");
		lblNewLabel.setBounds(96, 146, 186, 42);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setBounds(24, 148, 60, 36);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(24, 194, 60, 36);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setBackground(new Color(192, 192, 192));
		btnNewButton_1_1.setBounds(24, 240, 60, 36);
		contentPane.add(btnNewButton_1_1);
		
		JLabel lblBlancoBienEl = new JLabel("Blanco bien el color mal el lugar");
		lblBlancoBienEl.setBounds(96, 188, 186, 42);
		contentPane.add(lblBlancoBienEl);
		
		JLabel lblNewLabel_1_1 = new JLabel("Gris mal el color y mal el lugar");
		lblNewLabel_1_1.setBounds(96, 240, 186, 42);
		contentPane.add(lblNewLabel_1_1);
		ButtonGroup bggroup= new ButtonGroup();
        bggroup.add(rdbtn0);
        bggroup.add(rdbtn1);
        bggroup.add(rdbtn2);
		
		JButton btnNewButton_2 = new JButton("Jugar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int nivel = 1;
				if(rdbtn0.isSelected())nivel = 1;
				if(rdbtn1.isSelected())nivel = 2;
				if(rdbtn2.isSelected())nivel = 3;
				setNivel(nivel);
				game();
			}
			
		});
		btnNewButton_2.setBounds(96, 292, 85, 54);
		contentPane.add(btnNewButton_2);
	}
	
	public void setNivel(int nivel) {
		this.nivel = nivel;
		switch (nivel) {
		case 1: this.intentos = 10;
			break;
		case 2: this.intentos = 8;
		break;
		case 3: this.intentos = 6;
		break;
		default:
			break;
		}
	}
	
	public void game() {
		mainApp frame = new mainApp(nivel,this.intentos);
		frame.setVisible(true);
		this.dispose();
		
	}
}


