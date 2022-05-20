import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Quiz1181 {

   public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));  //값을 입력받기 위하여 BufferedReader 사용
    StringBuilder sb = new StringBuilder();  //정답을 저장 해줄 StringBuilder sb 선언.
    
    int N = Integer.parseInt(bf.readLine()); //단어의 개수 N. (1<=N<=20,000)
    
    String[] before_words = new String[N]; //N개의 단어의 개수를 저장 해줄 문자열 배열 before_words 선언.
   
    
    for(int i = 0; i < N ; i++) { //단어의 개수 N만큼 for문 반복 실행
       String word = bf.readLine(); //알파벳 소문자로 이루어진 단어입력. 문자열의 길이는 50을 넘지 않는다.
       before_words[i] = word; //before_words 배열에 단어를 순서대로 저장 
    }


    
    Arrays.sort(before_words, new Comparator<String>() {  //before_words 배열을 밑에 있는 조건에 따라 정렬할 예정.

      @Override
      public int compare(String o1, String o2) {
         if(o1.length() == o2.length()) { //만약 두 문자열의 길이가 같으면 
            return o1.compareTo(o2); //사전순으로 정렬. (문자열의 첫 번째 문자부터 서로 비교하며 첫 번째 문자가 같으면 다음 번째 문자의 아스키코드를 비교) o1 - o2 가 양수면 위치 변경
         }
         else { //만약 두 문자열의 길이가 같지않으면
            return Integer.compare(o1.length(), o2.length()); //두 문자열 길이를 비교하여 앞에 문자열의 길이가 더 길면 위치 변경.
         }                                                     //예를 들어 o1.length() == 5, o2.length() ==3 일 때 5 - 3 = 2이므로 두 문자열의 위치 변경
   
      }
    });
    
    ArrayList<String> temp_list = new ArrayList<String>(); //문자열 리스트 temp_list 선언.
    
    //같은 단어가 여러 번 입력된 경우에는 한 번씩만 출력한다. 의 조건을 만족시키기 위한 코드
     for(int k = 0; k < before_words.length; k++) { //before_words의 크기만큼 반복문 실행.
       if( k == 0) {                              // k = 0일 때 == 즉 for문 첫 번째 실행일 때,
          temp_list.add(before_words[k]);        //before_words의 첫 요소를 temp_list에 추가
       } else {                                   //k != 0이 아닐 때
          if(!before_words[k].equals( before_words[k-1])) { //before_words[k]가 before_words[k-1]과 같지 않다면 == 즉, before_words 배열의 앞부분 요소 중 같은 값이 있지 않다면,
             temp_list.add(before_words[k]); //temp_list에 before_words[k] 값을 추가
          }
       }
    }
    
    String[] after_words = temp_list.toArray(new String[temp_list.size()]); //temp_list를 문자열 배열 after_words로 형 변환

   
    
    for(int j = 0; j < after_words.length ; j++) { //조건에 따라 정렬된 단어가 저장된 배열 after_words의 배열 크기만큼 for문 실행
       sb.append(after_words[j]).append("\n"); //sb에 조건에 따라 정렬된 단어들을 sb에 저장.
    }
    
    System.out.println(sb); //sb문자열 출력 == 정답
   }

}