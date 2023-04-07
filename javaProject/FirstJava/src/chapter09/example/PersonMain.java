package chapter09.example;

public class PersonMain {

	public static void main(String[] args) {
		
		Person p1 = new Person("Kim", "990504-2054498");
		Person p2 = new Person("Park", "980504-2054498");
		Person p3 = new Person("Lee", "990504-2054498");
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
	}

}
