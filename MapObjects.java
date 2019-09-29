/**
 * 
 */
package edu.cpp.cs.cs141.spyvsninjaassasins;

/**
 * @author AAnthony
 * The MapObjects class is a superclass that keeps all the other game elements
 * (Player, Enemy, Power-Ups, etc.) under one umbrella class, so that they can
 * all be put into the same multi-dimensional array that is the GameBoard.
 */
public abstract class MapObjects {
	String type = "";
	Boolean visible = false;
	
	public MapObjects(String type) {
		this.type = type;
		visible = false;
	}
	
	public Boolean getVisible() {
		return visible;
	}

	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

	public abstract String getType();
}
