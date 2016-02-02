// Ashish Naik
// COP 3330, Section 2
// Adventure Game program: Miner class

// Import necessary Java functions
import java.util.*;
import java.io.*;

// Create a Miner class based on the Character class
public class Miner extends Character {
	
	// Use a string variable to store the name of this Character in the game
	public String name = "BomberMan";
	
	// Use a constructor to call the super class and set the location of this character
	public Miner(Cave initLoc) {
	
			super(initLoc);
	
	}
	
	// Use this class to return a string describing how the Miner altered the Board
	public String describeModification() {
		
		String what = "BomberMan cleared the cave-in";
		
		return what;
	}
	
	// Use this class to return the name of this character in the game
	public String getName() {
		
		return name;
		
	}
	
	// Use this class to specify how the Miner can modify a cave and whether or not they succeeded in doing so
	public boolean modifyCave(Cave loc) {
		
		// If the input cave is blocked, clear the path
		if (loc.isBlocked()) {
		
			loc.makeOpen();
			
			return true;
		}
		
		// Otherwise, leave it be
		return false;
	}
	
	// Use this class to indicate the overrides to the Miner's movement
	public boolean move(Cave to) {
		
		// The miner can't move into spaces already occupied by other characters
		if (to.isOccupied()) {
		
			return false;
			
		}
	
		return super.move(to);
	}

}