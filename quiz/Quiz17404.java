import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz17404 {
   public static int price[][];
   public static int dp[][];
   public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      
      int N = Integer.parseInt(bf.readLine());
      
      price = new int[N + 1][3];
      dp = new int[N + 1][3];
      
      for(int i = 1 ; i <= N ; i++) {
         StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
         
         price[i][0] = Integer.parseInt(st.nextToken());  // 빨강색 비용
         price[i][1] = Integer.parseInt(st.nextToken());  // 초록색 비용
         price[i][2] = Integer.parseInt(st.nextToken());  // 파랑색 비용
      }
      
      
      
      System.out.println(minPrice(N));
   }
   
   public static int minPrice(int N) {
      int infiniteNum = 1000001;
      int answer = Integer.MAX_VALUE;
   
      for(int i = 0; i <= 2; i++) {
    	  for(int j = 0; j <= 2; j++) {
    		  if(i == j) {
    			  dp[1][j] = price[1][j];
    		  } else {
    			  dp[1][j] = infiniteNum; 
    		  }
    	  }
    	  
    	  for(int k = 2; k <= N; k++) {
    		  dp[k][0] = Math.min(dp[k - 1][1], dp[k - 1][2]) + price[k][0];
    		  dp[k][1] = Math.min(dp[k - 1][0], dp[k - 1][2]) + price[k][1];
    		  dp[k][2] = Math.min(dp[k - 1][0], dp[k - 1][1]) + price[k][2];
    	  }
    	  
    	  for(int q = 0; q <= 2; q++) {
    		  System.out.print(dp[N][q] + "  ");
    	  }
    	  System.out.println();
    	  
    	  for(int a = 0; a <= 2; a++) {
    		  if(i != a) {
    			  answer = Math.min(answer, dp[N][a]);
    		  }
    	  }
    	  
  
      }
      
      return answer;
   }
}


