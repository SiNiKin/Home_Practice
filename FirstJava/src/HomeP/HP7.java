package HomeP;

import java.util.Arrays;

public class HP7 {

	public static void main(String[] args) {
		// 1. 1000개짜리 int형 배열을 생성한 뒤 모든 값을 1 - 100사이의 
		//    랜덤 숫자로 채워보세요
		
		int[] a = new int[1000];
		for (int i = 0; i < a.length -1; i++) {
			a[i] = (int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(a));
		
		// 2. 1000개의 램덤 숫자들 중 각 숫자가 몇번씩 나왔는지 세어 출력하세요 
		
//		int[] b = new int[100];
//		
//		for (int i = 0; i < 100; i++) {
//			for (int j = 0; j < a.length; j++) {
//				if(a[j] == i) {
//					b[i - 1]++; 
//				}
//			}
//		}
//		
//		for(int i = 0; i <)
		
		
		// numArr의 값들의 총합과 평균을 구해서 출력하세요.
		int[][] numArr = {
				{5, 5, 5, 5, 5},
				{10,10,10,10,10},
				{20,20,20},
				{30,30,30}
		};
		
		int sum = 0;
		int ave = 0;
		
		for(int i = 0; i < numArr.length; i++) {
			ave += numArr[i].length;
			for(int j = 0; j < numArr[i].length; j++) {
				sum += numArr[i][j];
			}
		}
		System.out.println(sum);
		System.out.println(sum/ave);

	}

}
