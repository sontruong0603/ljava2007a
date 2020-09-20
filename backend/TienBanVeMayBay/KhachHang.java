package TienBanVeMayBay;

import java.util.Scanner;


public class KhachHang {
	private String hoTen;
	private String gioiTinh;
	private int tuoi;
	private String tenChuyenBay;
	private String thoiGianBay;
	private int soLuongVeKhachMua;
	private int tienMuaVe;
	
	public void input() {
			Scanner input = new Scanner(System.in);
			System.out.println("Ho ten hanh khach: ");
			hoTen = input.nextLine();
			
			System.out.println("Gioi tinh: ");
			gioiTinh = input.nextLine();
			
			System.out.println("Tuoi: ");
			tuoi = Integer.parseInt(input.nextLine());
			
			System.out.println("Ten chuyen bay: ");
			tenChuyenBay = input.nextLine();
			
			System.out.println("Thoi gian bay: ");
			thoiGianBay = input.nextLine();
			
			System.out.println("So luong khach mua ve: ");
			soLuongVeKhachMua = Integer.parseInt(input.nextLine());
			
			System.out.println("Tien mua ve: ");
			tienMuaVe = Integer.parseInt(input.nextLine());
	}
	
	public void display() {
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "KhachHang [hoTen=" + hoTen + ", gioiTinh=" + gioiTinh + ", tuoi=" + tuoi + ", tenChuyenBay="
				+ tenChuyenBay + ", thoiGianBay=" + thoiGianBay + ", soLuongVeKhachMua=" + soLuongVeKhachMua
				+ ", tienMuaVe=" + tienMuaVe + "]";
	}

	public KhachHang(String hoTen, String gioiTinh, int tuoi, String tenChuyenBay, String thoiGianBay,
			int soLuongVeKhachMua, int tienMuaVe) {
		super();
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.tuoi = tuoi;
		this.tenChuyenBay = tenChuyenBay;
		this.thoiGianBay = thoiGianBay;
		this.soLuongVeKhachMua = soLuongVeKhachMua;
		this.tienMuaVe = tienMuaVe;
	}

	public String getHoTen() {
		return hoTen;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public int getTuoi() {
		return tuoi;
	}

	public String getTenChuyenBay() {
		return tenChuyenBay;
	}

	public String getThoiGianBay() {
		return thoiGianBay;
	}

	public int getSoLuongVeKhachMua() {
		return soLuongVeKhachMua;
	}

	public int getTienMuaVe() {
		return tienMuaVe;
	}
	
	
	
}
