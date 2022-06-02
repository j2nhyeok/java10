public class Student {
	private String Name;
	private int Kor;
	private int Math;
	private int Eng;


	public Student(String Name, int Kor, int Math, int Eng) {
		this.Name = Name;
		this.Kor = Kor;
		this.Math = Math;
		this.Eng = Eng;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String N) {
		this.Name = N;
	}
	
	public int getKor() {
		return Kor;
	}
	public void setKor(int k) {
		this.Kor = k;
	}
	
	public int getMath() {
		return Math;
	}
	public void setMath(int m) {
		this.Math = m;
	}
	
	public int getEng() {
		return Eng;
	}
	public void setEng(int e) {
		this.Eng = e;
	}


	public float getAvg() { //ЦђБе
		float avg =(Kor+Eng+Math)/3.f;
		
		return avg;
	
	}

}




