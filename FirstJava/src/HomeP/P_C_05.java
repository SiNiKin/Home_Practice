package HomeP;

public class P_C_05 {
	
	static class Player{
		String name;
		int hp;
		int mp;
		
		void info() {
			System.out.println("캐릭명 : " + name);
			System.out.println("체력 : " + hp);
			System.out.println("마나 : " + mp);
		}
		
	}
	
	static class Warrior extends Player {
		Warrior(String name, int hp, int mp){
			this.name = name;
			this.hp = hp;
			this.mp = mp;
		}
		
		void bash() {
			System.out.println("때리기 스킬 사용");
		}
	}
	
	static class Wizard extends Player {
		Wizard(String name, int hp, int mp){
			this.name = name;
			this.hp = hp;
			this.mp = mp;
		}
		
		void iceArrow() {
			System.out.println("얼음화살 사용");
		}
	}

	public static void main(String[] args) {

		Wizard wiz = new Wizard("구르미그린달빛", 500, 1000);
		Warrior war = new Warrior("강한친구대한전사", 1000, 500);
		
		System.out.println("----마법사----");
		wiz.info();
		wiz.iceArrow();
		System.out.println("-----전사----");
		war.info();
		war.bash();

	}

}
