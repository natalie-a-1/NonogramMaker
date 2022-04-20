package edu.ou.cs2334.project4.views;

import java.util.ArrayList;
import javafx.geometry.Pos;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

/**
 * This class constructs each cell into a visible and 
 * fully automated toggle button.
 * 
 * @author Collaboration of Natalie Hill and Keon Moradi
 * @version 0.1
 */
public class CellGridView {

	private ArrayList<ToggleButton> gridButtons = new ArrayList<ToggleButton>();
	private GridPane gridPane;
	private int numRows;
	private int numCols;

	/**
	 * This is the constructor for a cell grid.
	 * 
	 * @param numRows    total number of rows in the grid
	 * @param numCols    total number of columns in the grid
	 * @param cellLength the length of each cell
	 */
	public CellGridView(int numRows, int numCols, int cellLength) {
		this.numCols = numCols;
		this.numRows = numRows;
		gridPane = new GridPane();
		gridPane.setMinSize(numRows, numCols);
		gridPane.setAlignment(Pos.CENTER);

	}

	/**
	 * This method changes each cell into a toggle button.
	 * 
	 * @param numRows    the rows to search through
	 * @param numCols    the columns to search through
	 * @param cellLength the length of each cell
	 */
	public void initButtons(int numRows, int numCols, int cellLength) {
		this.numRows = numRows;
		this.numCols = numCols;
		gridButtons.clear();
		gridPane.getChildren().clear();

		for (int j = 0; j < numRows; j++) {
			for (int i = 0; i < numCols; i++) {
				ToggleButton temp = new ToggleButton();
				gridPane.add(temp, i, j);
				gridButtons.add(temp);
			}
		}

		for (ToggleButton b : gridButtons) {
			b.setMinSize(cellLength, cellLength);
			b.setMaxSize(cellLength, cellLength);
			b.setPrefSize(cellLength, cellLength);
		}
	}

	/**
	 * This method retrieves the total number of rows in the grid.
	 * 
	 * @return total number of rows in the grid
	 */
	public int getNumRows() {
		return numRows;
	}

	/**
	 * This method retrieves the total number of columns in the grid.
	 * 
	 * @return total number of columns in the grid
	 */
	public int getNumCols() {
		return numCols;
	}

	/**
	 * This method finds the specific toggle button to be returned.
	 * 
	 * @param row the row to be searched
	 * @param col the column to be searched
	 * @return the toggle button at an index in the grid
	 */
	public ToggleButton getToggleButtons(int row, int col) {
		return this.gridButtons.get((row * numCols) + col);

	}

	/**
	 * This method retrieves the whole gridPane.
	 * 
	 * @return the gridPane
	 */
	public Pane getPane() {
		return gridPane;
	}

}
