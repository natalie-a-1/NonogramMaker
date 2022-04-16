package edu.ou.cs2334.project4.handlers;



import java.io.IOException;

import edu.ou.cs2334.project4.interfaces.Openable;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.stage.FileChooser;
import javafx.stage.Window;

public class OpenHandler extends AbstractBaseHandler implements EventHandler<ActionEvent> {

	private Openable opener ;
	
	public OpenHandler(Window window, FileChooser fileChooser, Openable opener) {
		super(window, fileChooser);
		this.opener = opener;
		
	}
	
	public void handle(ActionEvent event) {
		super.fileChooser.showOpenDialog(window);
		if (super.fileChooser.showOpenDialog(window) != null) {
			try {
				opener.open(super.fileChooser.showOpenDialog(window));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


}
