
public class MultiThreaded extends Thread {

	public static void main(String[] args) throws InterruptedException {
		MultiThreaded mt = new MultiThreaded();
		mt.start();// start method invokes the run() method

		Thread currentThread = Thread.currentThread();// optional
		currentThread.setName("printing upto 200");
		System.out.println("current thread name is :" + currentThread.getName());

		for (int j = 1; j <= 200; j++) {
			System.out.print("j:" + j + "\t");
		}

		Thread.sleep(100);
	}

	// Multi-threading start from run method
	public void run() {
		for (int i = 1; i <= 200; i++) {
			System.out.print("i:" + i + "\t");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("Child thread exiting");
			}
		}

	}

}
