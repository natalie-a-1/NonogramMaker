package edu.ou.cs2334.project4.views;

import java.util.ArrayList;

import javafx.scene.control.ToggleButton;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class CellGridView {
	
	private ArrayList<ToggleButton> gridButtons = new ArrayList<ToggleButton>();
	private GridPane gridPane;
	private int numRows;
	private int numCols;
	
	public CellGridView(int numRows, int numCols, int cellLength) {
		this.numCols = numCols;
		this.numRows = numRows;

	}
	
	public void initButtons(int numRows, int numCols, int cellLength) {
		
	}
	
	public int getNumRows() {
		return numRows;
	}
	
	public int getNumCols() {
		return numCols;
	}
	
	public ToggleButton getToggleButtons(int row, int col) {
		
	}
	
	public Pane getPane() {
		return gridPane;
	}

}
