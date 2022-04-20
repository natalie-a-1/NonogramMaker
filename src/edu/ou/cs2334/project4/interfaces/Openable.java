package edu.ou.cs2334.project4.interfaces;

import java.io.File;
import java.io.IOException;

/**
 * This is an interface that openHandler can use.
 * 
 * @author Collaboration of Natalie Hill and Keon Moradi
 * @version 0.1
 */
public interface Openable {
	
	/**
	 * This is a method that opens files.
	 * 
	 * @param file	the file to be opened
	 * @throws IOException	thrown if the file can not be opened
	 */
	void open(File file) throws IOException;
}
