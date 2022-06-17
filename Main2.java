
public class Main2 {

	public static void main(String[] args) {
		String s = null;
		
		try {
			String local = "지역변수";
			
			int[] arr = new int[0];
			arr[1] = 10;
			
			int div = 10/0; 
	
			s.equals("asdf");
			
			System.out.println("실행 안됨");
		} catch(Exception e) {
			System.out.println("");
		}
		System.out.println("정상 종료");
	}

}
