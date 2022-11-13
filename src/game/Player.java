package game;

import pieces.Colour;

/**
 * A player in the chess game. The Game class
 * creates two players, White and Black.
 * 
 * As per the rules of Chess, players can only move
 * pieces of their corresponding colour.
 * 
 * @author haydenriches
 *
 */
public class Player {
	private Colour colour;
	
	/**
	 * Creates a new Player with the default chess
	 * pieces
	 */
	public Player(Colour colour) {
		this.colour = colour;
	}
}
