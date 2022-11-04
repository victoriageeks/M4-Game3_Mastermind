package com.app.equipo6.MasterMain.PanelControl;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.app.equipo6.MasterMain.Problema.Problema;
import com.app.equipo6.MasterMain.SelectColor.ColoresDisponibles;
import com.app.equipo6.MasterMain.SelectColor.SelectColor;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class PanelControl extends JPanel {

	private Color[] respuesta;
	private JButton[] buttonsSolucion;
	private JButton[] buttonsCdisponibles;
	private JButton intentos;
	private Problema prob;
	private Color[] disponibles;
	private Color[] coloresdefault;
	private int[] orden;
	
	
	public PanelControl(int i) {
		//cargamos todos los datos necesarios de los colores para que funcione el panel;
		ColoresDisponibles cd = new ColoresDisponibles();
		this.prob = new Problema(cd.getAllcolors(),i);
		this.disponibles = prob.getColoresDisponibles();
		this.respuesta = prob.getRespuesta();
		this.orden = prob.getOrden();
		this.coloresdefault= new Color[this.respuesta.length];
		this.buttonsSolucion = new JButton[6];
		this.buttonsCdisponibles = new JButton[6];
		//cargamos todos los datos necesarios de los colores para que funcione el panel;
		setBounds(100, 100, 457, 449);
		setLayout(null);
		
		JButton btn1 = new JButton("");
		btn1.setBounds(10, 23, 61, 59);
		add(btn1);
		
		JButton btn2 = new JButton("");
		btn2.setBounds(81, 23, 61, 59);
		add(btn2);
		
		JButton btn3 = new JButton("");
		btn3.setBounds(152, 23, 61, 59);
		add(btn3);
		
		JButton btn4 = new JButton("");
		btn4.setBounds(227, 23, 61, 59);
		add(btn4);
		
		JButton btn5 = new JButton("");
		btn5.setBounds(298, 23, 61, 59);
		add(btn5);
		
		JButton btn6 = new JButton("");
		btn6.setBounds(372, 23, 61, 59);
		add(btn6);
		
		
		this.buttonsSolucion[0] = btn1;
		this.buttonsSolucion[1] = btn2;
		this.buttonsSolucion[2] = btn3;
		this.buttonsSolucion[3] = btn4;
		this.buttonsSolucion[4] = btn5;
		this.buttonsSolucion[5] = btn6;

		
		JButton btn7 = new JButton("");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asignarColor(btn7);
			}
		});
		btn7.setBounds(10, 221, 61, 59);
		add(btn7);
		
		JButton btn8 = new JButton("");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asignarColor(btn8);
			}
		});
		btn8.setBounds(81, 221, 61, 59);
		add(btn8);
		
		JButton btn9 = new JButton("");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asignarColor(btn9);
			}
		});
		btn9.setBounds(152, 221, 61, 59);
		add(btn9);
		
		JButton btn10 = new JButton("");
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asignarColor(btn10);
			}
		});
		btn10.setBounds(227, 221, 61, 59);
		add(btn10);
		
		JButton btn11 = new JButton("");
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asignarColor(btn11);
			}
		});
		btn11.setBounds(298, 221, 61, 59);
		add(btn11);
		
		JButton btn12 = new JButton("");
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asignarColor(btn12);
			}
		});
		btn12.setBounds(369, 221, 61, 59);
		add(btn12);
		
		this.buttonsCdisponibles[0] = btn7;
		this.buttonsCdisponibles[1] = btn8;
		this.buttonsCdisponibles[2] = btn9;
		this.buttonsCdisponibles[3] = btn10;
		this.buttonsCdisponibles[4] = btn11;
		this.buttonsCdisponibles[5] = btn12;

		asignarColoresDisponibles(disponibles);
		
		JLabel lblNewLabel = new JLabel("Colores Disponibles");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(23, 163, 407, 48);
		add(lblNewLabel);
		
		JButton btnMostrarSolucion = new JButton("mostrar solucion");
		btnMostrarSolucion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarRespuesta();
			}
		});
		btnMostrarSolucion.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnMostrarSolucion.setBounds(57, 105, 136, 59);
		add(btnMostrarSolucion);
		
		JButton btnVolverJugar = new JButton("Volver a Jugar");
		btnVolverJugar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnVolverJugar.setBounds(319, 356, 111, 48);
		add(btnVolverJugar);
		
		JLabel intentos = new JLabel("intentos:");
		intentos.setFont(new Font("Tahoma", Font.PLAIN, 17));
		intentos.setBounds(10, 354, 77, 48);
		add(intentos);
		
		JLabel lblNewLabel_1 = new JLabel("Facíl");
		lblNewLabel_1.setBounds(231, 205, 57, 13);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Normal");
		lblNewLabel_1_1.setBounds(302, 205, 57, 13);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Dificil");
		lblNewLabel_1_1_1.setBounds(373, 205, 57, 13);
		add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Todos los niveles");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBounds(14, 205, 199, 13);
		add(lblNewLabel_1_2);
		
		JButton btnOcultarSolucion = new JButton("ocultar solucion");
		btnOcultarSolucion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ocultarRespuesta();
			}
		});
		btnOcultarSolucion.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnOcultarSolucion.setBounds(227, 105, 136, 59);
		add(btnOcultarSolucion);
		
		JButton btnCambiarColor = new JButton("Cambiar Colores");
		btnCambiarColor.setBounds(261, 290, 150, 53);
		add(btnCambiarColor);
		
		JButton btnIntentos = new JButton("");
		btnIntentos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnIntentos.setBackground(new Color(128, 255, 255));
		btnIntentos.setBounds(95, 361, 47, 41);
		add(btnIntentos);
		this.intentos = btnIntentos;
		
		JButton btnColoresDisponibles = new JButton("Recargar Colores");
		btnColoresDisponibles.setBounds(39, 291, 150, 53);
		add(btnColoresDisponibles);
		btnCambiarColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setColoresJuego();
				
			}
		});
		btnColoresDisponibles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asignarColoresDisponibles(disponibles);
			}
		});
		//setea el color de juego segun el orden;
		setColoresJuego();
		setDefaultColor();
	}
	
	//funciones
	public void asignarColor(JButton jb){
		SelectColor st = new SelectColor(jb);
		st.setVisible(true);
	}
	
	//muestra las respuesta
	public void mostrarRespuesta() {
		int aux = 0;
		for (Color color : respuesta) {
			this.buttonsSolucion[aux].setBackground(color);
			aux++;
		}
	}
	//oculta la respuesta
	public void ocultarRespuesta() {
		int aux = 0;
		for (Color color : this.respuesta) {
			this.buttonsSolucion[aux].setBackground(null);
			aux++;
		}
	}
	//asigna los colores disponibles segun la difucultad
	public void asignarColoresDisponibles(Color[] disponibles) {
		int aux = 0;
		for (Color color : disponibles) {
			this.buttonsCdisponibles[aux].setBackground(color);
			aux++;
		}
	}
	public void setColoresJuego() {
		int aux = 0;
		//reasignamos los valores de los disponibles segun el cambio en orden;
 		for (JButton jButton : this.buttonsCdisponibles) {
			this.disponibles[aux] = this.buttonsCdisponibles[aux].getBackground();
			aux++;
		}
 		//reasignamos la respuesta segun el orden con el cual se genero al principio;
		for (int i = 0; i < this.respuesta.length; i++) {
			this.respuesta[i] = this.disponibles[this.orden[i]];
		}
		//ocultamos los colores antes para realizar el cambio
		ocultarRespuesta();
		setDefaultColor();
	}
	public void setDefaultColor() {
		for (int i = 0; i < this.respuesta.length; i++) {
			this.coloresdefault[i] = this.disponibles[i];
		}
	}
	public Color[] getDefaultColor() {
		return this.coloresdefault;
	}
	
	public void setIntentos(String aux) {
		this.intentos.setText(aux);
	}
	public Color[] getRespuesta() {
		return this.respuesta;
	}
	public Color[] getDisponibles() {
		return this.disponibles;
	}
}
