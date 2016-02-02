// Ashish Naik
// COP 3330, Section 2
// Adventure Game program: Character class

// Import necessary Java functions
import java.util.*;
import java.io.*;

// Use this abstract class to define the three different characters at a basic level
public abstract class Character implements CaveWorker {
	
	// All characters will need their locations tracked
	protected Cave location;
	
	// Use a constructor to place each character on the grid
	// Make sure the spot is open and marked as Occupied
	public Character(Cave initLoc) {
		
		initLoc.makeOpen();
		initLoc.setOccupied(true);
		this.location = initLoc;
	
	}
	
	// Use this class to return the Cave where the character is currently located
	public Cave getLocation() {
	
		return location;
	
	}
	
	// Create an abstract to be defined in each character's class specifically
	public abstract String getName();
	
	// Use this class to specify the basic function by which a character moves across the board
	public boolean move(Cave to) {
		
		// Set the old location to unoccupied
		location.setOccupied(false);
		
		// Use the input value as the new location
		location = to;
		
		// Set the new location as occupied
		location.setOccupied(true);
		
		return true;
	}
	
	
	
}