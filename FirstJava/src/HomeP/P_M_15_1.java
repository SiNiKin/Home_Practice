package HomeP;

import java.util.Scanner;

public class P_M_15_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int O_cnt = 0;
		int X_cnt = 0;
		
		System.out.println("-------------");
		
		while(true) {
			int d1 = (int)(Math.random() * 100) + 1;
			int d2 = (int)(Math.random() * 100) + 1;
			System.out.println(d1 + " + " + d2 + " = " + " ? ");
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요.");
			System.out.print("> ");
			int result = scan.nextInt();
			
			if (result == (d1 + d2)) {
				O_cnt++;
				System.out.println("정답입니다!!");
			}else if (result != (d1 + d2) && result != 0){
				X_cnt++;
				System.out.println("틀렸는데요??");
			}else if (result == 0){
				System.out.println("프로그램을 종료합니다.");
				System.out.println("-------------");
				System.out.println("정답 횟수 : " + O_cnt + "회");
				System.out.println("오답 횟수 : " + X_cnt + "회");
				break;
			}
			
			System.out.println("-------------");
			
		}
		
		scan.close();

	}

}
