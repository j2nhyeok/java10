import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BookCont{
	
	Scanner sc = new Scanner(System.in);

	private String Title, Author, Publisher, Genre;
	private int Price;
	
public void insert() {
		System.out.print("몇 개의 책을 입력하시겠습니까?  : ");
		int BookCnt = sc.nextInt();
		System.out.println("\n" + BookCnt +" 개의 책에 대한 정보를 입력하시오.");
	
		for(int i = 0; i < BookCnt ; i++) {	
	    	
			for(int j = 0; j < BookProgram.class.) {
				
			}
	
    		//값 입력 부분
		
		   
		      Title = sc.next();
		     
		      Author = sc.next();
		      Publisher = sc.next();
		      Genre = sc.next();
		      Price = sc.nextInt();
		     
		      Book book[i] = new Book( Title, Author, Publisher, Genre, Price));
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
		
		Arrays.sort(avg);
		
		for(int i = 0; i < list.size() ; i++) {
			
			if(list.get(i).getAvg() == avg[avg.length-1]) {
				System.out.println(list.get(i).getName());
			}
		}
	}
}