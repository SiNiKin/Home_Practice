package HomeP;

public class P_C_06 {

	static class Player{
		String name;
		int hp;
		int mp;
		
		void info() {
			System.out.println("캐릭명 : " + name);
			System.out.println("체력 : " + hp);
			System.out.println("마나 : " + mp);
		}
		
		void action() {
			
		}
	}
	
	static class Warrior extends Player {
		Warrior(String name, int hp, int mp){
			this.name = name;
			this.hp = hp;
			this.mp = mp;
		}
		
		@Override
		void action() {
			System.out.println("전사는 멋진 동작을 합니다.");;
		}
	}
	
	static class Wizard extends Player {
		Wizard(String name, int hp, int mp){
			this.name = name;
			this.hp = hp;
			this.mp = mp;
		}
		
		 @Override
		void action() {
			System.out.println("마법사는 귀여운 동작을 합니다.");
		}
	} 
	
	public static void main(String[] args) {

		Wizard wiz = new Wizard("구르미그린달빛", 500, 1000);
		Warrior war = new Warrior("강한친구대한전사", 1000, 500);
		
		System.out.println("----마법사----");
		wiz.action();
		System.out.println("-----전사----");
		war.action();
	}
	
}
