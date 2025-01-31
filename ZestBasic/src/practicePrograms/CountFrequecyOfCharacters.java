package practicePrograms;

import java.util.Arrays;
import java.util.HashMap;

public class CountFrequecyOfCharacters {
	public static void main(String[] args) {

		String input = "aabbcc";
		char inputArray[] = input.toCharArray();

		System.out.println(inputArray);
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		
		for(char x:inputArray) 
		{
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		for(char count :map.keySet()) 
		{
			System.out.println(count + ":"+ map.get(count));
		}

	}

}
