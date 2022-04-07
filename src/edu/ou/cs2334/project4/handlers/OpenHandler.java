package edu.ou.cs2334.project4.handlers;

import java.awt.event.ActionEvent;

import edu.ou.cs2334.project4.interfaces.Openable;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.stage.FileChooser;
import javafx.stage.Window;

public class OpenHandler extends AbstractBaseHandler implements EventHandler<Event> {

	private Openable opener ;
	
	public OpenHandler(Window window, FileChooser fileChooser, Openable opener) {
		super(window, fileChooser);
		this.opener = opener;
		
	}
	
	public void handle(ActionEvent event) {
		
	}


}
