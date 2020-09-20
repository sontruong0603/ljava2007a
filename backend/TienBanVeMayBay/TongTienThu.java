package TienBanVeMayBay;


import java.util.Scanner;

public class TongTienThu{
	public static void main(String[] args) {
		int choose; 
		
		Scanner input = new Scanner(System.in);
		
		do {
			showMenu();
			choose = Integer.parseInt(input.nextLine());
			
			switch (choose) {
				case 1:
				
					break;
				case 2:
					int n;
					System.out.println("Nhap thong tin hanh khach: ");
					n = input.nextInt();
					
					for (int i = 0; i < n; i++) {
						System.out.println("hàng khách số: ");
						
					}
					break;
				case 3:
					
					break;
				case 4:
					System.out.println("Exit");
					break;

			default:
				System.err.println("Nhap sai!!!");
				break;
			}
		}while(choose !=4 );
		
	}
	static void showMenu() {
		System.out.println("1.Nhap thong tin hanh khach");
		System.out.println("2.Hien thi thong tin");
		System.out.println("3.Nhap so ve mua");
		System.out.println("4.Thoat");
	}
}
