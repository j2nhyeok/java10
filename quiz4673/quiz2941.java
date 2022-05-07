import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      String str = sc.nextLine();
	      String croatia_alphabet[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
	      
	      for(int j = 0; j < 8; j++){
	         if(str.contains(croatia_alphabet[j])){
	      
	      str = str.replace(croatia_alphabet[j], "d");
	         }
	      }
	    
	    		      
	   System.out.println(str2.length);

	}

}
