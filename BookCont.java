import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BookCont{
	
	Scanner sc = new Scanner(System.in);

	private String Title, Author, Publisher, Genre;
	private int Price;
	
public void insert() {
		System.out.print("�� ���� å�� �Է��Ͻðڽ��ϱ�?  : ");
		int BookCnt = sc.nextInt();
		System.out.println("\n" + BookCnt +" ���� å�� ���� ������ �Է��Ͻÿ�.");
	
		for(int i = 0; i < BookCnt ; i++) {	
	    	
			for(int j = 0; j < BookProgram.class.) {
				
			}
	
    		//�� �Է� �κ�
		
		   
		      Title = sc.next();
		     
		      Author = sc.next();
		      Publisher = sc.next();
		      Genre = sc.next();
		      Price = sc.nextInt();
		     
		      Book book[i] = new Book( Title, Author, Publisher, Genre, Price));
	}
}
	public void searchAll() {
		System.out.println("�̸�\t��������\t��������\t��������\t���");
		for(int i=0;i<list.size();i++) {
  		  	System.out.println(list.get(i).getName()+"\t"+list.get(i).getKor()+"\t"+list.get(i).getEng()+"\t"+list.get(i).getMath()+"\t"+ list.get(i).getAvg());
		}
	}
	
	public void avg_per_subject() {
		System.out.println("�������� ���\t�������� ���\t�������� ���");
		float sum_Kor = 0;
		float sum_Eng = 0;
		float sum_Math = 0;
		for(int i = 0; i < list.size(); i++) {
			sum_Kor += list.get(i).getKor();
			sum_Eng += list.get(i).getEng();
			sum_Math += list.get(i).getMath();
		}
			System.out.print(sum_Kor / 3 + "     \t");
			System.out.print(sum_Eng / 3 + "     \t");
			System.out.println(sum_Math / 3 + "     \t");
	}
	public void winner() {
		System.out.println("������� 1���� �л��� ����");
		float avg[] = new float[list.size()];
		
		for(int i = 0; i < list.size(); i++) {
			avg[i] = list.get(i).getAvg();
		}
		
		Arrays.sort(avg);
		
		for(int i = 0; i < list.size() ; i++) {
			
			if(list.get(i).getAvg() == avg[avg.length-1]) {
				System.out.println(list.get(i).getName());
			}
		}
	}
}