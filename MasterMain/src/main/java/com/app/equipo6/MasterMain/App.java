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
					MenuPrincipal menuPrincipal = new MenuPrincipal();
					menuPrincipal.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }
}
