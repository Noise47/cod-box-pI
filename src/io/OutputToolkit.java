package io;
/**
 * {@code Singleton}
 * A singleton encapsulating all output 
 * functionality that we're gonna need.
 * @author colonelmo
 *
 */
public class OutputToolkit {
	private static OutputToolkit __me = null;
	
	static{
		__me = new OutputToolkit();
	}
	
	/**
	 * Singleton accessor
	 * @return the singleton
	 */
	public OutputToolkit getInstance(){
		return __me ;
	}
}
