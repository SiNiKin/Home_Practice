package HomeP;

import java.util.Scanner;

public class P_M_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("구입할 메뉴는?");
		System.out.println("[수박, 사과, 멜론, 포도, 귤]");
		
		System.out.print("> ");
		String fru = scan.next();
		
		switch (fru){
		case "수박" :
			System.out.println(fru + "의 가격은 2만원입니다.");
			break;
		case "사과" :
		case "멜론" :
			System.out.println(fru + "의 가격은 1만원입니다.");
			break;
		case "포도" :
			System.out.println(fru + "의 가격은 3만원입니다.");
			break;
		case "귤" :
			System.out.println(fru + "의 가격은 6만원입니다.");
			break;
		default:
			System.out.println(fru + "는 메뉴에 없습니다. \n다시 입력해주세요.");
			break;
		}

		scan.close();
	}

}
