import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StuCont{
	ArrayList<Student> list = new ArrayList<Student>();	//arraylist ���� ( StuData Ŭ������ �迭�� ���� �ȴ� ) 
	Scanner sc = new Scanner(System.in);
	
	private String Name;
	private int Kor, Eng, Math;
	
public void insert() {
		int stu_Num = 3;
		System.out.println("\n3���� �л��� ���� ������ �Է��Ͻÿ�.");


		for(int i=0;i<stu_Num;i++) {	
	    	
    		//�� �Է� �κ�
		
		      System.out.print((i + 1) + "��° �л��� �̸��� �Է��ϼ��� : ");
		      Name = sc.next();
		      System.out.print("���������� �Է��ϼ��� : ");
		      Kor = sc.nextInt();
		      System.out.print("���������� �Է��ϼ��� : ");
		      Eng = sc.nextInt();
		      System.out.print("���������� �Է��ϼ��� : ");
		      Math = sc.nextInt();
		     
		      list.add(new Student(Name,Kor,Math, Eng));
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
		
		Arrays.sort(avg);  //�������� ������ �̿��Ͽ� ������� 1���� ���ϴ� ��.
		
		for(int i = 0; i < list.size() ; i++) {
			
			if(list.get(i).getAvg() == avg[avg.length-1]) {
				System.out.println(list.get(i).getName());
			}
		}
	}
}