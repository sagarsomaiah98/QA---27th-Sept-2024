package ListConcept;

import java.util.ArrayList;
import java.util.List;

public class AL {

	public static void main(String[] args) {
List<String> stud= new ArrayList<>();
		
		stud.add("kash");
		stud.add("som");
		stud.add("peter");
		stud.add("John");
		stud.add("bruce");
		
		
		
		System.out.println(stud.size());
		
		//System.out.println(stud.get(5));
		
		
		
		
		stud.add(3, "bob");
		
		for(int i=0;i<stud.size();i++) {
			System.out.println(stud.get(i));
		}
		System.out.println(stud.contains("bob"));
		System.out.println(stud.contains("Lee"));
		
		
}
		
		
		
	}


