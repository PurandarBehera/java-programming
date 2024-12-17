
public class Test {

	public static void main(String[] args) {
		Customer c =new Customer();
		c.setFname("Purandar");
		c.setLname("Behera");
		c.setCreditCard("6562353765");
		
		
		System.out.println("First Name:"+ c.getFname());
		System.out.println("Last Name:"+ c.getLname());
		System.out.println("Credit Card:"+ c.getCreditCard());
		
	}

}
