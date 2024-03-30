package HomeP;

public class P_M_2 {

	public static void main(String[] args) {
		int i = (int)(5 - Math.random() * 11);
		System.out.println("랜덤값 : " + i);
		int abs = i >= 0 ? i : i * -1;
		System.out.println(i + "의 절대값은 : " + abs);

	}

}
