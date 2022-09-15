package zahidwork;

public class ReturnType {
///local Vribale 
	public int testng() {

		int a = 20;

		// System.out.println(20);
		return a;

	}

	//long
	// String
	// double

	public int r() {

		int d = testng();
		return d;
		// System.out.println(d);
	}

	public static void main(String[] args) {
		ReturnType tr = new ReturnType();
		// tr.r();
		int c = tr.r();
		System.out.println(c);

	}
}
