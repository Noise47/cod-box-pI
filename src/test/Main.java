package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
	
	public static void main(String [] args){
		Main tester = new Main();
//		tester.testFileRead();
	
	}
	
	
	
	
	public void testFileRead(){
		String testFileReadName = "test/readertest.txt";
		String contents= "";
		try {
			contents = frontend.scanner.general.Toolkit.getInstance().readFile(new File(testFileReadName));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e){
			
		}
		System.out.println(contents);		
	}
}
