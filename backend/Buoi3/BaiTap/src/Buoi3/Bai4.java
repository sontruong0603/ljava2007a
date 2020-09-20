package Buoi3;

import java.util.Scanner;

import sun.nio.cs.KOI8_R;

public class Bai4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap vao so a: ");
		int a = scanner.nextInt();
		int b = a+1;
		if(a > 2) {
			for (int i = 9; i < a; i++) {
	            if(i%2==0 || i%3==0||i%4==0||i%5==0||i%6==0||i%7==0||i%8==0||i%9==0 ) {
	            	
	            }else {
					System.out.println(i);
				}        
	        }
		}	else if (a == 2) {
			System.out.println(a + " là số nt");
		}else if(a<2){
			System.out.println(a + " ko là số nt");
		}
	}
}
