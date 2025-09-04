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
public class ClEstados {

	private ClCasilla[][] casilla;
	
	public ClEstados() {
		//Constructor basico de la clase
	}
	
	/** Aqui es donde se cambia el estado de las fichas **/
	public int[][] cambiaEstado(int[][] estadoTablero, ClCasilla[][] casilla, int row, int col, int lado, int jugador) {
		/** Si jugador
			Jugador == 1 --> Movimiento realizado por persona.
			Jugador == 2 --> Movimiento realizado por maquina.
		**/
		
		int valor = 0; int movimiento = 0;
		int aux_col; int aux_row;
		
		if (jugador == 1) { valor = -1; movimiento = 1; }
		if (jugador == 2) { valor = 1; movimiento = -1; }
		
		if (row > 0) {
			aux_row = row; 
			aux_row--;
		} else {
			aux_row = 0;
		}

		while (casilla[aux_row][col].getValor() == valor && aux_row > 0) {
			/** Desde movimiento incial hasta 0 en vertical **/
			casilla[aux_row][col].setValor(movimiento);
			casilla[aux_row][col].setImagen(movimiento);
			estadoTablero[aux_row][col] = movimiento;
			aux_row--;
		}

		if (row < lado) {
			aux_row = row;
			aux_row++;
		} else {
			aux_row = lado;
		}
		
		while (casilla[aux_row][col].getValor() == valor && aux_row < lado) {
			/** Desde movimiento incial hasta 9 en vertical **/
			casilla[aux_row][col].setValor(movimiento);
			casilla[aux_row][col].setImagen(movimiento);
			estadoTablero[aux_row][col] = movimiento;
			aux_row++;
		}
		
		if (col > 0) {
			aux_col = col;
			aux_col--;
		} else {
			aux_col = 0;
		}
		while (casilla[row][aux_col].getValor() == valor && aux_col > 0) {
			/** Desde movimiento incial hasta 0 en horizontal **/
			casilla[row][aux_col].setValor(movimiento);
			casilla[row][aux_col].setImagen(movimiento);
			estadoTablero[row][aux_col] = movimiento;
			aux_col--;
		}
		
		if (col < lado) {
			aux_col = col;
			aux_col++;
		} else {
			aux_col = 9;
		}
		while (casilla[row][aux_col].getValor() == valor && aux_col < lado) {
			/** Desde movimiento incial hasta 10 en horizontal **/
			casilla[row][aux_col].setValor(movimiento);
			casilla[row][aux_col].setImagen(movimiento);
			estadoTablero[row][aux_col] = movimiento;
			aux_col++;
		}
/*		
		while (casilla[aux_row][col].getValor() == valor && aux_row > 0) {
			//Desde movimiento incial hasta 0 en vertical
			casilla[aux_row][col].setValor(movimiento);
			casilla[aux_row][col].setImagen(movimiento);
			estadoTablero[aux_row][col] = movimiento;
			aux_row--;
		}
		while (casilla[aux_row][col].getValor() == valor && aux_row > 0) {
			//Desde movimiento incial hasta 0 en vertical
			casilla[aux_row][col].setValor(movimiento);
			casilla[aux_row][col].setImagen(movimiento);
			estadoTablero[aux_row][col] = movimiento;
			aux_row--;
		}
		while (casilla[aux_row][col].getValor() == valor && aux_row > 0) {
			//Desde movimiento incial hasta 0 en vertical
			casilla[aux_row][col].setValor(movimiento);
			casilla[aux_row][col].setImagen(movimiento);
			estadoTablero[aux_row][col] = movimiento;
			aux_row--;
		}
		while (casilla[aux_row][col].getValor() == valor && aux_row > 0) {
			//Desde movimiento incial hasta 0 en vertical
			casilla[aux_row][col].setValor(movimiento);
			casilla[aux_row][col].setImagen(movimiento);
			estadoTablero[aux_row][col] = movimiento;
			aux_row--;
		}
*/

		return estadoTablero;
	}
}
