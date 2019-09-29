package edu.cpp.cs.cs141.spyvsninjaassasins;

/**
 * @author AAnthony
 * This class holds the data used for the construction of a Player object.
 * The fields below are encapsulated within the Player object for the
 * GameEngine to use throughout the duration of the game. The class also
 * extends the superclass MapObjects so that it can be included in the
 * GameBoard grid along with other MapObjects.
 */
public class Player extends MapObjects {
	private int lives;
	private int bullets;
	private boolean invincibility;
	public Player(String type, int lives, int bullets, boolean invincibility) {
		super(type);
		this.lives = lives;
		this.bullets = bullets;
		this.invincibility = invincibility;
	}
	
	public int getLives() {
		return lives;
	}
	
	public void setLives(int lives) {
		this.lives = lives;
	}
	
	public int getBullets() {
		return bullets;
	}
	
	public void setBullets(int bullets) {
		this.bullets = bullets;
	}
	
	public boolean isInvincibility() {
		return invincibility;
	}
	
	public void setInvincibility(boolean invincibility) {
		this.invincibility = invincibility;
	}

	@Override
	public void setVisible(Boolean visible) {
		super.setVisible(true);
	}

	@Override
	public String getType() {
		return "Player";
	}
}
