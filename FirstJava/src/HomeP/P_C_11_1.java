package HomeP;

public class P_C_11_1 {

	public static class ArrayPrint{
		static void printArray(String[] arr) {
			for(int i =0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
			System.out.println();
		}
		static void printArray(int[] arr) {
			for(int i =0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
			System.out.println();
		}
		static void printArray(char[] arr) {
			for(int i =0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		String[] sArr = {"홍길동", "이순신", "김길동"};
		int[] iArr = {1, 2, 3, 4, 5};
		char[] cArr = {'가','나'};

		ArrayPrint.printArray(sArr);
		ArrayPrint.printArray(iArr);
		ArrayPrint.printArray(cArr);
	}

}
