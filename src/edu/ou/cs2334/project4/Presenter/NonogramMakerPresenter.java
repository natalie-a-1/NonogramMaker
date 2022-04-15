package edu.ou.cs2334.project4.Presenter;

import java.awt.Window;
import java.io.File;

import edu.ou.cs2334.project4.interfaces.Openable;
import edu.ou.cs2334.project4.interfaces.Saveable;
import edu.ou.cs2334.project4.models.NonogramMakerModel;
import edu.ou.cs2334.project4.views.NonogramMakerView;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.Pane;

public class NonogramMakerPresenter implements Saveable, Openable {
	
	private NonogramMakerView view;
	private NonogramMakerModel model;
	private int cellLength;
	
	public NonogramMakerPresenter(int numRows, int numColumns, int cellLength) {
		NonogramMakerModel model = new NonogramMakerModel(numRows, numColumns);
		this.cellLength = cellLength;
		init();
	}
	
	public Pane getPane() {
		return view.getPane();
	}

	private Window getWindow() {
		
	}
	
	private void init() {
		initToggleButtons();
		bindToggleButtons();
		configureMenuItems();
	}
	
	private void initToggleButtons() {
		view.initButtons(model.getNumRows(), model.getNumCols(), cellLength);
		if (getWindow() != null) {
			getWindow().sizeToScene();
		}
	}
	
	private void bindToggleButtons() {
		ToggleButton.s
	}
	
	private void configureMenuItems() {
		
	}
	
	public void open(File file) {
		
	}
	
	public void save(String filename) {
		
	}
}
