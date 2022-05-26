import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz11655 {

   public static void main(String[] args) throws IOException {
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //값을 입력받기 위하여 BufferedReader 사용
      StringBuilder sb = new StringBuilder(); //문자열을 결합하여 정답 문자열을 만들기 위해 StringBuilder 사용
      
      String sentence = bf.readLine(); //알파벳 대문자, 소문자, 공백, 숫자로만 이루어진 문장, 문장의 길이는 100을 넘지 않는다.
      String[] alphabets = sentence.split(""); //공백도 하나의 문자로 판단해주어야 하기 때문에 공백을 기준으로 나뉘는게 아니라 ""을 기준으로 문자열을 나눈뒤 문자열 alphabets 배열에 순서대로 저장
     
      int a = alphabets.length; // alphabets 배열의 길이를 정수형 변수 a에 저장
     char c[] = new char[a]; //a의 크기를 가진 문자형 배열 c선언.
     
     for(int i = 0; i< a; i++) { //a만큼 반복문 실행
    	 c[i] = alphabets[i].charAt(0); //문자형 배열 c에 순서대로 alphabets배열의 요소들을 저장
     }
     


      for(int i = 0; i < a ; i++) { //a만큼 반복문 실행
      
            if( 65 <= (int)c[i] && (int)c[i] <= 77) { // 현재 문자의 아스키 코드가 65('A') 이상 77('M') 이하라면
               sb.append((char)((int)c[i] + 13)); // 현재 문자의 아스키 코드에 13을 더한 뒤 문자로 형 변환 후 정답 문자열 sb에 추가
            }else if( 78 <= (int)c[i] && (int)c[i] <= 90) { // 현재 문자의 아스키 코드가 78('N') 이상 90('Z') 이하라면
               sb.append((char)(c[i] - 13)); // 현재 문자의 아스키 코드에 13을 빼준 뒤 문자로 형 변환 후 정답 문자열 sb에 추가
            }else if( 97 <= (int)c[i] && (int)c[i] <= 109) { // 현재 문자의 아스키 코드가 97('a') 이상 109('m') 이하라면
               sb.append((char)((int)c[i] + 13)); // 현재 문자의 아스키 코드에 13을 더한 뒤 문자로 형 변환 후 정답 문자열 sb에 추가
            }else if( 110 <= (int)c[i] && (int)c[i] <= 122) {  // 현재 문자의 아스키 코드가 110('n') 이상 122('z') 이하라면
               sb.append((char)((int)c[i] - 13));   // 현재 문자의 아스키 코드에 13을 빼준 뒤 문자로 형 변환 후 정답 문자열 sb에 추가
            }else if( 48 <= (int)c[i] && (int)c[i] <= 57) { // 현재 문자의 아스키 코드가 48('0') 이상 57('9') 이하라면
               sb.append(c[i]); // 현재 문자를 그대로 정답 문자열 sb에 추가
            }else if ((int)c[i] == 32) { //// 현재 문자의 아스키 코드가 32(' ')라면 
               sb.append(c[i]); // 현재 문자를 그대로 정답 문자열 sb에 추가
         }
   
      }
System.out.println(sb); // 정답 출력
   }

}