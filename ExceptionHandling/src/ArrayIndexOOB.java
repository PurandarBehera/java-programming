

public class ArrayIndexOOB {

	public static void main(String[] args) {
		int arr[]= {10,20,30};
		try {
		System.out.println("Array elements are:");
		for (int i = 0; i <= arr.length; i++) {
			System.out.println(arr[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("array index out of array length");
		}
		System.out.println("After array Index excpetion");

		
	}

}
