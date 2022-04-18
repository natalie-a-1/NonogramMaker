/**
 * This is an abstract class that handles the task of saving the dialog.
 * 
 * @author Collaboration of Natalie Hill and Keon Moradi
 * @version 0.1
 */

package edu.ou.cs2334.project4.handlers;

import java.io.File;
import java.io.IOException;
import edu.ou.cs2334.project4.interfaces.Saveable;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.FileChooser;
import javafx.stage.Window;

public class SaveHandler extends AbstractBaseHandler implements EventHandler<ActionEvent> {

	private Saveable saver;

	/**
	 * This constructor creates dialog to be saved.
	 * 
	 * @param window      object that displays the content
	 * @param fileChooser object that chooser a file
	 * @param saver       object that saves the file
	 */

	public SaveHandler(Window window, FileChooser fileChooser, Saveable saver) {
		super(window, fileChooser);
		this.saver = saver;

	}

	/**
	 * This method tries to display the dialog, but if the file is not found it
	 * throws an exception.
	 * 
	 * @param event an ActionEvent that handles opening
	 */

	public void handle(ActionEvent event) {
		File temp = super.fileChooser.showSaveDialog(window);
		String tempo = super.fileChooser.getInitialFileName();
		if (temp != null) {
			try {
				saver.save(tempo.toString());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
