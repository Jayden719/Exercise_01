package ex_01;
import java.util.*;

public class day_04 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		//final 예약어를 통해 대입 불가한 상수값 형성 
		final double PI = 3.146; 
		
		System.out.println("구의 겉넓이와 부피를 구해보아요");
		System.out.println("반지름 : ");
		double r = stdIn.nextDouble();
		
		System.out.println("겉넓이는 : " + (4*PI*r*r) + "입니다");
		System.out.println("부피는 : " + (4/3.0 * PI * r * r * r) + "입니다");
		
		
	}

}
