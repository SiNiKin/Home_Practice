package HomeP;

public class HP_HR_8 {
	
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
	
	static class Warrior extends Player{
		Warrior(String name){
			this.name = name;
			this.hp = 1000;
			this.mp = 500;
		}
	}
	
	static class Wizard extends Player{
		Wizard(String name){
			this.name = name;
			this.hp = 500;
			this.mp = 1000;
		}
	} 

	public static void main(String[] args) {
		System.out.println("----마법사----");
		Wizard wiz = new Wizard("구르미그린달빛");
		wiz.info();
		
		System.out.println("-----전사----");
		Warrior war = new Warrior("강한친구대한전사");
		war.info();

	}

}
