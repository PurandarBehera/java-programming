
public abstract class BMW {
	
	int a,b;
	void commonFunc() {
		System.out.println("Inside common function method");
	}
	
	
	abstract void accelerate();
	
	public static void main(String[] args) {
		System.out.println("Inside main method");
	}

}
