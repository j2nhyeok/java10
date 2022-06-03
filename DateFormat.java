
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Calendar;

public class DateFormat{
   public static void main(String[] args) throws NumberFormatException, IOException{
       
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		Calendar cal = Calendar.getInstance();

		
		int y, m;  
		int w;   
		int i;     

		do
		{
			System.out.print("���� �Է� : ");
			y = Integer.parseInt(br.readLine());
		}
		while (y<1);

		do
		{
			System.out.print("�� �Է� : ");
			m = Integer.parseInt(br.readLine());
		}
		while (m<1 || m>12);

		
		cal.set(y,m-1,1); //-- check~!!!  �� -1 ���ְ� �Ͽ� 1���� ���� �˾ƾ��ϴϱ� 1�Է�!!
		//--- �� ���� �� �Է°�(m)�� �״�� ����ϴ� ���� �ƴ϶�
		//	  �Է°����� 1�� �� ������ ���� �����ؾ� �Ѵ�.
		//--- �� ���� �� �Է¹��� ��, ���� �ش��ϴ� 1�Ϸ� �����ؾ� �Ѵ�.
		//    �� ���� ���� Ȯ���� ���ؼ�...
		System.out.println(Calendar.DAY_OF_WEEK);
		System.out.println(Calendar.MONTH);
		System.out.println(Calendar.DATE);
		// ���� ��������
		w = cal.get(Calendar.DAY_OF_WEEK);

		
		System.out.println(w);
		//--==>> ���� �Է� : 2021
		//		 �� �Է�   : 8
		//		 1 -> 2021�� 8�� ���� -> �Ͽ��� -> 2021�� 8�� 1���� �Ͽ���~!!!

		System.out.println(); 
		System.out.println("\t[ " + y + "�� " +  m + "�� ]\n");
		System.out.println(" ��   ��   ȭ   ��   ��   ��   ��");
		System.out.println(" ===========================");
		

		// ��ĭ ���� �߻�
		for (i=1; i<w; i++)
			System.out.print("    ");
		//�׽�Ʈ
		//System.out.printf("%4d",1);    //1�� ������ ��ġ �׽�Ʈ

		// �� Calendar �� getActualMaximum() �޼ҵ�
		//System.out.println(cal.getActualMaximum(Calendar.DATE));
		
		
		//for (i=1; i<=�׿��� ������ ��¥;i++)
		for (i=1; i<=cal.getActualMaximum(Calendar.DATE); i++)
		{
			System.out.printf("%4d",i); 
			w++;   //--�ݺ����� �����ϸ� ��¥�� ������ ������ ���ϵ� �Բ� ������ �� �ֵ��� ó��

			if(w%7==1)         //���� �ߴ��� 0�̾��µ� ���⼱ 1!!! �ֳĸ� �Ͽ����� 1�̴ϱ�!!
				System.out.println();   //--������ ������ �Ͽ����� �� �� ���� ���� �� ���
		}

		if(w%7!=1)
			System.out.println();

		System.out.println(" ===========================");
		


   }
}
