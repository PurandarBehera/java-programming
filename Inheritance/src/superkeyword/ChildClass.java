package superkeyword;

public class ChildClass extends ParentClass {

	public ChildClass() {
		this(10);
		System.out.println("No Args Child class Constructer");
	}

	public ChildClass(int x) {
		super(10);
		System.out.println("One Args Child class Constructer");
	}

	public static void main(String[] args) {
		ChildClass c = new ChildClass(); //Constructor chaining concepts
	}

}
