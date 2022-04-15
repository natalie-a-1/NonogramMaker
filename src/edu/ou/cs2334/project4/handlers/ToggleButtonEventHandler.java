package edu.ou.cs2334.project4.handlers;

import java.awt.event.ActionEvent;

import edu.ou.cs2334.project4.models.NonogramMakerModel;
import javafx.scene.control.ToggleGroup;

public class ToggleButtonEventHandler {
	
	private NonogramMakerModel model;
	private int rowIdx;
	private int colIdx;
	
	public ToggleButtonEventHandler(NonogramMakerModel model, int rowIdx, int colIdx) {
		this.rowIdx = rowIdx;
		this.colIdx = colIdx;
		this.model = model;
		model.getCell(rowIdx, colIdx); //??
	}
	
	public void Handle(ActionEvent event) {
		if (model.getCell(rowIdx, colIdx)) {
			model.setCell(rowIdx, colIdx, false);
		} else {
			model.setCell(rowIdx, colIdx, true);
		}
	}

}
