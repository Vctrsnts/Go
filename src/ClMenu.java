
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

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ClMenu extends JMenuBar {

	/** Menu Principales de la aplicación */
	private JMenu MnArchivo = new JMenu("Archivo", true);
	private JMenu MnOpciones = new JMenu("Opciones", true);
	private JMenu MnAyuda = new JMenu("Ayuda", true);
	
	/** Items de MnArchivos */
	private JMenuItem MnNuevo = new ClMnNuevo();
	private JMenuItem MnAbrir = new ClMnAbrir();
	private JMenuItem MnGuardar = new ClMnGuardar();
	private JMenuItem MnCerrar = new ClMnCerrar();
	private JMenuItem MnSalir = new ClMnSalir();

	/** Items de MnOpciones */
	private JMenuItem MnConfiguracion = new ClMnConfiguracion();
	private JMenuItem MnJugador = new ClMnJugador();
	private JMenuItem MnNivel = new ClMnNivel();
	
	/** Items de MnAyuda */
	private JMenuItem MnDocumentacion = new ClMnDocumentacion();
	private JMenuItem MnAcercaDe = new ClMnAcercaDe();
	
	/** Constructor basico de la clase */
	public ClMenu() {
		initMnArchivo();
		initMnOpciones();
		initMnAyuda();
		add(MnArchivo);
		add(MnOpciones);
		add(MnAyuda);
	}
		
	/** Inserción de los items en MnArchivo */
	private void initMnArchivo() {
		MnArchivo.add(MnNuevo);
		MnArchivo.add(MnAbrir);
		MnArchivo.add(MnGuardar);
		MnArchivo.add(MnCerrar);
		MnArchivo.addSeparator();
		MnArchivo.add(MnSalir);
	}
		
	/** Inserción de los items en MnOpciones */
	private void initMnOpciones() {
		MnOpciones.add(MnConfiguracion);
		MnOpciones.add(MnJugador);
		MnOpciones.add(MnNivel);
	}
		
	/** Inserción de los items en MnAyuda */
	private void initMnAyuda() {
		MnAyuda.add(MnDocumentacion);
		MnAyuda.add(MnAcercaDe);
	}
}
