package ex_01;
import java.util.Scanner;

public class day_13 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("������ x, y, �� �հ�� ����� ���մϴ�");
		System.out.println("x��: "); int x = stdIn.nextInt();
		System.out.println("y��: "); int y = stdIn.nextInt();
		System.out.println("z��: "); int z = stdIn.nextInt();
		
		int sum = x + y + z;
		double ave = (x + y + z) / 3;
		double avg = (double)(x + y + z) / 3;
		System.out.println("�հ�� " + sum + "�Դϴ�");
		System.out.printf("����� %.3f �Դϴ�. \n", ave);
		System.out.printf("����ȯ ����� %.3f �Դϴ�. \n", avg);
		// TODO Auto-generated method stub

	}

}
