package HomeP;

import java.util.Scanner;

public class P_M_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		System.out.print("> ");
		int d = scan.nextInt();
		
		if (d < 0) {
			System.out.println(d + "은(는) 음의 정수입니다.");
		}else if (d > 0) {
			System.out.println(d + "은(는) " + (d%2==0 ? "짝수" : "홀수") + "입니다.");
		}else if (d == 0) {
			System.out.println("입력한 정수는 0입니다.");
		}

	}

}
