package assignment;

public class Test {

	public static void main(String[] args) {
		Patient patient= new Patient();
		patient.setId(101);
		patient.setName("ABC");
		patient.setSsn("123DDER");
		
		System.out.println(patient.getId());
		System.out.println(patient.getName());
		System.out.println(patient.getSsn());
	}

}
