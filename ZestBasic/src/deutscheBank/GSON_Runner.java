package deutscheBank;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GSON_Runner {
	public static void main(String[] args) {
//Serialization=> Converting Java Object into Json
		Person p1 = new Person("Vikramm");
		System.out.println(p1);
		//GSON library
		Gson gson=new Gson();
		String data=gson.toJson(p1);
		System.out.println(data);
		
		//JSON 
		Gson gsonPretty=new GsonBuilder().setPrettyPrinting().create();
		String formatedData=gsonPretty.toJson(p1);
		System.out.println(formatedData);
		
	}
}
