package External;
import Methods.Students;
import Parameters.Addition;

public class ExternalCalling {
	
	public void test() {
		
		System.out.println("calling test method");
	}

	public static void main(String[] args) {
		
    ExternalCalling ext= new ExternalCalling();
    ext.test();
    
    Students s = new Students();
     s.display();
     s.info();
		
	}

}
