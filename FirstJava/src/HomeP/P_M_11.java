package HomeP;

import java.util.Scanner;

public class P_M_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("구구단 단수를 입력하세요 : ");
		int dan = scan.nextInt();
		System.out.println("랜덤 구구단" + dan + "단");
		System.out.println("-----------------------");
		
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + " x " + i + " = " + dan*i);
		}
		
		scan.close();

	}

}
