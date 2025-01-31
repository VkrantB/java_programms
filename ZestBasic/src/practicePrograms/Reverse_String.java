package practicePrograms;

public class Reverse_String {
	public static void main(String[] args) {

		String input="Java";
		
		char [] inputArray=input.toCharArray();
		
		int left=0;
		int right=inputArray.length-1;
		System.out.println("Given string: "+ input);
		while(left<right)
		{
			char temp;
			temp=inputArray[left];
			inputArray[left]=inputArray[right];
			inputArray[right]=temp;
			left++;
			right--;
		}
		System.out.println("Output string: "+ new String(inputArray));
	}

}
