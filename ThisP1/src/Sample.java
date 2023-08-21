class Demo
{
	int pid,cid;
	void get1(int pid,int cid)
	{
		this.pid=pid;
		this.cid=cid;
		System.out.println("Your get1 fun.."+pid+""+cid);
	}
	void get2()
	{
		System.out.println("Your get2 fun.."+pid+""+cid);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1(1001,2001);
		f1.get2();

	}

}
