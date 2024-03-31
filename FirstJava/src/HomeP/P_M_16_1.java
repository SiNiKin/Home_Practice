package HomeP;

import java.util.Arrays;
import java.util.Scanner;

public class P_M_16_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] foodArr = new String[100];
		String cl = "그만";
		String c2 = null;
		
		int size = foodArr.length;
		
		System.out.println("# 먹고싶은 음식을 입력하세요!!");
		System.out.println("# 입력을 중지하려면 <그만>이라고 입력하세요.");
		
		int i = 0;
		while (i < size) {
			System.out.print("> ");
			foodArr[i] = scan.next();
			
			if(foodArr[i].equals(cl)) {
				System.out.println("입력 종료!!");
				break;
			}
			i++;			
		}
		
		System.out.print("내가 먹고싶은 음식들 : [");
		for (String k : foodArr) {
			System.out.print(k + " ");
			if(k.equals(null)) {
				System.exit(0);
			}
		}
		System.out.print("]");
		
		scan.close();
		
	}

}
