package pieces;

public class Rook implements Piece {
	int rank, file;
	Colour colour;
	
	public Rook(int rank, int file, Colour colour) {
		this.rank = rank;
		this.file = file;
		this.colour = colour;
	}
}
