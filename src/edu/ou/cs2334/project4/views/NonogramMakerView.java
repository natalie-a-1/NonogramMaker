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
	public String MENU_ITEM_OPEN = "MENU_ITEM_OPEN";
	public String MENU_ITEM_SAVE = "MENU_ITEM_SAVE";
	public String MENU_ITEM_EXIT = "MENU_ITEM_EXIT";
	
	public NonogramMakerView(int numRows, int numCols, int cellLength) {
		CellGridView cellGridView = new CellGridView(numRows, numCols, cellLength);
		BorderPane borderPane = new BorderPane();
//		borderPane.setCenter(cellGridView);
		borderPane.setTop(menubar);
	}
	private void initMenuBar() {
		
		//creating menu
		Menu menu = new Menu("_File");
		
		//creating menu items
		MenuItem open = new MenuItem("_Open");
		MenuItem save = new MenuItem("_Save");
		MenuItem exit = new MenuItem("_Exit");
		
		//adding menu items to menu
		menu.getItems().add(open);
		menu.getItems().add(save);
		menu.getItems().add(exit);
		
		//creating menu bar
		MenuBar menubar = new MenuBar();
		
		//adding menu to menubar
		menubar.getMenus().addAll(menu);
		
		//adding menu items to menu hash map
		menuItemsMap.put(MENU_ITEM_EXIT, exit);
		menuItemsMap.put(MENU_ITEM_OPEN, open);
		menuItemsMap.put(MENU_ITEM_SAVE, save);
		
		//setting action event to exit button
		exit.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				Platform.exit();
			}
			
		});
		
		//TODO: Instantiate the menuBar and add the File menu to the menuBar. 
		//This will allow the File option to show up on the menuBar.
	}
	
	public MenuItem getMenuItem(String name) {
		return menuItemsMap.get(name);
	}
	
	public Pane getPane() {
		return borderPane;
	}
	
	public void initButtons(int numRows, int numCols, int cellLength) {
		cellGridView.initButtons(numRows, numCols, cellLength);
	}
	
	public ToggleButton getToggleButton(int row, int col) {
		//TODO Return the toggleButton at a given position using the cellGridView variable.
	}
	
	public int getNumRow() {
		//TODO Return the number of rows using the cellGridView variable
	}
	
	public int getNumCols() {
		//TODO Return the number of columns using the cellGridView variable.
	}

}
