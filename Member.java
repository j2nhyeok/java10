
public class Member {
	private String name;
	private double height;
	private double weight;
	private double bmi;
	
	public double getBmi() {
		return  (int)(weight/((height/100) * (height/100)));
	}





	public Member(String name, double height, double weight)
	{
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.bmi = getBmi();
	}
	
	
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member temp = (Member) obj;
			return name.equals(temp.name) && height == temp.height && weight == temp.weight;
					
		}else {
			return false;
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return name + "\t" + height + "\t" + weight;
	}


	public String PrintAll() {
		// TODO Auto-generated method stub
		return this.name + "\t" + this.height + "\t" + this.weight + "\t" + this.bmi;
	}
	
	
}
