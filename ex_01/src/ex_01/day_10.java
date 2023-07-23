package ex_01;

public class day_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("45 & 25 = " + (45 & 25));
		System.out.println("45 | 25 = " + (45 | 25));
		System.out.println("45 ^ 25 = " + (45 ^ 25));
		System.out.println("~45 = " + (~45));
		
		int result = 0;
		result += 10; // result = result + 10
		System.out.println(result);
		result -= 5; //result = result - 5
		System.out.println(result);
		result *= 3; // result = result * 3
		System.out.println(result);
		result /= 5; // result = result / 5
		System.out.println(result);
		result %=2 ; 
		System.out.println(result);

		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + "점은" + "\t" +  grade + "등급입니다");
	}

}
