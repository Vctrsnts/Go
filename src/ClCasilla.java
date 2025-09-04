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
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.Icon;

import java.awt.Color;
import java.awt.Dimension;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseAdapter;

public class ClCasilla extends JButton {
	
	private int i_Fila = 0;
	private int i_Columna = 0;
	private int i_CasHeight = 30;
	private int i_CasWidth = 30;
	private int i_Valor = 0;
	
	private Color fonCasilla = new Color(58, 110, 165);
	private Color borCasilla = Color.white;
	
	private Icon fichas[] = { new ImageIcon ("white.png"), new ImageIcon("black.png") };
	
	public ClCasilla(int x, int y) {
		setPreferredSize(new Dimension(i_CasHeight, i_CasWidth));
		setBackground(fonCasilla);
		setBorder(new LineBorder(borCasilla));
		i_Fila = y;
		i_Columna = x;
	}
	/** Insertamos la imagen en la casilla
		* Si pos == 1 -> Blanca
		* Si pos == -1 -> Negra
	*/
	public void setImagen(int pos) {
		if (pos == 1) setIcon(fichas[0]);
		if (pos == -1) setIcon(fichas[1]);
	}
	public void setValor(int valor) {
		i_Valor = valor;
	}
	public int getValor() {
		return i_Valor;
	}
}
