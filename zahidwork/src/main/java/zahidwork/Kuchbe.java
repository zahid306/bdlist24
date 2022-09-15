package zahidwork;

public class Kuchbe {

	
	//overloading - when there is same methoud difrrent aggrement 
	public void delete() {
		
		
	int a=40 ; 
	int b=80 ; 
		int c = a+b;
		int d= a+b;
System.out.println(c);		
	}
	
	
	                     ///Argment 
	public void delete (int a , int b ) {
		int c = a+b;
	System.out.println(c);	
	}
	
	
	
	///overloading 
	
	
	public void delete (int a, int b, int c) {
		int d = a+b+c;
	System.out.println(d);	
	}
	
	
	
public static void main(String[] args) {

	Kuchbe wd = new Kuchbe () ;
     wd.delete(0, 0, 0);
	 wd.delete(0, 0);
	 wd.delete();
}
	
	
	
	
}
