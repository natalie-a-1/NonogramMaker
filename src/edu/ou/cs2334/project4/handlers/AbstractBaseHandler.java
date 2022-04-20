

package edu.ou.cs2334.project4.handlers;

import javafx.stage.FileChooser;
import javafx.stage.Window;

/**
 * This class represents a general handler involving file selection.
 * 
 * @author Collaboration of Natalie Hill and Keon Moradi
 * @version 0.1
 */
public abstract class AbstractBaseHandler {

	protected Window window;
	protected FileChooser fileChooser;

	protected AbstractBaseHandler(Window window, FileChooser fileChooser) {
		this.window = window;
		this.fileChooser = fileChooser;
	}

}
