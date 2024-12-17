package Interfaces;

public class Honda implements Car {

	@Override
	public void go() {
		System.out.println("inside Honda's go");
	}

	@Override
	public void stop() {
		System.out.println("inside Honda's stop");
	}

}
