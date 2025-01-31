package practicePrograms;

import java.util.Arrays;

public class ReverseString {
	public static void main(String[] args) {

		String input = "Hello World";
		String s="";
		char inputArray[] = input.toCharArray();

		int left = 0;
		int right = inputArray.length - 1;

		while (left < right) 
		{
				char temp;
				temp = inputArray[left];
				inputArray[left] = inputArray[right];
				inputArray[right] = temp;
				left++;
				right--;
		}
		for(char c:inputArray)
		{
			s =s+c;
		}
		System.out.println(s);
		//System.out.println("Output: " + new String(inputArray));
		}
	}


