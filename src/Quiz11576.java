

import java.util.Scanner;
import java.util.Stack;

public class Main{

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in); //���� �Է¹ޱ� ���Ͽ� Scanner ���
		
		
		Stack<Integer> stack = new Stack<>();  //Integer�� �����͸� �����ϴ� ����  stack ����

		
	
		int A = sc.nextInt();//�̷����� ��� ����  A .   2�̻� 30������ �ڿ���
		int B =  sc.nextInt(); // ���̰� ����ϴ� ���� B . 2�̻� 30������ �ڿ���
		
		int m =  sc.nextInt(); //A�������� ��Ÿ�� ������ �ڸ����� ���� m.  m(1 �� m �� 25)

		
		//�� ��° �ٿ��� A������ �̷�� �ִ� ���� m���� ������ �������� ���� �ڸ������� ���ʴ�� �־�����.
		  //�� ���ڴ� 0�̻� A�̸����� ����ȴ�. 
		  //���� ���� 0���� �����ϴ� ���� �������� �ʴ´�.
		int numbers[] = new int[m];  
		for(int i = 0 ; i < m ; i++) {
			numbers[i] = sc.nextInt();
		}
		
	    //first step) A�������� ��Ÿ�� ���� 10�������� ��ȯ
		int change_10 = 0; //A�������� ��Ÿ�� ���� 10�������� ��ȯ�Ͽ��� �� �� ���� ������ ������ ���� change_10�� ���� �� 0���� �ʱ�ȭ.  ���� 2^20���� �۴�.

        for(int i = 0; i < m; i++) {   //m��ŭ �ݺ��� ����
        	change_10 += numbers[i] * Math.pow(A, (m - 1) - i );  //10������ ��ȯ�ϴ� ����.	
        }   
       
        //second step) 10�������� ��ȯ�� ���� B�������� ��ȯ
        while(change_10 != 0) { //change_10�� 1�� �� while�� ����
        	
        	stack.push(change_10 % B);
        	change_10 = change_10 /B;
        	
        } 
        
    
      
       int a = stack.size(); //�ʱ� ������ ũ�⸦ ������ ���� a�� ����
       for(int i = 0; i< a; i++) {  //�ʱ� ���� ũ�⸸ŭ �ݺ��� ����
    	  System.out.print(stack.pop() + " ");
       }
    	
}
}
