package superkeyword;

public class ParentClass {
	
	int x;
	
	public ParentClass() {
		System.out.println("No Args Parent class Constructer");
	}

	public ParentClass(int x) {
		this();
		this.x=x;
		System.out.println("One Args Parent class Constructer");
	}

}
