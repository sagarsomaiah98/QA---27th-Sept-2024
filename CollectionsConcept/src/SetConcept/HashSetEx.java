package SetConcept;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
	
		Set<String> colors= new HashSet<>();
		colors.add("red");
		colors.add("white");
		colors.add("black");
		colors.add("green");
		colors.add("Red");
		colors.add("green");
		System.out.println(colors.size());
	
		Iterator<String> pointer= colors.iterator();
		
		/*
		 * System.out.println(pointer.next()); System.out.println(pointer.hasNext());
		 * System.out.println(pointer.next()); System.out.println(pointer.hasNext());
		 * System.out.println(pointer.next()); System.out.println(pointer.hasNext());
		 * System.out.println(pointer.next()); System.out.println(pointer.hasNext());
		 * System.out.println(pointer.next()); 
		 * System.out.println(pointer.hasNext());
		 */
		
		for(int i=0;i<colors.size();i++) {
			//System.out.println(pointer.next());
		}
		
		while(pointer.hasNext()) {
			System.out.println(pointer.next());
		}

	}

}
