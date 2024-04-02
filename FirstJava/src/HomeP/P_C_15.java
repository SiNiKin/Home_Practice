package HomeP;

public class P_C_15 {
	public static class Palindrome {
		public static String palindromeCheck(String str) {
			str = str.replace(" ", "");
			int mdlang = str.length() / 2;
			
			for (int i = 0; i < mdlang; i++) {
				if(str.charAt(i) != str.charAt(str.length()-i-1)) {
					return "회문이 아닙니다.";
				}
					
			}
			return "회문입니다.";
		}
	}
	
	public static void main(String[] args) {
		System.out.println(Palindrome.palindromeCheck("다시다"));
		System.out.println(Palindrome.palindromeCheck("다시 합창 합시다"));
		System.out.println(Palindrome.palindromeCheck("아 좋다 좋아"));
		System.out.println(Palindrome.palindromeCheck("안녕하세요"));
	}


}
