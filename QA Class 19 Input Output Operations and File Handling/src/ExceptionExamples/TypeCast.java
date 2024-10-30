package ExceptionExamples;

public class TypeCast {

	public static void main(String[] args) {
	
		int a=10;
		System.out.println(a);
		
		double b=a;
		System.out.println(b);
		
		String c= String.valueOf(a);
		//System.out.println(c);
		//System.out.println(a+20);
		//System.out.println(c+20);
		
		double d=12.76;
		int m=(int)d;
		System.out.println(m);
		
		String v="Kevin";
		int t=Integer.parseInt(v);
		System.out.println(v+50);
		System.out.println(t+50);
		
		
		
		
		
	}

}
