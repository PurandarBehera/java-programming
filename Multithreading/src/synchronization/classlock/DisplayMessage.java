package synchronization.classlock;

public class DisplayMessage {

	public static synchronized void sayHello(String name) {
		for (int i = 1; i <= 10; i++) {
			System.out.println("How Are You " + name);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
