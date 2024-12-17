package superkeyword;

public class Child extends Parent {
	int c,d;
	Child(int a ,int b, int c,int d){// constructor call must be the first call inside a constructor.
		super(a,b);    // to invoke super or parent class constructor method 
		this.c=c;   
		this.d=d;
		
	}
	void f1(){
		super.f1();
		System.out.println("Inside child's f1");
	}
	void displayDetails(){
		System.out.println(" Parents a" +super.a);
		System.out.println(" Parents b" +super.b);
		System.out.println(" Childs c"+this.c);
		System.out.println(" Childs d" +this.d);
		
	}

}
