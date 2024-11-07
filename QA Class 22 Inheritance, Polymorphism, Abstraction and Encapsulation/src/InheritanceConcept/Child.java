package InheritanceConcept;

public class Child extends Parent {
	
	public void car() {
		System.out.println("child owns car");
	}
	


	public static void main(String[] args) {
		
		Child c = new Child();
		c.car();
		c.house();
		c.factory();
		System.out.println(c.lname);
		System.out.println(c.grade);
		
	}

}
