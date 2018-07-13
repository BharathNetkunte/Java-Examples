package Sapient_Test;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayArranger {
public static void main(String args[])
{
	Scanner in =new Scanner(System.in);
	  int count=in.nextInt();
	  int array[]=new int[count];
	  for(int a0=0;a0<count;a0++)
	  {
		  array[a0]=in.nextInt();
	  }
	  
	/*  for(int i=0;i<array.length;i++)
	  {
		  System.out.print(array[i]+" ");
	  }*/
	  
	  int Sarray[]=new int[count];
	  
	  Arrays.fill(Sarray, -1);
	  
	  int temp;
	 for(int i=0;i<array.length-1;i++)
	  {
		  for(int j=i+1;i<array.length-3;j++)
		  {
			 if( array[i]<array[j])
			 {
				 Sarray[i]=array[j];
				break;
			 }
		  }
	  }
	  
	/*  for(int i=0;i<Sarray.length;i++)
	  {
		  System.out.print(Sarray[i]+" ");
	  }*/
	  int Tarray[]=new int[count];
	  Arrays.fill(Tarray, -1);
	  for(int i=0;i<Sarray.length-1;i++)
	  {
		   
		  for(int j=i+1;i<Sarray.length-3;j++)
		  {
			 if(!(Sarray[i]==-1||Sarray[j]==-1))
			 {
			 if( Sarray[i]>Sarray[j])
			 {
				 Tarray[i]=Sarray[j];
				break;
			 }
		  }
		  }
	  }
	  for(int i=0;i<Tarray.length;i++)
	  {
		  System.out.print(Tarray[i]+" ");
	  }
	  
}
}
