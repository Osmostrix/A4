// Ashish Naik
// COP 3330, Section 2
// Adventure Game program: Adventurer class

// Import necessary Java functions
import java.util.*;
import java.io.*;

// Create an Adventurer class based off of the Character class
public class Adventurer extends Character  {
	
	// Use a String variable for the name of this character in the game
	public String name = "Lara Croft";
	
	// Use a constructor to call the super class and set this character at the input location
	public Adventurer(Cave initLoc) {
	
			super(initLoc);
	
	}
	
	// Use this class to enter a message that appears when this character changes the board
	public String describeModification() {
		
		String what = "Lara found a teleporter!";
		
		return what;
	}
	
	// Use this class to return the name of this character
	public String getName() {
		
		return name;
		
	}
	
	// Use this class to indicate how the cave is modified by the Adventurer and whether they succeeded in doing so
	public boolean modifyCave(Cave loc) {
		
		// If the Cave spot is a teleporter and is unmarked, let the Adventurer alter it
		if (loc.isTeleport()) {
		
			if(loc.isMarked() == false) {
			
				loc.setMarked(true);
			
			}
			
		}
		
		// If the spot is already marked, leave it be
		return false;
		
	}
	
	// Use this class to specify an override against how the Adventurer is allowed to move
	public boolean move(Cave to) {
		
		// An adventurer cannot occupy the same space as another character, or move into a blocked cave
		if ((to.isBlocked()) || (to.isOccupied())) {
		
			return false;
			
		}
		
		// If it is possible for the Adventurer to move, make a call to the move class in the super class
		return super.move(to);
	}
	



}