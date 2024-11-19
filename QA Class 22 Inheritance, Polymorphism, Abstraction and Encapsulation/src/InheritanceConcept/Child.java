package InheritanceConcept;

public class Child extends Parent {
	
	public void car() {
		System.out.println("child owns car");
	}
	


	public static void main(String[] args) {
		
		Child c = new Child();
		//owned by parent inherited by child
		
		c.factory();
		c.house();
		System.out.println(c.lname);
		System.out.println(c.grade);
		
		//owned by child
		c.car();
		
	}

}
