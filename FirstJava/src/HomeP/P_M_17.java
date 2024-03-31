package HomeP;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class P_M_17 {
	
	static void method1() {
		System.out.println("안녕");
	}
	
	static String method2(String str) {
		return str;
	}
	
	static void method3(int a, int b, double c) {
		System.out.println(a + " + " + b + " + " + c + " = " + (a+b+c));
	}
	
	static String method4(int ad) {
		String result = ad%2 == 0 ? "짝수" : "홀수";
		return result;
	}
	
	static void method5(String s, int r) {
		for(int i = 0; i < r; i++) {
			System.out.print(s + " ");
		}
	}
	
	static int maxNum(int a, int b){
		int result = a>b ? a : b;
		return result;
	}
	
	static int abs(int abs) {
		int result = abs>0 ? abs : (abs*-1);
		return result;
	}
	
	static int method6(int i) {
		int sum = 0;
		for(int j = 0; j < i; j++) {
			sum += i;
		}
		return sum;
	}
	
	static int method7(int[] iArr) {
		return iArr.length;
	}
	
	static String method8(String st1, String st2) {
		String sArr[] = new String[2];
		sArr[0] = st1;
		sArr[1] = st2;
		return Arrays.toString(sArr);
	}

	public static void main(String[] args) {
		
		method1();
		System.out.println(method2("두번째"));
		method3(1,2,3.3);
		System.out.println(method4(6));
		System.out.println(method4(5));
		method5("메롱", 5);
		System.out.println();
		System.out.println(maxNum(5, 10));
		System.out.println(maxNum(11, 5));
		System.out.println(abs(5));
		System.out.println(abs(-15));
		System.out.println(method6(10));
		int[] arr = {1, 3, 5, 7, 9};
		System.out.println(method7(arr));
		System.out.println(method8("일", "이"));
	}

}
