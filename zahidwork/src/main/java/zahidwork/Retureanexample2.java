package zahidwork;

public class Retureanexample2 {

	public int  ali(int a, int b) {

		int c = a + b;

		return c;
	}
	
	
	

	public void tom() {

		int variable = ali(90, 80);
		System.out.println(variable);

	}

	public static void main(String[] args) {
		Retureanexample2 tuli = new Retureanexample2();

		tuli.tom();
		tuli.ali(0,0);

	}

}
