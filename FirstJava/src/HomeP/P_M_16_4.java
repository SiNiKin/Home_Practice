package HomeP;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P_M_16_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] kakao = {"무지","네오","어피치","라이언","단무지"};
		
		System.out.print("검색할 카카오친구 > ");
		String friend = scan.next();		// 값 입력...
		
		int i = 0;
		while(i <= kakao.length) {
			if(kakao[i].equals(friend)) {	// 값 검사
				System.out.println(friend + "친구는 " + (i+1) + "번째에 있습니다.");
				break;	// 탈출
			}else {
				i++;	
			}
			
			if(i == kakao.length) {		// 끝까지 검사 했는데 없는 경우
				System.out.println(friend + "친구는 없습니다!");
				break;
			}

		}
		
		// 리스트 사용
//		Scanner scan = new Scanner(System.in);
//		String[] kakao = {"무지","네오","어피치","라이언","단무지"};
//		List<String> kakaoList = Arrays.asList(kakao);
//		
//		System.out.print("검색할 카카오친구 > ");
//		String friend = scan.next();
//		
//		boolean containsF = kakaoList.contains(friend);
//		
//		if(containsF == true) {
//			System.out.println(friend + "친구는 " + (kakaoList.indexOf(friend) + 1) + "번째에 있습니다.");
//		}else {
//			System.out.println(friend + "친구는 없습니다!");
//		}

	}

}
