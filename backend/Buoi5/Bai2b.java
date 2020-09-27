package Buoi5;

public class Bai2b {
	private String Bai2b(String input) {
		String result = "";
		input = input.toLowerCase();
		String[] arr = input.split(" ");
		for (String string : arr) {
			if (!string.equals("") && !string.equals(null)) {
				result += String.valueOf(string.charAt(0)).toUpperCase() + string.substring(1) + " ";
			}
		}
		if (!result.equals("") && result.equals(null)) {
			result = result.substring(0, result.length() - 1);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(" chữ đầu viết hoa: " + new Bai2b().Bai2b(" lE    vAn     LuyEn    "));
    }
}
