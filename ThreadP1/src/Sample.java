class Demo extends Thread
{
	public void run()
	{
		System.out.println("This is run method..");
	}
}
public class Sample {

	public static void main(String[] args) {
	
		Demo t1=new Demo();
		t1.start();

	}

}
