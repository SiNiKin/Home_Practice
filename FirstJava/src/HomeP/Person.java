package HomeP;

public class Person {
	
	String name;
	int age;
	int tall;
	
	void info() {
		System.out.println(name);
		System.out.println(age + "세");
		System.out.println("키: "+tall);
	}
	
	public String getDetails() {
		return "아름 : " + name + "\n나이 : " + age + "세"; 
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
