package java3skillcheck;
import java.io.*;

/**
 * 3.if文 実力確認問題3-1_case2
 */
public class java3skillcheck3_1_case2 {
	/**
	 * 試験の点数を入力し、対応する成績を表示する。試験は 100 点満点（ 0 点～ 100 点）とし、点数と成績の対応を以下のようにします。
	 * 【ケース 2】
	 * 80 点以上：「たいへんよくできました。」
	 * 60 点以上、80 点未満：「よくできました。」
	 * 60 点未満：「ざんねんでした。」
	 * @param args 整数
	 */
	public static void main(String[] args) throws IOException{
		System.out.println("試験の点数（0~100）を入力してください。");
		
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int score = Integer.parseInt(str);
		
		if (score >= 80 && score <= 100) {
			System.out.println("たいへんよくできました。");
		}
		else if (score >= 60 && score < 80) {
			System.out.println("よくできました。");
		}
		else if (score >=0 && score < 60) {
			System.out.println("ざんねんでした。");
		}
		else {
			System.out.println("点数は0~100点の範囲で入力してください。");
		}
	}
}
