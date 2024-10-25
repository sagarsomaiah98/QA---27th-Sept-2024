package Loops;

public class SwitchEx {

	public static void main(String[] args) {

		char grade='D';
		
		switch(grade) {
		case 'A':
			System.out.println("Best performance");
			break;
		case 'B':
			System.out.println("Good performance");
			break;
		case 'C':
			System.out.println("Average performance");
		break;	
		default:
			System.out.println("invalid grade");
		
		}

	}

}
