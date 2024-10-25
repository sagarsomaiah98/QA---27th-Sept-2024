package breakContinue;

public class ContinueEx {

	public static void main(String[] args) {
      int key=6;
		
		for(int i=1;i<20;i++) {
			if(key<=i)
				continue;//skip condition
			System.out.println(i);
		}

	
	}

}
