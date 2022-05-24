import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Quiz1158 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Queue<Integer> person = new LinkedList<>();
		
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		int N = Integer.parseInt(st.nextToken()); //(1 ≤ N ≤ 5,000)
		int K = Integer.parseInt(st.nextToken()); //(1 ≤ K ≤ 5,000)
		for(int j = 1; j <= K; j++) {
			person.add(j);
			
		}
		
		for(int i = 0; i < K  ;  i++) {
			
			if(i%3 == 2)
			sb.append(person.).append();
		}
		
		
		System.out.println("<" + sb + ">");

	}
}
