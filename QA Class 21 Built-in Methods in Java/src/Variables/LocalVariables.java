package Variables;

public class LocalVariables {
	int age =30;
	String name="Bruce";
	
	public void method1() {
		
		char grade='A';
		double salary=345.62;
		System.out.println(grade);
		System.out.println(salary);
		System.out.println(age);
		System.out.println(name);
		
	}
		
	public void method2() {
		char grade='B';
		double salary=560.12;
		int age=25;
		String name="som";
		System.out.println(grade);
		System.out.println(salary);
		System.out.println(age);
		System.out.println(name);
		
	}

	public static void main(String[] args) {
		
		LocalVariables loc= new LocalVariables();
		loc.method1();
		loc.method2();

	}

}
