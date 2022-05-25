import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

import java.util.Stack;



public class Quiz1935 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		
		Stack <Double> stack = new Stack<>();
		
		String sentence = bf.readLine();
		
		HashMap<Character, Double> Hash = new HashMap<>(N);

		double number[] = new double[N];
		double temp_a = 0;
		double temp_b = 0;
		
		for(int i = 0; i < N; i++) {
			number[i] = Double.parseDouble(bf.readLine());
			stack.push(number[i]);
			
		}

		for(int i = sentence.length()-1; 0 <= i; i--) {
			if(65 <= (int)sentence.charAt(i) && (int)sentence.charAt(i) <= 90) {
				if(!Hash.containsKey(sentence.charAt(i))) {
				Hash.put(sentence.charAt(i), stack.pop());
				}
			}
		}
		
		for(int i = 0; i < sentence.length(); i++) {
			if(65 <= (int)sentence.charAt(i) && (int)sentence.charAt(i) <= 90) {
				stack.push(Hash.get(sentence.charAt(i)));
			}else {
				temp_b = stack.pop();
				temp_a = stack.pop();
				
			if(sentence.charAt(i) == '*') {
				stack.push( temp_a * temp_b);
			}
			else if(sentence.charAt(i) == '+') {
				stack.push( temp_a + temp_b);
			}
			else if(sentence.charAt(i) == '/') {
				stack.push( temp_a / temp_b);
			}
			else if(sentence.charAt(i) == '-') {
				stack.push( temp_a - temp_b);
			}
			
			}
		}
		
		 System.out.format("%.2f", stack.pop());
	}

}
