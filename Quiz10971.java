import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz10971 {
   public static int price[][];
   public static boolean visit[];
   public static int arr[];
   public static int minValue = Integer.MAX_VALUE;
   public static int N = 0;


   public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      
      N = Integer.parseInt(bf.readLine());
      price = new int[N+1][N+1];
      visit = new boolean[N+1];
     
      
      for(int i = 1; i <= N ; i++) {
         StringTokenizer st = new StringTokenizer(bf.readLine(), " ");   
         price[i][1] = Integer.parseInt(st.nextToken());
         price[i][2] = Integer.parseInt(st.nextToken());
         price[i][3] = Integer.parseInt(st.nextToken());
         price[i][4] = Integer.parseInt(st.nextToken());
      }
      
      for(int i = 1; i <= N ; i++) {
    	visit[i] = true;
      	solved(i,i, 0,0);
      	visit[i] = false;
      	
      }
      System.out.println(minValue);

   }
   
   public static void solved(int start, int now, int sum,  int cnt) {
      if(cnt == N-1 ) {
         if(price[now][start] != 0) {
        	 sum += price[now][start];
        	if(sum < minValue) { 
        		minValue = sum;
        	}
         }

         return;
         
         
      }
      
      
         for(int j = 1; j <= N; j++) {
	         if(!visit[j] && price[now][j] != 0 ) {
	            
	         
	        	visit[j] = true;
	   
	            
	            solved(start, j,sum + price[now][j] , cnt+1);
	       
	            visit[j] = false;
	         }
   
         
      }
   }
}