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

import javax.swing.JMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ClMnAcercaDe extends JMenuItem {
		
	private ClMensajes Mensaje = new ClMensajes(); 
		
	/** Constructor basico de la clase */
	public ClMnAcercaDe() {
		setText("Acerca De ...");
		addMouseListener(new MouseAdapter() {
		/** Mostramos el Acerca De ...*/
			public void mouseReleased(MouseEvent e) {
				Mensaje.setMensaje("Juego .: GO :. \n" + 
									 				 "Desarrolado por: Victor Santos Garcia.\n" +
													 "Código: 20040901.\n" + 
													 "Email: victorsantos@hotpop.com"
													);
			}
		});
	}
}
