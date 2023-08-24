class B
{
	int pid1=100;
	void get1()
	{
		System.out.println("Base class value is::"+pid1);
	}
}
class D extends B
{
	void get2()
	{
		int pid1=200;
		System.out.println("Dervided class is::"+super.pid1);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		D f1=new D();
		f1.get1();
		f1.get2();

	}

}
