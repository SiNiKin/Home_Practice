package HomeP;

public class HP2 {

	public static void main(String[] args) {
		// 구구단 세로
		
		int dan = 2;
		int gop = 1;
		
		while (dan < 10) {
			System.out.println(dan + "단");
			while (gop < 10) {
				System.out.println(dan + "*" + gop + "=" + dan*gop);
				gop++;
			}
			dan++;
			gop = 1;
		}
		
		// 구구단 가로
		int y = 0;
		while (y < 10) {
			int x = 2;
			while (x < 10) {
				if (y == 0) {
					System.out.print(x + "단 \t");
				}else {
					System.out.print(x + "*" + y + "=" + x*y + "\t");
				}
				x++;
			}
			System.out.println("");
			y++;
		}

	}

}
