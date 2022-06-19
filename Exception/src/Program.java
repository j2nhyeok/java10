
public class Program {

	public static void main(String[] args)  {
		Calculator calc = new Calculator();
		int result = 0;
		try {
			result = Calculator.add(3, 10004);
			System.out.printf("add : %d \n", result);
			result = Calculator.sub(3, -4);
			
		} catch(천을_넘는_예외 e) {  //천을넘는 예외만 특화되는 catch 구문
			System.out.println(e.getMessage());
		} catch(Exception e) { // 천을넘는 예외를 제외한 모든 예외들에게 특화되는 catch 구문
			System.out.println("입력 값에 오류가 있습니다.");
		}
		
	
		System.out.printf("sub : %d \n", result);
		result = Calculator.multi(3, -4);
		System.out.printf("multi : %d \n", result);
		result = Calculator.div(3, -4);
		System.out.printf("div : %d \n", result);
		
	}

}
