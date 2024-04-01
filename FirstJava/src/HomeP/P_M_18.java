package HomeP;

import java.util.Arrays;

public class P_M_18 {
	
	static String java(int a) {
		String sArr[] = new String[a];
		String st1 = "자";
		String st2 = "바";
		
		String sum = "";
		
		for(int i = 0; i < a; i++) {
			if(i % 2 == 0) {
				sArr[i] = st1;
			}else {
				sArr[i] = st2;
			}
		}
		
		for(int i = 0; i < sArr.length; i++) {	// 배열출력
			sum += sArr[i];
		}
		
		return sum;
	}

	public static void main(String[] args) {
		
		String str = java(6);
		System.out.println(str);
		
	}

}
