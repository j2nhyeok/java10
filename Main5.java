
public class Main5 {
	public static int divide(int left, int right) throws MyZeroDivideExeption { //호출한 메서드로 던져버림.
		if(right == 0) {
			throw new MyZeroDivideExeption("divide 할 수 없음");
		
		}else {
			return left / right;
		}
	}
	
	public static int myFunction() {
		throw new UnsupportedOperationException("내일 만들 예정");
		
	}
	

	public static void main(String[] args) throws MyZeroDivideExeption {
	
		myFunction();
			
		
	}

}
