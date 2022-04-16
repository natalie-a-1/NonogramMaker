package edu.ou.cs2334.project4.handlers;


import java.io.IOException;

import edu.ou.cs2334.project4.interfaces.Saveable;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.FileChooser;
import javafx.stage.Window;

public class SaveHandler extends AbstractBaseHandler implements EventHandler<ActionEvent> {

	private Saveable saver;
	
	public SaveHandler(Window window, FileChooser fileChooser, Saveable saver) {
		super(window, fileChooser);
		this.saver = saver;
		
	}
	
	public void handle(ActionEvent event) {
		super.fileChooser.showOpenDialog(window);
		if (super.fileChooser.showOpenDialog(window) != null) {
			try {
				saver.save(super.fileChooser.getInitialFileName());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
