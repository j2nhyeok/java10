class Car {
	private int speed;
	
	public void setSpeed(int s) {
		speed = s;
		System.out.println("���� ���� ȣ��");
	}

	
	public void setSpeed(double s) {
		speed = (int)s;
		System.out.println("�Ǽ� ���� ȣ��");
	
	}
}	


public class CarTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		myCar.setSpeed(100);
		myCar.setSpeed(79.2);
	}

}
