package edu.ou.cs2334.project4;

import java.util.List;

import edu.ou.cs2334.project4.Presenter.NonogramMakerPresenter;
import edu.ou.cs2334.project4.views.NonogramMakerView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
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
		List<String> parameters = getParameters().getUnnamed();
		NonogramMakerPresenter nonogramMakerPresenter = new NonogramMakerPresenter(Integer.parseInt(parameters.get(IDX_NUM_ROWS)),Integer.parseInt(parameters.get(IDX_NUM_COLS)),Integer.parseInt(parameters.get(IDX_CELL_SIZE)));
		Scene scene = new Scene(nonogramMakerPresenter.getPane());
		primaryStage.setScene(scene);
		scene.getStylesheets().add("src/style.css");
		primaryStage.setTitle("My first java app!");
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}

}
