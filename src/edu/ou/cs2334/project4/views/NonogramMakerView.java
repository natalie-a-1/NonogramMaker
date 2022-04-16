/**
 * This class creates all the visual components of a nonogram.
 * 
 * @author Natalie Hill
 * @version 0.1
 */

package edu.ou.cs2334.project4.views;

import java.util.HashMap;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class NonogramMakerView {

	private BorderPane borderPane;
	private MenuBar menubar;
	private CellGridView cellGridView;
	private HashMap<String, MenuItem> menuItemsMap = new HashMap<String, MenuItem>();

	/**
	 * String representation of the open button.
	 */

	public static String MENU_ITEM_OPEN = "MENU_ITEM_OPEN";

	/**
	 * String representation of the save button.
	 */

	public static String MENU_ITEM_SAVE = "MENU_ITEM_SAVE";

	/**
	 * String representation of the exit button.
	 */

	public static String MENU_ITEM_EXIT = "MENU_ITEM_EXIT";

	/**
	 * This is the constructor for the NonogramMakerView.
	 * 
	 * @param numRows    the number of rows in a nonogram
	 * @param numCols    the number of columns in a nonogram
	 * @param cellLength the length of a cell in the nonogram grid
	 */

	public NonogramMakerView(int numRows, int numCols, int cellLength) {
		initMenuBar();
		cellGridView = new CellGridView(numRows, numCols, cellLength);
		borderPane = new BorderPane();
		borderPane.setCenter(cellGridView.getPane());
		borderPane.setTop(menubar);
	}

	private void initMenuBar() {

		// creating menu
		Menu menu = new Menu("_File");

		// creating menu items
		MenuItem open = new MenuItem("_Open");
		MenuItem save = new MenuItem("_Save");
		MenuItem exit = new MenuItem("_Exit");

		// adding menu items to menu
		menu.getItems().add(open);
		menu.getItems().add(save);
		menu.getItems().add(exit);

		// creating menu bar
		menubar = new MenuBar();

		// adding menu to menu bar
		menubar.getMenus().addAll(menu);

		// adding menu items to menu hash map
		menuItemsMap.put(MENU_ITEM_EXIT, exit);
		menuItemsMap.put(MENU_ITEM_OPEN, open);
		menuItemsMap.put(MENU_ITEM_SAVE, save);

		// setting action event to exit button
		exit.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				Platform.exit();
			}
		});
	}

	/**
	 * This method returns menu items in the hash map.
	 * 
	 * @param name String representation of the menu item
	 * @return returns the value of the menu item in the map
	 */

	public MenuItem getMenuItem(String name) {
		return menuItemsMap.get(name);
	}

	/**
	 * This method retrieves the border pane.
	 * 
	 * @return returns the border pane.
	 */

	public Pane getPane() {
		return borderPane;
	}

	/**
	 * This method gets buttons in the cell grid view.
	 * 
	 * @param numRows    the number of rows in the cell grid view
	 * @param numCols    the number of columns in the cell grid view
	 * @param cellLength the length of each cell in the cell grid view
	 */

	public void initButtons(int numRows, int numCols, int cellLength) {
		cellGridView.initButtons(numRows, numCols, cellLength);
	}

	/**
	 * This method retrieves a button given a row and column.
	 * 
	 * @param row the row to be searched
	 * @param col the column to be searched
	 * @return the toggle button in the grid
	 */

	public ToggleButton getToggleButton(int row, int col) {
		return cellGridView.getToggleButtons(row, col);
	}

	/**
	 * This method returns the number of rows in the cell grid view.
	 * 
	 * @return the number of rows in the cell grid view
	 */

	public int getNumRow() {
		return cellGridView.getNumRows();
	}

	/**
	 * This method returns the number of columns in the cell grid view.
	 * 
	 * @return the number of columns in the cell grid view
	 */

	public int getNumCols() {
		return cellGridView.getNumCols();
	}

}
