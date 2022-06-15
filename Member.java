public class Member implements Comparable<Member> {
	private String name;      // �̸�
	private double height;    // Ű
	private double weight;    // ������
	private double bmi;      //bmi ���� 
	private String note;   //bmi ��� 
	
	
	public Member(String name, double height, double weight)
	{
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.bmi = getBmi(); 	//getBmi�޼��带 ȣ���Ͽ� return���� �ν��Ͻ��� bmi���� ����.
		this.note = getNote();	//getNote�޼��带 ȣ���Ͽ� return���� �ν��Ͻ��� note���� ����.
	}
	
	public String getNote() { //BMI ������ ���� ��� ���� ����.
		if(35 <= this.bmi) return "����(3�ܰ� ��)";
		else if(30 <= this.bmi) return "�ߵ��� (2�ܰ� ��)";
		else if(25 <= this.bmi) return "�浵�� (1�ܰ� ��)";
		else if(23 <= this.bmi) return "��ü��";
		else if(18.5 <= this.bmi && this.bmi < 23) return "����";
		else return "��ü��";
		
	}
	public double getBmi() { //BMI ���� == ( ������ / Ű^2 )
		return  Math.round((weight/((height) * (height))) * 100) / 100.0;  //Math.round()�� �ݿø� �� �� ����ϴ� �޼���
																		   //int a = 22.2141 �̶�� ����. ->  Math.round(a * 100)�� ���� 2221.41�� �Ҽ� ù° �ڸ����� �ݿø��Ͽ�
																		   // 2221�� �Ǵµ� �� ���� �� 100.0���� ������ 22.21�� �ǹǷ� �Ҽ� �� °�ڸ����� ǥ���� �����ϴ�.
																		   // 100�� �ƴ� 100.0���� �����ִ� ���� ��ȯ���� Ÿ���� double;
	}





	
	
	//���� �ű� ȸ���� �̸�, Ű, �����԰� � ȸ���� �̸�, Ű, �����Կ� ���ٸ� �ű� ȸ�� ��� �Ұ�
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
	
	

	public String PrintAll() { //������� �̸� , Ű , ������ , bmi����, bmi ������� ����.
		// TODO Auto-generated method stub
		return this.name + "\t" + this.height + "\t" + this.weight + "\t\t" + this.bmi + "\t" + this.note;
	}

	@Override
	public int compareTo(Member other) {
	
		if(this.height > other.height) {
			return 1;
		}else if( this.height < other.height) {
			return -1;
		}else  return 0;
		
	
	}
	
	
}