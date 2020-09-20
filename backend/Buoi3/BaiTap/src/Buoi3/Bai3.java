package Buoi3;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap vao so a từ 0 -200: ");
		int a = scanner.nextInt();
		if (a < 20) {
			System.out.println("Nhap lại số a: ");
		} else if(a > 200) {
			System.out.println("Nhap lại số a: ");
		}else if (!(a % 5 == 0) && (a % 7 == 0)) {
			System.out.println(a + " chia hết cho 7 và ko chia hết cho 5");
		}
		System.out.println(a + " ko chia hết cho 7");
	}
}
