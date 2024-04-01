package HomeP;

import java.util.Scanner;

public class P_M_16_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] kakao = new String[100];
		
		int i = 0;
		while(true) {
			System.out.print("입력할 카카오친구> ");
			String friend = scan.next();		// 입력받기...
			
			for(int k = 0; k <= i; k++) {		// 중복 검사 반복문...
				if(kakao[k] == null) {			// null값인 경우 요소 추가...
					kakao[i] = friend;
				}else if(kakao[k].equals(friend)) {		// 중복일 경우...
					System.out.println("이미 입력된 친구 입니다.");
					System.out.println("------------------");
					System.out.print("입력할 카카오친구> ");
					friend = scan.next();
				}
			}
			
			if(friend.equals("그만")) {
				System.out.println(i + "명의 카카오 친구가 입력 되었습니다.");
				break;
			}else {
				System.out.println(friend + "입력 성공!");
				System.out.println("------------------");
			}
			i++;
		}
		
		scan.close();

	}

}