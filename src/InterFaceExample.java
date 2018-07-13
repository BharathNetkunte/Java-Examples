interface My_interface1
{
	int Usage=100;
	void Method1();
}

 interface My_interface2 extends My_interface1
{
	int Usage=200;
	void Method1();
}

class Base implements My_interface1,My_interface2
{
	interface new_interface
	{
		void method1();
	}
	class inner implements new_interface
	{

		
		public void method1() {
			
			System.out.println("Inner Base Implementation"+My_interface2.Usage);
		}
		
	}
	public void Method1()
	{
		
		System.out.println("Base Implementation"+My_interface2.Usage);
	}
	Base()
	{
		inner ob=new inner();
		ob.method1();
	}
}

class Derived extends Base implements My_interface2
{
	public void Hello()
	{
		System.out.println("Hello");
	}
	public void Method1()
	{
		System.out.println("Derived Implementation"+My_interface2.Usage);
	}
	Derived()
	{
		System.out.println("Derived Contuctir");
	}
}
public class InterFaceExample {
public static void main(String args[])
{
	My_interface2 ob =new Derived();
	
	ob.Method1();
}
	
}
