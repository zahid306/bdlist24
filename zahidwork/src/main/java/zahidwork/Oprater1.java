package zahidwork;

public class Oprater1 {

	
 public void ali() {
	//This can be access any packge  
	 
	 
System.out.println("I am ALi ");	

 }
	
 private void sam () {
	 
	//only access for same class no other class  
	
 System.out.println("i am sam" );
	 
 }
	
	
 protected void tom () {
	 /// cant access from diffrent packege 
	 //it will work on same packege diffrent class 
	 
 System.out.println("i am tom "); 
	 
 } 
	
 
 
 public static void main(String[] args) {
	 Oprater1 bob = new Oprater1();
	 bob.sam();
	 bob.tom();
	 bob.ali();
	 
	 
	 
}
 
 
 
 
	
}
