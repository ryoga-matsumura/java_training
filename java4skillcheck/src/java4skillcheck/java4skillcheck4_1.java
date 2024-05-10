package java4skillcheck;

/**
 * 4.for文　実力確認問題4_1
 */
public class java4skillcheck4_1 {
	/**
	 * 下記の保険契約者の情報を出力してください。
	 * 出力の最後に遅延利息が発生している人数を出力してください。
	 * ※保険契約者一覧はString配列に格納すること
	 * 【保険契約者一覧】
	 * 契約者名	保険料	遅延利息金
	 * 中村	5000	2000
	 * 田島	3000	
	 * 小澤	4500	
	 * 大西	6000	3500
	 * @param args 文字列
	 */
	public static void main(String[] args) {
		String list[][] = {
			{"中村","田島","小澤","大西"}, {"5000","3000","4500","6000"}, {"2000","","","3500"}
		};
		int count = 0;
		
		for (int i = 0; i < list[0].length; i++) {
			System.out.println("契約者名:" + list[0][i] + "、保険料:" + list[1][i] + "円");
			if (list[2][i] != "") {
				count++;
			}
		}
		System.out.println("遅延利息金が発生している人数は" + count + "人です。");
	}
}
