/**
 * This is an abstract class that shows the dialog.
 * 
 * @author Natalie Hill
 */

package edu.ou.cs2334.project4.handlers;

import java.io.IOException;
import edu.ou.cs2334.project4.interfaces.Openable;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.FileChooser;
import javafx.stage.Window;

public class OpenHandler extends AbstractBaseHandler implements EventHandler<ActionEvent> {

	private Openable opener;

	/**
	 * Constructor to open the window.
	 * 
	 * @param window      object that displays the content
	 * @param fileChooser object that chooser a file
	 * @param opener      object that opens the file
	 */

	public OpenHandler(Window window, FileChooser fileChooser, Openable opener) {
		super(window, fileChooser);
		this.opener = opener;

	}

	/**
	 * This method tries to display the dialog, but if the file is not found it
	 * throws an exception.
	 * 
	 * @param event an ActionEvent that handles opening
	 */

	public void handle(ActionEvent event) {
		super.fileChooser.showOpenDialog(window);
		if (super.fileChooser.showOpenDialog(window) != null) {
			try {
				opener.open(super.fileChooser.showOpenDialog(window));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
