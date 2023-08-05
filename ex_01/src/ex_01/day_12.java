package ex_01;
import java.util.Scanner;

public class day_12 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.print("정수 : ");
		int x = stdIn.nextInt();
		
//		System.out.print(x);
		System.out.printf("8진수는 %o 입니다.\n", x);
		System.out.printf("10진수는 %d 입니다.\n", x);
		System.out.printf("16진수는 %x 입니다.\n", x);
		
		

	}

}
