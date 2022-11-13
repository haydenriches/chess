package game;

import pieces.*;

/**
 * Handles the mechanics of the game.
 * 
 * @author haydenriches
 *
 */
public class Game {
	Player white, black;
	Board board;
	
	public Game() {
		board = new Board();
		Player white = new Player(Colour.WHITE);
		Player black = new Player(Colour.BLACK);
	}
	
}
