import java.util.ArrayList;

public class ReceiptPrint {
	public void printReceipt(ArrayList<ReceiptArrayClass> orderData) {
		int sumTotalPrice = 0;
		System.out.printf("%19s %d\n", "�ֹ���ȣ : ", 106);
		System.out.println("-------------------------------------");
		System.out.println();
		System.out.printf("%23s\n", "[ ī���Ǹ� ������ ]");
		System.out.printf("%21s\n", "[����]");
		System.out.println();
		System.out.printf("%20s\n", "ī�丮��");
		System.out.printf("%s\n", "����ڹ�ȣ:428-58-30102");
		System.out.printf("%s \t %s \n", "��ǥ��:����", "TEL:02-561-0606");
		System.out.println("-------------------------------------");
		System.out.printf("%-5s %-12s %s\n", "�ǸŽð�:20191224", "13:10:45", "[POS100]");
		System.out.printf("%s\n", "�ǸŻ��:");
		System.out.println("=====================================");
		System.out.printf("%-15s %-7s %-6s %s\n", "��ǰ", "�ܰ�", "����", "�ݾ�");
		System.out.println("=====================================");
		for (int index = 0; index < orderData.size(); index++) {
			System.out.printf("%-14s %-8d %-6d %d\n", orderData.get(index).name, orderData.get(index).price,
					orderData.get(index).count, orderData.get(index).total);
			sumTotalPrice += orderData.get(index).total;
		}
		System.out.println("-------------------------------------");
		System.out.printf("%-5s %-25s %d\n", "��", "��", sumTotalPrice);
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
	}

}
