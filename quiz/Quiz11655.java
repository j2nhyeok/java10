import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz11655 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(bf.readLine(), ""); //알파벳 대문자, 소문자, 공백, 숫자로만 이루어진 문장, 문장의 길이는 100을 넘지 않는다.
		int a = st.countTokens();
		
		char c[] = new char[a];
		
		for(int k = 0; k < a ; k++) {
			c[k] = st.nextToken().charAt(0);
		}
		
		for(int i = 0; i < c.length ; i++) {
		
				if( 65 <= c[i] && c[i] <= 77) {
					sb.append((char)(c[i] + 13));
				}else if( 78 <= c[i] && c[i] <= 90) {
					sb.append((char)(c[i] - 13));
				}else if( 97 <= c[i] && c[i] <= 109) {
					sb.append((char)(c[i] + 13));
				}else if( 110 <= c[i] && c[i] <= 122) {
					sb.append((char)(c[i] - 13));
				}else if( 48 <= c[i] && c[i] <= 57) {
					sb.append(c[i]);
				}else if ((int)c[i] == 32) {
					sb.append(c[i]);
			}
	
		}
System.out.println(sb);
	}

}
