import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz6064 {
   public static int M, N, x, y = 0;


   public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      int min = 0;
      int max = 0;
   
      
      int T = Integer.parseInt(bf.readLine()); //T는 테스트 개수
      
      for(int i = 0; i < T; i++) {
         StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
          M = Integer.parseInt(st.nextToken());
          N = Integer.parseInt(st.nextToken());
          x = Integer.parseInt(st.nextToken());
          y = Integer.parseInt(st.nextToken());
          if(y == N) y = 0;
          int index = 0;
          int result = -1;
          
          
          for(int j = Math.min(M,  N); 1 <= j; j--) { //num1과 num2 중 작은 값 만큼 반복문 실행
               if(M % j == 0  && N % j == 0) {
                  max = j; //num1과 num2를 i로 나누었을 때 둘다 나머지가 0이 되게하는 i중 최대값이 최대 공약수가 되는 거임
                  break;
               }
           }
            min = max * (M / max) * (N / max);
            
      
            while(true) {
         	   if((M * index + x) % N == y) {
         		   result =  M * index + x ;
         		   break;
         	   }
         	   
         	   if(M * index + x > min) {
         		   break;
         	   }
         	   
         	   index++;
            }
            
     
          sb.append(result).append("\n");
      }
      
      System.out.println(sb);
   }

   
}
