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
      int N = Integer.parseInt(st.nextToken()); //(1 ¡Â N ¡Â 5,000)
      int K = Integer.parseInt(st.nextToken()); //(1 ¡Â K ¡Â 5,000)
   
      
      for(int j = 1; j <= N; j++) {
         person.add(j);
         
      }

      while(!person.isEmpty()) {
    	  int a = 0;

    	  if(person.size() == 1) {
    		  sb.append(person.poll());
    	  }
    	  
    	  else {
    	  for(int i = 0; i < K-1 ; i++) {
    		  a = person.poll();
    		  person.offer(a);
    	  }
    	  sb.append(person.poll()).append(", ");
    	  }
    	 
      }
      
      
      System.out.println("<" + sb + ">");

   }
}