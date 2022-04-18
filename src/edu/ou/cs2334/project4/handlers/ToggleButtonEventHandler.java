/**
 * This class decides the state of a toggle button at a given moment.
 * 
 * @author Natalie Hill
 * @version 0.1
 */

package edu.ou.cs2334.project4.handlers;

import edu.ou.cs2334.project4.models.NonogramMakerModel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ToggleButton;

public class ToggleButtonEventHandler implements EventHandler<ActionEvent> {

	private NonogramMakerModel model;
	private int rowIdx;
	private int colIdx;

	/**
	 * This constructor finds the cell in a given model.
	 * 
	 * @param model  NonogramMakerModel to be used
	 * @param rowIdx index of the row in NonogramMakerModel
	 * @param colIdx index of the column in NonogramMakerModel
	 */
	public ToggleButtonEventHandler(NonogramMakerModel model, int rowIdx, int colIdx) {
		this.rowIdx = rowIdx;
		this.colIdx = colIdx;
		this.model = model;
	}

	/**
	 * This method gets the state of the cell.
	 * 
	 * @param event ActionEvent to take care of the toggle button
	 */
	public void handle(ActionEvent event) {
		ToggleButton temp = (ToggleButton) event.getSource();
		model.setCell(rowIdx, colIdx, temp.isSelected());
	}

}
