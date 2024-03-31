package HomeP;

import java.util.Scanner;

public class P_M_16_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] kakao = new String[100];
		int size = kakao.length;
		
		String cl = "그만";
		
		int i = 0;
		while(i < size) {
			System.out.print("입력할 카카오친구> ");
			for(int a = 0; a < size; a++) {
				for(int j = 0; j < i; j++) {
					if(kakao[i].equals(kakao[j])) {
						System.out.println("이미 입력된 친구 입니다.");
						System.out.println("------------------");
						return;
					}else {
						kakao[i] = scan.next();
					}
				}
			}
			
			if(kakao[i].equals(cl)) {
				System.out.println(i + "명의 카카오 친구가 입력 되었습니다.");
				break;
			}else {
				System.out.println(kakao[i] + "입력 성공!");
				System.out.println("------------------");
			}
			

			i++;
		}
		
		scan.close();

	}

}
