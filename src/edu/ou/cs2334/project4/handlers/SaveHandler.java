package edu.ou.cs2334.project4.handlers;

import java.awt.Window;
import java.awt.event.ActionEvent;

import edu.ou.cs2334.project4.interfaces.Saveable;
import javafx.event.Event;
import javafx.event.EventHandler;

public class SaveHandler extends AbstractBaseHandler implements EventHandler<Event> {

	private Saveable saver;
	
	public SaveHandler(Window window, FileChooser fileChooser, Saveable saver) {
		super(window, fileChooser);
		this.saver = saver;
		
	}
	
	public void handle(ActionEvent event) {
		
	}


}
