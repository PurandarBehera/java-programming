
public class SingleInheritance { //eclipse implicitly extends java.lang.object
	void m1(){
		System.out.println("inside m1");
	}
	public static void main(String[] args) {
		
		SingleInheritance s= new SingleInheritance();
		s.m1();
		s.hashCode();// present in java.lang.object
		s.getClass();// --do--
		
	}

}
