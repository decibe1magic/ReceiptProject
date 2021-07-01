import java.util.ArrayList;

public class ReceiptPrint {
	public void printReceipt(ArrayList<ReceiptArrayClass> orderData) {
		int sumTotalPrice = 0;
		System.out.printf("%19s %d\n", "주문번호 : ", 106);
		System.out.println("-------------------------------------");
		System.out.println();
		System.out.printf("%23s\n", "[ 카드판매 영수증 ]");
		System.out.printf("%21s\n", "[고객용]");
		System.out.println();
		System.out.printf("%20s\n", "카페리빈");
		System.out.printf("%s\n", "사업자번호:428-58-30102");
		System.out.printf("%s \t %s \n", "대표자:김상숙", "TEL:02-561-0606");
		System.out.println("-------------------------------------");
		System.out.printf("%-5s %-12s %s\n", "판매시간:20191224", "13:10:45", "[POS100]");
		System.out.printf("%s\n", "판매사원:");
		System.out.println("=====================================");
		System.out.printf("%-15s %-7s %-6s %s\n", "상품", "단가", "수량", "금액");
		System.out.println("=====================================");
		for (int index = 0; index < orderData.size(); index++) {
			System.out.printf("%-14s %-8d %-6d %d\n", orderData.get(index).name, orderData.get(index).price,
					orderData.get(index).count, orderData.get(index).total);
			sumTotalPrice += orderData.get(index).total;
		}
		System.out.println("-------------------------------------");
		System.out.printf("%-5s %-25s %d\n", "합", "계", sumTotalPrice);
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
	}

}
