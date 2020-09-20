package Buoi3;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		// giai phuong trinh bac nhat
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao gia tri cua a:");
		int a = sc.nextInt();
		System.out.println("Nhap vao gia tri cua b:");
		float b = sc.nextInt();
		float c;
		System.out.println("pt bac nhat " + a + "x + " + b +" = 0");
		if (a != 0) {
			c = b/a;
			System.out.println("Nghiem cua phuong trinh la: " + c);
		} else if(a == 0){
			if(b == 0) {
				System.out.println("pt vo so nghiem");
			}System.out.println("pt vo nghiem");
		}
	}
}
