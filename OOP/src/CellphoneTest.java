
public class CellphoneTest {

	public static void main(String[] args) {
		Cellphone c1 = new Cellphone();
				
		c1.setColor("RED");
		c1.setModel("iphone13");
		c1.setCompany("Apple");
		c1.setWeight(173);
		
		Cellphone c2 = new Cellphone("BLUE", "galaxyS 22", "Samsung", 159);
	
		c1.volumeUp();
		c2.volumeUp();
	}

}
