package Buoi3;

import java.util.Scanner;

public class Bai1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so a: ");
		float a = sc.nextFloat();
		System.out.println("Nhap vao so b: ");
		float b = sc.nextFloat();
		System.out.println("Nhap vao so c");
		float c = sc.nextFloat();
		System.out.println("pt bac 2: " + a + "x^2 + " + b + "x + " + "c" + " = 0");

		float denta = (b*b) - (4*a*c);
		double d = (float) denta;
		
		System.out.println(Math.sqrt(d));
		float x1,x2;
		if(denta == 0) {
			x1 = x2 = -(b/(2*a));
			System.out.println("Phương trình có nghiệm kép x1 = x2 = " + x1);
		}else if(denta < 0){
			System.out.println("Phương trình vô nghiệm");
		}else {
			x1 = (float) ((-b + Math.sqrt(d)) / (2*a));
			x2 = (float) ((-b - Math.sqrt(d)) / (2*a));
			System.out.println("Nghiệm của pt là: x1 = " + x1 + " và x2 = " + x2);			
		}
	}

}
