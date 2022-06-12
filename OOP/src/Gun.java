
public class Gun {
	protected String model;
	protected int bulletCount;
		
	public void fire() {
		System.out.println(model + "=>");
		bulletCount -= 1;
	}
	
	public Gun(String model) {
		bulletCount = 10;
		this.model = model;
	}

}

 class AssaultRifle extends Gun{
	public void fire() {
		bulletCount -= 5;
		System.out.printf("%s => => => => => , %d \n", model, bulletCount);
	}
	
	public AssaultRifle(String model) {
		super(model);
		bulletCount = 40;
	}
}


 class ShotGun extends Gun{
	public void fire() {
		bulletCount -= 1;
		System.out.printf("%s =}}} , %d \n", model, bulletCount);
	}
	
	public ShotGun(String model) {
		super(model);
	}
}

