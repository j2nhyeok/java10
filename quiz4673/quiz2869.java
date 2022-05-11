import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;



public class quiz2869{

	public static void main(String[] args) throws NumberFormatException, IOException {
    //BufferedReader를 이용하여 값을 입력 받음.    
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
	
		
	//첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다. (1 ≤ B < A ≤ V ≤ 1,000,000,000)
	String numbers = bf.readLine(); //공백을 기준으로 세 숫자를 numbers라는 문자열로 입력받음.
    String[] number = numbers.split(" "); //공백을 기준으로 세 숫자를 분리하여 number이라는 문자열 배열에 저장
    int A = Integer.parseInt(number[0]); //배열의 첫 번째 숫자를 A에 저장. A는 올라가는 높이
    int B = Integer.parseInt(number[1]); //배열의 두 번째 숫자를 B에 저장. B는 내려가는 높이
    int V = Integer.parseInt(number[2]); //배열의 세 번째 숫자를 V에 저장. V는 도달하고 싶은 높이

    int day = (V - B)/(A - B); //V에 도달하기 위한 일 수
    
    if((V - B)%(A - B) != 0) { 
    	day++;
    }

    System.out.println(day);


	}
}