
public class MultiCatch {

	public static void main(String[] args) {
		try {
		String input= args[0];
		System.out.println("Input is:"+input);
		int op= Integer.parseInt(input);
		System.out.println("Output is:"+op);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Input is required");
			
		}
		catch(NumberFormatException e) {
			System.out.println("Enter an Integer");
			
			
		}
		System.out.println("exception is handled");
	}

}
