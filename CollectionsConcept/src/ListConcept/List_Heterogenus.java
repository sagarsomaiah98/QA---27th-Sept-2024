package ListConcept;

import java.util.LinkedList;
import java.util.List;

public class List_Heterogenus {

	public static void main(String[] args) {
		
		List<Object> studRec= new LinkedList<>();
		studRec.add("Kash");
		studRec.add(25);
		studRec.add(5.8);
		studRec.add('A');
		
		System.out.println(studRec.get(3));

}

}