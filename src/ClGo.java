/*
This file is part of [PROGRAM NAME] - [What it does in brief]
Copyright (c) 2001 [Author]

This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either version 2
of the License, or any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
*/
import javax.swing.JFrame;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Container;
import java.awt.BorderLayout;

public class ClGo extends JFrame {
	private static final int frame_width = 368;
	private static final int frame_height = 415;
	
	private Dimension tamPantalla = Toolkit.getDefaultToolkit().getScreenSize();
	
	private ClTablero tablero;
	
	private Container contenedor = getContentPane();
	
	/** Constructor basico de la clase */
	public ClGo() {
		postinitComponents();
		crearTablero();
	}
	
	/** Damos valor a las propiedades del JFrame */
	private void postinitComponents() {
		setTitle(".: GO :.");
		setResizable(false);
		setSize(frame_width, frame_height);
		
		if (getHeight() < tamPantalla.height) setLocation(tamPantalla.width / 2 - getWidth() / 2, tamPantalla.height / 2 - getHeight() / 2);
		
		setJMenuBar(new ClMenu());
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
	}
	/** Aqui es donde creamos el tablero */
	private void crearTablero() {
		tablero = new ClTablero();
		contenedor.add(tablero, BorderLayout.CENTER);
	}
}
