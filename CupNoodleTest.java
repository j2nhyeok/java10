
public class CupNoodleTest {

	public static void main(String[] args) {
		CupNoodle R1 = new CupNoodle("삼양", "육개장", 3000);
		CupNoodle R2 = new CupNoodle("삼양", "육개장", 4000);
		
		
		if(R1.equals(R2)) {
			System.out.println(R1.toString());
			System.out.println(R2.toString());
			System.out.println("같은 라면입니다");
		}else {
			System.out.println("동일한 회사와 모델이 아닙니다.");
		}

	}

}
