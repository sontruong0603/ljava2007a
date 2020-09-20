package Buoi3;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Nhập vào số n: ");
		long n = sc.nextLong();
		int b = 1;
		if(n == 0 || n == 1) {
			System.out.println("giai thua của " + n + " là: 1");
		}else {
			for (int i = 2; i <= n; i++) {
				b *=i;
			}
			System.out.println(b);
		}
		
	}
}
