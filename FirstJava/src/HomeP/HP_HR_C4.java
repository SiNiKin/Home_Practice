package HomeP;

public class HP_HR_C4 {
	
	static class Account {
		String name;
		int password;
		int balance;
		
		Account(String name, int password, int balance) {
			this.name = name;
			this.password = password;
			this.balance = balance;
		}
		
		void deposit(int plus) {
//			System.out.println(plus + "원 입금 되었습니다.");
			balance += plus;
		}
		
		void withDrwa(int minus) {
//			System.out.println(minus + "원 출금 되었습니다.");
			balance -= minus;
		}
		
		void getbalance(){
			System.out.println(name + "님의 계좌 잔액은 : " + balance + "원 입니다.");
		}
	}

	public static void main(String[] args) {
		Account myAcc = new Account("홍길동", 1234, 3600);
		
		myAcc.deposit(6400);
		myAcc.withDrwa(2000);
		myAcc.getbalance();
	}

}
