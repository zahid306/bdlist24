package finalexmple;

public class Final {

	//static we add front of vrivale and method 
	
	 //static int zahid = 40;
	int zahid = 40;
	
	// static public void m() {
	public void m() {
		System.out.println("Hi..");
	}
	
	

	public static void main(String[] args) {
		Final tom = new Final ();
		
		//m();
		tom.m();
		
		
      System.out.println(tom.zahid);
      
		//System.out.println(zahid);
	}

}
