package abcd;
///Access Modifers
public class Demo {

	///variables
	public  String name = "SK" ;
	
	
	
	public void am () {
		
		
	System.out.println("siginIN ");
	
	}
	
	public void ampm () {
		
		
		System.out.println(2000);
	}
	
	//cant access from any class outside this class 
	private void am2 () {
		
		
		System.out.println(" login ");
		
		
		}
	
/// can access only from same package not from other package
  protected void am3 () {
		
		
		System.out.println("search");
		
		
		}
  
  
  protected void am4 () {
	  
	  System.out.println("ahid");
	  
	  
  }
	
  
  
 public static void main(String[] args) {
	
	 Demo dell = new Demo ();
	 
	 dell.am();
	 dell.am2();
	 dell.am3();
	 dell.am4();
	 
	 
}
	
	
	
	
}
