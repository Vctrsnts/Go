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

import java.awt.event.*;

public class ClAtiendeBotones implements ActionListener {

	private int posX,
	private int posY;
	private int i_Lado;
	
	/** Constructor basico de la clase **/
	public ClAtiendeBotones() {
	}
	
	/** Constructor alternativo de la clase **/
	public ClAtiendeBotones(int y, int x, int lado, casilla, motor, resultado) {
		posX = x;
		posY = y;
		i_Lado = lado;
	}
	
/*	
	public casilla actionPerformed(ActionEvent e) {
		casilla[posY][posX].setImagen(1);
		for (int y = 0; y < i_Lado; y++) {
			for (int x = 0; x < i_Lado; x++) {
				if (casilla[y][x].getValor() == 1) estadoTablero[y][x] = 1;
				if (casilla[y][x].getValor() == -1) estadoTablero[y][x] = -1;
			}
		}
		motor = new ClMotor(posX, posY, i_Lado);
		resultado = motor.proximaJugada(estadoTablero);
		
		for (int y = 0; y < i_Lado; y++) {
			for (int x = 0; x < i_Lado; x++) {
				if (resultado [y][x] == 1) casilla[y][x].setImagen(1);
				if (resultado [y][x] == -1) casilla[y][x].setImagen(-1);
			}
		}
	}
*/	
}
