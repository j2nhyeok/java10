
import java.util.ArrayList;
import java.util.Scanner;
 
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList arr = new ArrayList();
        int a, tmp;
        System.out.print("수 입력 : ");
        a = sc.nextInt();
        while(true) {
            // 입력받은 수의 나머지를 tmp에 저장
            // 제일 마지막수를 tmp에 저장한다고 생각
            tmp = a%10;
            // 입력받은 수의 몫을 저장
            // 제일 마지막수를 제외하고 저장됨
            a = a/10;
            // 제일 마지막수를 순차적으로 ArrayList에 저장
            arr.add(tmp);
            // 더이상 나눌수가 없을때 while문 탈출
            if(a==0) {
                break;
            }
        }
        // 수를 거꾸로 하나씩 입력받은 ArrayList를 출력
        System.out.println(arr);
    }
}