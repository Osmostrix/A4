// Ashish Naik
// COP 3330, Section 2
// Adventure Game program: Board class

// Import necessary Java functions
import java.util.*;
import java.io.*;
import java.util.Random;

// Create class based on filename
public class Board {

	// Create a 10x10 grid of Caves
	// Create a variable for the number of rows
	// Create a variable for the number of collumns
	public Cave[][] grid;
	public int yend;
	public int xend;
	
	// Use a constructor to build the board based off of the given parameters
	public Board(int rows, int cols) {
	
		// Construct the grid using the input values
		grid = new Cave[rows][cols];
		
		// Apply the input value to the row variable
		// Apply the input value to the collumn variable
		yend = rows;
		xend = cols;
		
		// Use a random number generator to decide how the rest of the cave will be filled
		// Create a variable to store each number generated
		Random filler = new Random();
		int holder = filler.nextInt(100);
		
		// Use a loop to fill each grid point
		// Fill all 'x' coordinates
		for (int i = 0; i<cols; i++) {

			// Fill all 'y' coordinates
			for (int j = 0; j<rows; j++) {
			
				grid[i][j] = new Cave(i,j);

				// Obtain a value for current grid point
				holder = filler.nextInt(100);

				// Make sure value is valid, otherwise make safe
				if (holder != 0) {
					
					// For values between 1-10, keep the space safe
					// For values between 11-20, make teleport spot
					// For values between 21-60, block the path
					// For values between 61-100, place a pitfall
					if (holder<=10) {
						grid[i][j].makeOpen();
					}
					else if (holder<=20) {
						grid[i][j].makeTeleport();
					}
					else if (holder<=60) {
						grid[i][j].makeBlocked();
					}
					else if (holder<=100) {
						grid[i][j].makePit();
					}
				}
				else {
					grid[i][j].makeOpen();
				}
			}

		}
		
		// Make sure that the starting and finishing point are clear
		grid[0][0].makeOpen();
		grid[rows-1][cols-1].makeOpen();
	
	}
	
	// Use this class to return the Cave at the specified coordinates
	public Cave getCave(int r, int c) {
	
		return grid[r][c];
	}
	
	// Use this class to return a Random, Unoccupied, Open location within the grid of Caves
	public Cave getUnoccupiedOpenLocation() {
		
		// Create a random number generator to obtain random values within the grid
		// Use a variable to store the x-values
		// Use a variable to store the y-values
		// Use a variable to indicate a finishing statement
		Random find = new Random();
		int foundx = 0;
		int foundy = 0;
		int check = 0;
		
		// Make a while-loop based on the finishing statement
		// Check the cave at the indicated coordinates to insure it is within the grid, open, and unoccupied
		// Repeat process until an appropriate set of coordinates are obtained
		while (check != 1) {
			
			// Intake a random x-value
			// Intake a random y-value
			foundx = find.nextInt(xend-1);
			foundy = find.nextInt(yend-1);
			
			// If the appropriate conditions aren't met, repeat the process
			// If the appropriate conditons are met, satisfy the finishing statment
			if (((foundx == xend-1) && (foundy == yend-1)) || (grid[foundy][foundx].isOpen() == false) || (grid[foundy][foundx].isOccupied())) {
				continue;
			}
			else {
				check = 1;
			}
			
			
			
		}
		
		// After confirming the proper conditions have been met, return the coordinates found
		return grid[foundx][foundy];
	}
	
	// Use this class to confirm that the input coordinates are within the Board grid
	public boolean ok(int r, int c) {
		
		// If the rows specified are a negative integer, or beyond the Board, return false
		if ((r >= yend) || (r < 0)) {
			return false;
		}
		
		// If the collumns specified are a negative integer, or beyond the Board, return false
		if ((c >= xend) || (c < 0)) {
			return false;
		}
		
		// If there are no problems, return true
		return true;
	}
	
	
	



}