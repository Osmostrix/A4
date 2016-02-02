// Ashish Naik
// COP 3330, Section 2
// Adventure Game program: Filler class

// Import necessary Java functions
import java.util.*;
import java.io.*;

// Create a Filler class from the Character class
public class Filler extends Character {
	
	// Use a string variable to store this character's name 
	public String name = "Captain Olimar";
	
	// Use a constructor to call the super class and set the location of this character
	public Filler(Cave initLoc) {
	
			super(initLoc);
	
	}
	
	// Use this class to display a message about how the Filler modified the cave
	public String describeModification() {
		
		String what = "Captain Olimar filled the Pit";
		
		return what;
	}
	
	// Use this class to return the name of the 
	public String getName() {
		
		return name;
		
	}
	
	// Use this class to specify how the Filler can modify the cave and if they were successful in doing so
	public boolean modifyCave(Cave loc) {
		
		// If the input location is a pit, let the Filler fill it
		if (loc.isPit()) {
		
			loc.makeOpen();
			
			return true;
		}
		
		// Otherwise, leave it be
		return false;
	}
	
	// Use this class to indicate overrides to the movement abilities of the Filler
	public boolean move(Cave to) {
		
		// The filler canno move past a point that is Blocked or occupied by another character
		if ((to.isBlocked()) || (to.isOccupied())) {
		
			return false;
			
		}
		
		// If there are no obstacles, make a call the move class in the super class and let the Filler move
		return super.move(to);
	}

}