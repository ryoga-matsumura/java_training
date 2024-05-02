package java3skillcheck;
import java.io.*;

/**
 * 3.if文 実力確認問題3_2
 */
public class java3skillcheck3_2 {
	/**
	 * 整数値 x, y を入力し、以下のうち該当する条件を表示するプログラムを作成してください。
	 * x は y より小さく、かつ、x と y は共に偶数である。
	 * x と y は等しく、かつ、負の数である。
	 * x は y より小さい、または、x は偶数である。
	 * @param args 整数
	 */
	public static void main(String[] args) throws IOException{
		System.out.println("xに代入する整数を入力してください。");
		
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		int x = Integer.parseInt(str1);
		
		System.out.println("yに代入する整数を入力してください。");
		
		String str2 = br.readLine();
		int y = Integer.parseInt(str2);
		
		if (x < y && x % 2 == 0 && y % 2 ==0) {
			System.out.println("x は y より小さく、かつ、x と y は共に偶数である。");
		} else if (x == y && x < 0 && y < 0) {
			System.out.println("x と y は等しく、かつ、負の数である。");
		} else if (x < y || x % 2 == 0) {
			System.out.println("x は y より小さい、または、x は偶数である。");
		}
	}
}
