package java5skillcheck;
import java.io.*;

/**
 * 5.クラスの基礎　実力確認問題２
 */
class Calculation {
	/**
	 * 計算クラス
	 */
	int num1;
	int num2;
	String operator;
	
	void setNumber(int num1, int num2, String operator) {
		this.num1 = num1;
		this.num2 = num2;
		this.operator = operator;
	}
	
	void show() {
		switch(operator) {
		case "+":
			System.out.println("計算結果：" + (num1 + num2));
			break;
		case "-":
			System.out.println("計算結果：" + (num1 -  num2));
			break;
		case "*":
			System.out.println("計算結果：" + (num1 * num2));
			break;
		case "/":
			System.out.println("計算結果：" + (num1 / num2));
			break;
		default:
			System.out.println("演算子は +, -, *, / のいずれかを入力してください。");
			break;
		}
	}
}

public class java5skillcheck2 {
	/**
	 * 演算子（+、-、*、/）と計算値のフィールドを持つ計算クラスを作成してください。
	 * 演算子と計算値を入力し、計算結果を出力してください。
	 * ※出力はmainメソッドで行うこと。
	 * @param args +,-,*,/ 整数
	 */
	public static void main(String[] args) throws IOException {
		Calculation cal1 = new Calculation();
		
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("1つ目の数値を入力してください。");
		int num1 = Integer.parseInt(br.readLine());
		
		System.out.println("2つ目の数値を入力してください。");
		int num2 = Integer.parseInt(br.readLine());
		
		System.out.println("演算子を入力してください。");
		String operator = br.readLine();
		
		cal1.setNumber(num1, num2, operator);
		cal1.show();
	}
}
