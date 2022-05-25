import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class quiz1181 {

	public static void main(String[] args) throws NumberFormatException, IOException {
	 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));  //���� �Է¹ޱ� ���Ͽ� BufferedReader ���
	 StringBuilder sb = new StringBuilder();  //������ ���� ���� StringBuilder sb ����.
	 
	 int N = Integer.parseInt(bf.readLine()); //�ܾ��� ���� N. (1<=N<=20,000)
	 
	 String[] before_words = new String[N]; //N���� �ܾ��� ������ ���� ���� ���ڿ� �迭 before_words ����.
	
	 
	 for(int i = 0; i < N ; i++) { //�ܾ��� ���� N��ŭ for�� �ݺ� ����
		 String word = bf.readLine(); //���ĺ� �ҹ��ڷ� �̷���� �ܾ��Է�. ���ڿ��� ���̴� 50�� ���� �ʴ´�.
		 before_words[i] = word; //before_words �迭�� �ܾ ������� ���� 
	 }


	 Math.
	 Arrays.sort(before_words, new Comparator<String>() {  //before_words �迭�� �ؿ� �ִ� ���ǿ� ���� ������ ����.

		@Override
		public int compare(String o1, String o2) {
			if(o1.length() == o2.length()) { //���� �� ���ڿ��� ���̰� ������ 
				return o1.compareTo(o2); //���������� ����. (���ڿ��� ù ��° ���ں��� ���� ���ϸ� ù ��° ���ڰ� ������ ���� ��° ������ �ƽ�Ű�ڵ带 ��) o1 - o2 �� ����� ��ġ ����
			}
			else { //���� �� ���ڿ��� ���̰� ����������
				return Integer.compare(o1.length(), o2.length()); //�� ���ڿ� ���̸� ���Ͽ� �տ� ���ڿ��� ���̰� �� ��� ��ġ ����.
			}                                                     //���� ��� o1.length() == 5, o2.length() ==3 �� �� 5 - 3 = 2�̹Ƿ� �� ���ڿ��� ��ġ ����
	
		}
	 });
	 
	 ArrayList<String> temp_list = new ArrayList<String>(); //���ڿ� ����Ʈ temp_list ����.
	 
	 //���� �ܾ ���� �� �Էµ� ��쿡�� �� ������ ����Ѵ�. �� ������ ������Ű�� ���� �ڵ�
	  for(int k = 0; k < before_words.length; k++) { //before_words�� ũ�⸸ŭ �ݺ��� ����.
		 if( k == 0) {                              // k = 0�� �� == �� for�� ù ��° ������ ��,
			 temp_list.add(before_words[k]);        //before_words�� ù ��Ҹ� temp_list�� �߰�
		 } else {                                   //k != 0�� �ƴ� ��
			 if(!before_words[k].equals( before_words[k-1])) { //before_words[k]�� before_words[k-1]�� ���� �ʴٸ� == ��, before_words �迭�� �պκ� ��� �� ���� ���� ���� �ʴٸ�,
				 temp_list.add(before_words[k]); //temp_list�� before_words[k] ���� �߰�
			 }
		 }
	 }
	 
	 String[] after_words = temp_list.toArray(new String[temp_list.size()]); //temp_list�� ���ڿ� �迭 after_words�� �� ��ȯ

	
	 
	 for(int j = 0; j < after_words.length ; j++) { //���ǿ� ���� ���ĵ� �ܾ ����� �迭 after_words�� �迭 ũ�⸸ŭ for�� ����
		 sb.append(after_words[j]).append("\n"); //sb�� ���ǿ� ���� ���ĵ� �ܾ���� sb�� ����.
	 }
	 
	 System.out.println(sb); //sb���ڿ� ��� == ����
	}

}
