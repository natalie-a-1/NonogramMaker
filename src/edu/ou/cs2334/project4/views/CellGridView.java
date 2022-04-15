package edu.ou.cs2334.project4.views;

import java.util.ArrayList;

import javafx.geometry.Pos;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;

public class CellGridView {
	
	private ArrayList<ToggleButton> gridButtons = new ArrayList<ToggleButton>();
	private GridPane gridPane;
	private int numRows;
	private int numCols;
	
	public CellGridView(int numRows, int numCols, int cellLength) {
		this.numCols = numCols;
		this.numRows = numRows;
		GridPane gridPane = new GridPane();
		gridPane.setGridLinesVisible(true);
		
		for (int i = 0; i < numCols; i++) {
			ColumnConstraints c = new ColumnConstraints();
			c.setPercentWidth(100/numCols);
			gridPane.getColumnConstraints().add(c);
		}
		for (int i = 0; i < numRows; i++) {
			RowConstraints r = new RowConstraints();
			r.setPercentHeight(100/numRows);
			gridPane.getRowConstraints().add(r);
		}
		
		gridPane.setAlignment(Pos.CENTER);

	}
	
	public void initButtons(int numRows, int numCols, int cellLength) {
		gridButtons.clear();
		
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
