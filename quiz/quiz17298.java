import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class quiz17298 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(bf.readLine());
		boolean change[] = new boolean[N];
		int number[] = new int[N];
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		Stack<Integer> stack = new Stack<>();
		
		
		for(int i = 0 ; i < N; i++) {
			number[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < N ; i ++) {
			
			while(!stack.isEmpty() && number[stack.peek()] < number[i] && !change[i]) {
				int a = stack.pop();
				number[a] = number[i];
				change[a] = true;
			}
			stack.push(i);
		}
		
		for(int i = 0; i < N ; i ++) {
			if(!change[i])
				number[i] = -1;
		}
		
		for(int i = 0; i < N ; i++) {
			sb.append(number[i]).append(" ");
		}
		
		
	
		
		
		
		System.out.println(sb);
	}
}
