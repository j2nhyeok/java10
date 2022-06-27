import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Quiz2529 {
   public static int k;
   public static String[] inequality;
   public static boolean visited[] = new boolean[10];
   public static ArrayList<String> list = new ArrayList<String>();

   public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));  
      k = Integer.parseInt(bf.readLine());

      
      String sentence = bf.readLine();
      inequality = sentence.split(" ");
      //inequality[0] ~ inequality[k-1];
      // inequalit = new String[k]
      
  
      solve("",0);
      Collections.sort(list);
      System.out.println(list.get(list.size() - 1)); // 부등호에 만족하는 최대값
      System.out.println(list.get(0)); // 부등호에 만족하는 최소값
      
      
      
   }
   
   public static void solve(String num, int cnt) {
	   
	   if(cnt == k + 1) {
		   list.add(num);
		   return;
	   }
	   
	   for(int i = 0; i <= 9; i++) {
		   if(!visited[i]) {
			   if(cnt == 0 || check(num,Integer.toString(i).charAt(0), inequality[cntyy]) ) {
				   visited[i] = true;
				   solve(num + i , cnt + 1);
				   visited[i] = false;
			   }
		   }
	   }
   }

private static boolean check(String num, char i, String sign) {
	if(sign.equals(">")) {
		if(num.charAt(num.length()-1) > i) {
			return true;
		}
	}
	else if(sign.equals("<")){
		if(num.charAt(num.length()-1) < i) {
			return true;
		}
	}
	return false;

}    
   
}
   
