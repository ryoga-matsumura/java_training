package helloworld;
import java.io.*;
/**
* HelloWorld クラス
*/
public class HelloWorld{
	/**
	 * main メソッド
	 * @param args 実行引数
	 */
	public static void main(String[] args) throws IOException{
		System.out.println("文字を2つ入力してください。");
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		System.out.println(str1 + str2);
	}
}