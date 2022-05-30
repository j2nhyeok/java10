

import java.util.Scanner;
import java.util.Stack;

public class Main{

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in); //값을 입력받기 위하여 Scanner 사용
		
		
		Stack<Integer> stack = new Stack<>();  //Integer형 데이터를 저장하는 스택  stack 선언

		
	
		int A = sc.nextInt();//미래세계 사용 진법  A .   2이상 30이하의 자연수
		int B =  sc.nextInt(); // 정이가 사용하는 진법 B . 2이상 30이하의 자연수
		
		int m =  sc.nextInt(); //A진법으로 나타낸 숫자의 자리수의 개수 m.  m(1 ≤ m ≤ 25)

		
		//세 번째 줄에는 A진법을 이루고 있는 숫자 m개가 공백을 구분으로 높은 자릿수부터 차례대로 주어진다.
		  //각 숫자는 0이상 A미만임이 보장된다. 
		  //또한 수가 0으로 시작하는 경우는 존재하지 않는다.
		int numbers[] = new int[m];  
		for(int i = 0 ; i < m ; i++) {
			numbers[i] = sc.nextInt();
		}
		
	    //first step) A진법으로 나타낸 수를 10진법으로 변환
		int change_10 = 0; //A진법으로 나타낸 수를 10진법으로 변환하였을 때 의 값을 저장할 정수형 변수 change_10을 선언 후 0으로 초기화.  값은 2^20보다 작다.

        for(int i = 0; i < m; i++) {   //m만큼 반복문 실행
        	change_10 += numbers[i] * Math.pow(A, (m - 1) - i );  //10진수로 변환하는 과정.	
        }   
       
        //second step) 10진법으로 변환된 수를 B진법으로 변환
        while(change_10 != 0) { //change_10이 1일 때 while문 종료
        	
        	stack.push(change_10 % B);
        	change_10 = change_10 /B;
        	
        } 
        
    
      
       int a = stack.size(); //초기 스택의 크기를 정수형 변수 a에 저장
       for(int i = 0; i< a; i++) {  //초기 스택 크기만큼 반복문 실행
    	  System.out.print(stack.pop() + " ");
       }
    	
}
}
