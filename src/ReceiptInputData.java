import java.util.Scanner;

public class ReceiptInputData {
	
	public ReceiptArrayClass inputData() {
		Scanner sc = new Scanner(System.in);
		ReceiptArrayClass orderList = new ReceiptArrayClass();
		ReceiptProcess checkList = new ReceiptProcess();
		
		System.out.print("��ǰ ��ȣ�� �Է��ϼ��� : ");
		orderList.no = sc.nextInt();
		while (checkList.orderNumCheck(orderList.no) == false) {
			System.out.println("�ش��ϴ� ��ǰ ��ȣ�� �������� �ʽ��ϴ�.");
			orderList.no = sc.nextInt();
		}
		System.out.print("���� ���� : ");
		orderList.count = sc.nextInt();
		
		return orderList;
	}
}
