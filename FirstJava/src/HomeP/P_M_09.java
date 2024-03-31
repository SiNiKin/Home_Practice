package HomeP;

public class P_M_09 {

	public static void main(String[] args) {
		
		int i = 0;
		int sum = 0;
		
		while (i < 100) {
			i++;
			if(i % 3 == 0) {
				sum += i;
			}
		}
		
		System.out.println("1~100까지 3의 배수의 합 : " + sum);
		
		int i1 = 0;
		int sum1 = 0;
		int result = 0;
		
		while (i1 < 100) {
			i++;
			result = i1 % 3 == 0 ? sum1+=i1 : i1++;
		}
		
		System.out.println("3항 연산식을 이용한 1~100까지 3의 배수의 합 : " + sum1);

	}

}
