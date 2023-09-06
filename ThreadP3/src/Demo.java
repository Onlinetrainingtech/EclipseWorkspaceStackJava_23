class Sample extends Thread
{
	public void run()
	{
		int i;
		try
		{
			for(i=0;i<=5;i++)
			{
				System.out.println("I value is::"+i);
				Thread.sleep(10000);
			}
			System.out.println("loopoutside");
		}
		catch(InterruptedException t)
		{
			
		}
	}
}
public class Demo {

	public static void main(String[] args) {
		
		Sample s1=new Sample();
		Sample s2=new Sample();
		s1.start();
		try
		{
			System.out.println("JoinIn");
			s1.join(10000);
			System.out.println("JoinOut");
		}
		catch(InterruptedException t)
		{
			
		}
        s2.start();
	}

}
