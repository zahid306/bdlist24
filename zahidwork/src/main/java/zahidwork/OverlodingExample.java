package zahidwork;
//overloding example | Its also know as siginer 
public class OverlodingExample {
///Argement is diffrent 
	public void zahid () {
 int a=50;
 int b=60;
 int c=a=b;
 int d=a+b; 
 System.out.println(d);
	}

 public void zahid (int a, int b) {
	 
	 int c = a+b ; 
	 System.out.println(c);
	 
	 
 }
	
	
 public static void main(String[] args) {
	 OverlodingExample sam = new OverlodingExample();
		sam.zahid();
	    sam.zahid(200, 2000);
}
 
	
}
