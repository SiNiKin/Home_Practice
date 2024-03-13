package HomeP;

import java.util.Scanner;

public class HP6 {

	public static void main(String[] args) {
		// numArr의 값들의 총합과 평균을 구해서 출력하세요.
		int[][] numArr = {
				{5, 5, 5, 5, 5},
				{10,10,10,10,10},
				{20,20,20},
				{30,30,30}
		};
		
		int total = 0;
		int result = 0;
		
		for (int i = 0; i < numArr.length; i++) {
			total += numArr[i].length;
			for (int j = 0; j < numArr[i].length; j++) {
				result += numArr[i][j];
			}
		}
		
		System.out.println("총 합 : " + result + "\n" + "평 균 : " + (result / total));
		
		
		// 1. 소수(PrimeNumber) 구하기
		//   소수는 1과 자기 자신만으로 나누어지는 수를 말함. 
		//   조건문과 반복문을 사용하여 100이하의 소수를 출력해 보세요
		//   (for문 안에 for문)
		
		int count;
		
		for (int i = 2; i < 100; i++) {
			count = 0;
			for(int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count += 1;
				}
			}
			
			if (count == 2) System.out.println(i + " ");
		}
		
		// 2. 단어 거꾸로 출력하기(reverse 출력)
		//   자바의 Scanner 객체를 이용하여 콘솔에 데이터를 입력
		//   입력된 데이터를 for문을 사용하여 거꾸로(reverse) 출력하세요
		//   (String.charAt(index)를 사용)
//		Scanner scan = new Scanner(System.in);
//		System.out.print("단어를 입력하세요 >>");
//		String str = scan.next();
//		String reverse = "";
//		
//		for (int i = str.length(); i > 0; i--) {
//			reverse += str.charAt(i-1);
//		}
//		System.out.print(reverse);
		
//		scan.close();
		
		// 3. 로또 번호 추출하기
		//   앞서 배운 난수를 활용하여, 중복되는 번호 없이 1 ~ 45까지의 숫자 중
		//   6개의 숫자를 랜덤추출하고, 콘솔에 출력하세요. 
		//   (while문에 for)
		
		
		System.out.println();
		// 4. 대문자가 입력된다면 소문자로 출력하고, 
		//   소문자가 입력된다면 대문자로 출력하는 프로그램을 작성해보세요
		//	 아스키 코드
		Scanner scan = new Scanner(System.in);
		System.out.print(">> ");
		char ch = scan.next().charAt(0);
		
		if (ch >= 'A' && ch <= 'Z') {
			ch = (char)(ch - 'A' + 'a');
		}else if(ch >= 'a' && ch <= 'z') {
			ch = (char)(ch - 'a' + 'A');
		}
		
		System.out.println(ch);
		
		System.out.println();
		// 5. 커피의 가격은 2000원, 10개 이상 구매하면 초과분에 대해서 
		//   커피는 1500원을 받는다. 
		//   커피의 개수를 입력받고, 총 가격이 얼만인지 계산하여 출력하는 
		//   프로그램을 만들어보세요!
		int norPrice = 2000;
		int disPrice = 1500;
		int totalPrice = 0;
		System.out.print("커피 몇잔? >> ");
		int coffee = scan.nextInt();
		
		if (coffee > 10) {
			totalPrice += (norPrice * 10) + (disPrice * (coffee - 10));
		}else {
			totalPrice += norPrice * coffee;
		}
		
		System.out.println("총 " + totalPrice + "원 입니다.");
		
		// 6. 램덤으로 알파벳 대문자 50개 생성하여 출력하는 프로그램을 만들어 보세요. 
		//   출력은 10줄 마다 줄바꿈해서 출력되게 해주세요. 
		//   예> 	DEFDEGSDFE
		//       	ADEFSGESGS
		//          ...

		
		
	}

}
