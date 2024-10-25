package StringfunctionExamples;

public class String_Trim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="               Selenium is a          automation tool               ";
		
		System.out.println(s);
		
		System.out.println(s.trim());
		
		String s1=s.replaceAll("Selenium", "Cypress");
		System.out.println(s1);
		

	}

}
