package ex;

/*
 * Topic: 將前一題加強成可以做10以下的各種數字系統轉換
 * Date: 2016/11/21
 * Author: 105021038 傅琬鈞
 */
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		String i = "";
		while (n > 0 && m > 0) {

			i = (n % m) + i;
			n = n / m;
		}
		System.out.print(i);
	}

}
