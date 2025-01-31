package practicePrograms;

import java.util.Arrays;
import java.util.HashMap;

public class CountFrequecyOfCharacters_NoHashMap {//Error
	public static void main(String[] args) {
		int count = 0;
		String input = "aabbcc";
		char inputArray[] = input.toCharArray();

		for(int i=0;i<inputArray.length;i++)
		{
			char currentChar=inputArray[i];
			if(currentChar !=' ' && input.indexOf(currentChar)==i)
			
				  count = 0;
			
			for (int j=i;j<inputArray.length;j++)
			{
				if(inputArray[j]==currentChar)
				{
					count++;
				}
			}
			System.out.println(currentChar + ":"+ count);
		}
		
	}

}
