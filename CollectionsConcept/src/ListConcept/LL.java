package ListConcept;

import java.util.LinkedList;
import java.util.List;

public class LL {

	public static void main(String[] args) {
		
		List<String> stud= new LinkedList<>();
		
		stud.add("kash");
		stud.add("som");
		stud.add("peter");
		stud.add("John");
		stud.add("bruce");
		
		
		
		System.out.println(stud.size());
		
		//System.out.println(stud.get(5));
		
		
		for(int i=0;i<stud.size();i++) {
			System.out.println(stud.get(i));
		}
		
		
		
}
}