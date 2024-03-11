package HomeP;

public class HP3 {
	public static void main(String[] args) {
		
		int dan = 5;
		for (int i = 0; i < dan; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("=======================");
		
		for (int i = 0; i < dan; i++) {
			for (int j = dan - 1; j > i - 1; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
		
		for (int i = 0; i < dan; i++) {
			for (int j = 0; j < dan - i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("=======================");
		
		for (int i = 0; i < dan; i++) {
			for (int s = 0; s < dan - i - 1; s++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("=======================");
		
		for (int i = 0; i < dan; i++) {
			for (int s = 0; s < i; s++) {
				System.out.print(" ");
			}
			for(int j = 0; j < dan - i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
