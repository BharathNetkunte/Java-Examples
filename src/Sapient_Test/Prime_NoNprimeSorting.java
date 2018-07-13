package Sapient_Test;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Prime_NoNprimeSorting {
	static boolean isPrime(int n)
	{
	    // Corner cases
	    if (n <= 1)  return false;
	    if (n <= 3)  return true;
	 
	    // This is checked so that we can skip 
	    // middle five numbers in below loop
	    if (n%2 == 0 || n%3 == 0) return false;
	 
	    for (int i=5; i*i<=n; i=i+6)
	        if (n%i == 0 || n%(i+2) == 0)
	           return false;
	 
	    return true;
	}
public static void main(String args[])
{
	
	// Scanner s = new Scanner(System.in);
    // String name = s.nextLine();                 // Reading input from STDIN
     System.out.println("Enter count, " );  
     
     
     
     Comparator<Integer> InComp=new Comparator<Integer>()
    		 {

				@Override
				public int compare(Integer o1, Integer o2) {
					// TODO Auto-generated method stub
					return o1.compareTo(o2);
				}
    	 
    		 };
     
    		 Comparator<Integer> OutComp=new Comparator<Integer>()
    		 {

				@Override
				public int compare(Integer o1, Integer o2) {
					// TODO Auto-generated method stub
					return o2.compareTo(o1);
				}
    	 
    		 };
     
    		 List<Integer> PrimeList=new LinkedList<Integer>();
    	     List<Integer> NonPrimeList=new LinkedList<Integer>();	 
    	     
     Scanner in =new Scanner(System.in);
     int count=in.nextInt();
     int num;
    // int array[]=new int[count];
     for(int a0=0;a0<count;a0++)
     {
   	 num=in.nextInt();
    	 if(isPrime(num))
    	 {
    		 PrimeList.add(num);
    	 }else
    	 {
    		 NonPrimeList.add(num);
    	 }
     }
     Collections.sort(PrimeList,InComp);
     Collections.sort(NonPrimeList,OutComp);
     
    // PrimeList.forEach(System.out::print);
    // NonPrimeList.forEach(System.out::print);
     
     for(int i = 0; i < PrimeList.size(); i++) {
         System.out.print(PrimeList.get(i)+" ");
     }
     for(int i = 0; i < NonPrimeList.size(); i++) {
         System.out.print(NonPrimeList.get(i)+" ");
     }
}
}
