package edu.ou.cs2334.project4.models;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NonogramMakerModel {

	private static char EMPTY_CELL_CHAR = '0';
	private static char FILLED_CELL_CHAR = '1';
	private int numRows;
	private int numColumns;
	private boolean[] grid;

	public NonogramMakerModel(int numRows, int numColumns) {
		this.numColumns = numColumns;
		this.numRows = numRows;
		this.grid = new boolean[this.numColumns + this.numRows];
	}

	public NonogramMakerModel(File file) throws FileNotFoundException {
		Scanner scan = new Scanner(file);
		numRows = scan.nextInt();
		numColumns = scan.nextInt();
		for (int i = 0; i < (numRows + numColumns); i++) {
			scan.nextLine();
		}
		this.grid = new boolean[this.numColumns + this.getNumCols()];
		for(int i = 0; i < numRows; i++) {
			for (int j = 0; j < numColumns; j++) {
				if (j == EMPTY_CELL_CHAR) {
					grid[j] = false;
				} else {
					grid[j] = true;
				}
			}
			scan.nextLine();
		}
		scan.close();
	}

	public NonogramMakerModel(String filename) throws FileNotFoundException {
		new NonogramMakerModel(new File(filename));
	}

	public boolean[] getGrid() {
		return Arrays.copyOf(grid, grid.length);
	}

	public boolean getCell(int rowIdx, int colIdx) {
		return grid[rowIdx + colIdx];
	}

	public void setCell(int rowIdx, int colIdx, boolean state) {
		grid[rowIdx + colIdx] = state;
	}

	public int getNumRows() {
		return numRows;
	}

	public int getNumCols() {
		return numColumns;
	}

	public static List<Integer> project(boolean[] cells) {
		List<Integer> temp = new ArrayList<Integer>();
		for(int i = 0; i < cells.length; i++) {
			if (cells[i] == false) {
				temp.add(0);
			} else {
				temp.add(1);
			}
		}
		return temp;
	}

	public List<Integer> projectRow(int rowIdx) {

	}

	public List<Integer> projectCol(int colIdx) {

	}

	public void saveToFile(String filename) {

	}

	public String toString() {

	}
}
