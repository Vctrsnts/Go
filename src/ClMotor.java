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

import java.util.Random;

public class ClMotor {

	private int col = 0;
	private int row = 0;

	private ClCasilla[][] casilla;
	private int[][] estadoTablero;
	private int lado;

	/** Constructor basico de la clase */
	public ClMotor(int x, int y, int i_Lado, int[][] tablero, ClCasilla[][] casilla) {
		col = x;
		row = y;
		estadoTablero = tablero;
		this.casilla = casilla;
		lado = i_Lado;
	}

	/** Aqui es donde se realizara la proxima jugada **/
	public int[][] proximaJugada() {
		Random rnd = new Random();
		int[][] jugada = new int[0][0];
		int[][] valor = new int[0][0];
		int[][] ganancia = new int[4][4];
		int aux_row = 0; int aux_col = 0;
		int guany = 0;

		for (int i = 0; i < lado; i++) {
			for (int j = 0; j < lado; j++) {
				row = (int)(rnd.nextDouble() * 9);
				col = (int)(rnd.nextDouble() * 9);

				if (casilla[row][col].getValor() == 0) {

					if (row > 0) {
						aux_row = row;
						aux_row--;
					} else {
						aux_row = 0;
					}

					while (casilla[aux_row][col].getValor() == 1 && aux_row > 0) {
						/** De inicio movimiento hasta 0 en vertical **/
						casilla[aux_row][col].setValor(-1);
						casilla[aux_row][col].setImagen(-1);
						guany++;
						aux_row--;
					}
					
					if (guany > 0) {
						ganancia[0][0] = guany;
						ganancia[0][1] = row;
						ganancia[0][2] = col;
					}
					
					if (row < lado) {
						aux_row = row;
						aux_row--;
					} else {
						aux_row = lado;
					}

					guany = 0;

					while (casilla[aux_row][col].getValor() == 1 && aux_row < lado) {
						/** De inicio movimiento hasta 9 en vertical **/
						casilla[aux_row][col].setValor(-1);
						casilla[aux_row][col].setImagen(-1);
						guany++;
						aux_row++;
					}
					if (guany > 0) {
						ganancia[1][0] = guany;
						ganancia[1][1] = row;
						ganancia[1][2] = col;
					}
					
					if (col > 0) {
						aux_col = col;
						aux_col--;
					} else {
						aux_col = 0;
					}

					guany = 0;

					while (casilla[row][aux_col].getValor() == 1 && aux_col > 0) {
						/** Desde movimiento incial hasta 0 en horizontal **/
						casilla[row][aux_col].setValor(-1);
						casilla[row][aux_col].setImagen(-1);
						aux_col--;
					}
					if (guany > 0) {
						ganancia[2][0] = guany;
						ganancia[2][1] = row;
						ganancia[2][2] = col;
					}
					
					if (col < lado) {
						aux_col = col;
						aux_col++;
					} else {
						col = lado;
					}

					guany = 0;

					while (casilla[row][aux_col].getValor() == 1 && aux_col < lado) {
						/** Desde movimiento incial hasta lado en horizontal **/
						casilla[row][aux_col].setValor(-1);
						casilla[row][aux_col].setImagen(-1);
						aux_col++;
					}
					if (guany > 0) {
						ganancia[3][0] = guany;
						ganancia[3][1] = row;
						ganancia[3][2] = col;
					}
				}
			}
		}

		valor[0][0] = ganancia[0][0];

		for (int x = 1; x < 4; x++) {
			if (ganancia[x][0] > valor[0][0]) {
				valor[0][0] = ganancia[x][0];	/** Las piezas que se ganan en la jugada **/
				valor[0][1] = x;
			}
		}
		int x = valor[0][1];

		jugada[0][0] = ganancia[x][1];
		jugada[0][1] = ganancia[x][2];

		return jugada;
	}
}
