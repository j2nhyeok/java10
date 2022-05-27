import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Quiz2004 {

	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //���� �Է¹ޱ� ���Ͽ� BufferedReader ���
		
		StringTokenizer st =new StringTokenizer(bf.readLine(), " "); // �� ������ �������� �����Ͽ� �� �ٷ� �Է��� ���� ������ �������� �и��� �� st�� ������� ����
		long n = Long.parseLong(st.nextToken()); //st�� ù ��° ��ū�� n�� ����
		long m = Long.parseLong(st.nextToken()); //st�� ù ��° ��ū�� m�� ����
	
		//n!/{(n-m)!m!}
		long five_cnt = five_cnt_check(n) - five_cnt_check(n-m) - five_cnt_check(m); //n!�� 5�� �¼� - (n-m)!�� 5�� �¼� - m!�� 5�� �¼� = nCm�� 5�� �¼�
		long two_cnt = two_cnt_check(n) - two_cnt_check(n - m) - two_cnt_check(m); //n!�� 2�� �¼� - (n-m)!�� 2�� �¼� - m!�� 2�� �¼� = nCm�� 2�� �¼�
		
		System.out.println(Math.min(two_cnt, five_cnt)); // �� �� �� ���� ���� nCm ���ڸ� 0�� ����
	}
	
	   // factorial ������� �߿��� 2�� 5�� ���� ������ �ľ��Ѵ�.
	public static long two_cnt_check(long num) { //2�� �¼��� ���ϴ� �Լ�
		int two_cnt = 0; //2�� �¼��� ������ ��Ÿ���� two_cnt
		for(int i = 1; i <= num; i++) { //num��ŭ �ݺ��� ����
			int target = i; //������ ���� target�� i�� ����
			while((target % 2 == 0)) { //target�� 2�� ����� ��
				two_cnt++; //two_cnt�� 1�߰�
				target = target/2; //1�߰� �� target/2 �� ���� target�� ������
			}
		}
		return two_cnt; //2�� �¼��� ������ return
	}
	
	   // factorial ������� �߿��� 2�� 5�� ���� ������ �ľ��Ѵ�.
	public static long five_cnt_check(long num) { //5�� �¼��� ���ϴ� �Լ�
		int  five_cnt = 0; //5�� �¼��� ������ ��Ÿ���� five_cnt
		for(int i = 1; i <= num; i++) { //num��ŭ �ݺ��� ����
			int target = i; //������ ���� target�� i�� ����
			while((target % 5 == 0)) { //target�� 5�� ������
				five_cnt++; //5�� �¼� ���� 1����
				target = target/5; //1�߰� �� target/5 �� ���� target�� ������
			}
		}
		return five_cnt; //5�� �¼��� ������ return
		
	}
	
				
	}


