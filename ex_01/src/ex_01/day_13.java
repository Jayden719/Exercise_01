package ex_01;
import java.util.Scanner;

public class day_13 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수값 x, y, 의 합계와 평균을 구합니다");
		System.out.println("x값: "); int x = stdIn.nextInt();
		System.out.println("y값: "); int y = stdIn.nextInt();
		System.out.println("z값: "); int z = stdIn.nextInt();
		
		int sum = x + y + z;
		double ave = (x + y + z) / 3;
		double avg = (double)(x + y + z) / 3;
		System.out.println("합계는 " + sum + "입니다");
		System.out.printf("평균은 %.3f 입니다. \n", ave);
		System.out.printf("형변환 평균은 %.3f 입니다. \n", avg);
		// TODO Auto-generated method stub

	}

}
