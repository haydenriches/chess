package game;

import pieces.*;

public class Board {
	int files, ranks;
	Square[][] squares;
	
	/**
	 * Create a new Board object.
	 * A board consists of 64 Square objects.
	 * 
	 * The board is instantiated using an existing list of squares to allow for
	 * the reloading of games after future development.
	 */
	public Board(Square[][] loadSquares) {
		files = 8;
		ranks = 8;
		
		for (int i=0; i<8; i++) {
			for (int j=0; j<8; j++) {
				setSquare(squares[i][j], squares[i][j].getPiece());
			}
		}
	}
	
	// default constructor
	public Board() {
		files = 8;
		ranks = 8;
		
		defaultBoard();
	}
	
	/**
	 * Update a square on the Board.
	 * 
	 * @param p
	 */
	public void setSquare(Square s, Piece p) {
		squares[s.getRank()][s.getFile()].setPiece(p);
	}
	
	public int getRank() {
		return ranks;
	}
	
	public int getFile() {
		return files;
	}
	
	private void defaultBoard() {
		// create the pawns
		for (int rank=1; rank<=8; rank++) {
			squares[rank][2] = new Square(rank, 2, new Pawn(rank, 2, Colour.WHITE));
			squares[rank][7] = new Square(rank, 7, new Pawn(rank, 2, Colour.BLACK));
		}
		
		// create the Rooks
		squares[1][1] = new Square(1, 1, new Rook(1, 1, Colour.WHITE));
		squares[1][8] = new Square(1, 8, new Rook(1, 8, Colour.BLACK));
		squares[8][1] = new Square(8, 1, new Rook(8, 1, Colour.WHITE));
		squares[8][8] = new Square(8, 8, new Rook(8, 8, Colour.BLACK));
		
		// create the Knights
		squares[2][1] = new Square(2, 1, new Knight(2, 1, Colour.WHITE));
		squares[2][8] = new Square(2, 8, new Knight(2, 8, Colour.BLACK));
		squares[7][1] = new Square(7, 1, new Knight(7, 1, Colour.WHITE));
		squares[7][8] = new Square(7, 8, new Knight(7, 8, Colour.BLACK));
		
		// create the Bishops
		squares[3][1] = new Square(3, 1, new Bishop(3, 1, Colour.WHITE));
		squares[3][8] = new Square(3, 8, new Bishop(3, 8, Colour.BLACK));
		squares[6][1] = new Square(6, 1, new Bishop(6, 1, Colour.WHITE));
		squares[6][8] = new Square(6, 8, new Bishop(6, 8, Colour.BLACK));
		
		// create the Kings
		squares[5][1] = new Square(5, 1, new King(5, 1, Colour.WHITE));
		squares[5][8] = new Square(5, 8, new King(5, 8, Colour.BLACK));
		
		// create the Queens
		squares[4][1] = new Square(4, 1, new Queen(4, 1, Colour.WHITE));
		squares[4][8] = new Square(4, 8, new Queen(4, 8, Colour.BLACK));
	}
}
