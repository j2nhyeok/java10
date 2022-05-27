import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz9613 {

   public static StringTokenizer st; //전역변수로  StringTokenizer 선언
   
   public static Long sum ; //전역 변수로 sum 선언. 
   
   public static void main(String[] args) throws NumberFormatException, IOException {
      // TODO Auto-generated method stub
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //값을 입력받기 위하여 BufferedReader 사용
      StringBuilder sb =new StringBuilder(); //여러 문자열의 결합하여 정답 문자열을 만들기 위해 StringBuilder 사용
      
      int t = Integer.parseInt(bf.readLine()); //첫째 줄에 테스트 케이스의 개수 t (1 ≤ t ≤ 100)
      
      
      for(int i = 0; i < t; i++) { //테스트 케이스의 개수 t만큼 반복문 실행
         
         sum = 0l; //전역 변수 sum을 0으로 초기화
         st = new StringTokenizer(bf.readLine(), " "); //각 테스트 케이스는 수의 개수 n (1 < n ≤ 100)가 주어지고, 다음에는 n개의 수가 주어진다. 입력으로 주어지는 수는 1,000,000을 넘지 않는다.
         int n = Integer.parseInt(st.nextToken());  //각 테스트 케이스는 수의 개수 n (1 < n ≤ 100)
         
         sb.append(GCD(n)).append("\n"); //수의 개수 n을 GCD함수에 인자값으로 넘겨주고 return받은 값을 정답 문자열인 sb에 추가한다.
      }
      System.out.println(sb);
   }



public static Long GCD(int n) { //각 테스트 케이스마다 가능한 모든 쌍의 GCD의 합을 return 해주는 GCD 함수
   
   int number[] = new int[n]; // 수의 개수 n개의 정수를 저장 할 수 있는 정수형 배열 number을 n크기만큼 선언.
   
   for(int j = 0; j < n; j++) { //n만큼 반복문 실행
      number[j] = Integer.parseInt(st.nextToken()); //number 배열에 st에 남아있는 정수를 순서대로 추가
   }
   
   for(int k = 0 ; k < number.length - 1; k++) { //number 배열 요소 개수 만큼 for문 실행

     // 최대공약수를 구할 두 정수 중 큰 값을 저장할 bigger_number 선언.
      
      for(int m = k + 1; m < number.length; m++) {
         int moduler = 1; //최대 공약수를 구할 두 정수 중 큰 값을 나머지 값으로 나눴을 때의 나머지를 저장할 moduler 선언 후 1로 초기화
         
         int bigger_number = Math.max(number[k], number[m]); // 최대공약수를 구할 두 정수 중 큰 값을 정수형 변수 bigger_number 에 저장.
         int smaller_number = Math.min(number[k], number[m]); //최대공약수를 구할 두 정수 중 작은 값을 정수형 변수 smaller_number 에 저장.
        
         while(moduler != 0) { // moduler가 0이 아니면
         moduler = bigger_number % smaller_number; // 두 정수 중 큰 수에서 작은 값을 나눈 나머지를 moduler에 저장하고
         
         if(moduler != 0) { //만약 그 moduler가 0이 아니라면
            bigger_number = smaller_number; //큰 수에 작은 수의 값을 저장하고
            smaller_number = moduler; //작은 수에 나머지 값인 moduler 를 저장하고  다시 위로 올라가서 while문 실행. 언제까지? moduler가 0이 될 때 까지.;
         }else { // 결국 moduler가 0이 되었다면
        	 break; // smaller_number의 값이 최대 공약수라는 말이므로 while 문 탈출
         }
         
      }
         sum += smaller_number; //각 테스트 케이스마다 가능한 모든 쌍의 GCD의 합을 저장하는 sum변수에 smaller_number(최대공약수) 값 저장
}
   }
   return sum; //모든 쌍의 GCD의 합 리턴
}
}
