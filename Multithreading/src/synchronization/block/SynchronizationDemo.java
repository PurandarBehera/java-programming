package synchronization.block;

public class SynchronizationDemo {

	public static void main(String[] args) {

		DisplayMessage dm = new DisplayMessage();
		MyThread t1 = new MyThread(dm, "Steve");
		MyThread t2 = new MyThread(dm, "Smith");

		t1.start();
		t2.start();
	}

}
