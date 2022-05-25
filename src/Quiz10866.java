import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Quiz10866 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
        Deque<Integer> Deque = new ArrayDeque<>();
		
        int N = Integer.parseInt(bf.readLine());
        
      
        
		StringTokenizer st;
		for(int i = 0; i < N ; i++) {
			st = new StringTokenizer(bf.readLine(), " ");
			String order =  st.nextToken();
			if(order.equals("push_front")){
				int front_number = Integer.parseInt(st.nextToken());
				Deque.offerFirst(front_number);

			}
			else if(order.equals("push_back")){
				int back_number = Integer.parseInt(st.nextToken());
				Deque.offerLast(back_number);
			}
			else if(order.equals("pop_front")){
				if(Deque.isEmpty()) {
					sb.append(-1).append("\n");
				}else {
					sb.append(Deque.pollFirst()).append("\n");
				}
			}
			else if(order.equals("pop_back")){
				if(Deque.isEmpty()) {
					sb.append(-1).append("\n");
				}else {
					sb.append(Deque.pollLast()).append("\n");
				}
			}
			else if(order.equals("size")){
				sb.append(Deque.size()).append("\n");
			}
			else if(order.equals("empty")){
				if(Deque.isEmpty()) {
					sb.append(1).append("\n");
				}else {
					sb.append(0).append("\n");
				}
			}
			else if(order.equals("front")){
				if(Deque.isEmpty()) {
					sb.append(-1).append("\n");
				}else {
					sb.append(Deque.peekFirst()).append("\n");
				}
			}
			else if(order.equals("back")){
				if(Deque.isEmpty()) {
					sb.append(-1).append("\n");
				}else {
					sb.append(Deque.peekLast()).append("\n");
				}
			}
			
		}
		System.out.println(sb);
	}
}
