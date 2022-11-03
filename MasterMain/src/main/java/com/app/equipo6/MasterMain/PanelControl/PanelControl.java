package com.app.equipo6.MasterMain.PanelControl;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class PanelControl extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelControl frame = new PanelControl();
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
	public PanelControl() {
		setTitle("Panel de Colores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 316, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1 = new JButton("");
		btn1.setBounds(10, 23, 61, 59);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("");
		btn2.setBounds(81, 23, 61, 59);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("");
		btn3.setBounds(152, 23, 61, 59);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("");
		btn4.setBounds(227, 23, 61, 59);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("");
		btn5.setBounds(10, 92, 61, 59);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("");
		btn6.setBounds(81, 92, 61, 59);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("");
		btn7.setBounds(152, 92, 61, 59);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("");
		btn8.setBounds(227, 92, 61, 59);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("");
		btn9.setBounds(10, 161, 61, 59);
		contentPane.add(btn9);
		
		JButton btn10 = new JButton("");
		btn10.setBounds(81, 161, 61, 59);
		contentPane.add(btn10);
		
		JButton btn11 = new JButton("");
		btn11.setBounds(152, 161, 61, 59);
		contentPane.add(btn11);
		
		JButton btn12 = new JButton("");
		btn12.setBounds(227, 161, 61, 59);
		contentPane.add(btn12);
		
		JButton btn13 = new JButton("");
		btn13.setBounds(10, 233, 61, 59);
		contentPane.add(btn13);
		
		JButton btn14 = new JButton("");
		btn14.setBounds(81, 233, 61, 59);
		contentPane.add(btn14);
		
		JButton btn15 = new JButton("");
		btn15.setBounds(152, 233, 61, 59);
		contentPane.add(btn15);
		
		JLabel lblNewLabel = new JLabel("Black = no Disponible");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(26, 302, 187, 49);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("min 8 colores");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(204, 244, 88, 49);
		contentPane.add(lblNewLabel_1);
	}
}
