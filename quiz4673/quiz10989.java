import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class quiz10989 {

   public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      
      
      int N = Integer.parseInt(bf.readLine()); //첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다.
      int input_numbers[] = new int[N]; //N개의 정수를 저장해 줄 input_numbers 정수형 배열 선언
      int count[] = new int[10001]; //counting sort를 사용할 예정. 크기를 10001로 해준 이유는 입력 하는 숫자의 범위가 10,000보다 작거나 같은 자연수이기 떄문에 0 ~ 10000을 저장하기 위해 10001로 크기 결정
      int out_numbers[] = new int[N]; //out_numbers배열은 count 배열을 거쳐 오름차순으로 정렬된 배열 == 즉 정답을 저장한 배열 
      
      
      for(int k = 0; k <= 10000; k++) {
         count[k] = 0;
      }
      
      
      //counting 정렬 사용
      for(int i = 0 ; i < N; i++) {
         input_numbers[i] = Integer.parseInt(bf.readLine());
      }
      
      for(int j = 0; j < N; j++) {
         count[input_numbers[j]]++;
      }
      
      for(int c = 1; c < count.length ; c++) {
         count[c] += count[c-1];
      }
      
      //오름차순 정렬로 변신 중
      for(int a = input_numbers.length - 1; 0 <= a; a--) {
          out_numbers[--count[input_numbers[a]]]= input_numbers[a];
      }
      
      //오름차순 정렬된 배열을 출력 == 정답
      for(int b = 0; b <input_numbers.length; b++) {
        bw.write(String.valueOf(out_numbers[b]) + "\n");
      } 
      
bw.flush();
bw.close();
   }
}