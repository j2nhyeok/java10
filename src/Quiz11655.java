import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz11655 {

   public static void main(String[] args) throws IOException {
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //���� �Է¹ޱ� ���Ͽ� BufferedReader ���
      StringBuilder sb = new StringBuilder(); //���ڿ��� �����Ͽ� ���� ���ڿ��� ����� ���� StringBuilder ���
      
      String sentence = bf.readLine(); //���ĺ� �빮��, �ҹ���, ����, ���ڷθ� �̷���� ����, ������ ���̴� 100�� ���� �ʴ´�.
      String[] alphabets = sentence.split(""); //���鵵 �ϳ��� ���ڷ� �Ǵ����־�� �ϱ� ������ ������ �������� �����°� �ƴ϶� ""�� �������� ���ڿ��� ������ ���ڿ� alphabets �迭�� ������� ����
     
      int a = alphabets.length; // alphabets �迭�� ���̸� ������ ���� a�� ����
     char c[] = new char[a]; //a�� ũ�⸦ ���� ������ �迭 c����.
     
     for(int i = 0; i< a; i++) { //a��ŭ �ݺ��� ����
    	 c[i] = alphabets[i].charAt(0); //������ �迭 c�� ������� alphabets�迭�� ��ҵ��� ����
     }
     


      for(int i = 0; i < a ; i++) { //a��ŭ �ݺ��� ����
      
            if( 65 <= (int)c[i] && (int)c[i] <= 77) { // ���� ������ �ƽ�Ű �ڵ尡 65('A') �̻� 77('M') ���϶��
               sb.append((char)((int)c[i] + 13)); // ���� ������ �ƽ�Ű �ڵ忡 13�� ���� �� ���ڷ� �� ��ȯ �� ���� ���ڿ� sb�� �߰�
            }else if( 78 <= (int)c[i] && (int)c[i] <= 90) { // ���� ������ �ƽ�Ű �ڵ尡 78('N') �̻� 90('Z') ���϶��
               sb.append((char)(c[i] - 13)); // ���� ������ �ƽ�Ű �ڵ忡 13�� ���� �� ���ڷ� �� ��ȯ �� ���� ���ڿ� sb�� �߰�
            }else if( 97 <= (int)c[i] && (int)c[i] <= 109) { // ���� ������ �ƽ�Ű �ڵ尡 97('a') �̻� 109('m') ���϶��
               sb.append((char)((int)c[i] + 13)); // ���� ������ �ƽ�Ű �ڵ忡 13�� ���� �� ���ڷ� �� ��ȯ �� ���� ���ڿ� sb�� �߰�
            }else if( 110 <= (int)c[i] && (int)c[i] <= 122) {  // ���� ������ �ƽ�Ű �ڵ尡 110('n') �̻� 122('z') ���϶��
               sb.append((char)((int)c[i] - 13));   // ���� ������ �ƽ�Ű �ڵ忡 13�� ���� �� ���ڷ� �� ��ȯ �� ���� ���ڿ� sb�� �߰�
            }else if( 48 <= (int)c[i] && (int)c[i] <= 57) { // ���� ������ �ƽ�Ű �ڵ尡 48('0') �̻� 57('9') ���϶��
               sb.append(c[i]); // ���� ���ڸ� �״�� ���� ���ڿ� sb�� �߰�
            }else if ((int)c[i] == 32) { //// ���� ������ �ƽ�Ű �ڵ尡 32(' ')��� 
               sb.append(c[i]); // ���� ���ڸ� �״�� ���� ���ڿ� sb�� �߰�
         }
   
      }
System.out.println(sb); // ���� ���
   }

}