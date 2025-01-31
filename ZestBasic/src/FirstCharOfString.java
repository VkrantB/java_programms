
public class FirstCharOfString {
public static void main(String[] args) {
	//Write a program to print the first letter of each word in the String.

	String str = "I like Java and Development";
	
	char c[] = str.toCharArray();
	for (int i=0;i<c.length;i++)
	{
		//System.out.println(c[i]);
		if (c[i]!=' ' && (i==0 || c[i-1]==' ')) {
		System.out.println(c[i]);
	}
		}
}
	
	
}
