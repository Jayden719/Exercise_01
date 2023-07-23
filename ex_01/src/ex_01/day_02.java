package ex_01;
import java.util.*;

public class day_02 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("x값 : ");
		double x = stdIn.nextDouble();
		
		System.out.print("y값 : ");
		double y = stdIn.nextDouble();
		
		System.out.println("합계는 : " + (x + y) + "입니다");
		System.out.println("평균은 : " + (x + y)/2 + "입니다");
				
		
	}

}
