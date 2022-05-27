import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz1373 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //���� �Է¹ޱ� ���Ͽ� BufferedReader ���
		StringBuilder sb = new StringBuilder(); //���� ���ڿ��� �����Ͽ� ���� ���ڿ��� ����� ���� StringBuilder ���
		
		String binary = bf.readLine(); //2���� ���� ���ڿ��� �Է� ����. 
		
		if (binary.length() % 3 == 1) { //���� ���ڿ��� �Է��� 2������ ���̰� 3���� ������ �� �������� 1�̶��,  ��) 1|000
			sb.append(((int)binary.charAt(0) - 48) * 1); //������ �� �� ���� ���� '0'�� �ƽ�Ű �ڵ� ��(48)�� ���� ���ڷ� ���� �� *1�� �Ͽ� ���� ���ڿ��� sb�� �߰�.  1 * 1 = 1 
		}
		
		else if(binary.length() % 3 == 2) { // ���� ���ڿ��� �Է���2������ ���̰� 3���� ������ �� �������� 2���, ��) 11|000 
			sb.append(((int)binary.charAt(0) - 48) * 2 + ((int)binary.charAt(1) - 48) * 1);
			//������ �� �� ���� ������ �տ��� �� ��° ���� ���� '0'�� �ƽ�Ű �ڵ� ��(48)�� ���� ���ڷ� ���� �� *2, *1�� �Ͽ� �� ���� ���� �� ���� ���ڿ��� sb�� �߰�.  (1 * 2 = 2) + (1 * 1 = 1) = 3�� ����  
		}
		
		
			for(int i = binary.length() % 3 ; i < binary.length(); i+=3) { // ���� �ڵ带 ��ģ �� for�� �ݺ� 3�ڸ� ���� ��� ���
				sb.append(((int)binary.charAt(i) - 48) * 4 + ((int)binary.charAt(i + 1) - 48) * 2 + ((int)binary.charAt(i + 2) - 48) * 1);	
				//3�ڸ��� ������ �� ù ��° ���� 1�� �� 4, 0�� ��  0  + �� ��° ���� 1�� �� 2, 0�� ��  0 + �� ��° ���� 1�� �� 1, 0�� ��  0
			}
		

		
		System.out.println(sb);
	}

}
