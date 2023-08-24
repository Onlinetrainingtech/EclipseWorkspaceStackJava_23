import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

class Demo
{
//	HashSet<Integer>list1=new HashSet<Integer>();
	TreeSet<Integer>list1=new TreeSet<Integer>();
	
	void get1()
	{
	   list1.add(1001);
	   list1.add(1002);
	   list1.add(1004);
	   list1.add(1003);
	
	   Iterator h1=list1.iterator();
	   while(h1.hasNext())
	   {
		   System.out.println("Inside the loop is::"+h1.next());
	   }
	   
	   System.out.println("Your value is::"+list1);
	   System.out.println("Your size is::"+list1.size());
	   System.out.println("Searching the data is::"+list1.contains(1001));
	   System.out.println("Removing the data is::"+list1.remove(1001));
	   System.out.println("After removing data is::"+list1);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();

	}

}
