package zahidwork;
//This and Super Keywords / return type 

public class ThisandSuperexample {

     int zahid = 1000;// instance variable 

 public void smart () {
	
	 int zahid = 200; //local variable
	
	System.out.println(this.zahid);
	
	
}
	
public static void main(String[] args) {
	
	ThisandSuperexample bob =new ThisandSuperexample (); 
	bob.smart();
///is only happen when there is same local and instance Variable then we use this .	
	
}
	
	
	
	
	
	
	
}
