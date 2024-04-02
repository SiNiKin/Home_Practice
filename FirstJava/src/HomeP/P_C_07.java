package HomeP;

public class P_C_07 {
	
	static class Calculator {
		int result;
		
		int add(int a) {
			return result += a;
		}
		
		int add(int a, int b) {
			return result += a + b;
		}
		
		int add(int a, int b, int c) {
			return result += a + b + c;
		}
		
		int add(int a, int b, int c, int d) {
			return result += a + b + c + d;
		}
	}
	
	

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		cal.add(1);
		System.out.println("cal1의 누적값 : " + cal.result);
		cal.add(2, 3);
		System.out.println("cal1의 누적값 : " + cal.result);
		cal.add(1, 2, 3);
		System.out.println("cal1의 누적값 : " + cal.result);
		cal.add(1, 2, 3, 4);
		System.out.println("cal1의 누적값 : " + cal.result);
		
	}

}
