package edu.cpp.cs.cs141.spyvsninjaassasins;

import java.util.Scanner;

/**
 * @author AAnthony
 * The UI class is in charge of all text inputted by the user or displayed on the screen.
 * The UI will be constructed with a new GameEngine to run the code that controls the
 * internal game mechanics and a Scanner that will be used throughout the class to
 * allow the user to input their choices/moves in the game.
 */
public class UI {
	private GameEngine game = null;
	private Scanner sc = null;
	
	public UI (GameEngine game) {
		sc = new Scanner(System.in);
		this.game = game;
	}
	
	/**
	 * This method is used to initiate the game. The method will not reach its end
	 * unless the boolean quit becomes true, which will be at the control of the 
	 * user. Otherwise, the method will return back to opening the main menu while
	 * the boolean remains false.
	 */
	public void startGame() {
	}
	
	/**
	 * Displays the main menu to the user and returns whatever choice the user inputs,
	 * represented by some integer.
	 */
	private int openMainMenu() {
		return 0;
	}
	
	/**
	 * Displays the map to the user. Only shows the rooms, the player, and anything
	 * within the players range; if debug mode is on, everything on the map will be
	 * visible.
	 */
	private void displayBoard() {
	}
	
	/**
	 * This method is in charge of going through the process of a player's turn.
	 * It will call to multiple methods throughout the UI and the GameEngine that will
	 * account for functions such as moving the player, looking in a direction, shooting,
	 * etc.
	 */
	private void executeTurn() {
	}
	
	/**
	 * Prompts the user to input one of the given choices [Up, Down, Left, Right, Look,
	 * Shoot, Save, Quit]. Takes the user's input and returns it as a string to the
	 * method it was called from.
	 */
	private String promptMove() {
		return "";
	}
	
	/**
	 * Prompts the user to input the title of their previous save data, then returns
	 * said input to the method it was called from.
	 */
	private String inputSaveFile() {
		return "";
	}
	
	/**
	 * Prompts the user to input a new name for the game progress they want to save. Loops 
	 * until the user inputs a proper file name. If a user inputs an already existing file
	 * name, the user will be asked whether or not they want to overwrite the previous
	 * file. [Note: The process of actually saving the data will be in the GameEngine's
	 * saveFile() method.]
	 */
	private void saveNewFile() {
	}
	
	/**
	 * Displays that the user has finished the level and waits until the user is ready to
	 * generate a new board for the next level.
	 */
	private void displayEndLevel() {
	}
	
	/**
	 * Displays that the user has lost all of his/her lives and has now lost the game;
	 * whenever the user presses enter, it will return them to the main menu.
	 */
	private void gameOver() {
	}
	
	/**
	 * Opens a how-to-play manual for users new to the game.
	 */
	private void displayHowToPlay() {
	}

	/**
	 * This method is called upon with an int parameter to determine which error
	 * to display to the user.
	 */
	private void displayError(int errorCode) {	
	}
}
