package assignment;

public class Test {

	public static void main(String[] args) { // throws InterruptedException

		try {
			//Thread.currentThread().interrupt();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			throw new MyThreadException("My Thread custom unchecked Exception is Invoked");
		}
	}

}
