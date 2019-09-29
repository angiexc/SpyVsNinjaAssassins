/**
 * 
 */
package edu.cpp.cs.cs141.spyvsninjaassasins;

/**
 * @author AAnthony
 * Class for the shield power-up object.
 */
public class Shield extends MapObjects {

	public Shield(String type) {
		super(type);
	}

	@Override
	public String getType() {
		return "Shield";
	}

}
