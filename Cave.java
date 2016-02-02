// Ashish Naik
// COP 3330, Section 2
// Adventure Game program: Cave class

// Import necessary Java functions
import java.util.*;
import java.io.*;

// Create a class based on the filename
public class Cave {
	
	// Create a variable for each the number of rows and the number of collumns
	// Create a variable of the CaveType class to store the current condition of the Cave
	// Create a boolean variable to track whether the cave is marked or not
	// Create a boolean variable to track whether the cave is occupied or not
	protected int vert, horz;
	private CaveType status;
	private boolean mark = false;
	private boolean occupied = false;
	
	// Use a constructor class to specify the coordinates of this cave
	public Cave(int r, int c) {
		
		vert = r;
		horz = c;
		
	}
	
	// Create a static enum class to store information to be used as statuses for the cave
	public static enum CaveType {
	
		BLOCKED, OPEN, PIT, TELEPORT
		
	}
	
	// Use this class to obtain the x-coordinate of this cave
	public int getCol() {
		
		return horz;
	}
		
	// Use this class to obtain the y-coordinate of this cave
	public int getRow() {
		
		return vert;
	}
		
	// Use this class to detect if this cave is Blocked
	public boolean isBlocked() {
		
		if (status == CaveType.BLOCKED) {
			return true;
		}
			
		return false;
	}
	
	// Use this class to detect if this cave is Marked
	public boolean isMarked() {
		
		return mark;
	}
	
	// Use this class to detect if this cave is Occupied
	public boolean isOccupied() {
		
		return occupied;
	}
	
	// Use this class to detect if this cave is Open
	public boolean isOpen() {
		
		if (status == CaveType.OPEN) {
			return true;
		}
			
		return false;
	}
	
	// Use this class to detect if this cave is a Pit
	public boolean isPit() {
		
		if (status == CaveType.PIT) {
			return true;
		}
			
		return false;
	}
	
	// Use this class to detect if this cave is a Teleporter
	public boolean isTeleport() {
		
		if (status == CaveType.TELEPORT) {
			return true;
		}
			
		return false;
	}
	
	// Use this class to set the cave as Blocked
	public void makeBlocked() {
		
		status = CaveType.BLOCKED;
			
	}
	
	// Use this class to set the cave as Open
	public void makeOpen() {
		
		status = CaveType.OPEN;
			
	}
	
	// Use this class to set the cave as a Pit
	public void makePit() {
		
		status = CaveType.PIT;
			
	}
	
	// Use this class to set the cave as a Telporter
	public void makeTeleport() {
		
		status = CaveType.TELEPORT;
			
	}
	
	// Use this class to set the cave as Marked or unMarked
	public void setMarked(boolean set) {
		
		if (set == false) {
			mark = false;
		}
		
		if (set == true) {
			mark = true;
		}
		
	}
		
	// Use this class to set the cave as Occupied or unOccupied
	public void setOccupied (boolean set) {
		
		if (set == false) {
			occupied = false;
		}
		
		if (set == true) {
			occupied = true;
		}
	}
	
}