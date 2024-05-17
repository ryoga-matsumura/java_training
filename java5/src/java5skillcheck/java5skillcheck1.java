package java5skillcheck;
import java.io.*;

/**
 * 5.クラスの基礎　実力確認問題１
 */
class Item {
	/**
	 * 商品クラス
	 */
	String name;
	int price;
	double tax = 0.10;
	
	void setItem(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	void show() {
		int tax_fee = (int)(price * tax);
		int total = price + tax_fee;
		System.out.println("購入額：" + total + "円");
	}
}

public class java5skillcheck1 {
	/**
	 * 商品名、金額と消費税率をフィールドに持つ商品クラスを作成してください。
	 * 商品名と金額を入力し、計算結果を出力してください。
	 * 消費税率は一律10%です。 ※出力はmainメソッドで行うこと。
	 * @param args 文字列　整数
	 */
	public static void main(String[] args) throws IOException {
		Item item1 = new Item();
		
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("商品名を入力してください。");
		String name1 = br.readLine();
		
		System.out.println("金額を入力してください。");
		int price1 = Integer.parseInt(br.readLine());
		
		item1.setItem(name1, price1);
		item1.show();
	}
}
