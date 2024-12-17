package javabasics;

public class StaticMethodDemo {

	public static void main(String[] args) {
		System.out.println("inside main method");
		StaticMethodDemo.method1();

	}

	static void method1() {
		System.out.println("Inside method1");
	}
}
