
public class ReverseTheString {
	public static void main(String[] args) {
		
		String s="I am going to Nagpur";
		
		String []n=s.split(" ");
		for (int i=n.length-1;i>=0;i--) 
		{
		    
		    System.out.print(n[i] + " ");
		}
}
}