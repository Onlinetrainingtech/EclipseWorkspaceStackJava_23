class Demo
{
	void get1()
	{
		try
		{
			String name="null";
			   System.out.println("length is::"+name.length());
		}
		catch(NullPointerException t)
		{
			System.out.println("This is nullpointer");
		}
		finally
		{
			System.out.println("finally block");
		}
	   
	   get2();	
	}
	void get2()
	{
		System.out.println("This is get2 function..");
	}
	
}
public class Sample {

	public static void main(String[] args) {
		
		Demo d1=new Demo();
		d1.get1();

	}

}
