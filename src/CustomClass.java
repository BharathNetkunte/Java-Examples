import java.util.Formatter;

interface IKMObserver{} 
interface Environment {} 
interface IKMEnvironment extends Environment {} 
interface IKMProgramEnvironment extends IKMEnvironment {} 
class JavaSEEnvironment implements Environment {} 
class TestEnvironment implements IKMEnvironment {} 
class JavaSETestEnvironment extends TestEnvironment {} 
class JavaSE7TestEnvironment implements IKMObserver  {} 
class JavaEETestEnvironment implements IKMObserver, IKMProgramEnvironment  {} 

public class CustomClass  { 
	 public static void main(String[] args) { 
		 int x = 0, y = 4, z = 5;
	        if (x > 0)
	            if (y < 3)
	                System.out.println("One");
	            else if (y < 4)
	                System.out.println("Two");
	            else if (z > 5)
	                System.out.println("Three");
	        else
	            System.out.println("Four");
	    } 
	} 
