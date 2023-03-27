package chapter05.phone;

public class MemberMain {

	public static void main(String[] args) {
		
		Member member1 = new Member("Kim", "kim@gmail.com", 20, "010-5134-5789");
		Member member2 = new Member("Lee", "yeye@gmail.com");
		
		member1.showData();
		System.out.println();
		member2.showData();

	}

}
