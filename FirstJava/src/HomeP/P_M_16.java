package HomeP;

import java.util.Scanner;

public class P_M_16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("금액을 투입해 주세요 > ");
		int wallet = scan.nextInt();
		
		while(true) {
			System.out.println("남은금액 : " + wallet);
			System.out.println("[1]뎀이소다: 400원, [2]밀킥스: 500원, [3]코카콜라: 600원, [4]잔돈받기");
			System.out.print("음료수 선택 > ");
			String sel = scan.next();		
			
			switch(sel.charAt(0)) {
			case '1':
				if (wallet < 400) {
					System.out.println("금액이 부족합니다. 돈을 넣어주세요!");
				}else {
					System.out.println("뎀이소다를 받았습니다.");
					wallet -= 400;
				}
				break;
			case '2':
				if (wallet < 500) {
					System.out.println("금액이 부족합니다. 돈을 넣어주세요!");
				}else {
					System.out.println("밀킥스를 받았습니다.");
					wallet -= 500;
				}
				break;
			case '3':
				if (wallet < 600) {
					System.out.println("금액이 부족합니다. 돈을 넣어주세요!");
				}else {
					System.out.println("코카콜라를 받았습니다.");
					wallet -= 600;
				}
				break;
			case '4':
				System.out.println("남은 금액" + wallet + "을 반환합니다.");
				System.exit(0);
				break;
			default:
				System.out.println("입력값이 잘못 되었습니다.");
				break;
			}
		}

	}

}
