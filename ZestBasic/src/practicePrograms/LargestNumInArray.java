package practicePrograms;

public class LargestNumInArray {

	public static void main(String[] args) {
		
		int num[]= {4,8,7,2,9,13,18,74,24};
		
		int largestNumber=num[0];
		//System.out.println(large);
		
		for(int index=1;index<=num.length-1;index++)
		
		{
			if (num[index]>largestNumber)
			{
				largestNumber=num[index];
			}	
		}
		System.out.println("The largest Number is: "+largestNumber);
		
		System.out.println("-----------------------------");
		int smallestNumber=num[0];
		for(int index=1;index<=num.length-1;index++) 
		{
			if (num[index]<smallestNumber)
			{
				smallestNumber=num[index];
			}	
		}
		System.out.println("The smallest Number is: "+smallestNumber);
	}
	
}
