package HomeP;

import java.util.Arrays;

import HomeP.HP_HR_10_1.Warrior;
import HomeP.HP_HR_10_1.Wizard;

public class HP_HR_10_2 {

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
		
		void bash(Wizard p) {
			if (mp <=100) {
				System.out.println("마나가 부족합니다.");
			}else {
				System.out.println(p.name + "님 배쉬 스킬 적중");
				p.hp -= 200;
				mp -=100;
			}
			System.out.println();
		}
		
		void bash(Warrior p) {
			if (mp <=100) {
				System.out.println("마나가 부족합니다.");
				return;
			}else {
				System.out.println(p.name + "님 배쉬 스킬 적중");
				p.hp -= 100;
				mp -=100;
			}
			System.out.println();
		}
		
	}
	
	static class Wizard extends Player {
		Wizard(String name){
			this.name = name;
			this.hp = 500;
			this.mp = 1000;
		}
		
		void iceArrow() {
			System.out.println("얼음화살 사용");
		}
		
		void Blizzard(Player[] players) {
			for(Player str : players) {
				int i = (int)(Math.random()*15) +1;
				int a = (int)(Math.random()*15) +1;
				System.out.println("----------------------------");
				System.out.println(this.name + "님의 눈보라 시전!");
				System.out.println(str + "님이" + i + "피해를 입었습니다.");
				System.out.println(str + "님이" + a + "피해를 입었습니다.");
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		Warrior play1 = new Warrior("강한친구대한전사");
		Wizard play2 = new Wizard("구르미그린마법사");
		Warrior me = new Warrior("나의캐릭터");
		
		Player[] players = {play1,me};
	
		play2.Blizzard(players);

	}

}
