package customermanager;

import java.util.Scanner;

public class CustomerManager {

	public static void main(String[] args) {
		// 이전에 만들어 놓은 고객관리 프로그램을 OOP형식으로 변경하여 재 프로그래밍을 진행!
		// 1. Customer 클래스를 생성하고,
		// 2. 관련 프로그램을 위에 생성한 Customer 클래스 기준으로 재작성하세요!
		
		
		
	}
	
	class Customer{
		static final int MAX = 100;
		
		String[] nameList = new String[MAX];
		String[] genderList = new String[MAX];
		String[] emailList = new String[MAX];
		int[] birthYearList = new int[MAX];
		
		int index = -1;
		int count = 0;
		
		Scanner scan = new Scanner(System.in);
		
		//고객 정보 입력
		void insertCustomerData() {
			System.out.println("이름 : ");
			String name = scan.next();
			System.out.println("성별 : ");
			String gender = scan.next();
			System.out.println("이메일 : ");
			String email = scan.next();
			System.out.println("출생년도 : ");
			int birthYear = scan.nextInt();
			
			//고객 객체들 배열에 저장
			nameList[count] = name;
			genderList[count] = gender;
			emailList[count] = email;
			birthYearList[count] = birthYear;
			count++;
		}
		
		
	}

}