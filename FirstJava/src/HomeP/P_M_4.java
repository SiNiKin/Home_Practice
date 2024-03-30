package HomeP;

import java.util.Scanner;

public class P_M_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요> ");
		int d = scan.nextInt();
		String str = d % 2 == 0 ? "짝수" : "홀수";
		System.out.println("입력받은 수는 : " + str);

	}

}
