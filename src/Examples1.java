import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.StringTokenizer;
import java.util.TreeSet;
 

class Element implements Comparable {
    int id;
    
    Element(int id) {
        this.id = id;
    }
    
    public int compareTo(Object obj) {
        Element e = (Element)obj;
        return  this.id - e.id;
    }
    
    public String toString() {
        return "" + this.id;
    }
}
 
public class Examples1 {

	
 public static void main(String args[]){
	 
	 StringTokenizer stk1 = new StringTokenizer(",a,b",","); 
	       StringTokenizer stk2 = new StringTokenizer(",,ab",","); 
	       StringTokenizer stk3 = new StringTokenizer("ab,,,","b"); 
	       StringTokenizer stk4 = new StringTokenizer(",ab,,a",","); 
	      System.out.println(stk1.countTokens()+" "+stk2.countTokens()+" "+stk3.countTokens()+" "+stk4.countTokens());
	 
	 
	 SortedSet<Element> s = new TreeSet<Element>();
     s.add(new Element(15));
     s.add(new Element(10));
     s.add(new Element(25));
     s.add(new Element(10));
     System.out.println(s.first() + " " + s.size());
	 
	 
	 String first = "first";
	   String second = new String("first");
	   "first".concat("second");
	   System.out.println(first.equals(second));
	   System.out.println(first == second);
	   System.out.println(first.equals("firstsecond"));
	   System.out.println(second == "first");
	 
	 
	 int x = 0;
     if (x > 0)
         System.out.println("One");
         System.out.println("Two");
         
	 List<Integer> list = new ArrayList<Integer>();
	 
	 list.add(2007);
	 list.add(2008);
	 list.add(2009);
	 
	 System.out.println(list);
	 
	 for(int i :list)
	 {
		 int index = list.indexOf(i);
		 list.set(index, ++i);
	 }
	 
	 System.out.println(list);
	 
	 char[] d = { 'h','e','l','l','o' };
	 String a = "hello";
	 
	 if( a.equals(d))
		 System.out.println("equal");
	 
	 String s1 = "hello";
	 s1.concat(" world");
	 
	 System.out.println(s1);
			
 }
 
}


