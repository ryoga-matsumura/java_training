package java4skillcheck;
import java.io.*;

/**
 * 4.for文　実力確認問題4_2
 */
public class java4skillcheck4_2 {
	/**
	 * 商品と単価、支払金額を3回入力し、支払金額の不足有無を出力してください。 最後に不足の合計を出力してください。
	 * ※入力値はString配列に格納すること。
	 * ※数値の計算はStringから変換を行うこと。
	 * @param args 文字列,正の整数
	 */
	public static void main(String[] args) throws IOException{
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		
		String list[][] = new String[3][3];
		for (int i = 0; i < 3; i++) {
				System.out.println("商品を入力してください。");
				String product = br.readLine();
				list[i][0] = product;
				System.out.println("単価を入力してください。");
				String price = br.readLine();
				list[i][1] = price;
				System.out.println("支払い金額を入力してください。");
				String money = br.readLine();
				list[i][2] = money;
		}
		int price = 0;
		int money = 0;
		int shortage = 0;
		
		for (int i = 0; i < 3; i++) {
			price = Integer.parseInt(list[i][1]);
			money = Integer.parseInt(list[i][2]);
			if (price == money) {
				System.out.println(list[i][0] + "、" + list[i][1] + "円、" + "支払金額過不足無し");
			} else if (price < money) {
				System.out.println(list[i][0] + "、" + list[i][1] + "円、" + "支払金額過多");
				shortage += (price - money);
			} else {
				System.out.println(list[i][0] + "、" + list[i][1] + "円、" + "支払金額不足");
				shortage += (price - money);
			}
		}
		if (shortage <= 0) {
			System.out.println("全体の不足金:なし");
		} else {
			System.out.println("全体の不足金:" + shortage + "円");
		}
	}
}
