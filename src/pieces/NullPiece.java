package pieces;

public class NullPiece implements Piece {
	int rank, file;
	Colour colour;
	
	public NullPiece(int rank, int file, Colour colour) {
		this.rank = rank;
		this.file = file;
		this.colour = null;
	}	
}
