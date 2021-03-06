package edu.ou.cs2334.project4;

import java.util.List;
import edu.ou.cs2334.project4.presenters.NonogramMakerPresenter;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * This class runs the nongram.
 * 
 * @author Collaboration of Natalie Hill and Keon Moradi
 * @version 0.1
 */
public class Main extends Application {

	private static int IDX_NUM_COLS = 1;
	private static int IDX_NUM_ROWS = 0;
	private static int IDX_CELL_SIZE = 2;

	/**
	 * The main method the whole program.
	 * 
	 * @param args Arguments to run the program
	 */
	public static void main(String[] args) {
		launch(args);
	}

	/**
	 * This method uses all components in the program to display it.
	 * 
	 * @param primaryStage the stage to display the program
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		List<String> parameters = getParameters().getUnnamed();
		NonogramMakerPresenter nonogramMakerPresenter = new NonogramMakerPresenter(
				Integer.parseInt(parameters.get(IDX_NUM_ROWS)), Integer.parseInt(parameters.get(IDX_NUM_COLS)),
				Integer.parseInt(parameters.get(IDX_CELL_SIZE)));
		Scene scene = new Scene(nonogramMakerPresenter.getPane());
		primaryStage.setScene(scene);
		scene.getStylesheets().add("style.css");
		primaryStage.setTitle("My first java app!"); // CHANGE NAME
		primaryStage.setResizable(false);
		primaryStage.show();

	}

}
