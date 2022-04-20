package edu.ou.cs2334.project4.presenters;

import java.io.File;
import java.io.FileNotFoundException;
import edu.ou.cs2334.project4.handlers.OpenHandler;
import edu.ou.cs2334.project4.handlers.SaveHandler;
import edu.ou.cs2334.project4.handlers.ToggleButtonEventHandler;
import edu.ou.cs2334.project4.interfaces.Openable;
import edu.ou.cs2334.project4.interfaces.Saveable;
import edu.ou.cs2334.project4.models.NonogramMakerModel;
import edu.ou.cs2334.project4.views.NonogramMakerView;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Window;

/**
 * This class uses components from the both the NonogramMakerModel and
 * the NonogramMakerView to create a display for the nonogram. 
 * 
 * @author Collaboration of Natalie Hill and Keon Moradi
 * @version 0.1
 */
public class NonogramMakerPresenter implements Saveable, Openable {

	private NonogramMakerView view;
	private NonogramMakerModel model;
	private int cellLength;

	/**
	 * This is a constructor for the NonogramMakerPresetner.
	 * 
	 * @param numRows    total rows in the nonogram
	 * @param numColumns total columns in the nonogram
	 * @param cellLength the length of each cell in the nonogram
	 */
	public NonogramMakerPresenter(int numRows, int numColumns, int cellLength) {
		view = new NonogramMakerView(numRows, numColumns, cellLength);
		model = new NonogramMakerModel(numRows, numColumns);
		this.cellLength = cellLength;
		init();
	}

	/**
	 * Retrieves the nonogram's pane.
	 * 
	 * @return returns the pane from NonogramMakerView
	 */
	public Pane getPane() {
		return view.getPane();
	}

	private Window getWindow() {
		try {
			return view.getPane().getScene().getWindow();
		} catch (NullPointerException e) {
			return null;
		}
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
		for (int i = 0; i < model.getNumRows(); i++) {
			for (int j = 0; j < model.getNumCols(); j++) {
				view.getToggleButton(i, j).setSelected(model.getCell(i, j));
				view.getToggleButton(i, j).setOnAction(new ToggleButtonEventHandler(model, i, j));
			}
		}
	}

	private void configureMenuItems() {
		FileChooser filechooser = new FileChooser();
		filechooser.setTitle("Open");
		filechooser.getExtensionFilters().addAll(new ExtensionFilter("Text Files", "*.txt"));
		filechooser.setInitialDirectory(new File("."));
		view.getMenuItem(NonogramMakerView.MENU_ITEM_OPEN).setOnAction(new OpenHandler(getWindow(), filechooser, this));
		filechooser.setTitle("Save");
		view.getMenuItem(NonogramMakerView.MENU_ITEM_SAVE).setOnAction(new SaveHandler(getWindow(), filechooser, this));

	}

	/**
	 * This method opens a file.
	 * 
	 * @param file the file to be opened
	 * @throws FileNotFoundException exception is thrown if the file can not be
	 *                               found
	 */
	public void open(File file) throws FileNotFoundException {
		model = new NonogramMakerModel(file);
		init();
	}

	/**
	 * This method saves the contents of the nonogram to a file.
	 * 
	 * @param filename name of the file to be saved to
	 * @throws FileNotFoundException exception is thrown if the file can not be
	 *                               found
	 */
	public void save(String filename) throws FileNotFoundException {
		this.model.saveToFile(filename);
	}
}
