package java3skillcheck;
import java.io.*;

/**
 * 3.if文 実力確認問題3-1_case3
 */
public class java3skillcheck3_1_case3 {
/**
 * 試験の点数を入力し、対応する成績を表示する。試験は 100 点満点（ 0 点～ 100 点）とし、点数と成績の対応を以下のようにします。
 * 【ケース 3】
 * 80 点以上：「優」
 * 70 点以上、80 点未満：「良」
 * 60 点以上、70 点未満：「可」
 * 60 点未満：「不可」
 * @param args 整数
 */
	public static void main(String[] args) throws IOException{
		System.out.println("試験の点数（0~100）を入力してください。");
		
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int score = Integer.parseInt(str);
		
		if(score >= 80 && score <= 100) {
			System.out.println("優");
		}
		else if(score >= 70 && score < 80) {
			System.out.println("良");
		}
		else if(score >= 60 && score < 70) {
			System.out.println("可");
		}
		else if(score >= 0 && score < 60) {
			System.out.println("不可");
		}
		else {
			System.out.println("点数は0~100点の範囲で入力してください。");
		}
	}
}
