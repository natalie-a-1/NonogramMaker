/**
 * This is an interface that save handler can use.
 */

package edu.ou.cs2334.project4.interfaces;

import java.io.IOException;

public interface Saveable {

	void save(String filename) throws IOException;

}
