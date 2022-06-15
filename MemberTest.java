import java.util.Arrays;
import java.util.Scanner;
/* ����� 1.83 77     ����
   Ȳ���� 1.85 82     ��ü��
   ���ȣ 1.82 72     ����
   ��ȣ�� 1.82 136      ����  (������ ����)
   ��ġ 1.9 58    ��ü��
   
*/

public class MemberTest {
	Scanner sc = new Scanner(System.in); // ���� �Է� �ޱ� ���Ͽ� Scanner ���
	Member[] members = new Member[10]; // �ִ� 10���� ȸ������ ������ �� �ִ� members���� ����.
	int selectNumber = 0; //�������� ���������� ����.
	int count = 0; // �ű� ȸ�� �� �� ��� �ɶ� ���� count++; �� ����
				   //  count �� == ��ϵ� ȸ�� ��
	
	public MemberTest(){ //������ 
		run(); // �ֿ� ����� ����ϴ� run()�޼ҵ� ȣ��
	}
	
	
	public void run() {
		while(true) {
			if(selectNumber == 2) {
				break;
			}
			
			System.out.println("                                                  ");
			System.out.println("=====================���=========================");
			System.out.println("1. �ű� ȸ�� ���");
			System.out.println("2. ȸ�� ���");
			System.out.println("3. ���� ������ �ǰ�;�");
			System.out.println("4. Ű�� ������������ ���ĺ���");
			System.out.println("5. ����");
			System.out.println("=================================================");
			System.out.println("                                                  ");
			
			selectNumber = Integer.parseInt(getData("��ȣ �Է� : "));
			
			System.out.println();
			
			if(selectNumber == 1) {
				registerMember(); // ȸ�� ����ϴ� �Լ��� �̵�
			}else if(selectNumber == 2) {
				memberList(); // ��ϵ� ȸ�� ����� �� �� �ִ� �Լ��� �̵�
			}else if(selectNumber == 3){
				wantNomal(); 
			}else if(selectNumber == 4) {
				risingHeight();
			}
			else if(selectNumber == 5) {
    			System.out.println("\n <ȸ�� ���� ���α׷��� �����մϴ�.>");
    			break;
    		}else {
    			System.out.println("<������ ���� ��� ��ȣ�� �Է��ϼ̽��ϴ�.>");
    			System.out.println("<�ٽ� �Է����ּ���.>");
    		}
		}
		
	}
	
	private void risingHeight() {
		Member[] members2 = new Member[count];
		
		for(int i = 0; i < count ; i++) {
			members2[i] = members[i];
		}
		Arrays.sort(members2);
		for(int i = 0; i < 10; i++) {
	    	 if(members[i] != null) { // numbers[i]�� ��ϵ� ȸ���� �ִٸ�
	    		 System.out.println(members2[i].PrintAll()); //�� ȸ���� �̸�, Ű, ������, bmi����, bmi��� �� ���
	        }
	     }	
	}



	// ��ϵ� ȸ�� ����� �� �� �ִ� �Լ�
	private void memberList() { 
		 System.out.println("                                                  ");
		 System.out.println("=================================================");
	     System.out.println("                  ȸ�����");
	     System.out.println("�̸�\tŰ(m)\t������(kg)\tbmi\t���");
		 System.out.println("=================================================");
	
	     for(int i = 0; i < 10; i++) {
	    	 if(members[i] != null) { // numbers[i]�� ��ϵ� ȸ���� �ִٸ�
	    		 System.out.println(members[i].PrintAll()); //�� ȸ���� �̸�, Ű, ������, bmi����, bmi��� �� ���
	        }
	     }							//numbers[i]�� ��ϵ� ȸ���� ���ٸ� �Ѿ.
	     
		 System.out.println("=================================================");	// ��ϵ� ȸ������ �� ����ߴٸ�     
	     System.out.println("1.���   2.���α׷� ����"); //������� ���ư��� ���α׷��� �������� �������� �־���.
	     
	     selectNumber = Integer.parseInt(getData("��ȣ�Է� : "));
		
	    if(selectNumber == 2) {
			System.out.println("���α׷��� �����մϴ�.");
		}
	}


