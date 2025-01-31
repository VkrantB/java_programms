package practicePrograms;

import java.util.Arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		int array[][]=new int [2][2];
		
		array[0][0]=10;
		array[0][1]=20;
		array[1][0]=30;
		array[1][1]=40;
		System.out.println(array.length);
		System.out.println(array[0].length);
		
		System.out.println(Arrays.toString(array[0]));
		System.out.println(Arrays.toString(array[1]));
	/*	
		for(int[] temp:array)
		{
			System.out.println(temp);
		}
	*/
		
		
		//for ROW
		for(int rowIndex=0;rowIndex<array.length;rowIndex++) 
		{//for Column
			for (int colIndex=0;colIndex<array[0].length;colIndex++) 
			{	//System.out.print(rowIndex +" "+ colIndex + " ");
				System.out.print(array[rowIndex][colIndex]+ " ");
			}	
			System.out.println();
		}
		
System.out.println("-----------------------------------------------");

int a[]=new int[5];
a[0]=10;
a[1]=20;
a[2]=30;
a[3]=40;
a[4]=50;

for(int index=0;index<a.length;index++) 
{
	System.out.println(a[index]);
}
System.out.println("----for each loop ------------------");

//for each loop for traversing
for(int temp:a)
{
	System.out.println(temp);
}
	}

}
