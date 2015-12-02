package io;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * {@code Singleton}
 * A singleton encapsulating all input 
 * functionality that the program needs.
 * 
 * @author colonelmo
 *
 */
public class InputToolkit {
	private static InputToolkit __me = null;
	
	static{
		__me = new InputToolkit();
	}
	
	/**
	 * singleton accessor
	 * @return the singleton
	 */
	public static InputToolkit getInstance(){
		return __me;
	}
	
	/**
	 * 
	 * @param f File to read from
	 * @return The file, in string format
	 * @throws FileNotFoundException if the referenced file does not exist
	 * @throws IOException closing the BufferedReader,
	 */
	
	public String readFile(java.io.File f) throws FileNotFoundException , IOException{
		StringBuilder returnValueBuilder = new StringBuilder();
	
		java.io.FileReader fileReader = null ;
		fileReader = new java.io.FileReader(f);
		
		java.io.BufferedReader bufferedReader = new java.io.BufferedReader(fileReader);
		
		boolean eof = false;
		while(!eof){
			String line = bufferedReader.readLine() ;
			if(line == null){
				eof = true ;
				// will break out of the loop 
			}
			else{
				returnValueBuilder.append(line);
				returnValueBuilder.append(toolkit.Constants.FixedChars.NEW_LINE);
				// unifying the newline character is intentional
				// this will deal with the newline issue once and for all
			}
		}
		
		bufferedReader.close();
		return returnValueBuilder.toString();
	}
	
}
