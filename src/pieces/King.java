package pieces;

public class King implements Piece {
	int rank, file;
	Colour colour;
	
	public King(int rank, int file, Colour colour) {
		this.rank = rank;
		this.file = file;
		this.colour = colour;
	}
}
