
public class RobotTiger extends Robot implements Animal {

	public void bark() {
		System.out.println("어흥 어흥");
	}
	
	void charging() {
		System.out.println(getName() + "이 충전하러 갑니다.");
	}
	
	
	public static void main(String[] args) {
		RobotTiger rt = new RobotTiger();
		rt.setName("robotiger");
		rt.bark();
		rt.move();
		rt.charging();

	}

}
