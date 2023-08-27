class Sample
{
	void get1()
	{
		try
		{
			int a=100/0;//Exception 1
		}
		catch(ArithmeticException t)
		{
			System.out.println("Please check the division..");
		}
		
		System.out.println("This is get1 function..");
		get2();
	}
	void get2()
	{
		System.out.println("This is get2 function..");
	}
}
public class Demo {

	public static void main(String[] args) {
		
		Sample s1=new Sample();
		s1.get1();
	

	}

}
