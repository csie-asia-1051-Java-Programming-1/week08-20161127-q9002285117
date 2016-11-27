package hw;

import java.util.Scanner;

/*
 * Topic: 將前一題加強成可以做10以下的各種數字系統轉換 (必須使用遞迴)
 * Date: 2016/11/21
 * Author: 105021038 傅琬鈞
 */
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入數字");
		int o = scn.nextInt();
		System.out.println("請輸入幾進制轉幾進制");
		int n = scn.nextInt();
		int m = scn.nextInt();

		if (n == 10) {
			System.out.println(fun(o, m));
		} else if (m == 10) {
			System.out.println(fun2(o, n));
		} else {
			System.out.println(fun(fun2(o, n), m));
		}
	}

	public static String fun(int o, int m) {
		String i = "";
		while (o != 0) {

			i = (o % m) + i;
			o = o / m;
		}
		return i;
	}

	public static int fun2(int o, int n) {
		int sum = 0;
		int a = 0;
		while (o != 0) {
			sum = (int) (sum + (o % 10) * Math.pow(n, a));
			a++;
			o = o / 10;
		}
		return sum;
	}
}
