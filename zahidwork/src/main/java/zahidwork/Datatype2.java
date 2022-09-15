package zahidwork;

public class Datatype2 {

	public void adds () {
		
		int a=20;
		int b=30;
		int d=50;
		int c= a+b+d;
		
		
		System.out.println(c);
	
	}
	
	public void add2 () {  ///type 
		
		double k = 12345.6;
		double y = 45667.9;
		double f= k+y ; 
		
	System.out.println(f);	
	
	}
	
	public void add3 () {  //// 
		
		float t= 1234.123f;
		float s= 3245.234f;
		float r=t+s;
		
   System.out.println(r);


		
	}
	

	
	public static void main(String[] args) {
		
		Datatype2 math= new Datatype2 ();
		math.adds();
		math.add2();
		math.add3();
		
	}
	
	
}
