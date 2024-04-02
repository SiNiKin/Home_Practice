package HomeP;

public class P_C_03 {
	
	static class Person {
		String name;
		int age;
		int tall;
		
		public Person(String name, int age, int tall) {
			this.name = name;
			this.age = age;
			this.tall = tall;
		}
		
		void info() {
			System.out.println(name);
			System.out.println(age + "세");
			System.out.println("키 : " + tall);
		}
	}

	public static void main(String[] args) {
		
		Person p1 = new Person("홍길동", 20, 180);
		Person p2 = new Person("김길동", 40, 170);
		p1.info();
		System.out.println("--------------------");
		p2.info();

	}

}
