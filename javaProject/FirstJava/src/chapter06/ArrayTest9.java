package chapter06;

public class ArrayTest9 {

	public static void main(String[] args) {

		// Array type Member : 5 elements
		Member[] members = new Member[5];
		
		members[0] = new Member(1, "cool", "시원한");
		// Member member1 = new Member(1, "cool", "시원한");
		members[1] = new Member(2, "hot", "뜨거운");
		members[2] = new Member(3, "son", "손흥민");
		members[3] = new Member(4, "park", "박지성");
		members[4] = new Member(5, "lee", "이강인");
		
		// System.out.println(members[0].memberId);
		// System.out.println(members[0].memberName);
		// System.out.println(members[0].toString());
		// member[0] => Reference Variable of type Member
		
		System.out.println("=== List of Member ===");
		/*
		for(int i = 0; i < members.length; i++) {
			System.out.println(members[i]);
		}
		*/
		
		for(Member member : members) {
			// member = members[0->1-> ... -> 4]
			System.out.println(member);
		}
		
		
	}

}
