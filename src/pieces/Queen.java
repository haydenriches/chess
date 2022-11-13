package pieces;

public class Queen implements Piece {
	int rank, file;
	Colour colour;
	
	public Queen(int rank, int file, Colour colour) {
		this.rank = rank;
		this.file = file;
		this.colour = colour;
	}
}
