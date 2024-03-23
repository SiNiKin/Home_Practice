package HomeP;

public class HP_HR_10 {
	
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
		Warrior(String name){
			this.name = name;
			this.hp = 1000;
			this.mp = 500;
		}
		
		void bash(Player p) {
			System.out.println(p.name + "님 배쉬 스킬 적중");
			p.hp -= 100;
		}
	}
	
	static class Wizard extends Player {
		Wizard(String name){
			this.name = name;
			this.hp = 500;
			this.mp = 1000;
		}
	}

	public static void main(String[] args) {
		
		Warrior me = new Warrior("강한친구대한전사");
		
		Wizard play2 = new Wizard("구르미그린마법사");
		Warrior play3 = new Warrior("전사약해요");
		
		System.out.println("---나의 캐릭 배쉬스킬 사용---");
		me.bash(play2);
		me.bash(play3);
		
		play2.info();
		play3.info();
	}

}
