package deutscheBank;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GSON_Deserialization {
	public static void main(String[] args) {
//De-serialization=> Converting Json Object into Java Object 
		
		String data="{\r\n"
				+ "  \"name\": \"Vikramm\"\r\n"
				+ "}";
		
		Gson gson=new Gson();
		Person p=gson.fromJson(data, Person.class);
		System.out.println(p);
		System.out.println(p.getName());
		
	}
}
