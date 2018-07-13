class Gen<T extends Number &>
{
	private T num;
	
	Gen()
	{
		System.out.println("Normal Constructor");
	}
	
	Gen(Integer i)
	{
		System.out.println("Normal Constructor with Integer");
	}
	
	Gen(T i)
	{
		System.out.println("Generic Constructor with Integer");
	}
	
}
public class GenericsExample {
	
	public static void main(String args[])
	{
		Gen<Integer> iob=new Gen<Integer>();
		
		
	}

}
