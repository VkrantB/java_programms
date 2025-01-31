package practicePrograms;

public class SecondLargestNumberInArray {

	public static void main(String[] args) {
		
		int num[]= {3,5,8,6,1};
		
		int largestNum=Integer.MIN_VALUE;
		int secLargestNum=Integer.MIN_VALUE;
		
		for (int number:num) {
			
			if(number>largestNum) 
			{
				secLargestNum=largestNum;
				largestNum=number;
			}
			else if(number>secLargestNum && number!=largestNum) 
			{
				number=secLargestNum;
			}
		}
		System.out.println("The largest Number is: "+largestNum);
		
		System.out.println("The second largest Number is: "+secLargestNum);
		
		
	}	
}
