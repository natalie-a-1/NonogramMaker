package handlers;

import java.awt.Window;
import java.awt.event.ActionEvent;

import interfaces.Openable;

public class OpenHandler extends AbstractBaseHandler implements EventHandler<Event> {

	private Openable opener ;
	
	public OpenHandler(Window window, FileChooser filechooser, Openable opener) {
		
	}
	
	public void Handle(ActionEvent event) {
		
	}
}
