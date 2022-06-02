import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StuCont{
	ArrayList<Student> list = new ArrayList<Student>();	//arraylist 생성 ( StuData 클래스가 배열에 담기게 된다 ) 
	Scanner sc = new Scanner(System.in);
	
	private String Name;
	private int Kor, Eng, Math;
	
public void insert() {
		int stu_Num = 3;
		System.out.println("\n3명의 학생에 대한 정보를 입력하시오.");


		for(int i=0;i<stu_Num;i++) {	
	    	
    		//값 입력 부분
		
		      System.out.print((i + 1) + "번째 학생의 이름을 입력하세요 : ");
		      Name = sc.next();
		      System.out.print("국어점수를 입력하세요 : ");
		      Kor = sc.nextInt();
		      System.out.print("영어점수를 입력하세요 : ");
		      Eng = sc.nextInt();
		      System.out.print("수학점수를 입력하세요 : ");
		      Math = sc.nextInt();
		     
		      list.add(new Student(Name,Kor,Math, Eng));
	}
}
	public void searchAll() {
		System.out.println("이름\t국어점수\t영어점수\t수학점수\t평균");
		for(int i=0;i<list.size();i++) {
  		  	System.out.println(list.get(i).getName()+"\t"+list.get(i).getKor()+"\t"+list.get(i).getEng()+"\t"+list.get(i).getMath()+"\t"+ list.get(i).getAvg());
		}
	}
	
	public void avg_per_subject() {
		System.out.println("국어점수 평균\t영어점수 평균\t수학점수 평균");
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
		System.out.println("평균점수 1등인 학생의 정보");
		float avg[] = new float[list.size()];
		
		for(int i = 0; i < list.size(); i++) {
			avg[i] = list.get(i).getAvg();
		}
		
		Arrays.sort(avg);  //오름차순 정렬을 이용하여 평균점수 1등을 구하는 중.
		
		for(int i = 0; i < list.size() ; i++) {
			
			if(list.get(i).getAvg() == avg[avg.length-1]) {
				System.out.println(list.get(i).getName());
			}
		}
	}
}