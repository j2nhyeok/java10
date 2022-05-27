import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz9613 {

   public static StringTokenizer st; //����������  StringTokenizer ����
   
   public static Long sum ; //���� ������ sum ����. 
   
   public static void main(String[] args) throws NumberFormatException, IOException {
      // TODO Auto-generated method stub
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //���� �Է¹ޱ� ���Ͽ� BufferedReader ���
      StringBuilder sb =new StringBuilder(); //���� ���ڿ��� �����Ͽ� ���� ���ڿ��� ����� ���� StringBuilder ���
      
      int t = Integer.parseInt(bf.readLine()); //ù° �ٿ� �׽�Ʈ ���̽��� ���� t (1 �� t �� 100)
      
      
      for(int i = 0; i < t; i++) { //�׽�Ʈ ���̽��� ���� t��ŭ �ݺ��� ����
         
         sum = 0l; //���� ���� sum�� 0���� �ʱ�ȭ
         st = new StringTokenizer(bf.readLine(), " "); //�� �׽�Ʈ ���̽��� ���� ���� n (1 < n �� 100)�� �־�����, �������� n���� ���� �־�����. �Է����� �־����� ���� 1,000,000�� ���� �ʴ´�.
         int n = Integer.parseInt(st.nextToken());  //�� �׽�Ʈ ���̽��� ���� ���� n (1 < n �� 100)
         
         sb.append(GCD(n)).append("\n"); //���� ���� n�� GCD�Լ��� ���ڰ����� �Ѱ��ְ� return���� ���� ���� ���ڿ��� sb�� �߰��Ѵ�.
      }
      System.out.println(sb);
   }



public static Long GCD(int n) { //�� �׽�Ʈ ���̽����� ������ ��� ���� GCD�� ���� return ���ִ� GCD �Լ�
   
   int number[] = new int[n]; // ���� ���� n���� ������ ���� �� �� �ִ� ������ �迭 number�� nũ�⸸ŭ ����.
   
   for(int j = 0; j < n; j++) { //n��ŭ �ݺ��� ����
      number[j] = Integer.parseInt(st.nextToken()); //number �迭�� st�� �����ִ� ������ ������� �߰�
   }
   
   for(int k = 0 ; k < number.length - 1; k++) { //number �迭 ��� ���� ��ŭ for�� ����

     // �ִ������� ���� �� ���� �� ū ���� ������ bigger_number ����.
      
      for(int m = k + 1; m < number.length; m++) {
         int moduler = 1; //�ִ� ������� ���� �� ���� �� ū ���� ������ ������ ������ ���� �������� ������ moduler ���� �� 1�� �ʱ�ȭ
         
         int bigger_number = Math.max(number[k], number[m]); // �ִ������� ���� �� ���� �� ū ���� ������ ���� bigger_number �� ����.
         int smaller_number = Math.min(number[k], number[m]); //�ִ������� ���� �� ���� �� ���� ���� ������ ���� smaller_number �� ����.
        
         while(moduler != 0) { // moduler�� 0�� �ƴϸ�
         moduler = bigger_number % smaller_number; // �� ���� �� ū ������ ���� ���� ���� �������� moduler�� �����ϰ�
         
         if(moduler != 0) { //���� �� moduler�� 0�� �ƴ϶��
            bigger_number = smaller_number; //ū ���� ���� ���� ���� �����ϰ�
            smaller_number = moduler; //���� ���� ������ ���� moduler �� �����ϰ�  �ٽ� ���� �ö󰡼� while�� ����. ��������? moduler�� 0�� �� �� ����.;
         }else { // �ᱹ moduler�� 0�� �Ǿ��ٸ�
        	 break; // smaller_number�� ���� �ִ� �������� ���̹Ƿ� while �� Ż��
         }
         
      }
         sum += smaller_number; //�� �׽�Ʈ ���̽����� ������ ��� ���� GCD�� ���� �����ϴ� sum������ smaller_number(�ִ�����) �� ����
}
   }
   return sum; //��� ���� GCD�� �� ����
}
}
