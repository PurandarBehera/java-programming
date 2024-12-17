package checked;

public class ThrowKeyword {

	public static void main(String[] args) {
		
		throw new RuntimeException("UnChecked Exception Occurred");
		/*
		 * try { throw new Exception("Checked Exception Occurred"); } catch (Exception
		 * e) {
		 * 
		 * }
		 */
	}

}
