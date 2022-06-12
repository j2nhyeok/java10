public class Cellphone {

	private String color; // 휴대전화의 색상
	private String company; // 휴대전화의 제조사
	private String model; // 휴대전화의 모델
	private int weight; //휴대전화의 무게
    private int curVolume; // 휴대전화의 현재 음량 상태

    public Cellphone(){
             curVolume = 0;
    }
    
    public Cellphone(String color, String model, String company, int weight) {
    	this. color = color;
    	this.model = model;
    	this.company = company;
    	this.weight = weight;
    	curVolume = 0;
    }

    public void volumeUp(){
          if(weight < 160){
               curVolume += 10;
          } else if(weight >= 160){
               curVolume += 20;
          }
          System.out.printf("Volumeup %s, Current Volume  %d \n", model, curVolume);
    }

    public void volumeDown(){
          if(weight < 160){
               curVolume -= 10;
          } else if(weight >= 160){
               curVolume -= 20;
          }
          System.out.printf("Volumeup %s, Current Volume  %d \n", model, curVolume);
    }

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getCurVolume() {
		return curVolume;
	}

	public void setCurVolume(int curVolume) {
		this.curVolume = curVolume;
	}
    
    
}