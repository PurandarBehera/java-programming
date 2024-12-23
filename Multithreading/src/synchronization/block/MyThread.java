package synchronization.block;

public class MyThread extends Thread {

	DisplayMessage message;
	String name;

	public MyThread(DisplayMessage message, String name) {
		this.message = message;
		this.name = name;
	}

	@Override
	public void run() {
		message.sayHello(name);

	}

}
