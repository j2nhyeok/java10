import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Stack;

public class Quiz1874 {
	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //값을 입력받기 위하여 BufferedReader 사용
	StringBuilder sb = new StringBuilder(); //정답을 만들어줄 StringBuilder sb 사용
	
	Stack <Integer> origin = new Stack<>(); //객체 타입이 Integer인 Stack origin 선언. 이 스택 안에서 정수를 push, pop 할 예정
	int n = Integer.parseInt(bf.readLine()); // n (1 ≤ n ≤ 100,000), 둘째 줄부터 n개의 줄에는 수열을 이루는 1이상 n이하의 정수가 하나씩 순서대로 주어진다. 물론 같은 정수가 두 번 나오는 일은 없다.
	int max = 0; //스택에서의 요소 중 최댓값을 저장할 max 변수. 
	
	for(int i = 0 ; i < n ; i++) { //n만큼 반복문 실행
		int value = Integer.parseInt(bf.readLine()); // 정수 입력
		
		if(value>max) { //만약 value가 max보다 크면, // i = 0일 때 max가 0이고, value값은 1이상 n이하의 정수이므로 첫 반복문은 무조건 실행 된다.
			for(int j = max + 1; j <= value ; j++ ) { // value값보다 max값이 작은 경우, stack에 1부터 value 값까지 push 해줘야 한다
				origin.push(j); //origin 스택에 j값 push
				sb.append("+").append("\n"); //sb에 "+"와 "\n" 추가
			}
			
			origin.pop(); //origin 스택에 value값 까지 push 되었으면 제일 위에 있는 값(value값)을 pop해줘야 한다.
			sb.append("-").append("\n"); //sb에 "-" 와 "\n" 추가
			
			max = value; //value값을 max에 재저장
		} else if(value == origin.get(origin.size() - 1) ) { //만약 value값과 origin스택의 최상단 값이 같을 경우
			origin.pop(); //바로 origin 스택의 최상단 값을 pop한 뒤
			sb.append("-").append("\n"); //sb에 "-" 와 "\n" 추가
			
		} else if(value <origin.get(origin.size() - 1)) { //만약 value값이 origin스택의 최상단 값 보다 작을 경우
			sb.append("NO").append("\n"); // 수열을 만들 수 없다는 의미로 sb에 "NO" + "\n"를 추가
		}
		
	}
	if(sb.indexOf("NO") >= 0) //만약 sb에 "NO"가 포함 될 경우 sb.indexOf("NO")가 0 or 양수가 나오므로
	{
		System.out.println("NO"); //sb.indexOf("NO")가 0 or 양수이면 콘솔창에 NO 출력
	}else { //만약 sb에 "NO"가 포함 하지 않을 경우 
		
		System.out.println(sb); //sb에 저장된 "+" + "\n"  or  "-" + "\n" 출력
	}
	}
}