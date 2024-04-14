import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Customer {

	private String name;//이름
	private String gender;//성별
	private String email;//이메일
	private int birthYear;//태어난 연도
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}	
	
}

public class Customermanager {
	
	
	static final int MAX = 100;
	
	static ArrayList<Customer> cusList = new ArrayList<>(MAX);
	
	static int count;
	
	static Scanner scan = new Scanner(System.in);
	
	private static ArrayList<String> readFile() {
		ArrayList<String> strs = new ArrayList<String>();
		try(Reader reader = new FileReader("C:\\Users\\USER\\CusomerM\\CusomerManager.txt");
			BufferedReader bufReader = new BufferedReader(reader) ){
			
			String line = "";
			String[] arr = new String[4];
			boolean isAddall = false;
			int tmp = 0;
			int tmp2 = 0;
			int i = 0;
			while((line = bufReader.readLine()) != null) {
				tmp = line.indexOf("이름");
				tmp2 = line.indexOf(",");
				arr[0] = line.substring(tmp, tmp2);
				
				tmp = line.indexOf("성별");
				arr[1] = line.substring(tmp, line.indexOf(",", tmp));
				
				tmp = line.indexOf("이메일");
				arr[2] = line.substring(tmp, line.indexOf(",", tmp));
				
				tmp = line.indexOf("출생년도");
				arr[3] = line.substring(tmp);
				
				strs.add(arr[0] + "\n" + arr[1] + "\n" + arr[2] + "\n" + arr[3] + "\n");
				System.out.println(strs.get(i));
				isAddall = cusList.add((Customer) Arrays.asList(strs.get(i)));
				count++;
				i++;
			}
		}catch (FileNotFoundException e) {
			System.out.println("파일실패" + e.getMessage());
		}catch (IOException e) {
			System.out.println(e);
		}
		
		return strs;
	}

	public static void main(String[] args) throws Exception {
		
		String filepath = "C:\\Users\\USER\\CusomerM";
	    String filename = "CusomerManager.txt";

		while(true) {
			// 고객 메뉴
			System.out.printf("\n[INFO] 고객 수 : %d\n", count);
			System.out.println("메뉴를 입력하세요.");
			System.out.println("(I)nsert, (S)elect, (U)pdate, (D)elete, (Q)uit");
			System.out.print("메뉴 입력 : ");
			String menu = scan.next();
			menu = menu.toLowerCase(); 
			
			switch(menu.charAt(0)) {
			case 'ㅑ':
			case 'i':  // insert
				System.out.println("고객 정보 입력을 시작합니다.");
				if (count >= MAX) {
					System.out.println("더 이상 저장할 수 없습니다. ");
				}else {
					//저장
					insertCustomerData();
					System.out.println("고객 정보를 저장했습니다.");
				}
				break;
			case 's':
			case 'ㄴ':
				System.out.println("데이터를 출력합니다.");
				if(count > 0) {
					printCustomerData(selectCustomerData());
				}else {
					System.out.println("출력할 데이터가 선택되지 않았습니다.");
				}
				break;
			case 'ㅕ':
			case 'u':
				System.out.println("데이터를 수정합니다.");
				if(count > 0) {
					updateCustomerData(selectCustomerData());
				}else {
					System.out.println("수정할 데이터가 선택되지 않았습니다.");
				}
				break;
			case 'ㅇ':
			case 'd':
				System.out.println("데이터를 삭제합니다.");
				if (count > 0) {
					deleteCustomerData(selectCustomerData());
				}else {
					System.out.println("삭제할 데이터가 선택되지 않았습니다.");
				}
				break;
			case 'ㅂ':
			case 'q':  //종료
				System.out.println("프로그램을 종료합니다.");
				scan.close();
				System.exit(0); //프로세스 종료
				break;
			default :
				System.out.println("메뉴를 잘 못 입력했습니다. 다시 선택해 주세요");
			}
		}

	}

	public static void insertCustomerData() {
		File file = new File("C:\\Users\\USER\\CusomerM\\CusomerManager.txt");
		
		FileWriter out = null;
		
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("성별 : ");
		String gender = scan.next();
		System.out.print("이메일 : ");
		String email = scan.next();
		System.out.print("출생년도 : ");
		int birthYear = scan.nextInt();
		
		Customer c1 = new Customer();
		
		try {
			out = new FileWriter(file, true);
			out.write("이름 : " + name + ",\t");
			out.write("성별 : " + gender + ",\t");
			out.write("이메일 : " + email + ",\t");
			out.write("출생년도 : " + birthYear + "\n");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {out.close();} catch (Exception e2) {}
		}

		cusList.add(count, c1);
		count ++;
		
	}
	
	public static Customer selectCustomerData() {
		while (true) {
			System.out.println("출력, 수정 또는 삭제할 사람의 이름을 입력하세요.");
			String name = scan.next();
			for (int i = 0; i < count; i++) {
				if(cusList.get(i).getName().equals(name)) {
					return cusList.get(i);
				}
			}
			System.out.println("입력하신 이름을 가진 데이터가 없습니다.");
		}
	}
	
	public static void printCustomerData(Customer cus) {
		System.out.println("==========CUSTOMER INFO==========");
		System.out.print("이름 : "+cus.getName() + "\t");
		System.out.print("성별 : "+cus.getGender()+ "\t");
		System.out.print("이메일 : "+cus.getEmail()+ "\t");
		System.out.print("출생년도 : "+ cus.getBirthYear()+ "\n");
		System.out.println("=================================");
	}
	
	public static void updateCustomerData(Customer cus) {
		System.out.println("-------UPDATE CUSTOMER INFO-------");
		System.out.print("이름("+cus.getName()+") :");
		String name = scan.next();
		if(name.length() != 0) { 
			cus.setName(name);
		}
		System.out.print("성별("+cus.getGender()+") : ");
		cus.setGender(scan.next());
		System.out.print("이메일("+cus.getEmail()+") : ");
		cus.setEmail(scan.next());
		System.out.print("출생년도("+cus.getBirthYear()+") : ");
		cus.setBirthYear(scan.nextInt());
	}
	
	public static void deleteCustomerData(Customer cus) {
		for (int i = 0; i < count - 1; i++) {
			if(cusList.get(i).getName().equals(cus.getName())) {
				cusList.remove(i);
			}
		}
		System.out.println("데이터가 삭제되었습니다.");
		count --;
	}
	

}