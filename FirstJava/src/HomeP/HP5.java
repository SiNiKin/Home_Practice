package HomeP;

import java.util.Scanner;

public class HP5 {

	public static void main(String[] args) {
		// 다이아몬드 찍기
		// 1. 다음과 같은 형태로 별직기를 진행해 보세요.  
		/*          힌트  : 공백, 별, 단(줄)
		      *
		     ***
		    *****
		   *******
		  *********
		   *******
		    *****
		     ***
		      *
		 */
		
		int dan = 5;
		
		for (int i = 0; i < dan; i++) {
			for (int s = 0; s < dan - i; s++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i*2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		dan = 4;
		for (int i = 0; i < dan; i++) {
			for (int s = 0; s < i + 2; s++) {
				System.out.print(" ");
			}
			for (int j = 0; j < dan*2 - (i*2) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 2. 1번의 코드를 활용하여 줄 수를 입력 받아서 그 줄 수 에 맞는 다이아몬드 별을 찍는 
		//   프로그램을 작성해 보세요. (단, 줄은 홀수로만 입력 받아야 합니다.)
		
		Scanner scan = new Scanner(System.in);
		System.out.print("몇 줄 그릴까요? ");
		int row = scan.nextInt();
		int row2 = (row+1)/2;
		
		if (row % 2 != 0) {
			
			for (int i = 0; i < row2; i++) {
				for (int s = 0; s < row2 - i; s++) {
					System.out.print(" ");
				}
				for (int j = 0; j < i*2 +1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			row2 -= 1;
			for (int i = 0; i < row2; i++) {
				for (int s = 0; s < i + 2; s++) {
					System.out.print(" ");
				}
				for (int j = 0; j < row2*2 - i*2 - 1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.println("=========짠!!=========");
		}else {
			System.out.println("잘못된 접근입니다. 홀수만 입력해주세요.");
		}
		
//		if (row % 2 != 0) {
//			
//			for (int i = 0; i < row; i++) {
//				for (int s = 0; s < row - i; s++) {
//					System.out.print(" ");
//				}
//				for (int j = 0; j < i*2 +1; j++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
//			row -= 1;
//			for (int i = 0; i < row; i++) {
//				for (int s = 0; s < i + 2; s++) {
//					System.out.print(" ");
//				}
//				for (int j = 0; j < row*2 - i*2 - 1; j++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
//			System.out.println("=========짠!!=========");
//		}else {
//			System.out.println("잘못된 접근입니다. 홀수만 입력해주세요.");
//		}


	}

}
