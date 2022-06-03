
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
			System.out.print("연도 입력 : ");
			y = Integer.parseInt(br.readLine());
		}
		while (y<1);

		do
		{
			System.out.print("월 입력 : ");
			m = Integer.parseInt(br.readLine());
		}
		while (m<1 || m>12);

		
		cal.set(y,m-1,1); //-- check~!!!  월 -1 해주고 일에 1일의 요일 알아야하니까 1입력!!
		//--- 월 구성 시 입력값(m)을 그대로 사용하는 것이 아니라
		//	  입력값에서 1을 뺀 값으로 월을 설정해야 한다.
		//--- 일 구성 시 입력받은 연, 월에 해당하는 1일로 설정해야 한다.
		//    그 날의 요일 확인을 위해서...
		System.out.println(Calendar.DAY_OF_WEEK);
		System.out.println(Calendar.MONTH);
		System.out.println(Calendar.DATE);
		// 요일 가져오기
		w = cal.get(Calendar.DAY_OF_WEEK);

		
		System.out.println(w);
		//--==>> 연도 입력 : 2021
		//		 월 입력   : 8
		//		 1 -> 2021년 8월 기준 -> 일요일 -> 2021년 8월 1일은 일요일~!!!

		System.out.println(); 
		System.out.println("\t[ " + y + "년 " +  m + "월 ]\n");
		System.out.println(" 일   월   화   수   목   금   토");
		System.out.println(" ===========================");
		

		// 빈칸 공백 발생
		for (i=1; i<w; i++)
			System.out.print("    ");
		//테스트
		//System.out.printf("%4d",1);    //1이 찍히는 위치 테스트

		// ※ Calendar 의 getActualMaximum() 메소드
		//System.out.println(cal.getActualMaximum(Calendar.DATE));
		
		
		//for (i=1; i<=그월의 마지막 날짜;i++)
		for (i=1; i<=cal.getActualMaximum(Calendar.DATE); i++)
		{
			System.out.printf("%4d",i); 
			w++;   //--반복문을 수행하며 날짜가 증가할 때마다 요일도 함께 증가할 수 있도록 처리

			if(w%7==1)         //전에 했던건 0이었는데 여기선 1!!! 왜냐면 일요일이 1이니까!!
				System.out.println();   //--증가한 요일이 일요일이 될 때 마다 개행 후 출력
		}

		if(w%7!=1)
			System.out.println();

		System.out.println(" ===========================");
		


   }
}
