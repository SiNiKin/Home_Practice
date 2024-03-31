package HomeP;

public class P_M_20 {
	
	static int primeNum(int a) {
		int cnt = 0;
		int sum = 0;
		for(int i = 2; i <= a; i++) {
			cnt = 0;
			for(int k = 1; k <= i; k++) {
				if(i % k == 0) {
					cnt++;
				}
			}
			if (cnt == 2) {
				sum += 1;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		
		System.out.println("소수의 개수 : " + primeNum(11));
		
	}

}
