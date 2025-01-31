package practicePrograms;

import java.util.Arrays;

public class ReverseArray {//reverse array RIGHT where k=3 times
	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,6,7};
		System.out.println("Original Array: "+ Arrays.toString(a));
		
		int k=3; 
		//k=k%a.length;
		//Reverse entire Array
		a=reverseArray(a,0,a.length-1);
		System.out.println("Reverse Array: "+ Arrays.toString(a));
		//Reverse first part of Array where k=3(Index=0,1,2)
		a=reverseArray(a,0,k-1);
		System.out.println("updated Array: "+ Arrays.toString(a));
		//Reverse remaining part of Array where k=3(Index=4,5,6)
		a=reverseArray(a,k,a.length-1);
		System.out.println("K=3times Array: "+ Arrays.toString(a));
	}

	private static int [] reverseArray(int[] a, int left, int right) {
		//Reverse array with 2Pointer technique
		int temp;
		while(left<right)
		{
			 temp=a[left];
			 a[left]=a[right];
			 a[right]=temp;
			 left++;
			 right--;
		}
		return a;
		}

}
