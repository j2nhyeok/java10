import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class quiz2108 {

   public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //값을 입력받기 위해 BufferedReader 사용
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //값을 출력하기 위해 BufferedWriter 사용
      
      int N =Integer.parseInt(bf.readLine()); //첫째 줄에 수의 개수 N(1 ≤ N ≤ 500,000)이 주어진다. 단, N은 홀수이다.
      int[] numbers = new int[N]; //N개의 숫자를 저장 해줄  N의 크기를 가진 정수형 배열 numbers를 선언. 
      int[] cnt = new int [8001]; //카운팅 정렬을 사용하기 위해 크기가 8001인 정수형 배열 cnt 선언. 크기가 8001인 이유는 입력되는 정수의 절댓값은 4,000을 넘지 않기에  -4000~4000 총 8001개 이므로.
   
      double sum = 0; //N개의 정수의 합을 저장하기 위한 double형 변수 sum 선언 후 0으로 초기화.
      long Mean = 0; // 평균값을 나타내는 long형 Mean변수 선언 후 0으로 초기화.
      int Median = 0; //중앙값을 나타내는 int형 Median변수 선언 후 0으로 초기화.
      int Mode =0; //최빈값을 나타내는 int형 Mode변수 선언 후 0으로 초기화.
      int Range = 0; //범위를 나타내는 int형 Range변수 선언 후 0으로 초기화.
      
   
      for(int i = 0; i < N; i++) { //N만큼 반복문 돌림.
         numbers[i] = Integer.parseInt(bf.readLine()); //N(정수의 개수)만큼 정수를 입력 받은 후 numbers배열에 순서대로 저장.
      }
      
      for(int j = 0; j<N ;  j++) { //N만큼 반복문을 돌려
         sum += numbers[j]; //numbers배열에 저장 된 각 정수의 더한 총 합을 sum 변수에 저장.
      }
      
      Mean = Math.round(sum/N); //산술 평균..Math.round()를 사용하여 소수 한 자리수에서 반올림.
   
      Arrays.sort(numbers); //입력한 정수들이 저장 되어 있는 numbers 배열을 오름차순으로 정렬.
         
      Median =  numbers[N/2]; //정렬된 numbers 배열의 가장 가운데 값이 중앙값

      Range = numbers[N-1] - numbers[0]; //정렬된 numbers 배열의 가장 뒤에 있는 값과 가장 앞에있는 값을 뺀 값이 범위.
      
      for(int b = 0; b <= 8000; b++) { //카운팅 정렬을 사용하기 위해 cnt배열의 모든 요소들을 0으로 초기화.
         cnt[b] = 0;
      }
      
      for(int c = 0; c < N; c++) {
               cnt[numbers[c]+4000]++; //numbers[c]가 -4000이라면 cnt[0]값을 ++; , because cnt[-4000]으로 표현 할 수 없기때문. 
      }
      List<Integer> cnt_list = Arrays.stream(cnt).boxed().collect(Collectors.toList()); //정수형 배열 cnt를 정수형 리스트 cnt_list로 변환. 
      int count = Collections.frequency(cnt_list, Collections.max(cnt_list)); // cnt_list 요소들의 최대값이 cnt_list에서의 빈도수를 정수형 변수 count에 저장.
      
      
      if(count >= 2) { //만약 count가 2이상이라면 == 조건에서 최빈값이 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다라고 하였으니
      cnt_list.remove(Collections.max(cnt_list)); //최빈값 중 첫 번째로 작은 값을 리스트에서 삭제 해버리고
      Mode = cnt_list.indexOf(Collections.max(cnt_list)) - 3999; //최대값의 cnt_list 인덱스에서 3999를 뺀 값을 Mode에 저장.
      }else if(count == 1) { //만약 최빈값이 1개라면
         Mode = cnt_list.indexOf(Collections.max(cnt_list)) - 4000; //최대값의 cnt_list 인덱스에서 4000을 뺸 값을 Mode에 저장
      }else if(N==1) { //만약 N == 1이라면
         Mode = numbers[0]; //입력한 정수 그 자체가 최빈값.
      }
      
      
      
      
      bw.write(String.valueOf(Mean) + "\n" + String.valueOf(Median) + "\n" + String.valueOf(Mode) + "\n" + String.valueOf(Range));
      bw.flush();
      bw.close();
      
   }

}