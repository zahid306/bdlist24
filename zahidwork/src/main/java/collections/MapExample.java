package collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	//Name:Zahid
	//get to read vlaue 
	// put to add value 
	// has map to store data 
	
public static void main(String[] args) {
	
	Map<String, String> me= new HashMap<String,String>();
	me.put("name", "Zahid");
	me.put("name1", "Siddiqui");
	me.put("Address", "351sdfvsdfvdfvs");
	me.put("location", "Dhaka");
	
	
	
	System.out.println(me.get("location"));
	System.out.println(me.get("name"));
	
}
	
	
	
}
