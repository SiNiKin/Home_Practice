package HomeP;

import java.util.Scanner;

public class P_M_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 두개를 입력하세요");
		System.out.print("> ");
		int d1 = scan.nextInt();
		System.out.print("> ");
		int d2 = scan.nextInt();
		
		if (d1 > d2) {
			System.out.println(d1 + "이 큰 수 입니다.");
		}else if (d1 < d2) {
			System.out.println(d2 + "이 큰 수 입니다.");
		}else if (d1 == d2) {
			System.out.println("같은 수 입니다.");
		}

	}

}
