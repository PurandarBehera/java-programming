package synchronization.block;

public class DisplayMessage {

	public void sayHello(String name) {
		// Any codes can go here
		// synchronized (DisplayMessage.class) to achieve class level lock

		synchronized (this) {
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

}
