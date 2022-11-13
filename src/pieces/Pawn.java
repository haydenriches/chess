package pieces;

public class Pawn implements Piece {
	int rank, file;
	Colour colour;
	
	public Pawn(int rank, int file, Colour colour) {
		this.rank = rank;
		this.file = file;
		this.colour = colour;
	}
}
