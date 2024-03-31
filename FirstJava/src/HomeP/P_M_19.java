package HomeP;

public class P_M_19 {
	
	static int sum(int n) {
		int result = 0;
		for (int i = 1; i <= n; i++) {
			if(n % i == 0) {
				result += i;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		
		System.out.println(sum(5));
		System.out.println(sum(6));
		
	}

}
