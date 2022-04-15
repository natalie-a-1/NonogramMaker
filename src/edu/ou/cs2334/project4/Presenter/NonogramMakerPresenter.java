package edu.ou.cs2334.project4.Presenter;

import java.io.File;

import edu.ou.cs2334.project4.interfaces.Openable;
import edu.ou.cs2334.project4.interfaces.Saveable;
import edu.ou.cs2334.project4.models.NonogramMakerModel;
import edu.ou.cs2334.project4.views.NonogramMakerView;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.Pane;
import javafx.stage.Window;

public class NonogramMakerPresenter implements Saveable, Openable {
	
	private NonogramMakerView view;
	private NonogramMakerModel model;
	private int cellLength;
	
	public NonogramMakerPresenter(int numRows, int numColumns, int cellLength) {
		view = new NonogramMakerView(numRows, numColumns, cellLength);
		model = new NonogramMakerModel(numRows, numColumns);
		this.cellLength = cellLength;
		init();
	}
	
	public Pane getPane() {
		return view.getPane();
	}

	private Window getWindow() {
		return null;
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
		
	}
	
	private void configureMenuItems() {
		
	}
	
	public void open(File file) {
		
	}
	
	public void save(String filename) {
		
	}
}
