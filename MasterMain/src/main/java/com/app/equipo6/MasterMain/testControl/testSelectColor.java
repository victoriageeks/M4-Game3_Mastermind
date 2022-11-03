package com.app.equipo6.MasterMain.testControl;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.app.equipo6.MasterMain.Problema.Problema;
import com.app.equipo6.MasterMain.SelectColor.SelectColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class testSelectColor extends JFrame {

	private JPanel contentPane;
	private JButton button;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testSelectColor frame = new testSelectColor();
					frame.setVisible(true);
					Problema prob= new Problema();
					SelectColor selectColor = new SelectColor();
					prob.getProblema(selectColor.getColors(),1) ;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the frame.
	 */
	public testSelectColor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton();
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asignarColor(btnNewButton,1);
			}
		});
		btnNewButton.setBounds(31, 31, 189, 111);
		contentPane.add(btnNewButton);
		
		button = btnNewButton;
	}
	public void asignarColor(JButton jb, int n){
		SelectColor st = new SelectColor();
		st.setVisible(true);
	}
}
