package edu.ou.cs2334.project4.Presenter;

import java.awt.Window;
import java.io.File;

import edu.ou.cs2334.project4.interfaces.Openable;
import edu.ou.cs2334.project4.interfaces.Saveable;
import edu.ou.cs2334.project4.models.NonogramMakerModel;
import edu.ou.cs2334.project4.views.NonogramMakeView;

public class NonogramMakerPresenter implements Saveable, Openable {
	
	private NonogramMakeView view;
	private NonogramMakerModel model;
	private int cellLength;
	
	public NonogramMakerPresenter(int numRows, int numColumns, int cellLength) {
		
	}
	
	public Pane getPane() {
		
	}

	private Window getWindow() {
		
	}
	
	private void init() {
		
	}
	
	private void initToggleButtons() {
		
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
