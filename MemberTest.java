import java.util.Scanner;

public class MemberTest {
	Scanner sc = new Scanner(System.in);
	Member[] members = new Member[10];
	int selectNumber = 0;
	int count = 0;
	
	public MemberTest(){
		run();
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
			System.out.println("3. �� ȸ������ BMI ���� ����");
			System.out.println("6. ����				");
			System.out.println("=================================================");
			System.out.println("                                                  ");
			
			selectNumber = Integer.parseInt(getData("��ȣ �Է� : "));
			
			System.out.println();
			
			if(selectNumber == 1) {
				registerMember();
			}else if(selectNumber == 2) {
				memberList();
			}else if(selectNumber == 3){
				bmiCal();
			}else if(selectNumber == 6) {
    			System.out.println("\n <���� ���� ���α׷��� �����մϴ�.>");
    			break;
    		}else {
    			System.out.println("<������ ���� ��� ��ȣ�� �Է��ϼ̽��ϴ�.>");
    			System.out.println("<�ٽ� �Է����ּ���.>");
    		}
		}
		
	}
	private void bmiCal() {
		
	}





	private void memberList() {
		 System.out.println("                                                  ");
		 System.out.println("=================================================");
	     System.out.println("                  ȸ�����");
	     System.out.println("�̸�\tŰ(m)\t������(kg)\tbmi");
		 System.out.println("=================================================");
		 System.out.println("                                                  ");
	     
	     for(int i = 0; i < 10; i++) {
	    	 if(members[i] != null) {
	    		 System.out.println(members[i].PrintAll());
	        }
	     }
	     
	     System.out.println("1.���   2.���α׷� ����");
	     
	     selectNumber = Integer.parseInt(getData("��ȣ�Է� : "));
		if(selectNumber == 2) {
			System.out.println("���α׷��� �����մϴ�.");
		}
	}


	private void registerMember() {
		System.out.println("�� ���� ȸ���� ����Ͻðڽ��ϱ�? ");
        int register_cnt = sc.nextInt();
		
		
		 for(int j = 0; j < register_cnt; j++) {
			String name = getData((count +  1) +"��° �ű� ȸ���� �̸��� �Է����ּ���");
			double height = Double.parseDouble(getData( (count +  1) + "��° �ű� ȸ���� Ű�� �Է����ּ���"));
			double weight =  Double.parseDouble(getData( (count +  1) +"��° �ű� ȸ���� �����Ը� �Է����ּ���"));
		
			for(int i = 0; i < 10; i++) {
				
				
				if(members[i] == null) {
					members[i] = new Member(name, height, weight);
					count++;
					
					for(int k = 0; k < i; k++) {
						
						if(members[k].equals(members[i])) {
							count--;
							
							members[i] = null;
							System.out.println("���� ȸ���� ���� �̸�, Ű , �������Դϴ�.");
							System.out.println("������� �ٽ� ���ư��ϴ�.");
							break;
						}
						
					}
					break;
					
				}
			}
			
			
				
				
				
				
				
			
			System.out.println("< " + count + "�� ��ϿϷ�" + "                        " + (10 - count) + " �� ���ҽ��ϴ�.(�ִ� 10��) >");
		
			if(	members[j] == null) {
				
				j--;
				
				
			}
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
