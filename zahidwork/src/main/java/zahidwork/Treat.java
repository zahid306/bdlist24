package zahidwork;

public class Treat {

	
	
	
	
	public static void main(String[] args) {
		String s="ZAHID13245!@#$%^&city";
	
		//String name=s.replaceAll("[^A-Z ]","");  regular expression
		//String name=s.replaceAll("[^A-Z0-9]",""); ^note 
	     String name = s.replaceAll("[^0-9]","");
	     String name1 = s.replaceAll("[^A-Za-z]","");
		
		System.out.println(name);
		System.out.println(name1);
		
		
		
		
	}
	
}

