package edu.cpp.cs.cs141.spyvsninjaassasins;

/**
 * @author AAnthony
 * The GameEngine is in charge of executing code that will maintain/control
 * the games internal functions, numbers, etc. based on the inputs given
 * in the UI.
 */
public class GameEngine {
	private int level;
	private int enemiesAlive;
	
	/**
	 * Method in charge of allowing the user to look in a given direction.
	 * Has a String parameter that is used to tell the program which way the 
	 * user wanted to look.
	 */
	private void look(String direction) {
	}
	
	/**
	 * Method in charge of allowing the user to shoot in any direction.
	 * String argument determines which direction the user wants to shoot
	 * [inputted from the user in the UI].
	 */
	private void shoot(String direction) {
	}
	
	/**
	 * Method in charge of moving the player's position on the board based on the
	 * String argument used when called upon.
	 */
	private void movePlayer(String direction) {
	}
	
	/**
	 * This method is in charge of reading and loading any selected save data.
	 */
	private void loadFile(String fileName) {
	}
	
	/**
	 * This method is in charge of writing the game's current status into a .dat
	 * file with a name specified by the user.
	 */
	private void saveFile(String fileName) {
	}
	
	/**
	 * This method checks whether or not he/she has found the briefcase, whenever
	 * the player has entered one of the nine rooms.
	 */
	private void checkWin() {
	}
	
	/**
	 * After the players choice of movement, this method moves the Enemies based on
	 * their difficulty and scenario [IE. random movement vs. chasing the user (for
	 * hard mode)].
	 */
	private void moveEnemies() {
	}
	
	/**
	 * Checks whether or not an enemy has killed the player. If so, the player will lose
	 * a life and will be spawned back in the bottom left corner; otherwise, this method
	 * will do nothing. 
	 */
	private void checkDeath() {
	}
	
	/**
	 * Checks whether or not the user has lost all lives.
	 */
	private void checkGameOver() {
	}
}
