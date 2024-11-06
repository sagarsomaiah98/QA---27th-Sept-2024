package ReturnKeyword;

public class ReturnExample {
	//global 
	int salary=2000;
	
	public int annualSalary(int annual, char grade, String name) {
		//local
		 annual=salary*12;
		
		 name="Ram";
		//System.out.println(annual);
		return annual;
		
	}

	public static void main(String[] args) {
		
		ReturnExample ret= new ReturnExample();
		
		int val=ret.annualSalary(1000,'P',"Kevin");
		System.out.println(val);
	
	}

}
