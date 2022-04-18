/**
 * This is an interface that openHandler can use.
 * 
 * @auhtor Collaboration of Natalie Hill and Keon Moradi
 * @version 0.1
 */

package edu.ou.cs2334.project4.interfaces;

import java.io.File;
import java.io.IOException;

public interface Openable {

	void open(File file) throws IOException;
}
