package HomeP;

import java.util.Scanner;

public class HP1 {

	public static void main(String[] args) {
//		1. 100부터 1까지 순서대로 출력해보세요.
		
		/*
		 * 	for (int i = 100; i > 0; i--) {
		 * 		System.out.println(i);
		 * 	}
		 */


//		2. 1 ~ 200 사이의 수 중에서 2 또는 3의 배수가 아닌 수들의 총 합을 구해보세요.
		
		/*
		 *  int sum = 0;
		 *  for (int i = 1; i <= 200; i++) {
		 * 		if (!(i % 2 == 0 || i % 3 == 0)) {
		 * 			sum += i;
		 * 		}
		 * 	}
		 *  System.out.println(sum);
		 */

//		3. 1 + (1+2) + (1+2+3) + (1+2+3+4) + (1+2+3+4+5)+ .... +(1+2+3+4+5+6+7+8+9+10)
//		의 결과를 구해보세요.
		
		int result = 0;
		for (int i = 1; i <= 10; i++) {
			if(i != 1) System.out.print("+(");
			for (int j = 1; j <= i; j++) {
				result += j;
				System.out.print(j);
				if (j != i) System.out.print("+");
			}
			if(i != 1) System.out.print(")");
		}
		System.out.println("=" + result);
		
		int sum = 0;
		int sum2 = 0;
		for (int i = 1; i <=10; i++) {
			sum += i;
			sum2 += sum;
		}
		System.out.println(sum2);
		

//		4. 1 ~ 101미만의 임의의 정수를 생성하고, 그 숫자가 짝수인지 홀수인지 출력하세요.(3항 연산식을 사용)
		
		int rand = (int)(Math.random()*100);
		System.out.println("랜덤 수 : " + rand);
		System.out.println((rand % 2 == 0 ? "짝수입니다." : "홀수입니다."));

//		5. -5 ~ 5 사이의 임의의 정수를 생성하고, 삼항연산식을 사용하여 절대값을 출력하세요
		
		int rand5 = 5 - (int)(Math.random()*11);
		System.out.println("랜덤 수 : " + rand5);
		System.out.println((rand5 >= 0 ? "절대값은" + rand5 : "절대값은" + rand5*-1));

//		6. 정수를 입력받아 그 수가 짝수 인지 홀수인지 출력하는 프로그램을 작성하세요.(3항 연산식을 사용하세요)
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요 >> ");
		int st = scan.nextInt();
		System.out.println((st % 2 == 0 ? "짝수입니다" : "홀수입니다."));

//		7. 키와 나이를 입력받아서 놀이기구에 탑승 여부를 결정하는 프로그램을 작성하세요.
//		(조건 : 키 - 140 이상, 나이는 8살 이상)
		
		System.out.println("키와 나이를 입력하세요");
		System.out.print("키 >> ");
		double height = scan.nextDouble();
		System.out.print("나이 >> ");
		int age = scan.nextInt();
		
		
		if (height >= 140) {
			if (age >= 8) {
				System.out.println("놀이기구 탑승이 가능합니다");
			}else {
				System.out.println("놀이기구 탑승이 불가능합니다..");
			}
		}else {
			System.out.println("놀이기구 탑승이 불가능합니다..");
		}

//		8. 정수 두개를 입력받아서 큰수를 출력. 같은 경우에는 같다고 출력하는 프로그램을 작성하세요.
		
		System.out.println("두 수를 입력하세요");
		System.out.print(" >> ");
		int num1 = scan.nextInt();
		System.out.print(" >> ");
		int num2 = scan.nextInt();
		
		if (num1 > num2) {
			System.out.println("큰 수 : " + num1);
		}else if (num1 < num2) {
			System.out.println("큰 수 : " + num2);
		}else {
			System.out.println(num1 + " , " +  num2 + " 두 수가 같습니다.");
		}

//		9. 정수를 입력받아서 양의 정수인 경우에는 짝수, 홀수를 구분하고, 0이면 0입니다를 출력,
//		음수인 경우에는 음의 정수입니다를 출력하는 프로그램을 작성하세요.
		
		System.out.print("정수를 입력하세요 >>");
		int num9 = scan.nextInt();
		
		if (num9 > 0) {
			System.out.print("양의 정수이며, ");
			if (num9 % 2 == 0) {
				System.out.println("짝수입니다.");
			}else {
				System.out.println("홀수입니다.");
			}
		}else if (num9 == 0) {
			System.out.println("0입니다.");
		}else {
			System.out.println("음의 정수입니다.");
		}

//		10. Scanner를 사용하여 메뉴를 입력받고, 메뉴의 가격을 출력하는 프로그램을 작성하세요.
//		(switch를 사용) 수박, 사과, 멜론, 포도, 귤을 구매시 가격을 출력하는 프로그램. 

		System.out.println("과일을 골라주세요 ! : ");
		String menu = scan.next();
		
		switch (menu) {
		case "수박":
			System.out.println("1만원입니다.");
			break;
		case "사과":
			System.out.println("2만원입니다.");
			break;
		case "멜론":
			System.out.println("3만원입니다.");
			break;
		case "포도":
			System.out.println("4만원입니다.");
			break;
		case "귤":
			System.out.println("5만원입니다.");
			break;
		default:
			System.out.println("그런거 안팝니다.");
			break;
		}
		
		scan.close();

	}

}
