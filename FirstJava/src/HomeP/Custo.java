package HomeP;

import java.util.Scanner;

public class Custo {
	
	static final int MAX = 100;
	
	// 입력, 이전, 다음, 현재, 수정, 삭제, 종료
	// 고객 정보를 저장할 변수를 배열로 선언 : 이름, 성별, 이메일, 출생년도
	static String[] nameList = new String[MAX];
	static String[] genderList = new String[MAX];
	static String[] emailList = new String[MAX];
	static int[] birthYearList = new int[MAX];
	
	static int index = -1;
	
	static int count = 0;
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			System.out.printf("[INFO] 고객 수 : %d, 인덱스 : %d\n",count,index);
			System.out.println("메뉴를 입력하세요.");
			System.out.println("(I)nsert, (P)revious, (N)ext, (C)urrent, (U)pdate, (D)elete, (Q)uit");
			System.out.print("메뉴 입력 : ");
			String menu = scan.next();
			menu = menu.toLowerCase();
			
			switch(menu.charAt(0)) {
			case 'i':
			case 'ㅑ':
				System.out.println("고객 정보 입력을 시작합니다.");
				if(count >= MAX) {
					System.out.println("더이상 입력 할 수 없습니다.");
				}else {
					insertCustomerData();
					System.out.println("고객 정보를 저장했습니다.");
				}
				break;
			case 'p':
			case 'ㅔ':
				System.out.println("이전 데이터를 출력합니다.");
				if(index <= 0) {
					System.out.println("이전 데이터가 없습니다.");
				}else {
					index--;
					printCustomerData(index);
				}
				break;
			case 'ㅜ':
			case 'n':
				System.out.println("다음 데이터를 출력합니다.");
				if(index >= count -1) {
					System.out.println("다음 데이터가 없습니다.");
				}else {
					index++;
					printCustomerData(index);
				}
				break;
			case 'c':
			case 'ㅊ':
				System.out.println("현재 데이터를 출력합니다.");
				if(index >= 0 && index < count) {
					printCustomerData(index);
				}else {
					System.out.println("출력할 데이터가 선택되지 않았습니다.");
				}
				break;
			case 'ㅕ':
			case 'u':
				System.out.println("현재 데이터를 업데이트 합니다.");
				if(index >= 0 && index < count) {
					updateCustomerData(index);
				}else {
					System.out.println("업데이트 할 데이터가 선택되지 않았습니다.");
				}
				break;
			case 'd':
			case 'ㅇ':
				System.out.println("현재 데이터를 삭제 합니다.");
				if(index >= 0 && index < count) {
					 deleteCustomerData(index);;
				}else {
					System.out.println("삭제 할 데이터가 선택되지 않았습니다.");
				}
				break;
			case 'q':
			case 'ㅂ':
				System.out.println("프로그램을 종료합니다.");
				scan.close();
				System.exit(0);
				break;
			default:
				System.out.println("명령어 입력이 잘못 되었습니다. 다시 해주세요.");
			}
		}
		

	}
	
	// 고객 정보 입력
	public static void insertCustomerData() {
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("성별 : ");
		String gender = scan.next();
		System.out.print("이메일 : ");
		String email = scan.next();
		System.out.print("출생년도 : ");
		int birthYear = scan.nextInt();
		
		nameList[count] = name;
		genderList[count] = gender;
		emailList[count] = email;
		birthYearList[count] = birthYear;
		
		count++;
	}
	
	// 고객 정보 출력
	public static void printCustomerData(int index) {
		System.out.println("==========CUSTOMER INFO==========");
		System.out.println("이름 : " + nameList[index]);
		System.out.println("성별 : " + genderList[index]);
		System.out.println("이메일 : " + emailList[index]);
		System.out.println("출생년도 : " + birthYearList[index]);
		System.out.println("=================================");
	}
	
	// 고객 정보 수정
	public static void updateCustomerData(int index) {
		System.out.println("-------UPDATE CUSTOMER INFO-------");
		System.out.println("이름 (" + nameList[index] + ") :");
		String name = scan.next();
		System.out.println("성별 (" + genderList[index] + ") :");
		String gender = scan.next();
		System.out.println("이메일 (" + emailList[index] + ") :");
		String email = scan.next();
		System.out.println("출생년도 (" + birthYearList[index] + ") :");
		int birthYear = scan.nextInt();
		
		
		nameList[index] = name;
		genderList[index] = gender;
		emailList[index] = email;
		birthYearList[index] = birthYear;
	}
	
	// 고객 정보 삭제
	public static void deleteCustomerData(int index) {
		for (int i = index; i < count-1; i++) {
			nameList[i] = nameList[i + 1];
			genderList[i] = genderList[i + 1];
			emailList[i] = emailList[i + 1];
			birthYearList[i] = birthYearList[i + 1];
		}
		count--;
	}

}
