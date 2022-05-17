import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz7568 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //값을 입력받기 위하여 BufferedReader 사용
		
		int N = Integer.parseInt(bf.readLine()); //전체 사람 수 N. 2<=N<=50
		
		int[][] spec = new int[N][2]; //각 사람의 몸무게(x), 키(y)를 저장할 정수형 이중 배열 spec선언.
		
		String[] str; //몸무게 , 키 를 저장할 배열 str 선언
		
		for(int i = 0 ; i < N; i++) //사람의 수만큼 반복문을 돌린다.
		{
	
		
			str =bf.readLine().split(" "); // 한 줄로 한 사람의 몸무게(x)와 키(y)를 입력받고 공백을 기준으로 분리한 후 str배열에 순서대로 저장
			int x = Integer.parseInt(str[0]); //str[0] == 몸무게. 정수형으로 형 변환 후 정수형 변수 x에 저장
			int y = Integer.parseInt(str[1]); //str[1] == 키.    정수형으로 형 변환 후 정수형 변수 y에 저장
			
			spec[i][0] = x; //각 사람의 몸무게와 키를 이중배열 spec에 저장
			spec[i][1] = y; //   ''
		}
		StringBuilder sb = new StringBuilder(); //값을 출력하기 위해 StringBuilder 사용
		
		for(int j = 0 ; j < N  ; j++) {  //각 사람의 spec을 비교하기 위한 반복문
			int rank = 1; //모든 사람의 덩치 등수를 1로 초기화
			for(int k = 0; k< N ; k++) {
				if(spec[j][0] < spec[k][0] && spec[j][1] < spec[k][1]) {
					rank++; //한 사람과 나머지 N-1명의 사람의 덩치를 비교하여 다른 사람보다 덩치가 안좋으면 rank++
				}
			}
			sb.append(rank).append(" "); //sb에 덩치 등수를 추가한 후 공백 축
		}
		
System.out.println(sb); // 모든 사람의 덩치 등수를 출력
}
}
