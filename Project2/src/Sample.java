
public class Sample {

	int pid=1001;//class or instance
	void get1()
	{
		String pname="apple";//local variable
		System.out.println("This is get1 fun..."+pid+""+pname);
	}
	
	void get2()
	{
		System.out.println("This is get2 fun...."+pid+"");
	}
	void get3(int cid,String cname)
	{
		System.out.println("Your value is::"+cid+""+cname);
	}
	public static void main(String[] args) {
	
		Sample s1=new Sample();
		s1.get1();
		s1.get2();
		s1.get3(2001,"mobile");

	}

}
