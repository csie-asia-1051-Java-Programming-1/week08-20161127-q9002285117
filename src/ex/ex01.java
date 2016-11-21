package ex;

/*
 * Topic: 請寫一個函式 (不是遞迴) 進行十進制數字轉換成二進制數字，例如十進制的 13 會輸出二進制的 1101
 * Date: 2016/11/21
 * Author: 105021038 傅琬鈞
 */
import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(fun(n));
	}

	public static String fun(int a) {
		String i = "";
		while (a > 0) {
			i = Integer.toBinaryString(a % 2) + i;
			a = a / 2;

		}
		return i;
	}
}
