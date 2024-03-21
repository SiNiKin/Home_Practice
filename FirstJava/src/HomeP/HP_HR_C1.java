package HomeP;

public class HP_HR_C1 {
	
	static class Bread{
		String name;
		int price;
		
		Bread(String name, int price){
			this.name = name;
			this.price = price;
		}
		
		public void print() {
			System.out.println("빵 이름 : " + name);
			System.out.println("가격 : " + price + "원");
		}
	}
	
	public static void main(String[] args) {
		Bread bread1 = new Bread("피자빵", 500);
		Bread bread2 = new Bread("딸기케잌", 1500);
		
		bread1.print();
		bread2.print();

	}


}
