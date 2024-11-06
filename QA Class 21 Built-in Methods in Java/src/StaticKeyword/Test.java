package StaticKeyword;

public class Test {
	
	public void callingMethods() {
		Employee.info();
		Operations.add();
		Operations.sub();
		System.out.println(Employee.age);
		System.out.println(Employee.dept);
		System.out.println(Employee.grade);
		Employee e= new Employee();
		e.display();
	}
	
	public static void callingstaticMethods() {
		Employee.info();
		Operations.add();
		Operations.sub();
		System.out.println(Employee.age);
		System.out.println(Employee.dept);
		System.out.println(Employee.grade);
		Employee e= new Employee();
		e.display();
	}

	public static void main(String[] args) {
	
		/*
		 * Employee.info(); Operations.add(); Operations.sub();
		 * System.out.println(Employee.age); System.out.println(Employee.dept);
		 * System.out.println(Employee.grade);
		 */
		
		Test t = new Test();
		//t.callingMethods();
		
		callingstaticMethods();
	}

}
