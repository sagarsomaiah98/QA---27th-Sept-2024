package StaticKeyword;

public class Employee {
	
	static int age=30;
	static char grade='A';
	static String dept="Admin";
	
	public static void info() {
		System.out.println("Employee info");
	}
	
	public void display() {
		System.out.println("Employee display");
	}

	public static void main(String[] args) {
	
		
		info();
		System.out.println(age);
		System.out.println(grade);
		System.out.println(dept);

	}

}
