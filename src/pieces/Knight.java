package pieces;

public class Knight implements Piece {
	int rank, file;
	Colour colour;
	
	public Knight(int rank, int file, Colour colour) {
		this.rank = rank;
		this.file = file;
		this.colour = colour;
	}
}
