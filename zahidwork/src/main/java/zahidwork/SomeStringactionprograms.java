package zahidwork;

public class SomeStringactionprograms {
	
	//swapping with 2 string using 3rd veribale
	
	public static void main(String[] args) {
	
		 String fristname = "zahid";
		 String Lastname = "Hussin";
		 
		String Team = null;
		Team = fristname;
		fristname=Lastname;
		Lastname=Team;
		
		System.out.println(fristname);
		
		
		String s = "iamgoinghomebutidonthaveacar";
		
		System.out.println(s.charAt(10));// this to find out number 
		System.out.println(s.length());
		if (s.contains("car")) {
			System.out.println("we found car");
		} else {
			System.out.println(" we dont have car");

		}
		
	}

	
	
	
	
	
	
	
	
	
	
	

}
