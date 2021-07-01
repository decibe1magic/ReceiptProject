import java.util.Scanner;

public class ReceiptInputData {
	
	public ReceiptArrayClass inputData() {
		Scanner sc = new Scanner(System.in);
		ReceiptArrayClass orderList = new ReceiptArrayClass();
		ReceiptProcess checkList = new ReceiptProcess();
		
		System.out.print("상품 번호를 입력하세요 : ");
		orderList.no = sc.nextInt();
		while (checkList.orderNumCheck(orderList.no) == false) {
			System.out.println("해당하는 상품 번호가 존재하지 않습니다.");
			orderList.no = sc.nextInt();
		}
		System.out.print("구매 갯수 : ");
		orderList.count = sc.nextInt();
		
		return orderList;
	}
}
