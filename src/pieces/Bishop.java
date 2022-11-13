package pieces;

public class Bishop implements Piece {
	int rank, file;
	Colour colour;
	
	public Bishop(int rank, int file, Colour colour) {
		this.rank = rank;
		this.file = file;
		this.colour = colour;
	}
}
