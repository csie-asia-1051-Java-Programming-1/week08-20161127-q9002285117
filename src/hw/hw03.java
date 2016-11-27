package hw;
/*
 * Topic: 請寫一個遞迴程式，輸入一個 int 型態的資料，並回傳該資料在二進制下有多少個位元是 1，例如: 輸入 13 得到結果為 3
 * Date: 2016/11/21
 * Author: 105021038 傅琬鈞
 */

import java.util.Scanner;

public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(fun(n));
	}

	public static int fun(int a) {

		int b = 0;
		while (a > 0) {
			if (a % 2 == 1) {
				b = b + 1;
			}
			a = a / 2;

		}
		return b;
	}

}
