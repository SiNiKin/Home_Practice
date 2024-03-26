package HomeP;

public class Calculator {
	static double pi = Math.PI;
	
	int result;

	private int r;
	
	int add(int a) {
		result += a;
		return result;
	}
	
	int add(int a, int b) {
		result += a + b;
		return result;
	}
	
	int add(int a, int b, int c) {
		result += a + b + c;
		return result;
	}
	
	int add(int a, int b, int c, int d) {
		result += a + b + c + d;
		return result;
	}
	
	public static double circle(int r) {
		return (r * 2) * pi;
	}
	
//	public static double circle_area(int r) {
//		return (r * r) * pi;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("원주율 : " + pi);
		System.out.println("원의 둘레 : " + circle(10));
	}

}
