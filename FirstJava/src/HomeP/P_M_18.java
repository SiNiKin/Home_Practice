package HomeP;

public class P_M_18 {
	
	static void java(int a) {
		for(int i = 1; i < a; i++) {
			if(i % 2 == 0) {
				System.out.print("바");
			}else {
				System.out.print("자");
			}
		}
	}

	public static void main(String[] args) {
		
		java(6);
		
	}

}
