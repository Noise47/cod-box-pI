package io;
/**
 * {@code Singleton}
 * Provides a means of producing errors visible
 * to the end user
 * @author colonelmo
 *
 */
public class ErrorToolkit {
	private static ErrorToolkit __me ;
	
	static{
		__me = new ErrorToolkit();
	}
	
	public static ErrorToolkit getInstance(){
		return __me ;
	}
}
