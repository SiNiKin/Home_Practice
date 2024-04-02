package HomeP;

public class P_M_21 {
	
	static int sumNum(int a, int b) {
		int sum = 0;
		
		if(a < b) {
			for(int i = a; i <= b; i++) {
				sum += i;
			}
		}else if(a > b) {
			for(int i = b; i <= a; i++) {
				sum += i;
			}
		}else {
			sum = a;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		
		System.out.println("7~9의 사이의 수의 합 : " + sumNum(7,  9));
		System.out.println("7~9의 사이의 수의 합 : " + sumNum(9,  7));
		System.out.println("7~9의 사이의 수의 합 : " + sumNum(5,  5));

	}
	

}
