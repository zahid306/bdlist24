package zahidwork;

public class ConstructorsExaple {

	
	public  ConstructorsExaple( int a , int b, int c ) {
		
		 int d = a+b+c;
		 
		 System.out.println(d);
		
		//it returan object 
		
	}
	

	
	public void A() {
		System.out.println("kjnkn");
	}
	
	public void B() {
		System.out.println("kjnkn");
	}
	public void C() {
		System.out.println("kjnkn");
	}
	

	public static void main(String[] args) {
		
		
	ConstructorsExaple home =new ConstructorsExaple( 345, 3423, 4554 ) ;  ///object
	home.A();
	home.B();
	home.C();
	
	
	}
	

}
