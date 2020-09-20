package TienBanVeMayBay;

import java.util.Scanner;

public class Ve {
	int veCaoCap = 10000;
	int veThuongGia = 5000;
	int veTrungCap = 2000;
	
	public Ve() {
		
	}
	public Ve(int veCaoCap, int veThuongGia, int veTrungCap) {
		super();
		this.veCaoCap = veCaoCap;
		this.veThuongGia = veThuongGia;
		this.veTrungCap = veTrungCap;
	}
	public void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("So ve cao cap mua: ");
		veCaoCap = Integer.parseInt(input.nextLine());
		
		System.out.println("So ve thuong gia mua: ");
		veThuongGia = Integer.parseInt(input.nextLine());
		
		System.out.println("So trung cap mua: ");
		veTrungCap = Integer.parseInt(input.nextLine());
		
	}
	public void display() {
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "Ve [veCaoCap=" + veCaoCap + ", veThuongGia=" + veThuongGia + ", veTrungCap=" + veTrungCap + "]";
	}
	public int getVeCaoCap() {
		return veCaoCap;
	}
	public void setVeCaoCap(int veCaoCap) {
		this.veCaoCap = veCaoCap;
	}
	public int getVeThuongGia() {
		return veThuongGia;
	}
	public void setVeThuongGia(int veThuongGia) {
		this.veThuongGia = veThuongGia;
	}
	public int getVeTrungCap() {
		return veTrungCap;
	}
	public void setVeTrungCap(int veTrungCap) {
		this.veTrungCap = veTrungCap;
	}
}
