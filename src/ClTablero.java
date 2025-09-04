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
import javax.swing.JPanel;
import java.awt.event.*;

import java.awt.Color;

public class ClTablero extends JPanel {

	private int i_Lado = 10;

	private ClCasilla[][] casilla;
	private int[][] tablero = new int[i_Lado][i_Lado];
	// private int[][] resultado = new int[i_Lado][i_Lado];
	// private ClMotor motor;
	
	private moveHuman estado = new moveHuman();
	private moveMachine maquina = new moveMachine();
	private int[][] jugada;

	private ClMensajes mensaje = new ClMensajes();

	/** Constructor basico de la clase */
	public ClTablero() {
		try {
			casilla = new ClCasilla[i_Lado][i_Lado];
			for (int y = 0; y < i_Lado; y++) {
				for (int x = 0; x < i_Lado; x++) {
					casilla[y][x] = new ClCasilla(y, x);
					
					if (x == 4 && y == 4) { casilla[y][x].setValor(1); casilla[y][x].setImagen(1); tablero[y][x] = 1; }
					if (x == 4 && y == 5) { casilla[y][x].setValor(-1); casilla[y][x].setImagen(-1); tablero[y][x] = -1; }
					if (x == 5 && y == 4) { casilla[y][x].setValor(-1); casilla[y][x].setImagen(-1); tablero[y][x] = -1; }
					if (x == 5 && y == 5) { casilla[y][x].setValor(1); casilla[y][x].setImagen(1); tablero[y][x] = 1; }
					
					casilla[y][x].addActionListener(new atiendeBotones(y,x));
					add(casilla[y][x]);
				}
			}
		} catch (NullPointerException e) {
			System.out.println(e.toString());
		}
		setBackground(new Color(58, 110, 165));
	}

	class atiendeBotones implements ActionListener {
		
		private int posX;
		private int posY;
		
		public atiendeBotones (int y, int x) {
			posX = x;
			posY = y;
		}
		
		public void actionPerformed(ActionEvent e) {
			// Aqui es cuando se ha pulsado la pantalla, y obtenemos la "columna" y la "fila" pulsada
			estado.cambiaEstado(posX, posY, 1);
			// Aqui tenemos que actualizar el tablero
			jugada = maquina.Movimiento(tablero);
			estado.CambiaEstado(jugada[0][0], jugada[0][1], 2);
		}
/*		
		public void actionPerformed(ActionEvent e) {
			int[][] jugada;
			//mensaje.setMensaje("Casilla Pulsada");
			//System.out.println("Casilla pulsada");
			//System.out.println("Pos X: " + posX);
			
			casilla[posY][posX].setImagen(1);		// Aqui le pasamos el valor de la imagen a mostrar
			casilla[posY][posX].setValor(1);		// Aqui le pasamos el valor del movimiento
			tablero[posY][posX] = 1;						// Aqui actualizamos el estado del tablero
			
			tablero = estado.cambiaEstado(tablero, casilla, posY, posX, i_Lado, 1);

			// Ahora tira la maquina
			
			motor = new ClMotor(posX, posY, i_Lado, tablero, casilla);
			
			jugada = motor.proximaJugada();
			
			casilla[jugada[0][0]][jugada[0][1]].setImagen(-1);
			casilla[jugada[0][0]][jugada[0][1]].setValor(-1);
			
			tablero = estado.cambiaEstado(tablero, casilla, posY, posX, i_Lado, 2);

		}
*/		
	}
}
