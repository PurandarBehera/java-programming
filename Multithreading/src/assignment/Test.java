package assignment;

public class Test {

	public static void main(String[] args) {
		System.out.println("main thread started");
		EvenNumberThread e = new EvenNumberThread();
		Thread et = new Thread(e);
		et.start();
		OddNumberThread o = new OddNumberThread();
		Thread ot = new Thread(o);
		ot.start();

	}

}
