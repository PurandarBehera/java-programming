package customexception;

public class Test {

	public static void main(String[] args) throws CheckedCustomException {

		// throw new UncheckedCustomException("Unchecked Custom Exception is thrown");

		throw new CheckedCustomException("Checked Custom Exception is thrown");
	}

}
