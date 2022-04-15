package edu.ou.cs2334.project4;

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
	public void start(Stage arg0) throws Exception {
		// TODO NEEDS TO BE FIXED 
		getParameters();
		NonogramMakerPresenter nonogramMakerPresenter = new NonogramMakerPresenter(10,10,10);
		Scene scene = new Scene(nonogramMakerPresenter.getPane());
		Stage stage = new Stage();
		stage.setScene(scene);
		scene.getStylesheets().add("style.css");
		stage.setTitle("My first java app!");
		stage.setResizable(false);
		stage.show();
	}

}
