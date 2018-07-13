import java.io.Serializable;

class Base1
{
	void m1()
	{
		System.out.println("Inside Base");
		return ;
	}
}

class Derived1 extends Base1 implements Serializable
{
	void m1()
	{
		System.out.println("Inside Derived");
		return ;
	}
}

class Derived2 extends Derived1
{
	void m1()
	{
		System.out.println("Inside Derived2");
		return ;
	}
}

class StringsExample
{
	public static void main(String args[])
	{
		Base1 B1= new Derived2();
		Derived1 D=(Derived1)B1;
		D.m1();
	}
}