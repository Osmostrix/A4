// Ashish Naik
// COP 3330, Section 2
// Adventure Game program: Cave Worker interface

// Import necessary Java functions
import java.util.*;
import java.io.*;

// Create an interface class to store the prototypes of how each character will change its environment
public interface CaveWorker {
	
	// This class will be used to display messages about changes made to the Board
	public String describeModification();
	
	// This class will be used to make changes to the board and return a boolean that indicates whether the changes were made
	public boolean modifyCave(Cave loc);
	
	
}