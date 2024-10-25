package breakContinue;

public class ContinueEx1 {

	public static void main(String[] args) {
	
		for(int i=3;i<30;i++) {
			if(i%3==0)
				continue;
			System.out.println(i);
		}
	}

}
