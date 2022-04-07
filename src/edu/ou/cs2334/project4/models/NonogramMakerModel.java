package edu.ou.cs2334.project4.models;

import java.io.File;
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
	
	public NonogramMakerModel(File file) {
		Scanner scan = new Scanner(file);
		int rows = scan.nextInt();
		int cols = scan.nextInt();
	}
	
	public NonogramMakerModel(String filename) {
		
	}
	
	public boolean[] getGrid() {
		return Arrays.copyOf(grid, grid.length);
	}
	
	public boolean getCell(int rowIdx, int colIdx) {
		
	}
	
	public void setCell(int rowIdx, int colIdx, boolean state) {
		
	}
	
	public int getNumRows() {
		
	}
	
	public int getNumCols() {
		
	}
	
	public static List<Integer> project(boolean[] cells) {
		
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
