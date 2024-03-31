package HomeP;

public class P_C_02 {
	
	static class Person {
		public String name;
		public int age;
		
		public String getDetails() {
			return "이름 : " + name + "\n나이 : " + age + "세"; 
		}
		
		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 19);
		Person p2 = new Person("김길동", 30);
		
		System.out.println(p1.getDetails());
		System.out.println(p2.getDetails());
	}

}
