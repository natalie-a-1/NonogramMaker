package edu.ou.cs2334.project4.handlers;

import java.awt.event.ActionEvent;

import edu.ou.cs2334.project4.models.NonogramMakerModel;
import javafx.scene.control.ToggleGroup;

public class ToggleButtonEventHandler {
	
	private NonogramMakerModel model;
	private int rowIdx;
	private int colIdx;
	
	public ToggleButtonEventHandler(NonogramMakerModel model, int rowIdx, int colIdx) {
	}
	
	public void Handle(ActionEvent event) {
		ToggleGroup group = new ToggleGroup();
	}

}
