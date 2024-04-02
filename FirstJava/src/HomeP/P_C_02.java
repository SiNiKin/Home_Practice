package HomeP;

public class P_C_02 {
	
	static class Person {
		public String name;
		public int age;
		
		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		public String info() {
			return "이름 : " + name + "\n나이 : " + age + "세"; 
		}
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 19);
		Person p2 = new Person("김길동", 30);
		
		System.out.println(p1.info());
		System.out.println(p2.info());
	}

}
