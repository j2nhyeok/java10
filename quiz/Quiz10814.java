import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Quiz10814 {

   public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //값을 입력받기 위하여 BufferedReader 사용
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //정답을 출력하기 위하여 BufferedWriter 사용
      
      int N = Integer.parseInt(bf.readLine()); //첫째 줄에 온라인 저지 회원의 수 N이 주어진다. (1 ≤ N ≤ 100,000)
      String personal[][] = new String[N][2]; //나이와 이름을 저장해줄 크기가 N인 이중배열 personal 선언.
      
      StringTokenizer st;
      
      for(int i = 0; i < N ; i++) { //회원의 수 N만큼 반복문 실행
         st = new StringTokenizer(bf.readLine(), " "); //한 줄로 나이와 이름을 입력받아 공백으로 분리 한 후 st에 저장
            personal[i][0] = st.nextToken(); //나이 == 1 <= age <= 200 인 정수. 
         personal[i][1] = st.nextToken(); //이름 == 길이가 100보다 작거나 같은 문자열   
      }
      
      Arrays.sort(personal, new Comparator<String[]>() { //personal 배열을 밑에 있는 조건에 따라 정렬할 예정

         @Override
         public int compare(String[] o1, String[] o2) {
            // TODO Auto-generated method stub
            if(o1[0] == o2[0]) // 만약 나이가 같다면
               return -1; //입력한 순서대로 출력. return이 양수 일 때만 두 값의 위치 변경하므로 return값을 음수로 주면 위치를 변경시키지 않는다.
            else { //만약 나이가 서로 같지 않다면
               int a = Integer.parseInt(o1[0]); //전자의 나이값을 정수형으로 변환 후 정수형 변수 a에 저장
               int b = Integer.parseInt(o2[0]); //후자의 나이값을 정수형으로 변환 후 정수형 변수 b에 저장
               return Integer.compare(a, b); //a,b를 비교해서 a - b > 0이면 위치 변경 0 >= a -b 이면 위치 변경 x
         }
         }
         
         
      });
      
      for(int j = 0; j < N; j++) { //N만큼 반복문 실행하면서
         bw.write(personal[j][0] + " " + personal[j][1] + "\n"); // bw에 나이 " " 이름 , 개행문자 추가 
      }

      bw.flush(); //bw 출력
      bw.close();
   }

}