import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class ReceiptProcess {

	public static void order() {
		ArrayList<ReceiptArrayClass> orderData = new ArrayList<ReceiptArrayClass>();
		ReceiptArrayClass orderList = new ReceiptArrayClass();
		ReceiptInputData input = new ReceiptInputData();
		ReceiptPrint print = new ReceiptPrint();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/goodslist", "root", "password");
			Statement stmt = conn.createStatement();
			ResultSet rset;
			
			do {
				orderList = input.inputData();
				rset = stmt.executeQuery("select * from goods where no=" + orderList.no);
				while (rset.next()) {
					orderList.name = rset.getString(2);
					orderList.price = rset.getInt(3);
				}
				orderList.total = orderList.price * orderList.count;

				orderData.add(orderList);

			} while (continueOrderItem()!=2);
			rset.close();
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		print.printReceipt(orderData);
	}

	public boolean orderNumCheck(int num) {
		boolean check = false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/goodslist", "root", "password");
			Statement stmt = conn.createStatement();
			ResultSet rset = stmt.executeQuery("select * from goods where no=" + num);

			check = rset.next();

			rset.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return check;
	}

	public static int continueOrder() {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("계속 : 1, 종료 : 2");
		num = sc.nextInt();
		return num;
	}

	public static int continueOrderItem() {
		int num=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("계속 주문 : 1, 종료 : 2");
		num = sc.nextInt();
		return num;
	}
}
