
import java.util.Arrays;
import java.util.ArrayList;

import java.util.Scanner;

public class quiz1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		String sentence2[] = sentence.split(" ");
		
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(sentence2));



		// 공백, null 제거
		list.removeAll(Arrays.asList(""));
		// 공백, null이 제거된 List 출력
		System.out.println(list.size()); 


	}

}
