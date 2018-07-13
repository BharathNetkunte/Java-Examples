import java.util.ArrayList;
interface intr1
{
	void SayHello();
}

class implementer1 implements intr1
{

	@Override
	public void SayHello() {
		// TODO Auto-generated method stub
		System.out.println("implementor1");
	}
	
}

class implementer2 implements intr1
{

	@Override
	public void SayHello() {
		// TODO Auto-generated method stub
		System.out.println("implementor2");
	}
	
}

public class CollectionTest {
    
   
    	public static void main(String arg[]) { 
    		implementer1 ob1=new implementer1();
    		
    		implementer2 ob2=new implementer2();
    		
    		intr1 ob=ob1;
    		ob.SayHello();
    		
    		
            
        } 
    	 
    }
