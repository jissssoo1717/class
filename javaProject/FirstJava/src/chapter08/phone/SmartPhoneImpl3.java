package chapter08.phone;

public class SmartPhoneImpl3 implements Phone, Application {

	/* Application 인터페이스의 추상 메소드 오버라이딩 */
	@Override
	public void appRun() {
		System.out.println("앱을 실행합니다.");
	}

	@Override
	public void appStop() {
		System.out.println("앱을 종료합니다.");

	}

	/* Phone 인터페이스의 추상 메소드 오버라이딩 */
	@Override
	public void call() {
		System.out.println("전화 통화를 합니다.");

	}

	@Override
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}

	public static void main(String[] args) {
		System.out.println("전원을 켭니다.");
	}

}
