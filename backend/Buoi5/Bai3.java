package Buoi5;
import com.google.gson.Gson;

public class Bai3 {
	  private int age = 100;
	  private String name = "abc";
	  private String school = "cba";
	  private String subject = "cba";
	  
	  public static void main(String[] args) {
	      Bai3 obj = new Bai3();
	      Gson gson = new Gson();

	 
	      //convert java object to JSON format
	      String json = gson.toJson(obj);
	 
	      System.out.println(json);
	  }
}
