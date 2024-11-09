package SetConcept;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {

	//set doesnt allow duplicate values
	public static void main(String[] args) {
	
		Set<String> colors= new HashSet<>();
		colors.add("Red");
		colors.add("Green"); 
		colors.add("Yellow"); 	
		colors.add("Black");
		colors.add("red");
		colors.add("Green");
		
		System.out.println(colors.size());
		
		Iterator<String> it= colors.iterator();
		/*
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 */
		
		
		for(int i=0;i<colors.size();i++) {
			//System.out.println(it.next());
		}
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	}
	
	
	
	
	
	


