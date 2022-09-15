package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
////List, ArrayList, it will take also dublicae 
public class List1 {
	
	public static void main(String[] args) {
		
		//List<String> tom = new ArrayList<String>();
		//List<String> tom = new  ArrayList<String>();
		
		Set<String> tom = new HashSet<String>();
		//Set will not take dublicate balu .. we need to use iterator to get //HAshset 		
				
		tom.add("sam");
		tom.add("sam");
		tom.add("sam");
	
		tom.add("Siddiqui");
		tom.add("Zahid");
		tom.add("Zahid1");
		tom.add("Zahid3");
		tom.add("Zahid4");
		tom.add("Zahid5");
		tom.add("Zahid9");
		tom.add("ali");
		
		Iterator<String> bob = tom.iterator();
		
		while (bob.hasNext()) {
			String kib = (String) bob.next();
			
			System.out.println(kib);
		}
			
			
		}
		
		
		//System.out.println(tom.get(1));
		//System.out.println(tom.get(2));
		
		
		
		
		/*for (int i = 0; i < tom.size(); i++) {
			System.out.println(tom.get(i));
		}*/
		
		
		
	}


