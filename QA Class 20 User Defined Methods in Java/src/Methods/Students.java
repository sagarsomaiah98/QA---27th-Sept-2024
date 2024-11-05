package Methods;

public class Students {
	//global Variables or class variables
	char grade='A';
	int passMarks=50;
	
	
	public void display() {
		System.out.println("Students grade is "+grade);
		
	}
	
	public void info() {
		System.out.println("Students pass marks is "+passMarks);
	}

	public static void main(String[] args) {
		Students stud= new Students();
		stud.display();
		stud.info();

	}

}
