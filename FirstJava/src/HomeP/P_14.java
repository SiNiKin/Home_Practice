package HomeP;

import java.util.Scanner;

public class P_14 {

	public static void main(String[] args) {
		
		while(true) {
			Scanner str = new Scanner(System.in);
			System.out.print("아이디 등록 : ");
			String s = str.next();
			String result = "";
			
			if(s.length() < 5) {
				System.out.println("아이디는 5글자 이상으로 등록하세요.");
			}else {
				System.out.println(s.trim());
				break;
			}
		}

	}

}
