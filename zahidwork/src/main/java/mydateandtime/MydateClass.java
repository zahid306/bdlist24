package mydateandtime;
//date and time 
import java.text.SimpleDateFormat;
import java.util.Date;

public class MydateClass {
	
	
	public static void main(String[] args) {
		
	Date home = new Date ();
	
	SimpleDateFormat sp= new SimpleDateFormat("dd-mm-yyyy");
	
String ye=	sp.format(home);
	
	System.out.println(ye);
	
		
		
	}
}
