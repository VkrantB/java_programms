package practicePrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class CountFrequecyOfCharactersWithoutHashmap {
	public static void main(String[] args) {

		String input = "aabbcc";
		char inputArray[] = input.toCharArray();

		int frequency[]=new int[256];
		
		for(char currentChar:inputArray)
		{
			frequency[currentChar]=frequency[currentChar]+1;
		}
		for(int i=0;i<frequency.length;i++) 
		{
			if(frequency[i]>0)
			System.out.println((char)i +":"+ frequency[i]);
		}
		

	}

}
