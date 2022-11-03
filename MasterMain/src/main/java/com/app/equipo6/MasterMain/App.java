package com.app.equipo6.MasterMain;

import java.awt.EventQueue;


public class App 
{
	/**
	 * Launch the application.
	 */
	

    public static void main( String[] args )
    {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainApp frame = new mainApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }
}
