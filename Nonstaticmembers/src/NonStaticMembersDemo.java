
public class NonStaticMembersDemo {
	int num; // non static variables

	NonStaticMembersDemo() { // constructor
		System.out.println("Inside the constructor");
	}

	{
		System.out.println("Inside the non static block"); // non-static block
	}

	public static void main(String[] args) {
		System.out.println("inside the main method");
		new NonStaticMembersDemo();// instance of the object using new keyword
		new NonStaticMembersDemo();
		new NonStaticMembersDemo();
	}

	static {
		System.out.println("inside the static block");
	}
}
