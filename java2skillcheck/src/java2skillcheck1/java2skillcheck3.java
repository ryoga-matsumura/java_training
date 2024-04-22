package java2skillcheck1;

/**
 * 2.演算子　実力確認問題
 */
public class java2skillcheck3 {
	/**
	 * int 型の変数 x、y に任意の数値を代入し、x の値を y に、y の値を x に入れ替えて x と y の値を表示
	 * @param args 整数
	 */
	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		int z = x;
		
		x = y;
		y = z;
		
		System.out.println(x);
		System.out.println(y);
		
	}

}
