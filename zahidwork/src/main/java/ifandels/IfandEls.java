package ifandels;

public class IfandEls {

	
	public void H() {
		
	if (false) {
	   System.out.println("we are home ");
	   
   } else {
	System.out.println("we are not home");	
		
		
   }
}
	
	
	public void Pub() {
		
	if (true) {
		System.out.println("my car is working ");
	} else {
        System.out.println("my car is not working");
	}

	}
	
	public void ali() {
		
		if (false) {
			
			System.out.println("I am not you home");
		} else { 
		System.out.println("I am at your home ");
	}
	}
	
	public void ky() {
		
		for (int i = 1; i <10; i++) {
			System.out.println(i);
		}
		//System.out.println(i);
	}
	
	public void home() {
	if (10>20) {
		System.out.println("I am home ");
		
	} else {
  System.out.println("I am not home");
	}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IfandEls d= new IfandEls ();
		d.H();
		d.Pub();
		d.ali();
		d.ky();
	}

}
