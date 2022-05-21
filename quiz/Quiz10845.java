import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Quiz10845 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(bf.readLine());
		Queue<Integer> queue = new LinkedList<>(); 
		StringTokenizer st;
		int last_number = 0;
		for(int i = 0; i < N ; i++) {
			st = new StringTokenizer(bf.readLine(), " ");
			String order = st.nextToken();
			
			if(order.equals("push")) {
		    int number = Integer.parseInt(st.nextToken());
		    last_number = number;
			 queue.add(number);	
			}
			
			else if(order.equals("pop")) {
				if(queue.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(queue.poll()).append("\n");
				}
			}
			
			else if(order.equals("size")) {
			 sb.append(queue.size()).append("\n");
			}
			
			else if(order.equals("empty")) {
				if(queue.isEmpty()) {
					sb.append(1).append("\n");
				}else {
					sb.append(0).append("\n");
				}
		     }
			
			else if(order.equals("front")) {
				if(queue.isEmpty()) {
					sb.append(-1).append("\n");
				}
				else {
					sb.append(queue.peek()).append("\n");
				}
			}
			
			else if(order.equals("back")) {
				if(queue.isEmpty()) {
					sb.append(-1).append("\n");
				}
				else {
					sb.append(last_number).append("\n");
				}						
			}
		}
		System.out.println(sb);
	}
}
