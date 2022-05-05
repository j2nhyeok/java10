
import java.util.Scanner;

public class quiz10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		
		for(char i = 'a'; i <= 'z'; i++)
		{
			System.out.print(word.indexOf(i) + " ");
		}


		
	}
}




