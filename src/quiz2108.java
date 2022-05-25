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
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //���� �Է¹ޱ� ���� BufferedReader ���
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //���� ����ϱ� ���� BufferedWriter ���
		
		int N =Integer.parseInt(bf.readLine()); //ù° �ٿ� ���� ���� N(1 �� N �� 500,000)�� �־�����. ��, N�� Ȧ���̴�.
		int[] numbers = new int[N]; //N���� ���ڸ� ���� ����  N�� ũ�⸦ ���� ������ �迭 numbers�� ����. 
		int[] cnt = new int [8001]; //ī���� ������ ����ϱ� ���� ũ�Ⱑ 8001�� ������ �迭 cnt ����. ũ�Ⱑ 8001�� ������ �ԷµǴ� ������ ������ 4,000�� ���� �ʱ⿡  -4000~4000 �� 8001�� �̹Ƿ�.
	
		double sum = 0; //N���� ������ ���� �����ϱ� ���� double�� ���� sum ���� �� 0���� �ʱ�ȭ.
		long Mean = 0; // ��հ��� ��Ÿ���� long�� Mean���� ���� �� 0���� �ʱ�ȭ.
		int Median = 0; //�߾Ӱ��� ��Ÿ���� int�� Median���� ���� �� 0���� �ʱ�ȭ.
		int Mode =0; //�ֺ��� ��Ÿ���� int�� Mode���� ���� �� 0���� �ʱ�ȭ.
		int Range = 0; //������ ��Ÿ���� int�� Range���� ���� �� 0���� �ʱ�ȭ.
		
	
		for(int i = 0; i < N; i++) { //N��ŭ �ݺ��� ����.
			numbers[i] = Integer.parseInt(bf.readLine()); //N(������ ����)��ŭ ������ �Է� ���� �� numbers�迭�� ������� ����.
		}
		
		for(int j = 0; j<N ;  j++) { //N��ŭ �ݺ����� ����
			sum += numbers[j]; //numbers�迭�� ���� �� �� ������ ���� �� ���� sum ������ ����.
		}
		
		Mean = Math.round(sum/N); //��� ���..Math.round()�� ����Ͽ� �Ҽ� �� �ڸ������� �ݿø�.
	
		Arrays.sort(numbers); //�Է��� �������� ���� �Ǿ� �ִ� numbers �迭�� ������������ ����.
			
		Median =  numbers[N/2]; //���ĵ� numbers �迭�� ���� ��� ���� �߾Ӱ�

		Range = numbers[N-1] - numbers[0]; //���ĵ� numbers �迭�� ���� �ڿ� �ִ� ���� ���� �տ��ִ� ���� �� ���� ����.
		
		for(int b = 0; b <= 8000; b++) { //ī���� ������ ����ϱ� ���� cnt�迭�� ��� ��ҵ��� 0���� �ʱ�ȭ.
			cnt[b] = 0;
		}
		
		for(int c = 0; c < N; c++) {
			      cnt[numbers[c]+4000]++; //numbers[c]�� -4000�̶�� cnt[0]���� ++; , because cnt[-4000]���� ǥ�� �� �� ���⶧��. 
		}
		List<Integer> cnt_list = Arrays.stream(cnt).boxed().collect(Collectors.toList()); //������ �迭 cnt�� ������ ����Ʈ cnt_list�� ��ȯ. 
		int count = Collections.frequency(cnt_list, Collections.max(cnt_list)); // cnt_list ��ҵ��� �ִ밪�� cnt_list������ �󵵼��� ������ ���� count�� ����.
		
		
		if(count >= 2) { //���� count�� 2�̻��̶�� == ���ǿ��� �ֺ��� ���� �� ���� ������ �ֺ� �� �� ��°�� ���� ���� ����Ѵٶ�� �Ͽ�����
		cnt_list.remove(Collections.max(cnt_list)); //�ֺ� �� ù ��°�� ���� ���� ����Ʈ���� ���� �ع�����
		Mode = cnt_list.indexOf(Collections.max(cnt_list)) - 3999; //�ִ밪�� cnt_list �ε������� 3999�� �� ���� Mode�� ����.
		}else if(count == 1) { //���� �ֺ��� 1�����
			Mode = cnt_list.indexOf(Collections.max(cnt_list)) - 4000; //�ִ밪�� cnt_list �ε������� 4000�� �A ���� Mode�� ����
		}else if(N==1) { //���� N == 1�̶��
			Mode = numbers[0]; //�Է��� ���� �� ��ü�� �ֺ�.
		}
		
		
		
		
		bw.write(String.valueOf(Mean) + "\n" + String.valueOf(Median) + "\n" + String.valueOf(Mode) + "\n" + String.valueOf(Range));
		bw.flush();
		bw.close();
		
	}

}
