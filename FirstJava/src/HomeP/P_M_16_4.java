package HomeP;

import java.util.Scanner;

public class P_M_16_4 {

	public static void main(String[] args) {
		String[] kakao = {"무지","네오","어피치","라이언","단무지"};
		
		Scanner scan = new Scanner(System.in);
		
		int size = kakao.length;
		int i = 0;
		while(i < size) {
			System.out.print("검색할 카카오친구 > ");
			String friend = scan.next();
			if(kakao[i].equals(friend)) {
				System.out.println(friend + "친구는 " + i + "번째에 있습니다.");
			}else {
				System.out.println(friend + "친구는 없습니다!");
				break;
			}
			i++;
		}

	}

}
