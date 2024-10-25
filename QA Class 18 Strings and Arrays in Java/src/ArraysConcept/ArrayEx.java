package ArraysConcept;

public class ArrayEx {

	public static void main(String[] args) {
		
		//Syntax
		// DataType arrayname[]= new DataType[size]
		
		String stud[]= new String[5];
		
		stud[2]="Kash";
		stud[1]="Som";
		stud[0]="Mark";
		stud[3]="Rahul";
		stud[4]="Steve";
		stud[0]="John";
		stud[1]="Ram";
		System.out.println(stud.length);
		
		System.out.println(stud[0]);
		System.out.println(stud[1]);
		System.out.println(stud[2]);
		System.out.println(stud[3]);
		System.out.println(stud[4]);
		
	}

}
