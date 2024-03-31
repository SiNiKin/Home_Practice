package HomeP;

import java.util.Scanner;

public class P_M_12 {

	public static void main(String[] args) {
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.print("정수를 입력하세요 : ");
	      int d = scan.nextInt();
	      
	      int cnt = 0;
	      for(int j = 1; j <= d; j++) {
	         if(d % j == 0) {
	            cnt ++;
	         }
	      }
	         
	      // 소수인 경우... 
	      if (cnt == 2) System.out.println(d + "는(은) 소수입니다.");
	      else System.out.println(d + "는(은) 소수가 아닙니다." + cnt);

	}

}
