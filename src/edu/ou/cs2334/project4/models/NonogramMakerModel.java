/*
 * This is the NonogramMakerModel class. It is designed to create a model NonogramMaker
 * with a file, string  or just by entering the number of rows and coumns. 
 * 
 * @author Natalie Hill
 * @version 0.1
 * 
 */

package edu.ou.cs2334.project4.models;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;

public class NonogramMakerModel {

	/**
	 * Represents an empty cell state
	 */

	private static char EMPTY_CELL_CHAR = '0';

	/**
	 * Represents an filled cell state
	 */

	private static char FILLED_CELL_CHAR = '1';

	/**
	 * Represents the total number of rows
	 */

	private int numRows;

	/**
	 * Represents the total number of columns
	 */

	private int numCols;

	/**
	 * Array of boolean values representing either a filled or unfilled state
	 */

	private boolean[] grid;

	/**
	 * Constructor for the NonogramMakerModel
	 * 
	 * @param numRows number of rows the model should have
	 * @param numCols number of columns the model should have
	 * @throws IllegalArgumentException throws exception if either numRows or
	 *                                  numCols is equal to or less than 0
	 */

	public NonogramMakerModel(int numRows, int numCols) {
		if (numRows <= 0 || numCols <= 0) {
			throw new IllegalArgumentException();
		} else {
			this.numCols = numCols;
			this.numRows = numRows;
			this.grid = new boolean[this.numRows * this.numCols];
		}
	}

	/**
	 * Constructor for the NonogramMakerModel
	 * 
	 * @param file the file to be read
	 * @throws FileNotFoundException throws exception if the file is not found or
	 *                               unable to be opened
	 */

	public NonogramMakerModel(File file) throws FileNotFoundException {
		Scanner scan = new Scanner(file);
		numRows = scan.nextInt();
		numCols = scan.nextInt();
		for (int i = 0; i < (numRows + numCols + 1); i++) {
			scan.nextLine();
		}
		this.grid = new boolean[this.numCols * this.numRows];

		for (int i = 0; i < numRows; i++) {
			String line_input = scan.nextLine();

			for (int j = 0; j < line_input.length(); j++) {
				grid[(numCols * i) + j] = (line_input.charAt(j) == FILLED_CELL_CHAR);
			}

		}
		scan.close();
	}

	/**
	 * Constructor for the NonogramMakerModel
	 * 
	 * @param filename String to be converted to file and used to make
	 *                 NonogramMakerModel
	 * @throws FileNotFoundException throws exception of the file is not found or
	 *                               unable to be opened
	 */

	public NonogramMakerModel(String filename) throws FileNotFoundException {
		this(new File(filename));
	}

	/**
	 * Retrieves the boolean array values in grid
	 * 
	 * @return an array of boolean values
	 */

	public boolean[] getGrid() {
		return Arrays.copyOf(grid, grid.length);
	}

	/**
	 * Returns the state of a certain cell inside the grid boolean array
	 * 
	 * @param rowIdx the index inside a row of grid
	 * @param colIdx the index inside a column of grid
	 * @return Boolean value that represents the state of a cell in grid
	 */

	public boolean getCell(int rowIdx, int colIdx) {
		return grid[(numCols * rowIdx) + colIdx];
	}

	/**
	 * Sets the value of a certain cell to the given state
	 * 
	 * @param rowIdx the index inside a row of grid
	 * @param colIdx the index inside a column of grid
	 * @param state  Boolean value that represents the state of a cell in grid
	 */

	public void setCell(int rowIdx, int colIdx, boolean state) {
		grid[(numCols * rowIdx) + colIdx] = state;
	}

	/**
	 * Retrieves the total number of rows in the grid
	 * 
	 * @return the number of rows in the given grid
	 */

	public int getNumRows() {
		return numRows;
	}

	/**
	 * Retrieves the total number of columns in the grid
	 * 
	 * @return the number of columns in the grid
	 */

	public int getNumCols() {
		return numCols;
	}

	/**
	 * Creates a projection of the grid with Integer values given boolean values
	 * 
	 * @param cells an array of boolean values
	 * @return List of 1's (filled state) and 0's (unfilled state)
	 */

	public static List<Integer> project(boolean[] cells) {
		List<Integer> temp = new ArrayList<Integer>();
		int count = 0;
		for (int i = 0; i < cells.length; i++) {
			if (cells[i] == true) {
				count++;
			} else if (cells[i] == false) {
				if (count != 0) {
					temp.add(count);
				}
				count = 0;
			}
		}
		if (count > 0) {
			temp.add(count);
		}

		if (temp.size() == 0) {
			temp.add(0);
		}
		return temp;
	}

	/**
	 * Creates a projection of the grid's row with Integer values given boolean
	 * values
	 * 
	 * @param rowIdx the row to project
	 * @return List of 1's (filled state) and 0's (unfilled state)
	 */

	public List<Integer> projectRow(int rowIdx) {
		boolean[] temp = new boolean[getNumCols()];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = getCell(rowIdx, i);
		}
		return project(temp);
	}

	/**
	 * Creates a projection of the grid's column with Integer values given boolean
	 * values
	 * 
	 * @param colIdx the column to project
	 * @return List of 1's (filled state) and 0's (unfilled state)
	 */

	public List<Integer> projectCol(int colIdx) {
		boolean[] temp = new boolean[getNumRows()];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = getCell(i, colIdx);
		}
		return project(temp);
	}

	/**
	 * Saves the program's input to a file
	 * 
	 * @param filename the name of the file to be saved
	 * @throws FileNotFoundException throws exception if the file is not found or
	 *                               can not be opened
	 */

	public void saveToFile(String filename) throws FileNotFoundException {
		PrintWriter temp = new PrintWriter(filename);
		temp.print(toString());
		temp.close();

	}

	/**
	 * Takes in the projection of the gris's rows, columns and states to create a
	 * string representation
	 * 
	 * @return a string representation of the NonogramMakerModel
	 */

	public String toString() {
		StringJoiner sj = new StringJoiner("", "", "");
		List<Integer> temp = new ArrayList<Integer>();
		Integer count = 0;
		int counter = 0;
		int cols = numCols;
		String nums = numRows + " " + numCols + System.lineSeparator();
		for (int i = 0; i < numRows; i++) {
			temp = projectRow(i);
			count = temp.size();

			for (int j = 0; j < count - 1; j++) {
				nums = nums + temp.get(j) + " ";

			}
			nums = nums + temp.get(count - 1);
			nums = nums + System.lineSeparator();
		}
		for (int i = 0; i < numCols; i++) {
			temp = projectCol(i);
			count = temp.size();
			for (int j = 0; j < count - 1; j++) {
				nums = nums + temp.get(j) + " ";
			}
			nums = nums + temp.get(count - 1);
			nums = nums + System.lineSeparator();
		}

		for (int i = 0; i < grid.length; i++) {
			if (grid[i]) {
				sj.add("1");
			} else if (!grid[i]) {
				sj.add("0");
			}
			counter++;

			if (counter == cols && cols < (numRows * numCols)) {
				sj.add(System.lineSeparator());
				cols += numCols;
			}
		}
		return nums + sj;
	}
}
