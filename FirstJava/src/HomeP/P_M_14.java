package HomeP;

import java.util.Scanner;

public class P_M_14 {
	public static void main(String[] args) {
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.print("정수를 입력하세요 : ");
	      int d = scan.nextInt();
	      int sum = 0;
	      int cnt = 0;
	      
	      for (int i = 2; i <= d; i++) {
	         cnt = 0;
	         for(int j = 1; j <= i; j++) {
	        	 if(i % j == 0) {
	        		 cnt ++;
	        	 }
	         }
        	 if (cnt == 2) {
        		 sum += i;
        	 }
	      }
	         
	      System.out.println(d + "까지 소수의 합은 : " + sum);

	   }

}
