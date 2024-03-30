package HomeP;

import java.util.Arrays;
import java.util.Scanner;

public class P_14_1 {

	public static void main(String[] args) {
		
		Scanner str = new Scanner(System.in);
		System.out.print("주민번호 13자리를 입력하세요 : ");
		String s = str.next();
		String[] sArr = s.split("");	
		
		if(sArr[7].equals("1")) {
			System.out.println("남성");
		}else if(sArr[7].equals("2")){
			System.out.println("여성");
		}
		
		
		str.close();
	}

}
