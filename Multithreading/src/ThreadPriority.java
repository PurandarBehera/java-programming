
public class ThreadPriority extends Thread {

	public static void main(String[] args) {

		ThreadPriority tp = new ThreadPriority();
		tp.setPriority(MAX_PRIORITY);
		tp.setName("tp");
		tp.start();

		ThreadPriority tp1 = new ThreadPriority();
		tp1.setPriority(MIN_PRIORITY);
		tp1.setName("tp1");
		tp1.start();

	}

	public void run() {
		System.out.println("Thread invoked is : " + Thread.currentThread().getName());
	}

}