	private void registerMember() {

		
		boolean a = true;
		 while(a) {
			 // ���� count�� 0���� ���������Ƿ� 
			String name = getData((count +  1) +"��° �ű� ȸ���� �̸��� �Է����ּ���");
			double height = Double.parseDouble(getData( (count +  1) + "��° �ű� ȸ���� Ű�� �Է����ּ���"));
			double weight =  Double.parseDouble(getData( (count +  1) +"��° �ű� ȸ���� �����Ը� �Է����ּ���"));
			
			for(int i = 0; i < 10; i++) {
				
				
				if(members[i] == null) { //���� members[i]�� ����� ȸ���� ���ٸ�
					members[i] = new Member(name, height, weight); // ���ڸ��� N��° ȸ���� �̸� , Ű , �����Ը� ����
					count++; // �ű� ȸ���� ��� �Ǿ����� count++;
					
					for(int k = 0; k < i; k++) { // ���� �ݺ����� ���Ͽ� ���� ȸ���� �̸�, Ű, �����԰� ������ Ȯ�� �� ����
						
						if(members[k].equals(members[i])) { //���� ȸ���� �̸�, Ű, �����԰� ���ٸ�
							members[i] = null; //����ߴ� �ű� ȸ���� ���
							count--; //����ߴ� �ű� ȸ���� ��������� �ٽ� count--;
							
							
							System.out.println("-----------------------------------------------");
							System.out.println((count + 1) + "��° �ű� ȸ���� ����� �Ϸ� ���� �ʾҽ��ϴ�.");
							System.out.println("���� : "  + (k + 1) + "��° ȸ���� ���� �̸�, Ű , �������Դϴ�.");
							System.out.println("-----------------------------------------------");
										break;
						}
							
						
						
					}
					
					break;
					
				}
			}
			
			
			System.out.println("< " + count + "�� ��ϿϷ�" + "                        " + (10 - count) + " �� ���ҽ��ϴ�.(�ִ� 10��) >");	
			int b = Integer.parseInt(getData("1. �߰� ���      2. ��� ����"));
			if(b == 2) {
				break;			
			}
				
		 }
		
		
	}
	
	private void wantNomal() {
		System.out.println("------------------------------------------------------");
		System.out.println("1.���� | 2.�ߵ��� | 3.�浵�� | 4.��ü�� | 5.���� | 6.��ü��");
		System.out.println("------------------------------------------------------");
		
		
		for(int i = 0 ; i < members.length; i++) {
			if(members[i] != null) {
				if(members[i].getNote().equals("����(3�ܰ� ��)")) {
					System.out.println("  " + members[i].getName());
				}else if(members[i].getNote().equals("�ߵ��� (2�ܰ� ��)")) {
					System.out.println("\t\t   " + members[i].getName());
				}else if(members[i].getNote().equals("�浵�� (1�ܰ� ��)")) {
					System.out.println("\t\t\t   " + members[i].getName());
				}else if(members[i].getNote().equals("��ü��")) {
					System.out.println("\t\t\t\t " + members[i].getName());
				}else if(members[i].getNote().equals("����")) {
					System.out.println("\t\t\t\t\t " + members[i].getName());
				}else if(members[i].getNote().equals("��ü��")) {
					System.out.println("\t\t\t\t\t\t " + members[i].getName());
				}			
			}
		}
		
		selectNumber = Integer.parseInt(getData("<  �������� �ٲٰ���� ��ȣ �Է�   >"));

		switch(selectNumber) {
			case 1: nomalCal(1);
					break;
			case 2: nomalCal(2);
					break;
			case 3: nomalCal(3);
					break;
			case 4: nomalCal(4);
					break;
			case 5: System.out.println("�̹� bmi������ �����Դϴ�.");
					break;
			case 6: nomalCal(6);
					break;
		}
		System.out.println("------------------------------------------------------");
	     System.out.println("1.���   2.���α׷� ����");
	     
	     selectNumber = Integer.parseInt(getData("��ȣ�Է� : "));
		if(selectNumber == 2) {
			System.out.println("���α׷��� �����մϴ�.");
		}
	}

	private void nomalCal(int index) {
		String note[] = {"0", "����(3�ܰ� ��)", "�ߵ��� (2�ܰ� ��)", "�浵�� (1�ܰ� ��)", 
				"��ü��", "����", "��ü��"};
		int cnt = 0;
		for(int i = 0; i < members.length; i++) {
			double normalWeight = 0;
			double normalHeight = 0;
			if(members[i] != null) {
				if(members[i].getNote().equals(note[index])) {
					cnt++;
					normalWeight = 20 * members[i].getHeight() * members[i].getHeight();
					normalHeight = Math.sqrt(members[i].getWeight() / 20);
					if(index == 6) {
						System.out.println(members[i].getName() + "���� bmi�� ������ �Ƿ��� ���� " + String.format("%.2f",Math.abs(members[i].getWeight() - normalWeight)) + "kg ���� �Ͻðų� Ű�� " + String.format("%.2f",   Math.abs((normalHeight - members[i].getHeight())) * 100)+ "cm �� ���̽ʽÿ�.");
					}else {
						System.out.println(members[i].getName() + "���� bmi�� ������ �Ƿ��� ���� " + String.format("%.2f",members[i].getWeight() - normalWeight) + "kg ���� �Ͻðų� Ű�� " + String.format("%.2f",   (normalHeight - members[i].getHeight()) * 100)+ "cm �� Ű��ʽÿ�.");
					}
				}	
			}
		}
		if(cnt == 0) {
			System.out.println("�ش��ϴ� �ο��� �����ϴ�.");
			System.out.println("------------------------------------------------------");
		}
	
	}
						
	private String getData(String Message) {
		System.out.println(Message);
		return sc.next();
	}


	public static void main(String[] args) {
	
		new MemberTest();
		
	}

}