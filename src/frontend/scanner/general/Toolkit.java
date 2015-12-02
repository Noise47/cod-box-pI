package frontend.scanner.general;

import java.io.FileNotFoundException;
import java.io.IOException;

import io.InputToolkit;

/**
 *
 * {@code Singleton}
 * A toolkit for the tasks which are either mutual
 * between different scanners, or are not related
 * directly to the scanners inner structure.
 *
 * @author colonelmo
 *
 */
public class Toolkit {

	public void testMethod(){
		
	}

	private static Toolkit __me  = null ;

	static{
		__me = new Toolkit();
	}

	/**
	 * Singleton accessor
	 * @return the singleton object
	 */
	public static Toolkit getInstance(){
		return __me ;
	}

	/**
	 * reads an ASCII-formatted file
	 * @param f File to read from
	 * @return the file, in string format
	 * @throws FileNotFoundException upstream, referenced file not found
	 * @throws IOException upstream, closing BufferedReader
	 */
	public String readFile(java.io.File f) throws FileNotFoundException, IOException {
		return InputToolkit.getInstance().readFile(f);
	}
}
