package edu.cpp.cs.cs141.spyvsninjaassasins;

/**
 * @author AAnthony
 * The enemy class holds the blueprints for constructing enemies that will be
 * placed on the GameBoard grid. Extends the MapObjects superclass so it can
 * be included in the GameBoard. Contains a field to determine whether or not the
 * enemy is alive, and whether or not the enemy is visible to the player.
 */
public class Enemy extends MapObjects{
	private boolean alive;
	
	public Enemy(String type, boolean alive) {
		super(type);
		this.alive = alive;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	@Override
	public String getType() {
		return "Enemy";
	}
	
}
