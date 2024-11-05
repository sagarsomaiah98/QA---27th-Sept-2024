package Methods;

public class Employee {
	String name="Lee";
	int age=25;
	
	public void info() {
		
		System.out.println("Calling method info");
	}

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.info();
		System.out.println(emp.name);
		System.out.println(emp.age);
	}

}
