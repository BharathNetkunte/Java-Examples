package Here;

import java.util.Scanner;

public class Test1 {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		//String str1 = scanner.nextLine();
		//String str2 = scanner.nextLine();
		
		//System.out.println(username_1.length());
		//System.out.println(username_2.length());
	
		//System.out.println(tranformation);
		
		 int count=in.nextInt();
		  int array[]=new int[count];
		  for(int a0=0;a0<count;a0++)
		  {
			  array[a0]=in.nextInt();
		  }
	//	System.out.println( editDistDP( str1 , str2 , str1.length(), str2.length()) );
		  for(int a0=0;a0<count;a0++)
		  {
			  System.out.println(array[a0]);
		  }
	}
}
