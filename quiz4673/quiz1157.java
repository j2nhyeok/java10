import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class quiz1157 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String word = sc.next();
	char alphabet[] = new char[26];
	word = word.toLowerCase();
	
	for(int i = 0; i <26; i++) {
		alphabet[i] =(char)(i + 65);
	}

		List<Integer> number_count = new ArrayList<>();

	for(char a = 'a'; a <= 'z'; a++) {
	     number_count.add(countChar(word,a));
	}
	
	  int max = Collections.max(number_count);
	  
	  int maxFrequency = Collections.frequency(number_count,  max);
	 if( 2 <= maxFrequency ) {
		 System.out.println("?");
	 }else {
	  System.out.println(alphabet[number_count.indexOf(max)]);	
	 }	  
	  
	}

	
	public static int countChar(String word, char ch) {
		return  (word.length() - word.replace(String.valueOf(ch), "").length());
		}
}
