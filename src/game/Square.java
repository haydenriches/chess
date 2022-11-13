package game;

import pieces.*;

public class Square {
	final int rank, file;
	Piece piece;
	
	public Square(int rank, int file, Piece piece) {
		this.rank = rank;
		this.file = file;
		this.piece = piece;
	}
	
	/**
	 * Set the piece at this square.
	 */
	public void setPiece(Piece p) {
		piece = p;
	}
	
	/**
	 * Return the piece on this Square
	 * 
	 * @return this square's piece
	 */
	public Piece getPiece() {
		return piece;
	}
	
	public int getRank() {
		return rank;
	}
	
	public int getFile() {
		return file;
	}
}
