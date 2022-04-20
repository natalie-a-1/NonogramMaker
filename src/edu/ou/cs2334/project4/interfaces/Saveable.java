package edu.ou.cs2334.project4.interfaces;

import java.io.IOException;

/**
 * This is an interface that save handler can use.
 * 
 * @author Collaboration of Natalie Hill and Keon Moradi
 * @version 0.1
 */
public interface Saveable {

	/**
	 * This is a method that saves a file/
	 * 
	 * @param filename	the file name to be saved to 
	 * @throws IOException	thrown if the file can not be opened/saved
	 */
	void save(String filename) throws IOException;

}
