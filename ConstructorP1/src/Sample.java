class Demo
{
	
	Demo()
	{
		System.out.println("Default cons...");
	}
	Demo(int cid,String cname)
	{
		System.out.println("Value is::"+cid+""+cname);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		new Demo();
		new Demo(1001,"azar");

	}

}
