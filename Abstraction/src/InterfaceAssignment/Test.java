package InterfaceAssignment;

public class Test {

	public static void main(String[] args) {
		HPNotebook h = new HPNotebook();
		h.click();
		DELLNotebook d = new DELLNotebook();
		d.click();

		HP hp = new HPNotebook();
		hp.click();

		DELL dell = new DELLNotebook();
		dell.click();
	}
}
