package chapter06;

public class Member {
	
	int memberNo;
	String memberId;
	String memberName;
	
	Member(int memberNo, String memberId, String memberName) {
		this.memberNo = memberNo;
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		return "회원 [회원번호 = " + memberNo + "] [회원아이디 = " + memberId + "] [회원 이름 = " + memberName + "]";
	}

}
