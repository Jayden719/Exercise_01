package ex_01;
import java.util.*;
public class day_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("삼각형의 넓이를 구해봐요");
		
		System.out.println("삼각형 밑변의 길이 : " );
		double width = stdIn.nextDouble();
		
		System.out.println("삼각형 높이의 길이 : ");
		double height = stdIn.nextDouble();
		
		System.out.println("넓이는 " + (width * height / 2) + "입니다");

	}

}
