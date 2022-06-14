
class CupNoodle {
	private String company;
	private String model;
	private int price;
	
	public CupNoodle(String company, String model, int price) {
		this.company = company;
		this.model = model;
		this.price = price;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof CupNoodle) {
			CupNoodle temp = (CupNoodle) obj;
			return model.equals(temp.model) && company.equals(temp.company);
					
		}else {
			return false;
		}
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CupNoodle [company=" + company + ", model=" + model + ", price=" + price + "]";
	}
}
