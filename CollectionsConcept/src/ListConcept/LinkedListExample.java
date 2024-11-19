package ListConcept;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		List<String> names= new LinkedList<>();
		names.add("Lee");
		names.add("Sahil");
		names.add("Som");
		names.add("Kash");
		names.add("bob");
		names.add(3, "Mark");
		
		System.out.println(names.size());
		//System.out.println(names.get(2));
		
		for(int i=0;i<names.size();i++) {
			System.out.println(names.get(i));
		}

	}

}
