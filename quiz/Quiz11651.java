import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Quiz11651 {

   public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //값을 입력받기 위하여 BufferedReader 사용
      StringBuilder sb = new StringBuilder(); //정답을 저장 해줄 StringBuilder sb 선언.
      
      int N = Integer.parseInt(bf.readLine()); //첫째 줄에 점의 개수 N (1 ≤ N ≤ 100,000)이 주어진다. 
      
      int[][] coordinate = new int[N][2]; //총 개의 좌표 (x,y)를 저장해줄 이중배열 coordinate 선언
      
      StringTokenizer st; 
      for(int i = 0; i < N ; i++) { // N만큼 반복문 실행
         st = new StringTokenizer(bf.readLine(), " "); //한 줄로 x좌표 y좌표를 입력받아 공백으로 분리한 후 st에 저장
         coordinate[i][0] = Integer.parseInt(st.nextToken()); //st에 제일 앞 숫자 (x좌표)를 정수형으로 형 변환후 coordinate[i][0]에 저장
         coordinate[i][1] = Integer.parseInt(st.nextToken()); ////st에 제일 앞 숫자 (y좌표)를 정수형으로 형 변환후 coordinate[i][1]에 저장
         
      }
      
      Arrays.sort(coordinate, new Comparator<int[]>() { //coordinate 이중배열을 밑에 있는 조건에 따라 정렬할 예정.

         @Override
         public int compare(int[] o1, int[] o2) {
            if(o1[1] == o2[1])       //y좌표가 같은 경우
               return o1[0] -o2[0]; //x좌표가 증가하는 순으로 정렬.
            else                    //y좌표가 같지 않은 경우 
               return o1[1] - o2[1]; //y좌표가 증가하는 순으로 정렬
         }
         
      });
         
      for(int j = 0; j < N ; j++) { //N의 크기만큼 반복문 실행
         sb.append(coordinate[j][0] + " " + coordinate[j][1]).append("\n"); //이중배열의 x좌표 " " y좌표 그리고 개행문자를 sb에 저장
      }
   System.out.println(sb); //sb 출력 == 정답.
   }
}