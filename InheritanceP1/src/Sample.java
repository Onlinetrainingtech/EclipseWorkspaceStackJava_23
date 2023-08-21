class B
{
	int pid=1001;
	void get1()
	{
		System.out.println("This is get1 function..");
	}
	
}
class D1 extends B
{
	String pname="apple";
	void get2()
	{
		System.out.println("This is get2 function.."+pid);
		
	}
}
class D2 extends D1
{
	void get3()
	{
		System.out.println("This is get3 function.."+pname);
	}
}
public class Sample {

	public static void main(String[] args) {
	
		D2 f1=new D2();
		f1.get1();
		f1.get2();
		f1.get3();

	}

}
