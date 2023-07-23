package ex_01;

public class day_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte a = 1;
		byte b = 2;
		int c = 5;
		long d = 10L;
		
		int result1 = a + b;
		int result2 = c - (a+b);
		long result3 = a + b + c - d;
		double result4 = (double)a/b;
		int result5 = c % b;
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
		System.out.println("result5 : " + result5);
	}

}
