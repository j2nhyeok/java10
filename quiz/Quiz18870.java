import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Quiz18870 {

   public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //값을 입력받기 위하여 BufferedReader 사용
      StringBuilder sb = new StringBuilder();  //정답을 저장 해줄 StringBuilder sb 선언.
      int N = Integer.parseInt(bf.readLine()); //좌표의 개수 , 1 ≤ N ≤ 1,000,000
      int Xi[] = new int[N]; //좌표의 개수인 N의 크기만큼 정수형 배열 Xi를 선언
      int sorted[] = new int[N]; //좌표의 개수인 N의 크기만큼 정수형 배열 sorted을 선언, sorted배열 == Xi배열을 오름차순으로 정렬한 배열이 될 예정.
      HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>(); //key와 value의 자료형이 Integer인 HashMap 사용
      StringTokenizer st = new StringTokenizer(bf.readLine(), " "); // 한 줄로 N개의 좌표를 입력한 뒤 공백을 기준으로 분리한 후 st에 저장.
      
      for(int i = 0; i < N ; i++) { //N만큼 for문 반복 실행
         sorted[i] = Xi[i] = Integer.parseInt(st.nextToken()); //st에 저장된 좌표들을 순서대로 ,  sorted, Xi 배열에 저장.
      }
      
      Arrays.sort(sorted); //sorted 배열을 오름차순으로 정렬
      
      int rank = 0; //HashMap을 사용하였으므로 Xi배열의 요소들을 낮은 순서대로 ranking을 매겨 줄 예정. 예를들어, {-2,1,5,5} 일 경우 rank는 {0,1,2,2}
      
      for(int j = 0; j < sorted.length; j++) { //오름차순으로 정렬된 배열의 크기만큼 for문 반복 실행
         //sorted배열이 {-10, -9, 2, 4, 4} 일 때 출력 값이 {0, 1, 2, 3, 4}가 아니라 {0, 1, 2, 3, 3} 이 되어야함. 
         if(!rankingMap.containsKey(sorted[j])) { //만약 rankingMap에 key중에서 sorted[j]가 포함 되어있지 '않다면',,,즉 첫 번쨰 for문은 무조건 실행된다. 그 이유는 rankingMap안에 아무것도 들어있지 않기 때문에
            rankingMap.put(sorted[j],rank); //rankingMap에 key에는 sorted[j], value에는 rank를 추가한다.
            rank++; // 위의 문장 실행 한 후 rank를 1 추가.
         }
      }
      
      for(int k = 0; k < N; k++) { //N만큼 반복문을 실행하여
         sb.append(rankingMap.get(Xi[k])).append(" "); //Xi가 {2, 4, -10, 4, -9}라면 k가 0일 때 Xi[0]은 2. rankingMap.get(2)는 key의 값이 2인 value값을 불러온다.
      }
      System.out.println(sb); //정답 출력 
      
   }

}