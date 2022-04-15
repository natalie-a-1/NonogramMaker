package edu.ou.cs2334.project4;

import java.util.List;

import edu.ou.cs2334.project4.Presenter.NonogramMakerPresenter;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	
	private static int IDX_NUM_COLS = 1;
	private static int IDX_NUM_ROWS = 0;
	private static int IDX_CELL_SIZE = 2;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO NEEDS TO BE FIXED 
		List<String> parameters = getParameters().getUnnamed();
		NonogramMakerPresenter nonogramMakerPresenter = new NonogramMakerPresenter(IDX_NUM_ROWS,IDX_NUM_COLS,IDX_CELL_SIZE);
		Scene scene = new Scene(nonogramMakerPresenter.getPane());
		primaryStage.setScene(scene);
		scene.getStylesheets().add("src/style.css");
		primaryStage.setTitle("My first java app!");
		primaryStage.setResizable(false);
		primaryStage.show();
	}

}
