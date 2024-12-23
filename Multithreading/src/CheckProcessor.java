
public class CheckProcessor implements Runnable {

	@Override
	public void run() {
		System.out.println("processed the checks");
	}

	public static void main(String[] args) {
		CheckProcessor cp = new CheckProcessor();

		Thread t = new Thread(cp);
		t.start();

	}

}
