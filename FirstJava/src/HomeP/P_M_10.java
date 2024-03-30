package HomeP;

import java.util.Arrays;
import java.util.Scanner;

public class P_M_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("수를 입력하세요 > ");
		int d = scan.nextInt();
		
		int[] iarr = new int[d];
		
		for (int i = 0; i < iarr.length; i++) {
			iarr[i] = i+1;
		}
		
		System.out.println(Arrays.toString(iarr));
		
		scan.close();
	}

}
