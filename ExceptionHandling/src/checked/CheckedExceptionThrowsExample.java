package checked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionThrowsExample {

	/**
	 * If at all the code which might throw a checked exception is not handled with
	 * try & catch block, then we need to explicitly declare it using 'throws' keyword.
	 * 
	 * By doing this we are saying that , this method throws an exception which needs
	 * to be handled or catch by the caller method.
	 * 
	 * If caller methods too declare the exception using 'throws' , then default JVM
	 * exception handler with default exception message will be displayed.
	 * 
	 * @throws FileNotFoundException
	 * 
	 * 
	 **/
	
	/*
	 * void readFile() { try { FileInputStream fis = new FileInputStream(""); }
	 * catch (FileNotFoundException e) {
	 * System.out.println("File could not be found"); } }
	 */

	void readFile() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("");
	}

	public static void main(String[] args) {
		CheckedExceptionThrowsExample checkedExceptionThrowsExample = new CheckedExceptionThrowsExample();

		try {
			checkedExceptionThrowsExample.readFile();
		} catch (FileNotFoundException e) {
			System.out.println("File could not be found");
		}
	}

}
