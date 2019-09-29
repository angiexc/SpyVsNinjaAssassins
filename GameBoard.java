package edu.cpp.cs.cs141.spyvsninjaassasins;

/**
 * @author AAnthony
 * This class is in charge of keeping and controlling any changes made to
 * the GameBoard. It holds all of the spawned MapObjects in a 2-D array,
 * size 9 x 9. 
 */
public class GameBoard {
	private static int BOARD_SIZE = 9;
	private MapObjects[][] grid = new MapObjects[BOARD_SIZE][BOARD_SIZE];
	
	/**
	 * This method generates a new board with the player in the bottom right,
	 * 5 randomly spawned in enemies, 3 randomly spawned power-ups, and 1
	 * briefcase spawned in 1 of the 9 rooms.
	 */
	public void generateBoard() {
	}
	
	/**
	 * @param x
	 * @param y
	 * Checks the location grid[x][y] for any existing objects and returns
	 * the type of the object.
	 */
	public String checkForObject(int x, int y) {
		return "";
	}

	/**
	 * Takes an object at grid[x][y] and moves recolates said object to the 
	 * proper adjacent space. Works by copying the object into the new location
	 * and deleting the one that exists in the old location.
	 */
	public void moveObject() {
	}
	
	/**
	 * Sets the visibility of an object on the board, based on whether or not
	 * the user can see it.
	 */
	public void setVisibility() {
	}
	
	/**
	 * Nullifies all spots on the grid, so as to let the program generate a new
	 * board without error.
	 */
	public void deleteBoard() {
	}
}
